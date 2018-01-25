package foropractica.Ventanas;

import foropractica.Clases.Forero.Forero;

/** 
* Clase ventanaPerfilUser. permite actualizar la informacion de un usuario en 
* particular
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/

public class ventanaPerfilUser extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPerfilUser
     */
    Forero user;
    public ventanaPerfilUser(Forero user) {
        this.user = user;
        this.setLocationRelativeTo(null);
        initComponents();        
        textNombre.setVisible(false);
        textApell.setVisible(false);
        textTlf.setVisible(false);
        if(user!=null){
            lblNombre.setText(user.getNombre());
            lblApellidos.setText(user.getApellidos());
            lblTlf.setText(user.getApellidos());
            lblROL.setText(ventanaPrincipal.foro_.dameRol(user));
            
            if(user.getSancionado())
                lblEstado.setText("Sancionado");
            else
                lblEstado.setText("No sancionado");            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnEditar_Guardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTlf = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textApell = new javax.swing.JTextField();
        textTlf = new javax.swing.JTextField();
        lblROL = new javax.swing.JLabel();
        btnEditar_Guardar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(48, 41, 57));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(233, 155, 155));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Info_16px.png"))); // NOI18N
        jLabel10.setText("Perfil de Usuario:");

        btnEditar_Guardar.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btnEditar_Guardar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar_Guardar.setText("Editar");
        btnEditar_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar_GuardarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(48, 41, 57));

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 155, 155));
        jLabel1.setText("Nombre:");

        lblNombre.setForeground(new java.awt.Color(233, 155, 155));
        lblNombre.setText("jLabel4");

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 155, 155));
        jLabel2.setText("Apellidos:");

        lblApellidos.setForeground(new java.awt.Color(233, 155, 155));
        lblApellidos.setText("jLabel5");

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 155, 155));
        jLabel3.setText("Teléfono:");

        lblTlf.setForeground(new java.awt.Color(233, 155, 155));
        lblTlf.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(233, 155, 155));
        jLabel7.setText("Estado:");

        lblEstado.setForeground(new java.awt.Color(233, 155, 155));
        lblEstado.setText("jLabel8");

        textNombre.setBackground(new java.awt.Color(80, 89, 92));
        textNombre.setForeground(new java.awt.Color(255, 255, 255));
        textNombre.setToolTipText("Introduce Nombre");

        textApell.setBackground(new java.awt.Color(80, 89, 92));
        textApell.setForeground(new java.awt.Color(255, 255, 255));
        textApell.setToolTipText("Introduce Apellidos");

        textTlf.setBackground(new java.awt.Color(80, 89, 92));
        textTlf.setForeground(new java.awt.Color(255, 255, 255));
        textTlf.setToolTipText("Introduce Telefono");

        lblROL.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        lblROL.setForeground(new java.awt.Color(255, 153, 51));
        lblROL.setText("[ROL]");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTlf, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(lblEstado)
                            .addComponent(lblApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textApell)
                            .addComponent(textTlf)
                            .addComponent(textNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblROL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textApell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(textTlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblApellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblTlf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblEstado))))
                .addGap(20, 20, 20)
                .addComponent(lblROL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEditar_Guardar1.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btnEditar_Guardar1.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar_Guardar1.setText("Cerrar");
        btnEditar_Guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar_Guardar1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/User Male_40px.png"))); // NOI18N
        jLabel4.setToolTipText(ventanaPrincipal.user.toString());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditar_Guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4))
                            .addComponent(btnEditar_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnEditar_Guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnEditar_Guardar1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditar_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar_GuardarActionPerformed
        // TODO add your handling code here:
        
        if(btnEditar_Guardar.getText().equals("Editar")){
            
            textNombre.setVisible(true);
            textApell.setVisible(true);
            textTlf.setVisible(true);
            
            btnEditar_Guardar.setText("Guardar");
        }
        else{
            
            textNombre.setVisible(false);
            textApell.setVisible(false);
            textTlf.setVisible(false);
            
            user.setNombre(textNombre.getText());
            textNombre.setText("");
            
            user.setApellidos(textApell.getText());
            textApell.setText("");
            
            user.setTelefono(textTlf.getText());
            textTlf.setText("");
            
            lblNombre.setText(user.getNombre());
            lblApellidos.setText(user.getApellidos());
            lblTlf.setText(user.getTelefono());
            
            btnEditar_Guardar.setText("Editar");
        }
    }//GEN-LAST:event_btnEditar_GuardarActionPerformed

    private void btnEditar_Guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar_Guardar1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnEditar_Guardar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaPerfilUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPerfilUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPerfilUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPerfilUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar_Guardar;
    private javax.swing.JButton btnEditar_Guardar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblROL;
    private javax.swing.JLabel lblTlf;
    private javax.swing.JTextField textApell;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTlf;
    // End of variables declaration//GEN-END:variables
}
