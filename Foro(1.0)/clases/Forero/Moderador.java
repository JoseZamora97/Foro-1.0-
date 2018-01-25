
package foropractica.Clases.Forero;
import java.util.ArrayList;

/** 
* Clase Moderador
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class Moderador extends Forero implements Comparable  {
    
    protected static ArrayList<Forero> ForerosSancionados;
    protected static ArrayList<Forero> ForerosSancionadosHist;
    
    /**
     * 
     * @param nick nick del forero
     * @param contraseña contraseña
     */
    public Moderador(String nick, String contraseña) 
    {
        super(nick, contraseña);
        ForerosSancionados = new ArrayList<>();
        ForerosSancionadosHist = new ArrayList<>();
    }
    
    // METODOS 
    /**
     * 
     * @param f forero al que sanciona el moderador
     */
    public void sancionar (Forero f) 
    {
        f.setSancionado(true);
        ForerosSancionados.add(f);
        ForerosSancionadosHist.add(f);
        f.setVecesSancionados(f.getVecesSancionado()+1);
    }
    
    /**
     * 
     * @param f forero al que el moderador le levanta la sancion
     */
    public void levantarSancion (Forero f) 
    {       
        ForerosSancionados.remove(f);
        f.setSancionado(false);
    }

    /**
     * 
     * @param historico
     * @return ForerosSancionadosHist si historico == true, ForerosSancionados e.o.c.
     */
    public ArrayList<Forero> forerosSancionados ( boolean historico ) 
    {
        if(historico)   
            return ForerosSancionadosHist;

        return ForerosSancionados;
    }
    
    @Override
    public int compareTo (Object o)
    {
        Moderador otro = (Moderador) o;
        return otro.getNick().compareTo(this.getNick());
    }
    
    public ArrayList<Forero> getForerosSancionados()
    {
        return ForerosSancionados;
    }
    
    public ArrayList<Forero> getForerosSancionadosHist()
    {
        return ForerosSancionadosHist;
    }
        
   
}
