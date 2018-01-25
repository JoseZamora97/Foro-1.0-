
package foropractica.Ventanas;

import foropractica.Clases.Forero.Forero;
import foropractica.Clases.Foro.Foro;
import java.io.File; //no borrar pls
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/** 
* Clase ventanaLogin, permite a un usuario loggearse o crear una cuenta nueva y
* acceder al foro guardado en un fichero
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/
public class ventanaLogin extends javax.swing.JFrame {

    /**
     * Creates new form ventanaLogin
     */
    static Foro foro_;
    static Forero user;
    
    public ventanaLogin() throws IOException
    {
        initComponents();
        
        /*File fich = new File ("datosForo.ser");
        Foro f = new Foro ("1O n POO");
        foro_ = f;       
        foro_.actualizarEnMemoria();*/
       
        
        // Localizacion.
        this.setLocationRelativeTo(null);
        
        // Labels de Error no visibles.
        labelError.setVisible(false);  
        labelErrorContraseña.setVisible(false);
        panelRegistro.setVisible(false);
                    
        try 
        {
            foro_  = Foro.recuperarDeMemoria();
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(ventanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (foro_  == null )
        {
            foro_ = new Foro ("FOROMOTOS");
            foro_.actualizarEnMemoria();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        textNick = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        labelError = new javax.swing.JLabel();
        textPass = new javax.swing.JPasswordField();
        panelRegistro = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        nickRegistro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        textPass1 = new javax.swing.JPasswordField();
        textPass2 = new javax.swing.JPasswordField();
        labelErrorContraseña = new javax.swing.JLabel();
        panelmgForo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(48, 41, 57));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel2PropertyChange(evt);
            }
        });

        panelLogin.setBackground(new java.awt.Color(48, 41, 57));

        textNick.setBackground(new java.awt.Color(80, 89, 92));
        textNick.setForeground(new java.awt.Color(255, 255, 255));
        textNick.setToolTipText("Introduce tu Nick...");

        jLabel1.setFont(new java.awt.Font("Dubai Light", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 155, 155));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/nick_16px.png"))); // NOI18N
        jLabel1.setText("NICK:");

        jLabel2.setFont(new java.awt.Font("Dubai Light", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 155, 155));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Key_16px.png"))); // NOI18N
        jLabel2.setText("PASS:");

        btnEntrar.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(0, 0, 0));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnRegistro.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistro.setText("Crear cuenta");
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
        });

        labelError.setForeground(new java.awt.Color(255, 51, 51));
        labelError.setText("Usuario no encontrado.");

        textPass.setBackground(new java.awt.Color(80, 89, 92));
        textPass.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(btnRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEntrar))
                    .addComponent(textNick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(textPass))
                .addGap(39, 39, 39))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(labelError)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistro)
                    .addComponent(btnEntrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(labelError))
        );

        panelRegistro.setBackground(new java.awt.Color(48, 41, 57));

        btnCrear.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(0, 0, 0));
        btnCrear.setText("Crear");
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        nickRegistro.setBackground(new java.awt.Color(80, 89, 92));
        nickRegistro.setForeground(new java.awt.Color(255, 255, 255));
        nickRegistro.setToolTipText("Seleccione su Nick...");

        jLabel5.setFont(new java.awt.Font("Dubai Light", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 155, 155));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/nick_16px.png"))); // NOI18N
        jLabel5.setText("NICK:");

        jLabel6.setFont(new java.awt.Font("Dubai Light", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(233, 155, 155));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Key_16px.png"))); // NOI18N
        jLabel6.setText("PASS:");

        btnAtras.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("Atrás");
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });

        textPass1.setBackground(new java.awt.Color(80, 89, 92));
        textPass1.setForeground(new java.awt.Color(255, 255, 255));

        textPass2.setBackground(new java.awt.Color(80, 89, 92));
        textPass2.setForeground(new java.awt.Color(255, 255, 255));

        labelErrorContraseña.setForeground(new java.awt.Color(255, 51, 51));
        labelErrorContraseña.setText("Las contraseñas no coinciden");

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(btnAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCrear))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelErrorContraseña)
                            .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textPass2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                .addComponent(nickRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                .addComponent(textPass1)))))
                .addGap(38, 38, 38))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nickRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras)
                    .addComponent(btnCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(labelErrorContraseña)
                .addContainerGap())
        );

        panelmgForo.setBackground(new java.awt.Color(48, 41, 57));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Sin título-2.png"))); // NOI18N

        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/btnSalir_16px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 3, 43)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 155, 155));
        jLabel3.setText("1O N POO");

        javax.swing.GroupLayout panelmgForoLayout = new javax.swing.GroupLayout(panelmgForo);
        panelmgForo.setLayout(panelmgForoLayout);
        panelmgForoLayout.setHorizontalGroup(
            panelmgForoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelmgForoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(panelmgForoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        panelmgForoLayout.setVerticalGroup(
            panelmgForoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmgForoLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(panelmgForoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelmgForoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelmgForoLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelmgForo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelmgForo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseClicked
        // TODO add your handling code here:
        panelLogin.setVisible(false);
        panelRegistro.setVisible(true);
    }//GEN-LAST:event_btnRegistroMouseClicked

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
        // TODO add your handling code here:
        
        if(labelError.isVisible())
            labelError.setVisible(false);
        
        if(!"".equals(textPass1.getText()) || !"".equals(textPass2.getText()) || !"".equals(nickRegistro.getText())) 
        {
            if(textPass1.getText().equals(textPass2.getText()))
            {
                foro_.registrarNuevo(nickRegistro.getText(), textPass1.getText());
                user = foro_.obtenerForero(nickRegistro.getText(),textPass2.getText());
                
                               
                ventanaPrincipal.foro_ = foro_;
                ventanaPrincipal.user = user;
                ventanaPrincipal.rol = foro_.dameRol(user);
                ventanaPrincipal ventanaPrincipal = new ventanaPrincipal();

                System.out.print("Se añadio el Forero: " + ventanaPrincipal.user.toString());                
                try {
                    foro_.actualizarEnMemoria();
                } catch (IOException ex) {
                    Logger.getLogger(ventanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
                ventanaPrincipal.setVisible(true);

                this.dispose();
            }
            else
            { 
                textPass1.setText("");
                textPass2.setText("");
                labelErrorContraseña.setVisible(true);
            }
        }
        else
        {
            labelError.setText("Hay campos vacios...");
            labelError.setVisible(true);
        }             
    }//GEN-LAST:event_btnCrearMouseClicked
    
    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        // TODO add your handling code here:
        panelRegistro.setVisible(false);
        panelLogin.setVisible(true);
        if(labelError.isVisible())
            labelError.setVisible(false);
        
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void jPanel2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel2PropertyChange

    }//GEN-LAST:event_jPanel2PropertyChange

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
        Forero forero = foro_.obtenerForero(textNick.getText(), textPass.getText());
        
        if (forero == null)
            {
                labelError.setVisible(true);
                textNick.setText("");
                textPass.setText("");
            }
        else 
        {
            user = forero;                       
            ventanaPrincipal.foro_ = foro_;
            ventanaPrincipal.user = user;
            ventanaPrincipal.rol = foro_.dameRol(user);
            
            ventanaPrincipal ventanaPrincipal = new ventanaPrincipal();       
            System.out.print("Se añadio el Forero: " + ventanaPrincipal.user.toString());                

            ventanaPrincipal.setVisible(true);
                
            this.dispose();
        }
        
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ventanaLogin().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ventanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelErrorContraseña;
    private javax.swing.JTextField nickRegistro;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPanel panelmgForo;
    private javax.swing.JTextField textNick;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JPasswordField textPass1;
    private javax.swing.JPasswordField textPass2;
    // End of variables declaration//GEN-END:variables


}