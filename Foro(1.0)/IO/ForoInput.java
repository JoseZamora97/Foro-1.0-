
package foropractica.IO;

import foropractica.Clases.Foro.Foro;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/** 
* Clase ForoInput, para leer el foro serializado en el archivo "datosForo.ser"
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class ForoInput {
    private FileInputStream file;
    private ObjectInputStream input;
    
    public void abrir() throws FileNotFoundException, IOException
    {
        file = new FileInputStream ("datosForo.ser");
        input = new ObjectInputStream (file);
    }
    
    public void cerrar() throws IOException 
    {
        if(input!=null)
            input.close();
    }
    
    /**
     * 
     * @return Foro almacenado en el fichero serializado
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public Foro leer() throws IOException, ClassNotFoundException 
    {
        Foro foro = null;
        
        if (input!=null){
            try{
                foro = (Foro) input.readObject();
            }catch(EOFException eof) {}
        }
        
        return foro;
    }
}
