
package foropractica.Paneles;

import foropractica.Clases.Forero.Forero;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/** 
* Clase panelForero, muestra la informacion de un forero en particular en la
* interfaz gráfica
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class panelForero extends javax.swing.JPanel implements ListCellRenderer {

    /**
     * Creates new form panelForero
     */
    public panelForero() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNick = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        labelSancionado = new javax.swing.JLabel();
        labelNumSancionado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 155, 155));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setLayout(new java.awt.GridLayout(1, 0, 20, 10));

        labelNick.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        labelNick.setForeground(new java.awt.Color(48, 41, 57));
        labelNick.setText("jLabel1");
        add(labelNick);

        labelNombre.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(48, 41, 57));
        labelNombre.setText("jLabel2");
        add(labelNombre);

        labelApellidos.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        labelApellidos.setForeground(new java.awt.Color(48, 41, 57));
        labelApellidos.setText("jLabel3");
        add(labelApellidos);

        labelSancionado.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        labelSancionado.setForeground(new java.awt.Color(48, 41, 57));
        labelSancionado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSancionado.setText("jLabel4");
        add(labelSancionado);

        labelNumSancionado.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        labelNumSancionado.setForeground(new java.awt.Color(48, 41, 57));
        labelNumSancionado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumSancionado.setText("jLabel5");
        add(labelNumSancionado);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelNick;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNumSancionado;
    private javax.swing.JLabel labelSancionado;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Forero forero_ = (Forero) value;
        labelNick.setText(forero_.getNick());
        
        if(!forero_.getApellidos().isEmpty())
        {
            labelApellidos.setText(forero_.getApellidos());
        }else{
            labelApellidos.setText("<unknown>");
        }
        
        if(!forero_.getNombre().isEmpty())
        {
            labelNombre.setText(forero_.getNombre());
        }else{
            labelNombre.setText("<unknown>");
        }
        
        labelNumSancionado.setText(Integer.toString(forero_.getVecesSancionado()));
        
        if(forero_.getSancionado())
        {
            labelSancionado.setText("Si");
        }else{
            labelSancionado.setText("No");
        }
        return this;
    }
}
