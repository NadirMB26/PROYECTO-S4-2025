package com.raven.form;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.ClienteRepository;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.UsuarioRepository;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.VeterinarioRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EditarVeterinCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EliminarVeterinCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.GuardarVeterinCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarVeterinQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IVeterinRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarVeterinQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarVeterinQueryHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarVeterinCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarVeterinCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cliente;
import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class panelVeterinario extends javax.swing.JPanel {

    private Veterinario veterinActual;
    DefaultTableModel modelo = new DefaultTableModel();

    public panelVeterinario() {
        initComponents();
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Clave");
        modelo.addColumn("Especialidad");
        refrescarLista();

    }

    public void refrescarLista() {
        modelo.setRowCount(0);
        tablaUsuarios.setModel(modelo);
        var repo = new VeterinarioRepository();
        for (Veterinario vete : repo.getVeteuAll()) {
            String[] datos = new String[8];
            datos[0] = vete.getCedula();
            datos[1] = vete.getNombre();
            datos[2] = vete.getApellido();
            datos[3] = vete.getDireccion();
            datos[4] = vete.getCorreo();
            datos[5] = vete.getTelefono();
            datos[6] = vete.getClave();
            datos[7] = vete.getEspecialidad();
            modelo.addRow(datos);

        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        ButtonEliminar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonBuscar = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ComboEsp = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        FieldClave = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FieldTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FieldCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FieldDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FieldName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FieldCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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

        ButtonEliminar.setText("ELIMINAR");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        ButtonEditar.setText("EDITAR");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButtonBuscar.setText("BUSCAR");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        ButtonSave.setText("GUARDAR");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ESPECIALIDAD:");

        ComboEsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Peluqueria", "Medico" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("CLAVE:");

        FieldClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldClaveActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TELEFONO:");

        FieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTelefonoActionPerformed(evt);
            }
        });
        FieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldTelefonoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CORREO:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DIRECCION:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("APELLIDO:");

        FieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldApellidoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NOMBRE:");

        FieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNameActionPerformed(evt);
            }
        });
        FieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldNameKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CEDULA:");

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

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("Getionar Veterinario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(FieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(FieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(ButtonEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonSave))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(FieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(FieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ComboEsp))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEliminar)
                    .addComponent(ButtonEditar)
                    .addComponent(ButtonBuscar)
                    .addComponent(ButtonSave))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
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
                String telefono = FieldTelefono.getText();
                String especialidad = ComboEsp.getSelectedItem().toString();
                String clave = FieldClave.getText();

                validarCedulaUnica(cedula);
                validarCorreoUnico(correo);
                var comando = new GuardarVeterinCommand(cedula, nombre, apellido, direccion, correo, clave, telefono, especialidad);
                var repository = new VeterinarioRepository();
                var guardarVeterinCommandHandler = new GuardarVeterinCommandHandler(repository);
                int total = guardarVeterinCommandHandler.createVeterin(comando);
                JOptionPane.showMessageDialog(this, "Veterinario guardado Correctamente, total " + total);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            cleanFields();
            refrescarLista();
        }
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        try {
            String rolId = JOptionPane.showInputDialog(this, "Ingrese el ID del veterinario");
            IVeterinRepository repository = new VeterinarioRepository();
            IBuscarVeterinQuery queryHandler = new BuscarVeterinQueryHandler(repository);
            var query = new BuscarVeterinQuery(rolId);
            veterinActual = queryHandler.obtenerVeterin(query);
            FieldCedula.setText(veterinActual.getCedula());
            FieldName.setText(veterinActual.getNombre());
            FieldApellido.setText(veterinActual.getApellido());
            FieldDireccion.setText(veterinActual.getDireccion());
            FieldCorreo.setText(veterinActual.getCorreo());
            FieldTelefono.setText(veterinActual.getTelefono());
            FieldClave.setText(veterinActual.getClave());

            for (Veterinario vete : repository.getVeteuAll()) {
                if (vete.getCedula().equals(rolId)) {
                    ComboEsp.addItem(vete.getEspecialidad());
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        try {
            if (veterinActual == null) {
                JOptionPane.showMessageDialog(this, "Primero busque el veterinario y editelo");
                return;
            }
            // Obtener los datos del formulario
            String nombre = FieldName.getText();
            String apellido = FieldApellido.getText();
            String direccion = FieldDireccion.getText();
            String correo = FieldCorreo.getText();
            String pass = FieldClave.getText();
            String telefono = FieldTelefono.getText();
            String rol = ComboEsp.getSelectedItem().toString();

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

            validarCorreoUnico(correo);
            var rolRepository = new VeterinarioRepository();
            var editarCommandHandler = new EditarVeterinCommandHandler(rolRepository);
            editarCommandHandler.editar(editarVeterinCommand);
            JOptionPane.showMessageDialog(this, "veterinario Editado ");

            cleanFields();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        try {
            if (veterinActual == null) {
                JOptionPane.showMessageDialog(this, "Primero busque el veterinario ");
                return;
            }
            var rolRepository = new VeterinarioRepository();
            var eliminarVeterinCommand = new EliminarVeterinCommandHandler(rolRepository);
            eliminarVeterinCommand.eliminar(veterinActual);
            JOptionPane.showMessageDialog(this, "veterinario Eliminado ");

            cleanFields();
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

    public void cleanFields() {
        FieldName.setText("");
        FieldCedula.setText("");
        FieldApellido.setText("");
        FieldDireccion.setText("");
        FieldCorreo.setText("");
        FieldTelefono.setText("");
        FieldClave.setText("");

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

    private void FieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldTelefonoActionPerformed

    private void FieldClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldClaveActionPerformed

    private void FieldCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCedulaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_FieldCedulaKeyTyped

    private void FieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_FieldTelefonoKeyTyped

    private void FieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNameActionPerformed
;
    }//GEN-LAST:event_FieldNameActionPerformed

    private void FieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldApellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_FieldApellidoKeyTyped

    private void FieldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldNameKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_FieldNameKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JComboBox<String> ComboEsp;
    private javax.swing.JTextField FieldApellido;
    private javax.swing.JTextField FieldCedula;
    private javax.swing.JTextField FieldClave;
    private javax.swing.JTextField FieldCorreo;
    private javax.swing.JTextField FieldDireccion;
    private javax.swing.JTextField FieldName;
    private javax.swing.JTextField FieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
