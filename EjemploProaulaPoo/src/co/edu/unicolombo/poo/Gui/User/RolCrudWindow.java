
package co.edu.unicolombo.poo.Gui.User;

import co.edu.unicolombo.poo.Domain.Business.Handlers.Commands.EditarRolCommandHandler;
import co.edu.unicolombo.poo.Domain.Business.Handlers.Commands.EliminarRolCommandHandler;
import co.edu.unicolombo.poo.Domain.Business.Handlers.Commands.GuardarRoleCommandHandler;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Queries.IBuscarRolQuery;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Repositories.IRoleRepository;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases.BuscarRolQueryHandler;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases.BuscarRolquery;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases.EditarRolCommand;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases.EliminarRolCommand;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases.GuardarRolCommand;
import co.edu.unicolombo.poo.Domain.Model.Role;

import co.edu.unicolombo.poo.Infrastructure.Repositories.RoleRepository;

import javax.swing.JOptionPane;


public class RolCrudWindow extends javax.swing.JDialog {
private Role rolActual;
    public RolCrudWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FieldName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        boxDescription = new javax.swing.JTextArea();
        ButtonSave = new javax.swing.JButton();
        ButtonBuscar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE ROLES");

        PanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del Rol", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NOMBRE:");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Descripcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 51, 255))); // NOI18N

        boxDescription.setColumns(20);
        boxDescription.setRows(5);
        boxDescription.setBorder(null);
        jScrollPane1.setViewportView(boxDescription);

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

        ButtonEditar.setText("EDITAR");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButtonEliminar.setText("ELIMINAR");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonSave)
                .addGap(14, 14, 14))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSave)
                    .addComponent(ButtonBuscar)
                    .addComponent(ButtonEditar)
                    .addComponent(ButtonEliminar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
       if(FieldName.getText().isEmpty()&&boxDescription.getText().isEmpty()){
          JOptionPane.showMessageDialog(this,"Debes llenar todos los campos");
       }else{
              try {
            var name= FieldName.getText();
            var description=boxDescription.getText();
            var comando = new GuardarRolCommand(name,description);
            var repository=new RoleRepository();
            var guardarRoleCommandHandler= new GuardarRoleCommandHandler(repository);
            int total=guardarRoleCommandHandler.createRole(comando);
            JOptionPane.showMessageDialog(this,"Usuario guardado Correctamente, total "+total);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        } 
              FieldName.setText("");
              boxDescription.setText("");
       }
    
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
         try {
            if(rolActual==null){
                JOptionPane.showMessageDialog(this,"Primero busque el rol y editelo");
                return;
            }
            String nombre = FieldName.getText();
            String descripcion=boxDescription.getText();
            rolActual.setName(nombre);
            rolActual.setDescripcion(descripcion);
             
            var editarRolCommand=new EditarRolCommand(rolActual.getId(),
                    rolActual.getName(),rolActual.getDescripcion());
          
           var rolRepository=new RoleRepository();
           var editarCommandHandler=new EditarRolCommandHandler(rolRepository);
           editarCommandHandler.editar(editarRolCommand);
            JOptionPane.showMessageDialog(this,"Rol Editado ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
       try {
            String id=JOptionPane.showInputDialog(this,"Ingrese el ID del Rol");
            int rolId= Integer.parseInt(id);
            IRoleRepository repository=new RoleRepository();
            IBuscarRolQuery queryHandler = new BuscarRolQueryHandler(repository);
            var query=new BuscarRolquery(rolId);
            rolActual=queryHandler.obtenerRol(query);
            FieldName.setText(rolActual.getName());
            boxDescription.setText(rolActual.getDescripcion());
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
    
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RolCrudWindow dialog = new RolCrudWindow(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JTextField FieldName;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JTextArea boxDescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
