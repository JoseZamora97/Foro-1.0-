package foropractica.Clases.Foro;

import java.io.Serializable;
import java.util.*;

/** 
* Clase Mensaje
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class Mensaje implements Serializable, Comparable {

    private final String autor;
    private final String titulo;
    private final String cuerpo;
    private final int numPalabras;
    private final Date fecha;

    /**Contructor de Mensaje
     * 
     * @param autor Autor del mensaje
     * @param titulo Título del mensaje
     * @param cuerpo Cuerpo del mensaje
     */
    public Mensaje(String autor, String titulo, String cuerpo) {
        this.autor = autor;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.numPalabras = contarPalabras(cuerpo);
        this.fecha = new Date();

    }

    //GETS
    public String getFecha() {
        String date = this.fecha.toString();
        return date;

    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getCuerpo() {
        return this.cuerpo;
    }

    public int getNumPalabras() {
        return this.numPalabras;
    }

    /** Cuenta el numero de palabras que tiene un mensaje
     * 
     * @param e cuerpo del mensaje
     * @return  numero de palabras que tiene el mensaje
     */
    private int contarPalabras(String e) {
        StringTokenizer st = new StringTokenizer(e);
        return st.countTokens();
    }

    // Equals, hashcode y compareTo
    @Override
    public int hashCode() {
        return this.getTitulo().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }

        Mensaje m = (Mensaje) o;
        return (this.getTitulo().equals(m.getTitulo()));
    }

    @Override
    public int compareTo(Object o) {
        Mensaje m = (Mensaje) o;
        return (this.getTitulo().compareTo(m.getTitulo()));
    }
    
    @Override
    public String toString()
    {
        return ("Fecha: " + this.getFecha() + "\n" +
                "Titulo: " + this.getTitulo() + "\n" + 
                "Cuerpo: " + this.getCuerpo() + "\n" + 
                "Numero de palabras: " + this.getNumPalabras()
                );
    }
}
