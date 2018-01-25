
package foropractica.Clases.Foro;

import java.io.Serializable;
import java.util.*;

/** 
* Clase Csategoría
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class Categoria implements Serializable, Comparable
{
    
    private final String nombre;
    private ArrayList <Hilo> Hilos;
    
    /**
     * 
     * @param nombre nombre de la categoria
     */
    public Categoria(String nombre) 
    {
        this.nombre = nombre;
        Hilos = new ArrayList <> ();
    }
    
    //GETS:
    public String getNombre()
    {
        return this.nombre;
    }
    
    public ArrayList<Hilo> getArrayHilos() 
    {
        return this.Hilos;
    }
    
    /**
     * 
     * @return numero de hilos de la categoria
     */
    public int numHilosCreados()
    {
        return Hilos.size();
    }
     
    /**
     * Añade un nuevo hilo a la categoria
     * 
     * @param titulo titulo del hilo
     * @param menini mensaje incial del hilo creado
     */
    public void crearHilo(String titulo, Mensaje menini) 
    {
        Hilos.add(new Hilo (titulo, menini));
    }
    
    /**
     * Elimina un hilo de la categoria
     * 
     * @param h Hilo a borrar
     */
    public void eliminarHilo(Hilo h) 
    {
        Iterator it = Hilos.iterator();
        while (it.hasNext())
        {
            Hilo k = (Hilo) it.next();
            if (k.equals(h))
            {
                it.remove();
            }          
        }
    }
    /**
     * Elimina un hilo de la categoria
     * 
     * @param titulo titulo del hilo a borrar
     */
    public void eliminarHilo(String titulo) 
    {
        Iterator it = Hilos.iterator();
        while (it.hasNext())
        {
            Hilo k = (Hilo) it.next();
            if (k.getTitulo().equals(titulo))
            {
                it.remove();
            }          
        }
    }
    
    
    //Equals, hashcode y compareTo
    @Override
    public int compareTo(Object o) 
    {
        Categoria c = (Categoria) o;
        int numMensajesThis = 0;
        int numMensajesC = 0;
        
        for(Hilo h : this.getArrayHilos()){
            numMensajesThis += h.getNumMensajes();
        }
        
        for(Hilo  h : c.getArrayHilos()){
            numMensajesC += h.getNumMensajes();
        }
        
        return new Integer(numMensajesThis).compareTo(numMensajesC);       
    }
    
    @Override
    public int hashCode()
    {
        return this.getNombre().hashCode();
    }

    @Override
    public boolean equals (Object o)
    {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        
        Categoria c = (Categoria) o;
        return (this.getNombre().equals (c.getNombre()));
    }
    
    public int getNumPalabras(){
        int numPalabras = 0;
        for(Hilo h : this.getArrayHilos()){
            for(Mensaje m : h.getStack()){
                numPalabras += m.getNumPalabras();
            }
        }
        return numPalabras;
    }
        
    public int getNumMensajes(){
        int numMensajes = 0;
        for(Hilo h : this.getArrayHilos())
            numMensajes += h.getNumMensajes();
        return numMensajes;
    }
    
    
}
