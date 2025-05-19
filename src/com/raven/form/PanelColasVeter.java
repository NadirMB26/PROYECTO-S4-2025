package com.raven.form;

import View.Doctor.Doctor_Login;
import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.CitaRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;
import com.raven.component.ColaCitas;
import com.raven.component.NodoCita;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Locale;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class PanelColasVeter extends javax.swing.JPanel {
    public String usuV=Doctor_Login.usuarioNombre;
    DefaultTableModel modelo = new DefaultTableModel();


    public PanelColasVeter() {
        initComponents();

        // Definir columnas de la tabla
        modelo.addColumn("Cedula");
        modelo.addColumn("Mascota");
        modelo.addColumn("Entrada");
        modelo.addColumn("Salida");
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Veterinario");
        modelo.addColumn("Recepcionista");

        tablaCita.setModel(modelo);
        refrescarLista(); // Mostrar datos inicialmente

        // Timer para refrescar cada 60 segundos
        Timer timer = new Timer(60000, e -> refrescarLista());
        timer.start();
    }

    public void refrescarLista() {
    // Limpiar tabla para evitar entradas duplicadas
    modelo.setRowCount(0);
    ColaCitas cola = new ColaCitas();
    CitaRepository repo = new CitaRepository();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a", Locale.US);
    
    // Obtener fecha y hora actual
    LocalDateTime ahora = LocalDateTime.now();
    LocalDate hoy = ahora.toLocalDate();
    LocalTime horaActual = ahora.toLocalTime();
    
    // Obtener todas las citas
    List<Cita> citas = repo.getCitaAll();
    int i = 0;
    
    // Usar while para encolar citas que aún no han pasado
    while (i < citas.size()) {
        Cita cita = citas.get(i);
        try {
            LocalTime horaSalida = LocalTime.parse(cita.getHoraSalida(), formatter);
            
            // Simplificamos la lógica: encolamos citas cuya hora de salida no ha pasado aún
            if (!horaActual.isAfter(horaSalida)) {
                cola.encolar(cita);
            }
        } catch (DateTimeParseException e) {
            System.err.println("Error al parsear hora: " + cita.getHoraSalida());
        }
        i++;
    }
    
    // Mostrar citas encoladas
    NodoCita aux = cola.getFrente();
    while (aux != null) {
        Cita vete = aux.getCita();
        if (usuV.equalsIgnoreCase(vete.getNombreveterinario())) {
        modelo.addRow(new String[] {
            vete.getCedulacliente(),
            vete.getMascotaNombre(),
            vete.getHoraEntrada(),
            vete.getHoraSalida(),
            vete.getFecha(),
            vete.getDescrip(),
            vete.getNombreveterinario(),
            vete.getUsuarioS()
        });
        }
        aux = aux.getSiguiente();
    }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        timeEntrada1 = new com.raven.swing.TimePicker();
        timeSalida1 = new com.raven.swing.TimePicker();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCita = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        timeSalida1.setForeground(new java.awt.Color(255, 51, 51));

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
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jButton1.setText("ENCOLAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jButton1)
                .addContainerGap(302, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     refrescarLista();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaCita;
    private com.raven.swing.TimePicker timeEntrada1;
    private com.raven.swing.TimePicker timeSalida1;
    // End of variables declaration//GEN-END:variables
}
