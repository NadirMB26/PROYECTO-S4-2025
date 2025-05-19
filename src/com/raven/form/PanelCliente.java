
package com.raven.form;

import View.Admin.Admin_Login;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.ClienteRepository;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.MascotasRepository;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.UsuarioRepository;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.VeterinarioRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EditarClientCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EliminarClientCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.GuardarClientCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarClientQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarPetQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IClientRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarClientQueryHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarPetQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarPetQueryHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarUsuquery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarClientCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarClientCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cliente;
import co.edu.unicolombo.poo.Vet.Domain.Model.Mascota;
import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nadir
 */
public class PanelCliente extends javax.swing.JPanel {
    
 DefaultTableModel modelo = new DefaultTableModel();
 
    private Usuario usuActual;
    
    public PanelCliente() {
        initComponents();
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        refrescarLista();
        
       
    }
    
     public void refrescarLista() {
        modelo.setRowCount(0);
        tablaUsuarios.setModel(modelo);
        var repo = new ClienteRepository();
        for (Usuario vete : repo.getClientAll()) {
            String[] datos = new String[6];
            datos[0] = vete.getCedula();
            datos[1] = vete.getNombre();
            datos[2] = vete.getApellido();
            datos[3] = vete.getDireccion();
            datos[4] = vete.getCorreo();
            datos[5] = vete.getTelefono();
            
            modelo.addRow(datos);

        }
    }
     
  
     
public void limpiar(){
         FieldName.setText("");
                FieldCedula.setText("");
                FieldApellido.setText("");
                FieldDireccion.setText("");
                FieldCorreo.setText("");
                FieldTelefono.setText("");
}
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser2 = new com.raven.datechooser.DateChooser();
        timePicker1 = new com.raven.swing.TimePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        FieldDireccion = new javax.swing.JTextField();
        FieldName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ButtonSave = new javax.swing.JButton();
        FieldCorreo = new javax.swing.JTextField();
        ButtonBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ButtonEditar = new javax.swing.JButton();
        FieldTelefono = new javax.swing.JTextField();
        ButtonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FieldCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CORREO:");

        ButtonSave.setText("GUARDAR");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        ButtonBuscar.setText("BUSCAR");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TELEFONO:");

        ButtonEditar.setText("EDITAR");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

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

        ButtonEliminar.setText("ELIMINAR");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE CLIENTES");

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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("APELLIDO:");

        FieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldApellidoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DIRECCION:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NOMBRE:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonEditar)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonEliminar)
                            .addComponent(ButtonEditar)
                            .addComponent(ButtonBuscar)
                            .addComponent(ButtonSave))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        if(FieldName.getText().isEmpty()|| FieldCedula.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Debes llenar todos los campos");
        }else{
            try {
                String nombre = FieldName.getText();
                String cedula=FieldCedula.getText();
                String apellido=FieldApellido.getText();
                String direccion=FieldDireccion.getText();
                String correo=FieldCorreo.getText();
                String telefono=FieldTelefono.getText();
                String tipo="Cliente";
                validarCedulaUnica(cedula);
                validarCorreoUnico(correo);
                var comando = new GuardarClientCommand(cedula, apellido, nombre,direccion,correo,telefono, tipo);
                var repository=new ClienteRepository();
                var guardarClientCommandHandler= new GuardarClientCommandHandler(repository);
                int total=guardarClientCommandHandler.createClient(comando);
                JOptionPane.showMessageDialog(this,"Cliente guardado Correctamente, total "+total);
                limpiar();
                refrescarLista();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }

        }

    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        try {
            String id = JOptionPane.showInputDialog(this, "Ingrese el ID del Usuario");
            int rolId= Integer.parseInt(id);
            IClientRepository repository=new ClienteRepository();
            IBuscarClientQuery queryHandler = new BuscarClientQueryHandler(repository);
            var query=new BuscarUsuquery(rolId);
            usuActual=queryHandler.obtenerRol(query);
            FieldCedula.setText(usuActual.getCedula());
            FieldName.setText(usuActual.getNombre());
            FieldApellido.setText(usuActual.getApellido());
            FieldDireccion.setText(usuActual.getDireccion());
            FieldCorreo.setText(usuActual.getCorreo());
            FieldTelefono.setText(usuActual.getTelefono());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        try {
            if(usuActual==null){
                JOptionPane.showMessageDialog(this,"Primero busque el rol y editelo");
                return;
            }
            String nombre = FieldName.getText();
            String apellido=FieldApellido.getText();
            String direccion=FieldDireccion.getText();
            String correo=FieldCorreo.getText();

            String telefono=FieldTelefono.getText();

            usuActual.setNombre(nombre);
            usuActual.setApellido(apellido);
            usuActual.setDireccion(direccion);
            usuActual.setCorreo(correo);
            usuActual.setTelefono(telefono);

            validarCorreoUnico(correo);
            var editarClientCommand=new EditarClientCommand(usuActual.getCedula(),
                usuActual.getApellido(),usuActual.getNombre(),usuActual.getDireccion(),usuActual.getCorreo(),usuActual.getTelefono());
            var rolRepository=new ClienteRepository();
            var editarCommandHandler=new EditarClientCommandHandler(rolRepository);
            editarCommandHandler.editar(editarClientCommand);
            JOptionPane.showMessageDialog(this,"Rol Editado ");
        limpiar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        try {
            
             if(Admin_Login.Tusuario.equalsIgnoreCase("recepcionista")){
             JOptionPane.showMessageDialog(this,"No tienes acceso a este modulo");
             }else{
             
                         
            if(usuActual==null){
                JOptionPane.showMessageDialog(this,"Primero busque el Cliente");
                return;
            }
            MascotasRepository repository = new MascotasRepository();
            int contador=0;
          
            for (Mascota mascota : repository.getPetsAll()) {
                if (mascota.getCedulaUsuario().equals(usuActual.getCedula())) {
                    contador++;
                }
            }
            if(contador!=0){
               JOptionPane.showMessageDialog(this,"No puedes eliminar este cliente porque tiene mascotas asociadas");
                return;
            }else{
                
            var clientRepository=new ClienteRepository();
            var eliminarClientCommand=new EliminarClientCommandHandler(clientRepository);  
            eliminarClientCommand.eliminarclient((Cliente)usuActual);
            JOptionPane.showMessageDialog(this,"Cliente Eliminado ");
            limpiar();
            FieldTelefono.setText("");
            
            }
             
             }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
         refrescarLista();
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

    private void FieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldTelefonoActionPerformed

    private void FieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNameActionPerformed

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

    private void FieldCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCedulaKeyTyped
            char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_FieldCedulaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JTextField FieldApellido;
    private javax.swing.JTextField FieldCedula;
    private javax.swing.JTextField FieldCorreo;
    private javax.swing.JTextField FieldDireccion;
    private javax.swing.JTextField FieldName;
    private javax.swing.JTextField FieldTelefono;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private com.raven.swing.TimePicker timePicker1;
    // End of variables declaration//GEN-END:variables
}
