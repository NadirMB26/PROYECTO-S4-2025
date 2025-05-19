
package com.raven.form;


import View.Doctor.Doctor_Login;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.VeterinarioRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EditarVeterinCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarVeterinQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IVeterinRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarVeterinQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarVeterinQueryHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarVeterinCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;
import javax.swing.JOptionPane;


/**
 *
 * @author nadir
 */
public class PanelLog2 extends javax.swing.JPanel {
public String usuV= Doctor_Login.usuarioCC;
public String usutipo2= Doctor_Login.Tusuario;
private Veterinario veterinActual;
    public PanelLog2() {
        initComponents();
        refrescar();
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FieldCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FieldName = new javax.swing.JTextField();
        FieldApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FieldDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FieldCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ButtonEditar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FieldTelefono = new javax.swing.JTextField();
        roles = new javax.swing.JLabel();
        clave = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCedulaActionPerformed(evt);
            }
        });
        FieldCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldCedulaKeyTyped(evt);
            }
        });
        add(FieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 192, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CEDULA:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 40, 135, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NOMBRE:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 70, 135, -1));

        FieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldNameKeyTyped(evt);
            }
        });
        add(FieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 192, -1));

        FieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldApellidoKeyTyped(evt);
            }
        });
        add(FieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 192, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("APELLIDO:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 100, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DIRECCION:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 130, 135, -1));
        add(FieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 192, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CORREO:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 160, 135, -1));
        add(FieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 192, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("CLAVE:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 190, 135, -1));

        ButtonEditar.setText("EDITAR");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });
        add(ButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TELEFONO:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 220, 94, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ROL:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 60, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("USUARIO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        FieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldTelefonoKeyTyped(evt);
            }
        });
        add(FieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 192, -1));

        roles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 190, 20));

        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });
        add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed


           
            try {
    String contra = JOptionPane.showInputDialog(this, "Ingresa tu contraseña para aplicar cambios");

    if (contra == null || contra.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debes ingresar tu contraseña para continuar.");
        return;
    }

    if (!contra.equals(veterinActual.getClave())) {
        JOptionPane.showMessageDialog(this, "Tu contraseña es incorrecta");
        return;
    }

    // Obtener los datos del formulario
    String nombre = FieldName.getText();
    String apellido = FieldApellido.getText();
    String direccion = FieldDireccion.getText();
    String correo = FieldCorreo.getText();
    String pass = clave.getText();
    String telefono = FieldTelefono.getText();
    String rol = roles.getText();

    // Actualizar el objeto
    veterinActual.setNombre(nombre);
    veterinActual.setApellido(apellido);
    veterinActual.setDireccion(direccion);
    veterinActual.setCorreo(correo);
    veterinActual.setClave(pass);
    veterinActual.setTelefono(telefono);
    veterinActual.setRol(rol);

    // Ejecutar el comando
    var editarVeterinCommand = new EditarVeterinCommand(
            veterinActual.getCedula(),
            veterinActual.getNombre(), 
            veterinActual.getApellido(), 
            veterinActual.getDireccion(), 
            veterinActual.getCorreo(),
            veterinActual.getClave(),
            veterinActual.getTelefono(), 
            veterinActual.getEspecialidad());

    var rolRepository = new VeterinarioRepository();
    var editarCommandHandler = new EditarVeterinCommandHandler(rolRepository);
    editarCommandHandler.editar(editarVeterinCommand);
    JOptionPane.showMessageDialog(this, "Editaste tu usuario correctamente");

} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
}
      

    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void FieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCedulaActionPerformed

    private void FieldCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCedulaKeyTyped
         char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_FieldCedulaKeyTyped

    private void FieldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldNameKeyTyped
         char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_FieldNameKeyTyped

    private void FieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldApellidoKeyTyped
           char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_FieldApellidoKeyTyped

    private void FieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldTelefonoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldTelefonoKeyTyped

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveActionPerformed

   public void refrescar() {

           try {

            IVeterinRepository repository = new VeterinarioRepository();
            IBuscarVeterinQuery queryHandler = new BuscarVeterinQueryHandler(repository);
            var query = new BuscarVeterinQuery(usuV);
            veterinActual = queryHandler.obtenerVeterin(query);

    
                FieldCedula.setText(veterinActual.getCedula());
                FieldName.setText(veterinActual.getNombre());
                FieldApellido.setText(veterinActual.getApellido());
                FieldDireccion.setText(veterinActual.getDireccion());
                FieldCorreo.setText(veterinActual.getCorreo());
                clave.setText(veterinActual.getClave());
                FieldTelefono.setText(veterinActual.getTelefono());
                roles.setText(usutipo2);
            
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al obtener el veterinario: " + ex.getMessage());
    } 

   
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JTextField FieldApellido;
    private javax.swing.JTextField FieldCedula;
    private javax.swing.JTextField FieldCorreo;
    private javax.swing.JTextField FieldDireccion;
    private javax.swing.JTextField FieldName;
    private javax.swing.JTextField FieldTelefono;
    private javax.swing.JPasswordField clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel roles;
    // End of variables declaration//GEN-END:variables
}
