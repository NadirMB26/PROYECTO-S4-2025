package com.raven.form;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.ClienteRepository;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.UsuarioRepository;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.VeterinarioRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EditarUsuCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EliminarUsuCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.GuardarUsuCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarUsuQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IUsuRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarUsuQueryHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarUsuquery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarUsuCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarUsuCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cliente;
import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nadir
 */
public class PanelUsuarios extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    private Usuario usuActual;

    public PanelUsuarios() {
        initComponents();
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Correo");
        modelo.addColumn("Clave");
        modelo.addColumn("Telefono");
        modelo.addColumn("Rol");
        refrescarLista();
    }

    public void refrescarLista() {
        modelo.setRowCount(0);
        tablaUsuarios.setModel(modelo);
        var repo = new UsuarioRepository();
        for (Usuario vete : repo.getUsuAll()) {
            String[] datos = new String[8];
            datos[0] = vete.getCedula();
            datos[1] = vete.getNombre();
            datos[2] = vete.getApellido();
            datos[3] = vete.getDireccion();
            datos[4] = vete.getCorreo();
            datos[5] = vete.getClave();
            datos[6] = vete.getTelefono();
            datos[7] = vete.getRol();
            modelo.addRow(datos);

        }
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
        ButtonEliminar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonBuscar = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();
        FieldClave = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FieldTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        radioAdmin = new javax.swing.JRadioButton();
        radioRecep = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();

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
        add(FieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 192, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CEDULA:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 135, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NOMBRE:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 135, -1));

        FieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldNameKeyTyped(evt);
            }
        });
        add(FieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 192, -1));

        FieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldApellidoKeyTyped(evt);
            }
        });
        add(FieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 192, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("APELLIDO:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DIRECCION:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, 135, -1));
        add(FieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 192, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CORREO:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 170, 135, -1));
        add(FieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 192, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("CLAVE:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 200, 135, -1));

        ButtonEliminar.setText("ELIMINAR");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });
        add(ButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 291, -1, -1));

        ButtonEditar.setText("EDITAR");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });
        add(ButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 291, -1, -1));

        ButtonBuscar.setText("BUSCAR");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });
        add(ButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 291, -1, -1));

        ButtonSave.setText("GUARDAR");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });
        add(ButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 291, -1, -1));
        add(FieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 192, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TELEFONO:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 94, -1));

        FieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldTelefonoKeyTyped(evt);
            }
        });
        add(FieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 192, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ROL:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 60, -1));

        radioAdmin.setText("ADMIN");
        radioAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAdminActionPerformed(evt);
            }
        });
        add(radioAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        radioRecep.setText("RECEPCIONISTA");
        add(radioRecep, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("GESTION USUARIOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 560, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        if (FieldName.getText().isEmpty() || FieldCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
        } else {
            try {
                String nombre = FieldName.getText();
                String cedula = FieldCedula.getText();
                String apellido = FieldApellido.getText();
                String direccion = FieldDireccion.getText();
                String correo = FieldCorreo.getText();
                String clave = FieldClave.getText();
                String telefono = FieldTelefono.getText();
                String tipo;
                if (radioRecep.isSelected()) {
                    tipo = "RECEPCIONISTA";
                } else if (radioAdmin.isSelected()) {
                    tipo = "ADMIN";
                } else {
                    JOptionPane.showMessageDialog(this, "Debes seleccionar un tipo", "ALERTA", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                validarCedulaUnica(cedula);
                validarCorreoUnico(correo);
                var comando = new GuardarUsuCommand(cedula, apellido, nombre, direccion, correo, clave, telefono, tipo);
                var repository = new UsuarioRepository();
                var guardarUsuCommandHandler = new GuardarUsuCommandHandler(repository);
                int total = guardarUsuCommandHandler.createUsu(comando);
                JOptionPane.showMessageDialog(this, "Usuario guardado Correctamente, total " + total);
                limpiar();
                refrescarLista();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }

        }

    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        try {
            String id = JOptionPane.showInputDialog(this, "Ingrese el ID del Usuario");
            int rolId = Integer.parseInt(id);
            IUsuRepository repository = new UsuarioRepository();
            IBuscarUsuQuery queryHandler = new BuscarUsuQueryHandler(repository);
            var query = new BuscarUsuquery(rolId);
            usuActual = queryHandler.obtenerRol(query);
            FieldCedula.setText(usuActual.getCedula());
            FieldName.setText(usuActual.getNombre());
            FieldApellido.setText(usuActual.getApellido());
            FieldDireccion.setText(usuActual.getDireccion());
            FieldCorreo.setText(usuActual.getCorreo());
            FieldClave.setText(usuActual.getClave());
            FieldTelefono.setText(usuActual.getTelefono());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        try {
            if (usuActual == null) {
                JOptionPane.showMessageDialog(this, "Primero busque el rol y editelo");
                return;
            }
            String nombre = FieldName.getText();
            String apellido = FieldApellido.getText();
            String direccion = FieldDireccion.getText();
            String correo = FieldCorreo.getText();
            String clave = FieldClave.getText();
            String telefono = FieldTelefono.getText();
            String tipo;
            if (radioRecep.isSelected()) {
                tipo = "RECEPCIONISTA";
            } else if (radioAdmin.isSelected()) {
                tipo = "ADMIN";
            }
            usuActual.setNombre(nombre);
            usuActual.setApellido(apellido);
            usuActual.setDireccion(direccion);
            usuActual.setCorreo(correo);
            usuActual.setClave(clave);
            usuActual.setTelefono(telefono);

            validarCorreoUnico(correo);
            var editarUsuCommand = new EditarUsuCommand(usuActual.getCedula(),
                    usuActual.getApellido(), usuActual.getNombre(), usuActual.getDireccion(), usuActual.getCorreo(), usuActual.getClave(), usuActual.getTelefono(), usuActual.getRol());

            var rolRepository = new UsuarioRepository();
            var editarCommandHandler = new EditarUsuCommandHandler(rolRepository);
            editarCommandHandler.editar(editarUsuCommand);
            JOptionPane.showMessageDialog(this, "Rol Editado ");
            limpiar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        try {
            if (usuActual == null) {
                JOptionPane.showMessageDialog(this, "Primero busque el rol ");
                return;
            }
            // int eli=rolActual.getId();
            var rolRepository = new UsuarioRepository();
            var eliminarUsuCommand = new EliminarUsuCommandHandler(rolRepository);
            eliminarUsuCommand.eliminar(usuActual);
            JOptionPane.showMessageDialog(this, "Rol Eliminado ");
            limpiar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void validarCedulaUnica(String cedula) throws Exception {
        ClienteRepository clienteRepo = new ClienteRepository();
        UsuarioRepository usuarioRepo = new UsuarioRepository();
        VeterinarioRepository veterinarioRepo = new VeterinarioRepository();

        for (Cliente cliente : clienteRepo.getClientAll()) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)) {
                throw new Exception("La cédula ya existe registrada como Cliente");
            }
        }

        for (Usuario usuario : usuarioRepo.getUsuAll()) {
            if (usuario.getCedula().equalsIgnoreCase(cedula)) {
                throw new Exception("La cédula ya existe registrada como Usuario");
            }
        }

        for (Veterinario veterinario : veterinarioRepo.getVeteuAll()) {
            if (veterinario.getCedula().equalsIgnoreCase(cedula)) {
                throw new Exception("La cédula ya existe registrada como Veterinario");
            }
        }
    }

    private void validarCorreoUnico(String correo) throws Exception {
        ClienteRepository clienteRepo = new ClienteRepository();
        UsuarioRepository usuarioRepo = new UsuarioRepository();
        VeterinarioRepository veterinarioRepo = new VeterinarioRepository();

        for (Cliente cliente : clienteRepo.getClientAll()) {
            if (cliente.getCorreo().equalsIgnoreCase(correo)) {
                throw new Exception("El correo ya existe registrado en la plataforma");
            }
        }

        for (Usuario usuario : usuarioRepo.getUsuAll()) {
            if (usuario.getCorreo().equalsIgnoreCase(correo)) {
                throw new Exception("El correo ya existe registrado en la plataforma");

            }
        }

        for (Veterinario veterinario : veterinarioRepo.getVeteuAll()) {
            if (veterinario.getCorreo().equalsIgnoreCase(correo)) {
                throw new Exception("El correo ya existe registrado en la plataforma");

            }
        }
    }
    private void FieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCedulaActionPerformed

    private void radioAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAdminActionPerformed

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
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_FieldTelefonoKeyTyped
    public void limpiar() {
        FieldName.setText("");
        FieldCedula.setText("");
        FieldApellido.setText("");
        FieldDireccion.setText("");
        FieldCorreo.setText("");
        FieldClave.setText("");
        FieldTelefono.setText("");
        radioAdmin.setSelected(false);
        radioRecep.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JTextField FieldApellido;
    private javax.swing.JTextField FieldCedula;
    private javax.swing.JTextField FieldClave;
    private javax.swing.JTextField FieldCorreo;
    private javax.swing.JTextField FieldDireccion;
    private javax.swing.JTextField FieldName;
    private javax.swing.JTextField FieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioAdmin;
    private javax.swing.JRadioButton radioRecep;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
