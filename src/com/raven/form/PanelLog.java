
package com.raven.form;

import View.Admin.Admin_Login;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.UsuarioRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EditarUsuCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarUsuQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IUsuRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarUsuQueryHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarUsuquery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarUsuCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import javax.swing.JOptionPane;


/**
 *
 * @author nadir
 */
public class PanelLog extends javax.swing.JPanel {
public String usuU= Admin_Login.usuarioCC;
public String usutipo1= Admin_Login.Tusuario;
private Usuario usuActual;
    public PanelLog() {
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

    if (!contra.equals(usuActual.getClave())) {
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
    String rol = Admin_Login.Tusuario;

    // Actualizar el objeto
    usuActual.setNombre(nombre);
    usuActual.setApellido(apellido);
    usuActual.setDireccion(direccion);
    usuActual.setCorreo(correo);
    usuActual.setClave(pass);
    usuActual.setTelefono(telefono);
    usuActual.setRol(rol);


            usuActual.setNombre(nombre);
            usuActual.setApellido(apellido);
            usuActual.setDireccion(direccion);
            usuActual.setCorreo(correo);
            usuActual.setClave(pass);
            usuActual.setTelefono(telefono);
            var editarUsuCommand=new EditarUsuCommand(usuActual.getCedula(),
                usuActual.getApellido(),usuActual.getNombre(),usuActual.getDireccion(),usuActual.getCorreo(),usuActual.getClave(),usuActual.getTelefono(),usuActual.getRol());

            var rolRepository=new UsuarioRepository();
            var editarCommandHandler=new EditarUsuCommandHandler(rolRepository);
            editarCommandHandler.editar(editarUsuCommand);
  

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
        // Verifica que usuU no esté vacío antes de parsear
        if (usuU != null && !usuU.isEmpty()) {
            int rolId = Integer.parseInt(usuU);
            IUsuRepository repository = new UsuarioRepository();
            IBuscarUsuQuery queryHandler = new BuscarUsuQueryHandler(repository);
            var query = new BuscarUsuquery(rolId);
            usuActual = queryHandler.obtenerRol(query);
                FieldCedula.setText(usuActual.getCedula());
                FieldName.setText(usuActual.getNombre());
                FieldApellido.setText(usuActual.getApellido());
                FieldDireccion.setText(usuActual.getDireccion());
                FieldCorreo.setText(usuActual.getCorreo());
                clave.setText(usuActual.getClave());
                FieldTelefono.setText(usuActual.getTelefono());
                roles.setText(usutipo1);
            
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al obtener el usuario: " + ex.getMessage());
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
