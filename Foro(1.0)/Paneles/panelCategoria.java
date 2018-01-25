
package foropractica.Paneles;

import foropractica.Clases.Foro.Categoria;
import foropractica.Clases.Foro.Foro;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/** 
* Clase PanelCategoria, carga la lista de categorias en la interfaz gráfica
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class panelCategoria extends javax.swing.JPanel implements ListCellRenderer{
  
    Foro foro_;
    public panelCategoria(Foro foro_) {
        initComponents();
        this.foro_= foro_;

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNumHilos = new javax.swing.JLabel();
        labelNombreCat = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        labelNumHilos.setForeground(new java.awt.Color(233, 155, 155));
        labelNumHilos.setText("[numHilos]");
        jPanel1.add(labelNumHilos, java.awt.BorderLayout.CENTER);

        labelNombreCat.setFont(new java.awt.Font("Eras Demi ITC", 1, 14)); // NOI18N
        labelNombreCat.setForeground(new java.awt.Color(48, 41, 57));
        labelNombreCat.setText("[nombre de la categoria]");
        labelNombreCat.setToolTipText("");
        jPanel1.add(labelNombreCat, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNombreCat;
    private javax.swing.JLabel labelNumHilos;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i,boolean isSelected, boolean cellHasFocus) {
        Categoria c = (Categoria) e;
        labelNombreCat.setText("    " + c.getNombre());
        Integer integer = c.numHilosCreados();
        labelNumHilos.setText("     " + integer.toString() + " Hilos.");
        
        if(isSelected){
          jPanel1.setBackground(Color.DARK_GRAY);
          jPanel1.setForeground(Color.WHITE);
          labelNombreCat.setForeground(Color.WHITE);
          labelNumHilos.setForeground(Color.WHITE);
        }else{
          jPanel1.setBackground(Color.WHITE);
          jPanel1.setForeground(Color.BLACK);
          labelNombreCat.setForeground(Color.BLACK);
          labelNumHilos.setForeground(Color.BLACK);
        }
        
        if(cellHasFocus){
            jPanel1.setBackground(Color.LIGHT_GRAY);
            jPanel1.setForeground(Color.WHITE);
            labelNombreCat.setForeground(Color.BLACK);
            labelNumHilos.setForeground(Color.BLACK);
        }else{
            jPanel1.setBackground(Color.WHITE);
            jPanel1.setForeground(Color.BLACK);
            labelNombreCat.setForeground(Color.BLACK);
            labelNumHilos.setForeground(Color.BLACK);
        }
        
        
        return this;
    }
}
