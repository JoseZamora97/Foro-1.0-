/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foropractica.Paneles;

import foropractica.Clases.Forero.Moderador;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/** 
* Clase panelModeradores, muestra el numero de foreros sancionados en la 
* actualidad y a lo largo de la historia del foro.
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class panelModeradores extends javax.swing.JPanel implements ListCellRenderer {

    /**
     * Creates new form panelModeradores
     */
    public panelModeradores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombModerador = new javax.swing.JLabel();
        NumeroActuales = new javax.swing.JLabel();
        NumeroHistorico = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        nombModerador.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nombModerador.setText("jLabel1");
        jPanel1.add(nombModerador);

        NumeroActuales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumeroActuales.setText("jLabel2");
        jPanel1.add(NumeroActuales);

        NumeroHistorico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumeroHistorico.setText("jLabel2");
        jPanel1.add(NumeroHistorico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumeroActuales;
    private javax.swing.JLabel NumeroHistorico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombModerador;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Moderador m = (Moderador) value;
        nombModerador.setText(m.getNick());
        NumeroActuales.setText(Integer.toString(m.forerosSancionados(false).size()));
        NumeroHistorico.setText(Integer.toString(m.forerosSancionados(true).size()));
        
        return this;
    }
}
