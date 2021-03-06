/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.sql.ResultSet;
import static UI.HappyTravel.base;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Yeimi Márquez
 */
public class Registro extends javax.swing.JPanel {

    /**
     * Creates new form Reservaciones
     */
    public Registro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jApellidos = new javax.swing.JTextField();
        jEmail = new javax.swing.JTextField();
        jTelefono = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jBtnRegistro = new javax.swing.JButton();
        jBtnConsulta = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(228, 137, 121));

        jLabel2.setBackground(new java.awt.Color(0, 255, 204));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Registro");

        jPanel3.setBackground(new java.awt.Color(244, 192, 119));

        jLabel1.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        jLabel1.setText("Por favor captura tu información personal para registrarte");

        jNombre.setFont(new java.awt.Font("HP Simplified Light", 0, 14)); // NOI18N
        jNombre.setForeground(new java.awt.Color(153, 153, 153));
        jNombre.setText("Nombre(s)");
        jNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNombreMouseClicked(evt);
            }
        });

        jApellidos.setFont(new java.awt.Font("HP Simplified Light", 0, 14)); // NOI18N
        jApellidos.setForeground(new java.awt.Color(153, 153, 153));
        jApellidos.setText("Apellido(s)");
        jApellidos.setMaximumSize(new java.awt.Dimension(600, 400));
        jApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jApellidosMouseClicked(evt);
            }
        });

        jEmail.setFont(new java.awt.Font("HP Simplified Light", 0, 14)); // NOI18N
        jEmail.setForeground(new java.awt.Color(153, 153, 153));
        jEmail.setText("Email");
        jEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEmailMouseClicked(evt);
            }
        });

        jTelefono.setFont(new java.awt.Font("HP Simplified Light", 0, 14)); // NOI18N
        jTelefono.setForeground(new java.awt.Color(153, 153, 153));
        jTelefono.setText("Teléfono");
        jTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTelefonoMouseClicked(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(17, 91, 116));
        jRadioButton1.setFont(new java.awt.Font("HP Simplified Light", 1, 12)); // NOI18N
        jRadioButton1.setText("Acepto los términos y condiciones");

        jBtnRegistro.setBackground(new java.awt.Color(41, 127, 184));
        jBtnRegistro.setFont(new java.awt.Font("HP Simplified Light", 1, 12)); // NOI18N
        jBtnRegistro.setText("Registrarme");
        jBtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistroActionPerformed(evt);
            }
        });

        jBtnConsulta.setBackground(new java.awt.Color(41, 127, 184));
        jBtnConsulta.setFont(new java.awt.Font("HP Simplified Light", 1, 12)); // NOI18N
        jBtnConsulta.setText("Consultar usuarios");
        jBtnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(335, 335, 335))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jBtnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jEmail)
                                    .addComponent(jNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(jTelefono))))
                        .addGap(51, 51, 51))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConsulta)
                    .addComponent(jBtnRegistro))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistroActionPerformed
        if (jRadioButton1.isSelected() == true) {
            int i = 0;
            ResultSet resultados = HappyTravel.base.consultar("SELECT max(IDCLIENTES) as maximo FROM APP.CLIENTES");

            
            if (resultados != null) {
                try {
                    while (resultados.next()) {
                        i = Integer.parseInt(resultados.getString("maximo"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (HappyTravel.base.ejecutar("INSERT INTO APP.CLIENTES (IDCLIENTES, NOMBRE, APELLIDOS, EMAIL, TELEFONO) \n"
                    + "	VALUES (" + (i + 1) + ",'" + jNombre.getText() + "', '" + jApellidos.getText() + "', '" + jEmail.getText() + "', '" + jTelefono.getText() + "')")) {
                System.out.println("eEjecución correcta!");
                this.setVisible(false);
                
            } else {
                System.out.println("Ocurrió un problema al ejecutar!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor De Aceptar Terminos Y Condiciones");
        }
    }//GEN-LAST:event_jBtnRegistroActionPerformed

    private void jBtnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultaActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        frame= new JFrame();
        usuarios1 = new Usuarios();
        frame.setLocation(250, 250);
        frame.setSize(600, 450);
        frame.setVisible(true);
        frame.add(usuarios1);
    }//GEN-LAST:event_jBtnConsultaActionPerformed

    private void jNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNombreMouseClicked
        // TODO add your handling code here:
        jNombre.selectAll();
    }//GEN-LAST:event_jNombreMouseClicked

    private void jApellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jApellidosMouseClicked
        // TODO add your handling code here:
        jApellidos.selectAll();
    }//GEN-LAST:event_jApellidosMouseClicked

    private void jEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEmailMouseClicked
        // TODO add your handling code here:
        jEmail.selectAll();
    }//GEN-LAST:event_jEmailMouseClicked

    private void jTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTelefonoMouseClicked
        // TODO add your handling code here:
        jTelefono.selectAll();
    }//GEN-LAST:event_jTelefonoMouseClicked
   
    

    private UI.Usuarios usuarios1;
    public static JFrame frame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jApellidos;
    private javax.swing.JButton jBtnConsulta;
    private javax.swing.JButton jBtnRegistro;
    private javax.swing.JTextField jEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTelefono;
    // End of variables declaration//GEN-END:variables
}
