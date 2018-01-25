/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foropractica.Comparadores;

import foropractica.Clases.Foro.*;
import java.util.Comparator;

/** 
* Clase NumMensajesCat, para ordenar las categorias por numero de mensajes
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/
public class NumMensajesCat implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        Categoria c1 = (Categoria) t;
        Categoria c2 = (Categoria) t1;
        
        int numPalabrasC1 = 0;
        int numPalabrasC2 = 0;
        
        for(Hilo h : c1.getArrayHilos()){
            for(Mensaje m : h.getStack()){
                numPalabrasC1 += m.getNumPalabras();
            }
        }
        
        for(Hilo g : c2.getArrayHilos()){
            for(Mensaje d : g.getStack()){
                numPalabrasC2 += d.getNumPalabras();
            }
        }
        
        if(numPalabrasC1<numPalabrasC2)         return 1;
        else if(numPalabrasC1>numPalabrasC2)    return -1;
        
        return 0;
        
    }
    
    
}
