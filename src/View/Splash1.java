/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.UsuarioRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.GuardarUsuCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarUsuCommand;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Splash1 extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash1() {
        initComponents();
    }
      public void nuevoUsuario(){
      
            String nombre = "Nadir";
            String cedula="1002";
            String apellido="Marsiglia";
            String direccion="MZ 24";
            String correo="Nadir@gmail.com";
            String telefono="3164727307";
            String tipo="Admin";
            String clave="123";
       
              try {
        
         var comando = new GuardarUsuCommand(cedula, apellido, nombre,direccion,correo, clave, telefono, tipo);
            var repository=new UsuarioRepository();
            var guardarUsuCommandHandler= new GuardarUsuCommandHandler(repository);
            int total=guardarUsuCommandHandler.createUsu(comando);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        } 
               
       
     }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Vetclinic1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Precentage = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(594, 308));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(594, 308));
        jPanel1.setMinimumSize(new java.awt.Dimension(594, 308));
        jPanel1.setPreferredSize(new java.awt.Dimension(594, 308));
        jPanel1.setLayout(null);

        Vetclinic1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Vetclinic1.setForeground(new java.awt.Color(255, 143, 43));
        Vetclinic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vetclinic1.setText("Historial Clinico de Mascotas");
        jPanel1.add(Vetclinic1);
        Vetclinic1.setBounds(10, 10, 590, 22);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/Canes4.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 40, 590, 160);

        Precentage.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Precentage.setForeground(new java.awt.Color(255, 143, 43));
        Precentage.setText("%");
        jPanel1.add(Precentage);
        Precentage.setBounds(380, 230, 40, 23);

        loading.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 143, 43));
        loading.setText("Cargando Login....");
        jPanel1.add(loading);
        loading.setBounds(230, 230, 138, 23);

        progress.setForeground(new java.awt.Color(15, 225, 111));
        jPanel1.add(progress);
        progress.setBounds(-10, 296, 610, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/carga (1).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 595, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Splash1 Mysplash = new Splash1(); //creating object
       Mysplash.setVisible(true); //set visible interface
       try{
           for (int i = 0; i<=100; i++)
           {
           Thread.sleep(75); //to pause the execution of the current thread for a specified time in milliseconds (running time)
           Mysplash.progress.setValue(i); // set value to progress bar
           Mysplash.Precentage.setText(Integer.toString(i)+"%"); // set value to percentage label
           }
       } catch (Exception e){
           
       }
       new Login_user_type().setVisible(true);  //link to the next interface
        new Splash1().nuevoUsuario();
      Mysplash.dispose(); //leaving from current interface  

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Precentage;
    private javax.swing.JLabel Vetclinic1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loading;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
