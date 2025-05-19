package com.raven.component;

import View.Admin.Admin_Login;
import View.Doctor.Doctor_Login;
import com.raven.event.EventMenu;
import com.raven.form.PanelLog;
import com.raven.form.PanelLog2;
import com.raven.swing.ButtonMenu;
import com.raven.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

public class Menu extends javax.swing.JPanel {
    public String usutipo1= Admin_Login.Tusuario;
    public String usutipo2= Doctor_Login.Tusuario;
    private EventMenu event;
    public String datosu="";
    public Menu() {
        initComponents();
        if(Admin_Login.usuarioOnline.equalsIgnoreCase("")){
        usuarioACT.setText(Doctor_Login.usuarioOnline);
        Tipo.setText(Doctor_Login.Tusuario="Veterinario");
        datosu= "Usuario "+Doctor_Login.usuarioOnline+" Rol:"+Doctor_Login.Tusuario ;
        }else{
        usuarioACT.setText(Admin_Login.usuarioOnline);
        Tipo.setText(Admin_Login.Tusuario);  
        datosu= "Usuario "+Admin_Login.usuarioOnline+" Rol:"+Admin_Login.Tusuario ;
        }
      
        setOpaque(false);
        ScrollBarCustom sb = new ScrollBarCustom();
        sb.setForeground(new Color(130, 130, 130, 100));
        jScrollPane1.setVerticalScrollBar(sb);
        panelMenu.setLayout(new MigLayout("wrap, fillx, inset 3", "[fill]", "[]0[]"));
    }

    public void initMenu(EventMenu event) {
        this.event = event;
        if(Admin_Login.Tusuario.equalsIgnoreCase("recepcionista")){
        ImageIcon iconoMascota = new ImageIcon(getClass().getResource("/com/raven/icon/recepcionista.png"));
        imageAvatar1.setIcon(iconoMascota);

        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/1.png")), "Home", 0);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/2.png")), "Clientes", 1);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/3.png")), "Mascotas", 2);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "Citas", 3);   
        }else if(Admin_Login.Tusuario.equalsIgnoreCase("admin")){
            
        ImageIcon iconoMascota = new ImageIcon(getClass().getResource("/com/raven/icon/perfil1.png"));
        imageAvatar1.setIcon(iconoMascota);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/1.png")), "Home", 0);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/2.png")), "Clientes", 1);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/3.png")), "Mascotas", 2);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "Citas", 3);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/8.png")), "Configuracion Veterinaio", 4);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/8.png")), "Configuracion Usuarios", 5);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "Gestionar Diagnostico", 6);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "colas de citas", 8);
        }else{
        ImageIcon iconoMascota = new ImageIcon(getClass().getResource("/com/raven/icon/veterinario.png"));
        imageAvatar1.setIcon(iconoMascota);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/1.png")), "Home", 0);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "colas de citas", 9);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/3.png")), "Mascotas", 2);
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "Gestionar Diagnostico", 6);    
        }
        addEmpty();
        addMenu(new ImageIcon(getClass().getResource("/com/raven/icon/logout.png")), "Salir", 7);
    }
    

    private void addEmpty() {
        panelMenu.add(new JLabel(), "push");
    }

    private void addMenu(Icon icon, String text, int index) {
        ButtonMenu menu = new ButtonMenu();
        menu.setIcon(icon);
        menu.setText("  " + text);
        panelMenu.add(menu);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.selected(index);
                setSelected(menu);
            }
        });
    }

    private void setSelected(ButtonMenu menu) {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof ButtonMenu) {
                ButtonMenu b = (ButtonMenu) com;
                b.setSelected(false);
            }
        }
        menu.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.raven.swing.RoundPanel();
        imageAvatar1 = new com.raven.swing.ImageAvatar();
        usuarioACT = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        roundPanel2 = new com.raven.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();

        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));

        imageAvatar1.setForeground(new java.awt.Color(231, 231, 231));
        imageAvatar1.setBorderSize(2);
        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/perfil1.png"))); // NOI18N
        imageAvatar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageAvatar1MouseClicked(evt);
            }
        });

        usuarioACT.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        usuarioACT.setForeground(new java.awt.Color(224, 224, 224));

        Tipo.setForeground(new java.awt.Color(203, 203, 203));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuarioACT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(usuarioACT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelMenu.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelMenu);

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void imageAvatar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar1MouseClicked
    if(usutipo1.equalsIgnoreCase("admin")||usutipo1.equalsIgnoreCase("recepcionista")){
    JDialog dialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this),datosu, true);
    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    dialog.setSize(400, 500);
    dialog.setLocationRelativeTo(null); // Centrado en la pantalla
    dialog.add(new PanelLog()); // Asegúrate que existe
    dialog.setVisible(true);
    }else{
    JDialog dialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this),datosu, true);
    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    dialog.setSize(400, 500);
    dialog.setLocationRelativeTo(null); // Centrado en la pantalla
    dialog.add(new PanelLog2()); // Asegúrate que existe
    dialog.setVisible(true);  
    }

    }//GEN-LAST:event_imageAvatar1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tipo;
    private com.raven.swing.ImageAvatar imageAvatar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMenu;
    private com.raven.swing.RoundPanel roundPanel1;
    private com.raven.swing.RoundPanel roundPanel2;
    private javax.swing.JLabel usuarioACT;
    // End of variables declaration//GEN-END:variables
}
