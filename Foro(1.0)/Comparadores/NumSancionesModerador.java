/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foropractica.Comparadores;

import foropractica.Clases.Forero.Moderador;
import java.util.Comparator;

/** 
* Clase NumSancionesModerador, para ordenar los moderadores por numero de 
* foreros sancionados
* 
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class NumSancionesModerador implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Moderador mod1 = (Moderador) o1;
        Moderador mod2 = (Moderador) o2;
        
        /*
        int i = mod1.forerosSancionados(false).size();
        int j = mod2.forerosSancionados(false).size();
         if(i<j)         return -1;
        else if(i>j)    return 1;
        return 0;
        */
        return new Integer(mod1.forerosSancionados(false).size()).compareTo(mod2.forerosSancionados(false).size());
    }
    
    
}
