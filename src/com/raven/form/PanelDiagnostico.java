
package com.raven.form;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.CitaRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;
import javax.swing.table.DefaultTableModel;

public class PanelDiagnostico extends javax.swing.JPanel {

  DefaultTableModel modelo = new DefaultTableModel();
 
    public PanelDiagnostico() {
        initComponents();
         modelo.addColumn("IdCita");
        modelo.addColumn("CedulaCliente");
        modelo.addColumn("Nombre Mascota");
        modelo.addColumn("Entrada");
        modelo.addColumn("Salida");
        modelo.addColumn("Fecha");
        modelo.addColumn("Confirmar");
        modelo.addColumn("Descrip");
        modelo.addColumn("Veterinario");
        modelo.addColumn("Atendido por");
        refrescarLista();
    }

    public void refrescarLista() {
        modelo.setRowCount(0);
        tablaUsuarios.setModel(modelo);
        var repo = new CitaRepository();
        for (Cita vete : repo.getCitaAll()) {
            String[] datos = new String[10];
            //datos[0] = vete.getIdcita();
            datos[1] = vete.getCedulacliente();
            datos[2] = vete.getMascotaNombre();
            datos[3] = vete.getHoraEntrada();
            datos[4] = vete.getHoraSalida();
            datos[5] = vete.getFecha();
            datos[6] = vete.getConfirmar();
            datos[7] = vete.getDescrip();
            datos[8] = vete.getNombreveterinario();
            datos[9] = vete.getUsuarioS();           
            modelo.addRow(datos);

        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("Diagnostico");

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
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea1KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setText("Sintomas");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea2KeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(jTextArea2);

        jLabel3.setText("Tratamiento");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea3KeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(jTextArea3);

        jLabel4.setText("observaciones");

        jLabel5.setText("Cedula cliente");

        jLabel6.setText("Mascota");

        jLabel7.setText("Fecha");

        jLabel8.setText("Veterinario");

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        int selectedRow = tablaUsuarios.getSelectedRow(); 
        if (selectedRow != -1) {
            // Obtener los datos de la fila seleccionada 
            String cedulaCliente = (String) modelo.getValueAt(selectedRow, 1); 
            String nombreMascota = (String) modelo.getValueAt(selectedRow, 2); 
            String fecha = (String) modelo.getValueAt(selectedRow, 5); 
            String nombreVeterinario = (String) modelo.getValueAt(selectedRow, 8); 
            // Actualizar los JLabel con los datos de la fila seleccionada 
            jLabel5.setText("Cedula cliente: " + cedulaCliente); 
            jLabel6.setText("Mascota: " + nombreMascota); 
            jLabel7.setText("Fecha: " + fecha); 
            jLabel8.setText("Veterinario: " + nombreVeterinario);
        }
    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void jTextArea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyTyped
   char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_jTextArea1KeyTyped

    private void jTextArea2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyTyped
   char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_jTextArea2KeyTyped

    private void jTextArea3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea3KeyTyped
     char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_jTextArea3KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
