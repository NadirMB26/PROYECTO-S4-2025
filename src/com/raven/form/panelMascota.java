/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import View.Admin.Admin_Login;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.CitaRepository;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.ClienteRepository;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.MascotasRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EditarPetCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EliminarPetCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.GuardarPetCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarCitaQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarPetQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IClientRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarCitaQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarCitaQueryHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarPetQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarPetQueryHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarPetCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarPetCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;
import co.edu.unicolombo.poo.Vet.Domain.Model.Mascota;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Duvacrack
 */
public class panelMascota extends javax.swing.JPanel {
DefaultTableModel modelo = new DefaultTableModel();
    private Mascota petActual;
    private Cita citaActual;
    private String mascotacombo;
    public panelMascota() {
        initComponents();
        modelo.addColumn("Cedula Cliente");
        modelo.addColumn("Nombre Mascota");
        modelo.addColumn("Color");
        modelo.addColumn("Especie");
        modelo.addColumn("Tipo de Sangre");   
        refrescarLista();
    }
    
    public void refrescarLista() {
        modelo.setRowCount(0);
        tablaUsuarios.setModel(modelo);
        var repo = new MascotasRepository();
        for (Mascota vete : repo.getPetsAll()) {
            String[] datos = new String[5];
            datos[0] = vete.getCedulaUsuario();
            datos[1] = vete.getNombreMascota();
            datos[2] = vete.getColor();
            datos[3] = vete.getEspecie();
            datos[4] = vete.getTipoSangre();
            modelo.addRow(datos);

        }
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FieldCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FieldNamePet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FieldEspecie = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FieldSangre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ComboPets = new javax.swing.JComboBox<>();
        ButtonEliminar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonBuscar = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE MASCOTAS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CEDULA DE CLIENTE:");

        FieldCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldCedulaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NOMBRE DE MASCOTA:");

        FieldNamePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNamePetActionPerformed(evt);
            }
        });
        FieldNamePet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldNamePetKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("COLOR:");

        FieldColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldColorKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ESPECIE:");

        FieldEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldEspecieKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("TIPO DE SANGRE:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("MASCOTAS ASOCIADAS:");

        ComboPets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ComboPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPetsActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FieldCedula)
                                    .addComponent(FieldNamePet)
                                    .addComponent(FieldColor)
                                    .addComponent(FieldEspecie)
                                    .addComponent(FieldSangre)
                                    .addComponent(ComboPets, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldNamePet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(FieldSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ComboPets, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonSave)
                            .addComponent(ButtonBuscar)
                            .addComponent(ButtonEliminar)
                            .addComponent(ButtonEditar))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComboPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPetsActionPerformed
        String cedula = FieldCedula.getText();
        var repositoryPets = new MascotasRepository();
        String namePet = (String) ComboPets.getSelectedItem();
        mascotacombo=namePet;
        for (Mascota mascota : repositoryPets.getPetsAll()) {
            if (mascota.getNombreMascota().equals(namePet)&& mascota.getCedulaUsuario().equals(cedula)) {
                FieldCedula.setText(mascota.getCedulaUsuario());
                FieldNamePet.setText(mascota.getNombreMascota());
                FieldColor.setText(mascota.getColor());
                FieldEspecie.setText(mascota.getEspecie());
                FieldSangre.setText(mascota.getTipoSangre());
                
            // 🔥 Aquí actualizamos la mascota actual
            petActual = mascota;
            JOptionPane.showMessageDialog(this, petActual.getNombreMascota());
            break;
            }
        }
    }//GEN-LAST:event_ComboPetsActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
         if(Admin_Login.Tusuario.equalsIgnoreCase("recepcionista")){
             JOptionPane.showMessageDialog(this,"No tienes acceso a este modulo");
             }else{
        try {
            if (petActual == null) {
                JOptionPane.showMessageDialog(this, "Primero busque la mascota ");
                return;
            }
            String cedulaCliente = petActual.getCedulaUsuario();
            JOptionPane.showMessageDialog(this, petActual.getNombreMascota());
            CitaRepository repository = new CitaRepository();
            IBuscarCitaQuery queryHandler = new BuscarCitaQueryHandler(repository);
            var query = new BuscarCitaQuery(cedulaCliente);        
            citaActual = queryHandler.obtenerCita(query);
            var petRepository = new MascotasRepository();
            var eliminarPetCommand = new EliminarPetCommandHandler(petRepository); 
        if (citaActual == null) {

             eliminarPetCommand.eliminarPet(petActual);
             JOptionPane.showMessageDialog(this, "Mascota eliminada ");
             cleanFields();
           ComboPets.removeAllItems(); 
         } else if (petActual.getCedulaUsuario().equals(citaActual.getCedulacliente()) &&
                    mascotacombo.equals(citaActual.getMascotaNombre())) {
             JOptionPane.showMessageDialog(this, "No puedes eliminar esta mascota porque tiene citas asociadas");
         }else{
          JOptionPane.showMessageDialog(this, "Esta mascota no es la misma que aparece en la cita");
             cleanFields();

         }

            
        
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
         }
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        try {
            if (petActual == null) {
                JOptionPane.showMessageDialog(this, "Primero busque la mascota y editela");
                return;
            }
            String nombre = FieldNamePet.getText();
            String color = FieldColor.getText();
            String especie = FieldEspecie.getText();
            String TipoSangre = FieldSangre.getText();

            petActual.setNombreMascota(nombre);
            petActual.setColor(color);
            petActual.setEspecie(especie);
            petActual.setTipoSangre(TipoSangre);

            var editarPetCommand = new EditarPetCommand(petActual.getCedulaUsuario(),
                petActual.getNombreMascota(), petActual.getColor(), petActual.getEspecie(), petActual.getTipoSangre());

            var petRepository = new MascotasRepository();
            var editarCommandHandler = new EditarPetCommandHandler(petRepository);
            editarCommandHandler.editarPet(editarPetCommand);
            JOptionPane.showMessageDialog(this, "Datos de mascota editados ");
            ComboPets.removeAllItems();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        try {
            String idCliente = JOptionPane.showInputDialog(this, "Ingrese la cedula del cliente");
            ComboPets.removeAllItems();
            MascotasRepository repository = new MascotasRepository();
            IBuscarPetQuery queryHandler = new BuscarPetQueryHandler(repository);
            var query = new BuscarPetQuery(idCliente);
            petActual = queryHandler.obtenerPet(query);
            FieldCedula.setText(petActual.getCedulaUsuario());
            FieldNamePet.setText(petActual.getNombreMascota());
            FieldColor.setText(petActual.getColor());
            FieldEspecie.setText(petActual.getEspecie());
            FieldSangre.setText(petActual.getTipoSangre());

            for (Mascota mascota : repository.getPetsAll()) {
                if (mascota.getCedulaUsuario().equals(idCliente)) {
                    ComboPets.addItem(mascota.getNombreMascota());
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        if (FieldNamePet.getText().isEmpty() || FieldCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
        } else {
            try {
                String nombrePet = FieldNamePet.getText();
                String cedula = FieldCedula.getText();
                String color = FieldColor.getText();
                String especie = FieldEspecie.getText();
                String Tiposangre = FieldSangre.getText();

                IClientRepository repository = new ClienteRepository();
                repository.BuscarClientPorId(cedula);

                var comando = new GuardarPetCommand(cedula, nombrePet, color, Tiposangre, especie);
                var repositoryPets = new MascotasRepository();
                var guardarPetCommandHandler = new GuardarPetCommandHandler(repositoryPets);
                int total = guardarPetCommandHandler.createPet(comando);
                JOptionPane.showMessageDialog(this, "Mascota guardada Correctamente, total " + total);
                cleanFields();
                ComboPets.removeAllItems();
                refrescarLista();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            cleanFields();
        }
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void FieldNamePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNamePetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNamePetActionPerformed

    private void FieldNamePetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldNamePetKeyTyped
       char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_FieldNamePetKeyTyped

    private void FieldColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldColorKeyTyped
      char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_FieldColorKeyTyped

    private void FieldEspecieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldEspecieKeyTyped
      char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_FieldEspecieKeyTyped

    private void FieldCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCedulaKeyTyped
              char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_FieldCedulaKeyTyped

    public void cleanFields() {
        FieldCedula.setText("");
        FieldNamePet.setText("");
        FieldColor.setText("");
        FieldEspecie.setText("");
        FieldSangre.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JComboBox<String> ComboPets;
    private javax.swing.JTextField FieldCedula;
    private javax.swing.JTextField FieldColor;
    private javax.swing.JTextField FieldEspecie;
    private javax.swing.JTextField FieldNamePet;
    private javax.swing.JTextField FieldSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
