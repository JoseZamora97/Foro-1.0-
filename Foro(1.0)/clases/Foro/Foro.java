
package foropractica.Clases.Foro;

import foropractica.Clases.Forero.*;
import foropractica.Comparadores.NumSancionesModerador;
import foropractica.IO.*;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/** 
* Clase Foro
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class Foro implements Serializable{
    
    private String tematica;
    
    private HashSet <Categoria> Categorias_;
    private HashSet <Forero> Foreros_;
    private ArrayList <Moderador> Moderadores_;
    private ArrayList <Administrador> Administradores_;
    
    /**
     * 
     * @param tematica Título del foro
     */
    public Foro (String tematica) 
    {
        this.tematica = tematica;
        Categorias_ = new HashSet <> ();
        Moderadores_ = new ArrayList <> ();
        Foreros_ = new HashSet <> ();
        Administradores_ = new ArrayList <> ();
    }   
    
    public String getTematica() 
    {
        return tematica;
    }  
    
    public void setTematica(String tematica)
    {
        this.tematica = tematica;
    }   
    /** 
     * devuelve un forero registrado en el foro
     * 
     * @param nick nick del forero
     * @param pass contraseña del forero
     * @return null si el nick y la contraseña no coinciden con ningun forero registrado
     */
    public Forero obtenerForero (String nick, String pass)
    {
     
        for(Forero f : Foreros_){
            if(f.equals(new Forero(nick,pass)))
                return f;
        }
        
        return null;
    }
    
    /**devuelve un moderador registrado en el foro
     * 
     * @param nick nick del moderador
     * @return moderador si lo encuentra, null si no
     */
    public Moderador obtenerModerador (String nick)
    {
        for (Moderador m : Moderadores_)
        {
            if (m.getNick().equals(nick))
                return m;
        }
        return null;
    }
    /**deuvuelve un administrador registrado en el foro
     * 
     * @param nick nick del administrador
     * @return administrador si lo encuentra, null si no.
     */
    public Administrador obtenerAdministrador (String nick)
    {
        for(Administrador a: Administradores_)
        {
            if (a.getNick().equals(nick))
                return a;
        }
        return null;
    }
    /**
     * Crea una categoria nueva dentro del foro
     * 
     * @param tematica Título de la cateogria
     */
    public void crearCategoria (String tematica) 
    {
        Categorias_.add(new Categoria (tematica));
    }    
    
    /**
     * Elimina una catogoria existente dentro del foro
     * 
     * @param cat Categoría a borrar
     */
    public void eliminarCategoria ( Categoria cat )
    {
       boolean i = Categorias_.remove(cat);
    }   
    
    /**
     * Convierte un forero en moderador
     * 
     * @param f forero que pasa a ser moderador
     */
    public void nombrarModerador (Forero f)
    {
       Moderadores_.add(new Moderador (f.getNick() , f.getContraseña()) );
       
    }  
    
    /**
     * Convierte un moderador en un forero común
     * 
     * @param f moderador que pasa a ser forero común
     */
    public void destituirModerador (Forero f)
    {
       Moderadores_.remove(new Moderador (f.getNick() , f.getContraseña()) );
    }   
    
    /**
     * Guarda el foro this en un archivo serializado
     * 
     * @throws IOException 
     */
    public void actualizarEnMemoria() throws IOException 
    {
        ForoOutput salida = new ForoOutput();
        salida.abrir();
        salida.escribir(this);
        salida.cerrar();
    }
    
    /**
     * Guarda en una variable un foro almacenado en un fichero
     * 
     * @return Foro almacenado en el fichero
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public static Foro recuperarDeMemoria() throws IOException, ClassNotFoundException
    {
        ForoInput entrada = new ForoInput();
        entrada.abrir();
        Foro f = entrada.leer();
        entrada.cerrar();
        
        return f;
    }
    
    /**
     * Añade un nuevo forero o administrador al foro
     * con contraseña especial. 
     * @param nick nick del nuevo forero
     * @param pass contraseña del nuevo forero
     */
    public void registrarNuevo (String nick, String pass/*, int tipo*/) 
    {
        /*  Este codigo estaba durante la creacion del Foro para hacer 
            pruebas.
        
        switch (tipo) {
            case 0:
                Foreros_.add(new Forero (nick,pass));
                Administradores_.add(new Administrador (nick, pass));
                break;
            case 1:
                Foreros_.add(new Forero (nick,pass));
                Moderadores_.add(new Moderador(nick,pass));
                break;
            default:*/
                Foreros_.add(new Forero (nick,pass));
                if("admin".equals(pass))
                    Administradores_.add(new Administrador (nick, pass));
                /*break;
   
        }*/
        
        
    }
    /**
     * 
     * @return ArrayList de las categorias del foro
     */
    public ArrayList<Categoria> listadoCategorias()
    {
        ArrayList<Categoria> c = new ArrayList<>();
        
        for (Categoria cat : Categorias_){
            c.add(cat);
        }
       
        return c;
    }     
    
   /**
    * 
    * @param user
    * @return Rol del forero pasado como parámetro
    */
    public String dameRol(Forero user) {
        
        String rol = "Forero";
        
        if(Administradores_.contains(new Administrador(user.getNick(),user.getContraseña()))) 
            rol = "Administrador";
        if(Moderadores_.contains(new Moderador(user.getNick(),user.getContraseña())))
            rol = "Moderador";
        return rol;
    } 
    
    /**
     * ordena las cateogrias por numero de mensajes publicados
     * 
     * @param c 
     */
    public void listadoCategorias (Comparator c) 
    {
        Moderadores_.sort(new NumSancionesModerador());
    } 
    
    /**
     * 
     * @return ArrayList de moderadores ordenada por orden alfabetico
     */
    public ArrayList<Moderador> getModeradores() {
        Collections.sort(Moderadores_);
        return Moderadores_;
    }
    
    /**
     * 
     * @return ArrayList de moderador ordenada por nº de foreros sancionados
     */
    public ArrayList<Moderador> getModeradoresOrdenado()
    {
        ArrayList<Moderador> ordenados = new ArrayList();
        ordenados.addAll(Moderadores_);
        ordenados.sort(new NumSancionesModerador());
        return ordenados;
    }
    
    public void setModeradores(Moderador m)
    {
        Collections.sort(Moderadores_);
        Moderadores_.add(m);
    }

    
    public HashSet<Forero> getForeros() {
        return Foreros_;
    }
    
    public ArrayList<Administrador> getAdministradores()
    {
        return Administradores_;
    }
    
    public HashSet<Categoria> getCategorias()
    {
        return Categorias_;
    }

    public void actualizarEnMemoria(String text) throws IOException {
        ForoOutput salida = new ForoOutput(text);
        salida.abrir();
        salida.escribir(this);
        salida.cerrar();
    }
 
}
