
package View.Doctor;
import View.Login_user_type;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.VeterinarioRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IVeterinRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;
import com.raven.main.Main;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class Doctor_Login extends javax.swing.JFrame {

  public static String usuarioOnline;
    public static String Tusuario;
    public static String usuarioCC;
    public static String usuarioNombre;
    public Doctor_Login() {
        initComponents();
        
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 35, 35));
    }

    public Doctor_Login(String UsuarioOnline) {
        this.usuarioOnline = UsuarioOnline;
    }

    public String getUsuarioOnline() {
        return usuarioOnline;
    }

    public void setUsuarioOnline(String UsuarioOnline) {
        this.usuarioOnline = UsuarioOnline;
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cross = new javax.swing.JLabel();
        User_Name_Field = new javax.swing.JTextField();
        User_Name_Icon = new javax.swing.JLabel();
        User_Name = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        Password = new javax.swing.JLabel();
        Password_Icon = new javax.swing.JLabel();
        ContinueBT = new javax.swing.JLabel();
        PopUp = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_back_arrow_25px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(680, 90, 30, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inicio de sesion");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(460, 100, 250, 30);

        Cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cross.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/Cross.png"))); // NOI18N
        Cross.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cross.setPreferredSize(new java.awt.Dimension(25, 25));
        Cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrossMouseClicked(evt);
            }
        });
        jPanel1.add(Cross);
        Cross.setBounds(840, 10, 30, 30);

        User_Name_Field.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        User_Name_Field.setForeground(new java.awt.Color(0, 102, 51));
        User_Name_Field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(User_Name_Field);
        User_Name_Field.setBounds(510, 170, 180, 28);

        User_Name_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User_Name_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/user.png"))); // NOI18N
        jPanel1.add(User_Name_Icon);
        User_Name_Icon.setBounds(470, 160, 40, 40);

        User_Name.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        User_Name.setText("User Name");
        jPanel1.add(User_Name);
        User_Name.setBounds(510, 140, 110, 30);

        jPasswordField1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 102, 51));
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(510, 260, 180, 28);

        Password.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Password.setText("Password");
        jPanel1.add(Password);
        Password.setBounds(510, 230, 110, 30);

        Password_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/pass.png"))); // NOI18N
        jPanel1.add(Password_Icon);
        Password_Icon.setBounds(470, 250, 40, 40);

        ContinueBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContinueBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/continue.png"))); // NOI18N
        ContinueBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ContinueBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContinueBTMouseClicked(evt);
            }
        });
        jPanel1.add(ContinueBT);
        ContinueBT.setBounds(510, 320, 180, 30);

        PopUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/Login_popup.png"))); // NOI18N
        jPanel1.add(PopUp);
        PopUp.setBounds(120, 30, 731, 440);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Home.png"))); // NOI18N
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jPanel1.add(Back);
        Back.setBounds(0, 0, 880, 495);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(880, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CrossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CrossMouseClicked

    private void ContinueBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueBTMouseClicked




        String correo;
        String contra;

        if (User_Name_Field.getText().isEmpty() || jPasswordField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
        } else {
            correo = User_Name_Field.getText();
            contra = jPasswordField1.getText();
            IVeterinRepository repository = new VeterinarioRepository();
            try {
                for (Veterinario usuario : repository.getVeteuAll()) {
                    if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario.getClave().equalsIgnoreCase(contra)) {
                        usuarioOnline = usuario.getNombre() + " " + usuario.getApellido();
                        Tusuario = usuario.getRol();
                        usuarioCC=usuario.getCedula();
                        usuarioNombre=usuario.getNombre()+" "+usuario.getApellido();
                        
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                new Main().setVisible(true);
                            }
                        });

                        JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso. ¡Bienvenido, " + usuarioOnline + "!");
                        super.dispose();
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

        }
    }//GEN-LAST:event_ContinueBTMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Login_user_type().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

 
    
     public void clearField(){
User_Name_Field.setText("");
jPasswordField1.setText("");
    }     
     
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel ContinueBT;
    private javax.swing.JLabel Cross;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Password_Icon;
    private javax.swing.JLabel PopUp;
    private javax.swing.JLabel User_Name;
    private javax.swing.JTextField User_Name_Field;
    private javax.swing.JLabel User_Name_Icon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
