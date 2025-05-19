package com.raven.form;

import View.Admin.Admin_Login;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.CitaRepository;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.ClienteRepository;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.MascotasRepository;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.VeterinarioRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EditarCitaCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.EliminarCitaCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands.GuardarCitaCommandHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarCitaQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.ICitaRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IClientRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarCitaQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarCitaQueryHandler;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarCitaCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarCitaCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;
import co.edu.unicolombo.poo.Vet.Domain.Model.Mascota;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP
 */
public class PanelCita extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    
    private Cita citaActual;

    public PanelCita() {
        initComponents();
        modelo.addColumn("Cedula");
        modelo.addColumn("Mascota");
        modelo.addColumn("Entrada");
        modelo.addColumn("Salida");
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Veterinario");
        modelo.addColumn("Recepcionista");
        refrescarLista();
    }
    
         public void refrescarLista() {
        modelo.setRowCount(0);
        tablaCita.setModel(modelo);
        var repo = new CitaRepository();
        for (Cita vete : repo.getCitaAll()) {
            String[] datos = new String[8];
            datos[0] = vete.getCedulacliente();
            datos[1] = vete.getMascotaNombre();
            datos[2] = vete.getHoraEntrada();
            datos[3] = vete.getHoraSalida();
            datos[4] = vete.getFecha();
            datos[5] = vete.getDescrip();
            datos[6] = vete.getNombreveterinario();
            datos[7] = vete.getUsuarioS();
            modelo.addRow(datos);

        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timeEntrada1 = new com.raven.swing.TimePicker();
        timeSalida1 = new com.raven.swing.TimePicker();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnGuardarcita = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnHoraEntrada = new javax.swing.JButton();
        btnHoraSalida = new javax.swing.JButton();
        txtHoraSalida = new javax.swing.JTextField();
        txtHoraEntrada = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        comboBoxMascotas = new javax.swing.JComboBox<>();
        txtCita = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonEliminar1 = new javax.swing.JButton();
        ButtonEditar1 = new javax.swing.JButton();
        ButtonBuscar1 = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnFecha = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        ComboVeterins = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ComboEsp = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        BtnCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCita = new javax.swing.JTable();

        timeEntrada1.setDisplayText(txtHoraEntrada);

        timeSalida1.setForeground(new java.awt.Color(255, 51, 51));
        timeSalida1.setDisplayText(txtHoraSalida);

        dateChooser2.setTextRefernce(txtFecha);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Registrar Cita");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel12.setText("CC. cliente");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel13.setText("Fecha");

        btnGuardarcita.setText("GUARDAR");
        btnGuardarcita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarcitaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setText("hora de entrada");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setText("hora de salida");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        btnHoraEntrada.setText("...");
        btnHoraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraEntradaActionPerformed(evt);
            }
        });

        btnHoraSalida.setText("...");
        btnHoraSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraSalidaActionPerformed(evt);
            }
        });

        txtHoraSalida.setEditable(false);
        txtHoraSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraSalidaActionPerformed(evt);
            }
        });

        txtHoraEntrada.setEditable(false);
        txtHoraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraEntradaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel15.setText("Mascota");

        comboBoxMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxMascotasMouseClicked(evt);
            }
        });
        comboBoxMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMascotasActionPerformed(evt);
            }
        });

        txtCita.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel16.setText("N_Cita");

        ButtonEliminar1.setText("ELIMINAR");
        ButtonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminar1ActionPerformed(evt);
            }
        });

        ButtonEditar1.setText("EDITAR");
        ButtonEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditar1ActionPerformed(evt);
            }
        });

        ButtonBuscar1.setText("BUSCAR");
        ButtonBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscar1ActionPerformed(evt);
            }
        });

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setText("Descripcion");

        btnFecha.setText("...");
        btnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaActionPerformed(evt);
            }
        });

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        ComboEsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Peluqueria", "Medico" }));
        ComboEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEspActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel17.setText("Veterinario");

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel18.setText("Especialidad");

        BtnCargar.setText("...");
        BtnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCargarMouseClicked(evt);
            }
        });
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });

        tablaCita.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaCita);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnHoraEntrada))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(BtnCargar)))
                                                        .addGap(67, 67, 67))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btnHoraSalida)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel12))
                                                    .addGap(138, 138, 138)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel15)
                                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnFecha))
                                                .addComponent(jLabel13)
                                                .addComponent(comboBoxMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(65, 65, 65))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(94, 94, 94)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGuardarcita)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ButtonBuscar1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ButtonEditar1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonEliminar1)
                                        .addGap(83, 83, 83)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(ComboEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(ComboVeterins, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(309, 309, 309)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCita, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFecha)
                            .addComponent(ComboEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCargar))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHoraEntrada)
                            .addComponent(comboBoxMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboVeterins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHoraSalida))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarcita)
                            .addComponent(ButtonBuscar1)
                            .addComponent(ButtonEditar1)
                            .addComponent(ButtonEliminar1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarcitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarcitaActionPerformed
        if (txtCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
        } else {
            try {
                ICitaRepository cita = new CitaRepository();
                cita.getCitaAll().size();
                int idCita=cita.getCitaAll().size()+1;
                txtCita.setText(idCita+"");
                JOptionPane.showMessageDialog(this,idCita);
                String cedulacliente = txtCedula.getText();
                String mascotaName = comboBoxMascotas.getSelectedItem().toString();
                String horaEntrada = txtHoraEntrada.getText();
                String horaSalida = txtHoraSalida.getText();
                String fecha = txtFecha.getText();
                String descripcion = txtDescripcion.getText();
                String veterinario=ComboVeterins.getSelectedItem().toString();           
                String usuarios=Admin_Login.usuarioOnline;
                

                IClientRepository repository = new ClienteRepository();
                repository.BuscarClientPorId(cedulacliente);
                CitaRepository repositoryCita = new CitaRepository();
                
                var comando = new GuardarCitaCommand(idCita, cedulacliente, mascotaName, horaEntrada, horaSalida, fecha, descripcion,veterinario,usuarios,repositoryCita);
                var guardarCitaCommandHandler = new GuardarCitaCommandHandler(repositoryCita);
                int total = guardarCitaCommandHandler.createCita(comando);
                JOptionPane.showMessageDialog(this, "Cita guardada Correctamente, total " + total);
                JOptionPane.showMessageDialog(this, "Veterinario agendado" +veterinario+", atendido por "+usuarios);
                cleanFields();
                refrescarLista();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            txtCedula.setText("");

        }
    }//GEN-LAST:event_btnGuardarcitaActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void btnHoraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraEntradaActionPerformed
        timeEntrada1.showPopup(this, 450, 105);
    }//GEN-LAST:event_btnHoraEntradaActionPerformed

    private void btnHoraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraSalidaActionPerformed
        timeSalida1.showPopup(this, 450, 105);
    }//GEN-LAST:event_btnHoraSalidaActionPerformed

    private void txtHoraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraSalidaActionPerformed

    private void txtHoraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraEntradaActionPerformed

    private void comboBoxMascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxMascotasMouseClicked
        comboBoxMascotas.addActionListener(e -> {
            String mascotaSeleccionada = (String) comboBoxMascotas.getSelectedItem();
            // Aquí puedes realizar acciones según la mascota seleccionada
            // Por ejemplo, mostrar detalles de la mascota en otro componente o realizar alguna operación.
        });
    }//GEN-LAST:event_comboBoxMascotasMouseClicked

    private void ButtonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminar1ActionPerformed
        try {
            if (citaActual == null) {
                JOptionPane.showMessageDialog(this, "Primero busque la cita ");
                return;
            }
            var citaRepository = new CitaRepository();
            var eliminarCitaCommand = new EliminarCitaCommandHandler(citaRepository);
            eliminarCitaCommand.eliminarCita(citaActual);
            JOptionPane.showMessageDialog(this, "Cita eliminada ");
            cleanFields();
            comboBoxMascotas.removeAllItems();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonEliminar1ActionPerformed

    private void ButtonEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditar1ActionPerformed
        try {
            if (citaActual == null) {
                JOptionPane.showMessageDialog(this, "Primero busque la cita y editela");
                return;
            }
            String mascotaName = comboBoxMascotas.getSelectedItem().toString();
            String horaEntrada = txtHoraEntrada.getText();
            String horaSalida = txtHoraSalida.getText();
            String fecha = txtFecha.getText();
            String descripcion = txtDescripcion.getText();
            String veterinario = ComboVeterins.getSelectedItem().toString();

            citaActual.setMascotaNombre(mascotaName);
            citaActual.setHoraEntrada(horaEntrada);
            citaActual.setHoraSalida(horaSalida);
            citaActual.setFecha(fecha);
            citaActual.setDescrip(descripcion);
            citaActual.setNombreveterinario(veterinario);

            var editarCitaCommand = new EditarCitaCommand(citaActual.getIdcita(), citaActual.getCedulacliente(),
                    citaActual.getMascotaNombre(), citaActual.getHoraEntrada(), citaActual.getHoraSalida(),
                    citaActual.getFecha(), citaActual.getDescrip(), citaActual.getNombreveterinario());

            var citaRepository = new CitaRepository();
            var editarCommandHandler = new EditarCitaCommandHandler(citaRepository);
            editarCommandHandler.editarCita(editarCitaCommand);
            JOptionPane.showMessageDialog(this, "Datos de cita editados ");
            cleanFields();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonEditar1ActionPerformed

    private void ButtonBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscar1ActionPerformed
        try {
            String cedulaCliente = JOptionPane.showInputDialog(this, "Ingrese la cedula del cliente");
            CitaRepository repository = new CitaRepository();
            IBuscarCitaQuery queryHandler = new BuscarCitaQueryHandler(repository);
            var query = new BuscarCitaQuery(cedulaCliente);
            citaActual = queryHandler.obtenerCita(query);
            txtCedula.setText(citaActual.getCedulacliente());
            txtHoraEntrada.setText(citaActual.getHoraEntrada());
            txtHoraSalida.setText(citaActual.getHoraSalida());
            txtFecha.setText(citaActual.getFecha());
            comboBoxMascotas.setSelectedItem(citaActual.getMascotaNombre());
            txtDescripcion.setText(citaActual.getDescrip());
            txtCita.setText(citaActual.getIdcita()+"");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonBuscar1ActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaActionPerformed
        dateChooser2.showPopup();
    }//GEN-LAST:event_btnFechaActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void BtnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCargarMouseClicked
        String cedula = txtCedula.getText();
        var repositoryPets = new MascotasRepository();
        comboBoxMascotas.removeAllItems();
        for (Mascota mascota : repositoryPets.getPetsAll()) {
            if (mascota.getCedulaUsuario().equals(cedula)) {
                comboBoxMascotas.addItem(mascota.getNombreMascota());
            }
        }

    }//GEN-LAST:event_BtnCargarMouseClicked

    private void comboBoxMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMascotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxMascotasActionPerformed

    private void ComboEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEspActionPerformed
        VeterinarioRepository repository = new VeterinarioRepository();
        String especiality = (String) ComboEsp.getSelectedItem();
        ComboVeterins.removeAllItems();
        for (Veterinario vete : repository.getVeteuAll()) {
            if (vete.getEspecialidad().equals(especiality)) {
                ComboVeterins.addItem(vete.getNombre());
            }
        }
    }//GEN-LAST:event_ComboEspActionPerformed

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCargarActionPerformed

    public void cleanFields() {
        txtCedula.setText("");
        txtHoraEntrada.setText("");
        txtHoraSalida.setText("");
        txtDescripcion.setText("");
        txtFecha.setText("");
//        comboBoxMascotas.setSelectedItem("Seleccione...");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton ButtonBuscar1;
    private javax.swing.JButton ButtonEditar1;
    private javax.swing.JButton ButtonEliminar1;
    private javax.swing.JComboBox<String> ComboEsp;
    private javax.swing.JComboBox<String> ComboVeterins;
    private javax.swing.JButton btnFecha;
    private javax.swing.JButton btnGuardarcita;
    private javax.swing.JButton btnHoraEntrada;
    private javax.swing.JButton btnHoraSalida;
    private javax.swing.JComboBox<String> comboBoxMascotas;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaCita;
    private com.raven.swing.TimePicker timeEntrada1;
    private com.raven.swing.TimePicker timeSalida1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JLabel txtCita;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtHoraSalida;
    // End of variables declaration//GEN-END:variables
}
