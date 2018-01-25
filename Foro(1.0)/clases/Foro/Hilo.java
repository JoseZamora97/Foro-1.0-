
package foropractica.Clases.Foro;
import java.io.Serializable;
import java.util.*;

/** 
* Clase Hilo
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class Hilo implements Serializable, Comparable
{
    
    private final String titulo;
    private Stack <Mensaje> mensajes;
    private final Mensaje mensajeInicio;
    private final Date fecha;
    
    /**Contructor de Hilo
     * 
     * @param titulo titulo del hilo
     * @param men mesnaje inicial del hilo
     */
    public Hilo (String titulo, Mensaje men)
    {
        this.titulo = titulo;
        mensajes = new Stack<> ();
        this.mensajeInicio = men;
        mensajes.add(men);
        this.fecha = new Date();
    }
    
    //GETS: 
    public String getFecha()
    {
        return this.fecha.toString();
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    
    /**Crear mensaje dentro del hilo
     * 
     * @param autor autor del mensaje
     * @param tit tutlo del mensaje
     * @param cuerpo cuerpo del mensaje
     * @return  true si se creó el mensaje correctamente
     */
    public boolean crearMensaje (String autor, String tit, String cuerpo) 
    {
        Mensaje m = new Mensaje (autor, tit, cuerpo);
        return this.mensajes.add (m);     
    }
    
    /**Borrar mensaje dentro del hilo
     * 
     * @param m mensaje a borrar
     */
    public void borrarMensaje (Mensaje m) 
    {
        Iterator it = mensajes.iterator();
        while (it.hasNext())
        {
            Mensaje n = (Mensaje) it.next();
            if (n.equals(m))
            {
                it.remove();
            }
        }
    }
    /**Borrar mensaje dentro del hilo
     * 
     * @param titulo titulo del mensaje a borrar
     */
    public void borrarMensaje (String titulo) 
    {
        Iterator it = mensajes.iterator();
        while (it.hasNext())
        {
            Mensaje n = (Mensaje) it.next();
            if (n.getTitulo().equals(titulo))
            {
                it.remove();
            }
        }
    }
    // Equals, hashcode y compare to
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        
        Hilo h = (Hilo) o;
        return (this.getTitulo().equals(h.getTitulo()));
    }
    
    @Override
    public int hashCode()
    {
        return this.getTitulo().hashCode();
    }
    
    @Override
    public int compareTo(Object o) 
    {
        Hilo h = (Hilo) o;
        return this.getTitulo().compareTo(h.getTitulo());
    }

    public Stack<Mensaje> getStack() 
    {
        return mensajes;
    }

    public int getNumMensajes() 
    {
        return mensajes.size();
    }
    
    public Stack<Mensaje> getMensajes()
    {
        return mensajes;
    }

    public String getAutor() 
    {
        return this.mensajeInicio.getAutor();
    }
}
