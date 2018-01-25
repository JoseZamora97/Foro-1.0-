
package foropractica.Clases.Forero;

import static foropractica.Clases.Forero.Moderador.ForerosSancionados;
import foropractica.Clases.Foro.Categoria;
import foropractica.Clases.Foro.Hilo;
import foropractica.Clases.Foro.Mensaje;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;

/** 
* Clase Forero
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class Forero implements Serializable, Comparable{
    
    protected String nick;
    protected String contraseña;
    protected boolean sancionado;
    protected int veces_sancionado;
    protected int num_mensajes;
    protected ArrayList<Categoria> categoriaMasFrecuente;
    protected ArrayList<Mensaje> mensajes;
    
    
    private String nombre = "";
    private String apellidos = "";
    private String telefono = "";
    
    /**
     * Get Nombre.
     * @return nombre del Forero.
     */
    public String getNombre(){
        return this.nombre;
    }    

    /**
     * Get Apellidos.
     * @return apellidos del Forero.
     */
    public String getApellidos(){
        return this.apellidos;
    }   

    /**
     * Get Telefono.
     * @return
     */
    public String getTelefono(){
        return this.telefono;
    }    

    /**
     * Cambia el valor del Nombre.
     * @param s nombre.
     */
    public void setNombre(String s){
        this.nombre = s;
    }   

    /**
     * Cambia el valor de los Apellidos.
     * @param s apellidos.
     */
    public void setApellidos(String s){
        this.apellidos = s;
    }    

    /**
     * Cambia el valor del Telefono.
     * @param s telefono.
     */
    public void setTelefono(String s){
        this.telefono = s;
    }
    
    
    /**
     * Constructor de Forero por Nick y Contraseña.
     * @param nick 
     * @param contraseña 
     */
    public Forero ( String nick , String contraseña ) 
    { 
        this.nick = nick;
        this.contraseña = contraseña;
        this.sancionado = false;
        this.veces_sancionado = 0;
        this.num_mensajes = 0;
        categoriaMasFrecuente = new ArrayList<>();  
        mensajes = new ArrayList<>();
    }
    
    /**
     * Crea un forero a partir de otro forero.
     * @param f nuevo forema.
     */
    public Forero ( Forero f ) 
    {
        
        this.nick = f.getNick();
        this.contraseña = f.getContraseña();
        this.sancionado = f.getSancionado();
        this.veces_sancionado = f.getVecesSancionado();
        this.num_mensajes = f.getNumMensajes();
        this.categoriaMasFrecuente = f.getCategoriaMasFrecuente();
        this.mensajes = f.getMensajes();
        
    }
    
    /**
     * Get Nick
     * @return Nick del Forero.
     */
    public String getNick(){
        return this.nick;
    }

    /**
     * Get Contraseña
     * @return contraseña.
     */
    public String getContraseña(){
        return this.contraseña;
    }
    
    /**
     * Get si está sancionado o no.
     * @return booleano sacionado.
     */
    public boolean getSancionado(){
        return this.sancionado;
    }
    
    /**
     * Get numero de sanciones.
     * @return 
     */
    public int getVecesSancionado(){
        return this.veces_sancionado;
    }
    
    /**
     * Get Categorías.
     * @return array de Categorías.
     */
    public ArrayList<Categoria> getCategoriaMasFrecuente(){
        return this.categoriaMasFrecuente;
    }
    
    /**
     * Get Número de Mensajes.
     * @return numero de mensajes.
     */
    public int getNumMensajes()
    {
        return mensajes.size();
    }
    
    /**
     * Set cambia el Numero de mensajes.
     * @param a numero de mensajes.
     */
    public void setNumMensajes(int a){
       num_mensajes = a;
    }
    
    /**
     * Set cambia el Nick.
     * @param nick nuevo nick.
     */
    public void setNick(String nick){        
        this.nick = nick;     
    }
    
    /**
     * Set cambia la contraseña.
     * @param contraseña nueva contraseña.
     */
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    
    /**
     * Set cambia el sancionado.
     * @param bool estado del forero.
     */
    public void setSancionado(boolean bool){
        this.sancionado = bool;
    }
    
    /**
     * Cambia el numero de Veces sancionado.
     * @param i veces sancionado.
     */
    public void setVecesSancionados(int i){
        this.veces_sancionado = i;
    }
    
    /**
     * Sobreescritura del método toString.
     * @return un string con La informacion básica del Forero.
     */
    @Override
    public String toString(){
        
        String msg = "Nick: " + this.getNick() + "\nVeces Sancionado: " 
                              + this.getVecesSancionado();
        
        if (this.getSancionado())
            msg= msg + "\nActualmente bajo sanción\n";
        else 
            msg = msg + "\nActualmente libre de sanción\n";
        
        return msg;
    }
    
    /**
     * Sobreesctritura del método equals(Object o)
     * @param o parametro a comparar.
     * @return si son iguales o no.
     */
    @Override
    public boolean equals (Object o){
        
        if(this == o) return true;
        if(o == null) return false;
        if(this.getClass() != o.getClass() ) return false;
        
        Forero f = (Forero) o;
        return f.getNick().equals(this.getNick());
       
    }
    
    //hashcode
    @Override
    public int hashCode(){
        return this.getNick().hashCode();
    }
    
    //==========================================================================
    //METODOS:
    
    /**
     * crea un nuevo hilo
     * 
     * @param titulo
     * @param men mensaje inicial del hilo
     * @param c categoria a la que pertenece el hilo
     */
    public void crearHilo (String titulo, Mensaje men, Categoria c){
        mensajes.add (men);
    }
    /**
     * 
     * @param h hilo a eliminar
     * @param c catoria a la que pertencia el hilo
     */
    public void eliminarHilo (Hilo h, Categoria c){
        
        c.eliminarHilo(h);  
    }
    /** 
     * 
     * @param titulo titulo del mensaje
     * @param cuerpo cuerpo del mensaje
     * @param h hilo al que pertenece el mensaje
     */
    public void crearMensaje (String titulo, String cuerpo, Hilo h)
    {
        mensajes.add (new Mensaje (this.getNick(), titulo, cuerpo));
    }
    
    /**
     * 
     * @param men mensaje a borrar
     * @param h hilo al que pertence el mensaje a borrar
     */
    public void borrarMensaje (Mensaje men, Hilo h)
    {
        h.borrarMensaje(men);

    }
    
    /**
     * 
     * @return categoria mas frecuente en la que publica el forero
     */
    public Categoria CategoriaMasFrecuente(){
        return moda();
    }

    /**
     * Sobreescritura del método compareTo(Object t)
     * @param t
     * @return
     */
    @Override
    public int compareTo(Object t){
        Forero f = (Forero) t;
        return (this.getNick().compareTo(f.getNick()));
    }
    
    /**
     * Private.
     * @return categoria mas frecuente en la que publica el forero
     */
    private Categoria moda(){
        int maxRepes = 0;
        Categoria moda = null;
        
        for (int i=0; i<categoriaMasFrecuente.size(); i++)
        {
            int repes = 0;
            for (int j=0; j<categoriaMasFrecuente.size(); j++)
            {
                if (categoriaMasFrecuente.get(i).equals(categoriaMasFrecuente.get(j)))
                    repes++;
            }
            if (repes>maxRepes)
            {
                moda = categoriaMasFrecuente.get(i);
                maxRepes = repes;
            }
        }
        return moda;
    }

    /** 
     * 
     * @return numero de mensajes publicados por el forero
     */
    public int numMensajes() {
        return this.getNumMensajes();
    }
    
    /**
     * devuelve todos los mensajes publicados por el forero this en un fichero .txt
     * @param fichero nombre del fichero de texto que se va a crear
     */
    public void listaMensjaesTXT (String fichero)
    {
        try
        {
            String file = fichero+".txt";
            File fich = new File (file);
            FileWriter fw = new FileWriter (file);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter salida = new PrintWriter (bw);
            
            salida.println("Autor de los mensajes: " + this.getNick() + "\n" +
                    "Número de mensajes publicados: " + this.getNumMensajes() +
                    "\n\n----------------------------------------------------");
            for (Mensaje m : this.getMensajes())
            {
                salida.println(m.toString() + "\n" +
                        "----------------------------------------------------");
            }
            salida.close();
            
        }
        catch (IOException e){System.out.println("problema con el fichero");}   
    }

    private ArrayList<Mensaje> getMensajes()
    {
        return this.mensajes;
    }
    
    

}
