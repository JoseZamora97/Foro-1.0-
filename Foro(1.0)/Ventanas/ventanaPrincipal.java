package foropractica.Ventanas;

import foropractica.Clases.Forero   .*;
import foropractica.Clases.Foro     .*;
import foropractica.Comparadores.NumMensajesCat;
import foropractica.Paneles         .*;
import foropractica.Ventanas.Aviso.ventanaAvisoNoCategoria;
import java.io.File;
import javax.swing                  .DefaultListModel;
import java.io                      .IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/** 
* Clase ventanaPrincipal, da uso a todas las ventanas disponibles en el proyecto
* y muestra informacion de usuario, categorias e hilos
*
* @author David Correas, Alejandro Quesada, José Zamora
* @version 4/1/2018
*/


public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */    
    static Foro             foro_;
    static Forero           user;
    static String           rol;
    static Categoria        categoria_;
    static Hilo             hilo_;
    
    static DefaultListModel listCategorias = new DefaultListModel();
    static DefaultListModel listHilos = new DefaultListModel();
   
    static void iniciarCategorias() {
        for(Categoria c : ventanaLogin.foro_.listadoCategorias()){
              listCategorias.addElement(c);
        }
    }
    static void refrescarCategorias() {
        listCategorias.clear();
        ArrayList<Categoria> listaCategorias = new ArrayList(foro_.listadoCategorias());
        Collections.sort(listaCategorias);
        Collections.reverse(listaCategorias);
          for(Categoria c : listaCategorias){
              listCategorias.addElement(c);
          }
    }
    
    static void refrescarNumero(){
        lbNumMensajes.setText("Numero de mensajes: " + categoria_.getNumMensajes());
        lbNumPalabras.setText("Numero de palabras: " + categoria_.getNumPalabras());
    }
    
    static void refrescarHilos() {
        listaHilos.setModel(listHilos);
        listaHilos.setCellRenderer( new panelHilos(categoria_));
        listHilos.clear();
          for(Hilo h : categoria_.getArrayHilos()){
              listHilos.addElement(h);
          }
    }

   
    public ventanaPrincipal() {
        user = ventanaLogin.user;
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        iniciarCategorias();
        refrescarCategorias();
        lblRuta.setText("");
        lbNumMensajes.setText("");
        lbNumPalabras.setText("");
        btnBorrarCat.setVisible(false);
        
        btnCrearCategoria.setVisible(false);
        btnCrearCategoria.setEnabled(false);
        
        btnCrearCategoria.setVisible(false);
        btnCrearCategoria.setEnabled(false);
        btnBorrarCat.setEnabled(false);
        
        menuItemListaModeradores.setVisible(false);
        menuItemListaModeradores.setEnabled(false);
        
        if ("Administrador".equals(ventanaLogin.foro_.dameRol(ventanaLogin.user))) //if eres administrador
        {
            btnCrearCategoria.setVisible(true);
            btnCrearCategoria.setEnabled(true);
            btnBorrarCat.setEnabled(true);
            
            menuItemListaModeradores.setVisible(true);
            menuItemListaModeradores.setEnabled(true);
        }
        else if("Moderador".equals(ventanaLogin.foro_.dameRol(ventanaLogin.user)) /* && !"Administrador".equals(ventanaLogin.foro_.dameRol(ventanaLogin.user))*/) //if eres moderador
        {
            menuItemListaForeros.setVisible(true);
            menuItemListaForeros.setEnabled(true);  
        }
        
        if(user.getSancionado())
        {
            btnCrearHilo.setVisible(false);
        }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTematica = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelInfoNick = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelInfoMensajes = new javax.swing.JLabel();
        labelInfoRol = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblCategorias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCat = new javax.swing.JList<>();
        tbOrdenarPalabras = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        lblRuta = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaHilos = new javax.swing.JList<>();
        btnCrearHilo = new javax.swing.JButton();
        btnCrearCategoria = new javax.swing.JButton();
        btnBorrarCat = new javax.swing.JButton();
        lbNumMensajes = new javax.swing.JLabel();
        lbNumPalabras = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuForo = new javax.swing.JMenu();
        menuItemGuardar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        menuItemCerrar = new javax.swing.JMenuItem();
        menuHerramientas = new javax.swing.JMenu();
        menuItemListaForeros = new javax.swing.JMenuItem();
        menuItemListaModeradores = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        menuItemVerPerfil = new javax.swing.JMenuItem();
        menuItemMensajesATxt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(48, 41, 57));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(48, 41, 57));

        lblTematica.setFont(new java.awt.Font("Eras Demi ITC", 3, 48)); // NOI18N
        lblTematica.setForeground(new java.awt.Color(233, 155, 155));
        lblTematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Sin título-2.png"))); // NOI18N
        lblTematica.setText(ventanaLogin.foro_.getTematica().toUpperCase());

        jPanel5.setBackground(new java.awt.Color(48, 41, 57));
        jPanel5.setForeground(new java.awt.Color(48, 41, 57));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/User Male_40px.png"))); // NOI18N
        jLabel5.setToolTipText(ventanaPrincipal.user.toString());
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/btnSalir_16px.png"))); // NOI18N
        jButton1.setToolTipText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 216, 216));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/nick_16px.png"))); // NOI18N
        jLabel3.setToolTipText("Nick");

        labelInfoNick.setText(ventanaLogin.user.getNick());
        labelInfoNick.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        labelInfoNick.setForeground(new java.awt.Color(255, 216, 216));

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 216, 216));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/numMensajes_16px.png"))); // NOI18N
        jLabel4.setToolTipText("Total de Mensajes Publicados");

        Integer i = new Integer(ventanaLogin.user.numMensajes());
        labelInfoMensajes.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        labelInfoMensajes.setForeground(new java.awt.Color(255, 216, 216));

        labelInfoRol.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        labelInfoRol.setForeground(new java.awt.Color(255, 216, 216));
        labelInfoRol.setText("");
        if(ventanaPrincipal.foro_.dameRol(ventanaPrincipal.user) == "Administrador"){
            labelInfoRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Crown_16px.png")));
            labelInfoRol.setText("Administrador");
            labelInfoRol.setToolTipText("Eres un Administrador");
        }else if(ventanaPrincipal.foro_.dameRol(ventanaPrincipal.user) == "Moderador"){
            labelInfoRol.setToolTipText("Eres un Moderador");
            labelInfoRol.setText("Moderador");
            labelInfoRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Sergeant SGT_16px.png")));
        }else{
            labelInfoRol.setToolTipText("Eres un forero");
            labelInfoRol.setText("Forero");
            labelInfoRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Theatre Mask_16px.png")));
        }

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Sign Out_16px.png"))); // NOI18N
        jButton2.setToolTipText("Cambiar de Usuario...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelInfoNick, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelInfoMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(labelInfoRol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(labelInfoNick, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelInfoMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelInfoRol))
                    .addComponent(lblTematica))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelInfoMensajes.setText(Integer.toString(ventanaPrincipal.user.getNumMensajes()));

        jPanel3.setBackground(new java.awt.Color(80, 89, 92));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(80, 89, 92));

        lblCategorias.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 216, 216));
        lblCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/cat_16px.png"))); // NOI18N
        lblCategorias.setText("Categorías:");

        listCat.setModel(listCategorias);
        listCat.setCellRenderer(new panelCategoria(foro_));
        listCat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listCat);

        tbOrdenarPalabras.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        tbOrdenarPalabras.setText("Ordenar por número de palabras");
        tbOrdenarPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbOrdenarPalabrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblCategorias)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tbOrdenarPalabras)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblCategorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tbOrdenarPalabras)
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(80, 89, 92));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRuta.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        lblRuta.setForeground(new java.awt.Color(255, 216, 216));
        lblRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Code_30px.png"))); // NOI18N
        lblRuta.setText("[nombre de la Categoria]");

        listaHilos.setModel(listHilos);
        listaHilos.setCellRenderer(new panelHilos(categoria_));
        listaHilos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaHilosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaHilos);

        btnCrearHilo.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btnCrearHilo.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearHilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Add File_16px.png"))); // NOI18N
        btnCrearHilo.setToolTipText("Crear Hilo");
        btnCrearHilo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearHiloMouseClicked(evt);
            }
        });

        btnCrearCategoria.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btnCrearCategoria.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/crear cat_16px.png"))); // NOI18N
        btnCrearCategoria.setToolTipText("Crear Categoria");
        btnCrearCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearCategoriaMouseClicked(evt);
            }
        });

        btnBorrarCat.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btnBorrarCat.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrarCat.setText("Borrar cat");
        btnBorrarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCatActionPerformed(evt);
            }
        });

        lbNumMensajes.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        lbNumMensajes.setText("jLabel1");

        lbNumPalabras.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        lbNumPalabras.setText("jLabel1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblRuta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNumMensajes)
                        .addGap(18, 18, 18)
                        .addComponent(lbNumPalabras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarCat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCrearCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCrearHilo)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRuta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrearHilo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBorrarCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNumPalabras)
                        .addComponent(lbNumMensajes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jMenuBar1.setBackground(new java.awt.Color(80, 89, 92));

        menuForo.setBackground(new java.awt.Color(80, 89, 92));
        menuForo.setText("Foro");
        menuForo.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N

        menuItemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Save_16px.png"))); // NOI18N
        menuItemGuardar.setText("Guardar");
        menuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGuardarActionPerformed(evt);
            }
        });
        menuForo.add(menuItemGuardar);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Save_16px.png"))); // NOI18N
        jMenuItem1.setText("Guargar como...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuForo.add(jMenuItem1);

        menuItemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Sign Out_16px.png"))); // NOI18N
        menuItemCerrarSesion.setText("Cerrar Sesión");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        menuForo.add(menuItemCerrarSesion);

        menuItemCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/btnSalir_16px.png"))); // NOI18N
        menuItemCerrar.setText("Cerrar");
        menuItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarActionPerformed(evt);
            }
        });
        menuForo.add(menuItemCerrar);

        jMenuBar1.add(menuForo);

        menuHerramientas.setBackground(new java.awt.Color(80, 89, 92));
        menuHerramientas.setText("Herramientas");
        menuHerramientas.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N

        menuItemListaForeros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        menuItemListaForeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/listaforeros_16px.png"))); // NOI18N
        menuItemListaForeros.setText("Lista Foreros...");
        menuItemListaForeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaForerosActionPerformed(evt);
            }
        });
        menuHerramientas.add(menuItemListaForeros);

        menuItemListaModeradores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuItemListaModeradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/moderad_16px.png"))); // NOI18N
        menuItemListaModeradores.setText("Lista Moderadores...");
        menuItemListaModeradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListaModeradoresActionPerformed(evt);
            }
        });
        menuHerramientas.add(menuItemListaModeradores);

        jMenuBar1.add(menuHerramientas);

        menuUsuario.setBackground(new java.awt.Color(80, 89, 92));
        menuUsuario.setText("Usuario");
        menuUsuario.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N

        menuItemVerPerfil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuItemVerPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Info_16px.png"))); // NOI18N
        menuItemVerPerfil.setText("Ver Perfil...");
        menuItemVerPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerPerfilActionPerformed(evt);
            }
        });
        menuUsuario.add(menuItemVerPerfil);

        menuItemMensajesATxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foropractica/Recursos/Foro/Send_16px.png"))); // NOI18N
        menuItemMensajesATxt.setText("Mensajes a fichero de Texto");
        menuItemMensajesATxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMensajesATxtActionPerformed(evt);
            }
        });
        menuUsuario.add(menuItemMensajesATxt);

        jMenuBar1.add(menuUsuario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCatMouseClicked
        // TODO add your handling code here:
        
        if(!listCat.isSelectionEmpty()){
            listHilos.clear();
            listaHilos.setModel(listHilos);   
        
            categoria_ = listCat.getSelectedValue();
            lblRuta.setText("Estás en la Categoría: "+categoria_.getNombre());
        
            refrescarNumero();
        
            if(!listHilos.isEmpty()){
                for(Hilo h : categoria_.getArrayHilos()){
                    listHilos.addElement(h);
                }
            }
            
            if("Administrador".equals(foro_.dameRol(user))){
                btnBorrarCat.setVisible(true);
                btnBorrarCat.setEnabled(true);
            }
                     
            refrescarHilos();
        }
        
    }//GEN-LAST:event_listCatMouseClicked

    private void btnCrearCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCategoriaMouseClicked
        // TODO add your handling code here:      
        new CrearCategoria().setVisible(true);        
    }//GEN-LAST:event_btnCrearCategoriaMouseClicked

    private void btnCrearHiloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearHiloMouseClicked
            if(categoria_!=null)
            {
                    new CrearHilo().setVisible(true);
                    labelInfoMensajes.setText(Integer.toString(user.getNumMensajes()));
            }
            else
            {
                new ventanaAvisoNoCategoria(this, true).setVisible(true);
            }
        
    }//GEN-LAST:event_btnCrearHiloMouseClicked

    private void listaHilosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaHilosMouseClicked
        // TODO add your handling code here:
        
        if(!listaHilos.isSelectionEmpty()){
            hilo_ = listaHilos.getSelectedValue();
        lblRuta.setText("Estas en la Categoría: " + categoria_.getNombre() + "// Hilo: " + hilo_.getTitulo());
        if(categoria_ != null)
            new ventanaMensaje(hilo_).setVisible(true);
        
        labelInfoMensajes.setText(Integer.toString(user.getNumMensajes()));
        }
        
        
    }//GEN-LAST:event_listaHilosMouseClicked

    private void menuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarActionPerformed
        // TODO add your handling code here:
        try {
            
            foro_.actualizarEnMemoria();
        } catch (IOException ex) {
            Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_menuItemCerrarActionPerformed

    private void menuItemListaModeradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaModeradoresActionPerformed
        
        new ventanaListaModeradores().setVisible(true);
    }//GEN-LAST:event_menuItemListaModeradoresActionPerformed

    private void menuItemVerPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerPerfilActionPerformed
        // TODO add your handling code here:
        new ventanaPerfilUser(user).setVisible(true);
    }//GEN-LAST:event_menuItemVerPerfilActionPerformed

    private void menuItemListaForerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListaForerosActionPerformed
        new ventanaListaForeros().setVisible(true);
    }//GEN-LAST:event_menuItemListaForerosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            foro_.actualizarEnMemoria();
        } catch (IOException ex) {
            Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGuardarActionPerformed
        // TODO add your handling code here:
        try {
            
            foro_.actualizarEnMemoria();
        } catch (IOException ex) {
            Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemGuardarActionPerformed

    private void btnBorrarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCatActionPerformed
        // TODO add your handling code here:
        if(categoria_ != null)  
            foro_.eliminarCategoria(categoria_);
        refrescarCategorias();
        btnBorrarCat.setVisible(false);
        btnBorrarCat.setEnabled(false);
    }//GEN-LAST:event_btnBorrarCatActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cerrarSesion();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        // TODO add your handling code here:
        cerrarSesion();
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void menuItemMensajesATxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMensajesATxtActionPerformed
        // TODO add your handling code here:
        user.listaMensjaesTXT("Mis_Mensajes_del_Foro");
    }//GEN-LAST:event_menuItemMensajesATxtActionPerformed

    private void tbOrdenarPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbOrdenarPalabrasActionPerformed
        if(tbOrdenarPalabras.isSelected())
        {
            ArrayList<Categoria> categoriaPalabras = new ArrayList(foro_.listadoCategorias());
            categoriaPalabras.sort(new NumMensajesCat());
            listCategorias.clear();
            for(Categoria c : categoriaPalabras)
                listCategorias.addElement(c);
            //listCat.setModel(listCategorias);
            
        }else{
            refrescarCategorias();
        }
    }//GEN-LAST:event_tbOrdenarPalabrasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new ventanaGuardarForoSer().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new meme().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked
    
    
    File file;
    private void cerrarSesion(){
        
            this.dispose();
        
            try{
                ventanaLogin ventanaLogin = new ventanaLogin();
                ventanaLogin.setVisible(true);
            }catch(IOException e){
                System.exit(0);
            }

    }
    
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater (new Runnable() {
            public void run() {}
        });
        
        
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCat;
    private javax.swing.JButton btnCrearCategoria;
    private javax.swing.JButton btnCrearHilo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelInfoMensajes;
    private javax.swing.JLabel labelInfoNick;
    private javax.swing.JLabel labelInfoRol;
    static javax.swing.JLabel lbNumMensajes;
    static javax.swing.JLabel lbNumPalabras;
    private javax.swing.JLabel lblCategorias;
    static javax.swing.JLabel lblRuta;
    private javax.swing.JLabel lblTematica;
    private javax.swing.JList<Categoria> listCat;
    static javax.swing.JList<Hilo> listaHilos;
    private javax.swing.JMenu menuForo;
    private javax.swing.JMenu menuHerramientas;
    private javax.swing.JMenuItem menuItemCerrar;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemGuardar;
    private javax.swing.JMenuItem menuItemListaForeros;
    private javax.swing.JMenuItem menuItemListaModeradores;
    private javax.swing.JMenuItem menuItemMensajesATxt;
    private javax.swing.JMenuItem menuItemVerPerfil;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JToggleButton tbOrdenarPalabras;
    // End of variables declaration//GEN-END:variables

    
}
