
package foropractica.IO;

import foropractica.Clases.Foro.Foro;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/** 
* Clase ForoOutput, para escribir el foro serializado en el archivo datosFor.ser
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class ForoOutput implements Serializable 
{
    private FileOutputStream file;
    private ObjectOutputStream output;
    private String nombre;
    
    public ForoOutput(){
        nombre = "datosForo.ser";
    }
    
    public ForoOutput(String nombre){
        this.nombre = nombre;
    }
    
    public void abrir () throws IOException 
    {
        file = new FileOutputStream(nombre);
        output = new ObjectOutputStream(file);
    }
    public void cerrar () throws IOException 
    {
        if (output!=null)
            output.close();
    }
    
    /**
     * 
     * @param foro Foro a escribir en un archivo serializado
     * @throws IOException 
     */
    public void escribir (Foro foro) throws IOException
    {
        if(output!=null)
            output.writeObject(foro);
    }
    
}
