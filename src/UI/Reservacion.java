
package UI;
import java.sql.ResultSet;
import static UI.HappyTravel.base;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Reservacion extends javax.swing.JPanel {

    public Reservacion() {
        initComponents();
        dateChooser = new JDateChooser();
        dateChooser.setBounds(350, 22, 150, 30);
        dateChooser.setToolTipText("Fecha de entrada");
        dateChooser2 = new JDateChooser();
        dateChooser2.setBounds(350, 76, 150, 30);
        dateChooser2.setToolTipText("Fecha de salida");
        jPanel1.add(dateChooser);
        jPanel1.add(dateChooser2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextNinos = new javax.swing.JTextField();
        jComDestino = new javax.swing.JComboBox<>();
        jComHotel = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jComAutobus = new javax.swing.JComboBox<>();
        jTextAdultos = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 192, 119));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(244, 192, 119));
        jPanel1.setOpaque(false);

        jTextNinos.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        jTextNinos.setForeground(new java.awt.Color(0, 0, 0));
        jTextNinos.setText("Niños");
        jTextNinos.setMaximumSize(new java.awt.Dimension(65, 27));
        jTextNinos.setMinimumSize(new java.awt.Dimension(65, 27));
        jTextNinos.setPreferredSize(new java.awt.Dimension(65, 27));
        jTextNinos.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextNinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextNinosMouseClicked(evt);
            }
        });

        jComDestino.setFont(new java.awt.Font("HP Simplified Light", 0, 14)); // NOI18N
        jComDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Destino", "Real de catorce", "Xilitla", "Tamasopo", "Rio verde", "Venado", "Salinas", "San luis potosi(capital)", "Ahualulco", " " }));

        jComHotel.setFont(new java.awt.Font("HP Simplified Light", 0, 14)); // NOI18N
        jComHotel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de hotel", "5 Estrellas", "4 Estrellas", "3 Estrellas", " " }));

        jButton1.setBackground(new java.awt.Color(41, 127, 184));
        jButton1.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComAutobus.setFont(new java.awt.Font("HP Simplified Light", 0, 14)); // NOI18N
        jComAutobus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autobus", "Autobus1", "Autobus2", "Autobus3" }));
        jComAutobus.setLightWeightPopupEnabled(false);
        jComAutobus.setMaximumSize(new java.awt.Dimension(65, 27));
        jComAutobus.setMinimumSize(new java.awt.Dimension(65, 27));
        jComAutobus.setPreferredSize(new java.awt.Dimension(65, 27));

        jTextAdultos.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        jTextAdultos.setForeground(new java.awt.Color(0, 51, 51));
        jTextAdultos.setText("Adultos");
        jTextAdultos.setMaximumSize(new java.awt.Dimension(65, 27));
        jTextAdultos.setMinimumSize(new java.awt.Dimension(65, 27));
        jTextAdultos.setPreferredSize(new java.awt.Dimension(65, 27));
        jTextAdultos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAdultosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextNinos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jComHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jComDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jComAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jPanel5.setBackground(new java.awt.Color(228, 137, 121));

        jLabel15.setBackground(new java.awt.Color(0, 255, 204));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 204));
        jLabel15.setText("Reservaciones");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(189, 189, 189))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i = 0, j = 0, ninos = 0, adultos = 0;
        String fechSelect, fechAleat;
        Fecha yymmdd = new Fecha();
        ResultSet resultados = HappyTravel.base.consultar("SELECT max(IDRESERVAS) as maximo FROM APP.RESERVAS");
        ResultSet resultados2 = HappyTravel.base.consultar("SELECT max(IDCLIENTES) as maximo FROM APP.CLIENTES");

        if (resultados != null) {
            try {
                while (resultados.next()) {
                    i = Integer.parseInt(resultados.getString("maximo"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (resultados2 != null) {
            try {
                while (resultados2.next()) {
                    j = Integer.parseInt(resultados2.getString("maximo"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Random rnd = new Random();
        Date fechaActual, aleatorioFecha;
        aleatorioFecha = new Date();
        aleatorioFecha.setDate(rnd.nextInt(15));
        aleatorioFecha.setMonth(rnd.nextInt(12));
        aleatorioFecha.setYear(rnd.nextInt(2) + 120);
        fechaActual = dateChooser.getDate();
        dateChooser2.setDate(aleatorioFecha);

        fechSelect = fechaActual.toString();
        fechAleat = aleatorioFecha.toString();
        System.out.println(fechSelect);
        System.out.println(fechAleat);
        System.out.println(yymmdd.convertir(fechSelect));
        System.out.println(yymmdd.convertir(fechAleat));

        //yyyy-mm-dd
        ninos = Integer.parseInt(jTextNinos.getText());
        adultos = Integer.parseInt(jTextAdultos.getText());
        int destRand = rnd.nextInt(12);
        int autobusRand = rnd.nextInt(5);
        int hotelRand = rnd.nextInt(5);
        if (jComDestino.getSelectedIndex() == destRand) {
            JOptionPane.showMessageDialog(null, "Este destino ya se encuentra ocupado");
        }
        if (jComAutobus.getSelectedIndex() == autobusRand) {
            JOptionPane.showMessageDialog(null, "El autobus ya se encuentra con cupo lleno");
        }
        if (jComHotel.getSelectedIndex() == hotelRand) {
            JOptionPane.showMessageDialog(null, "Este hotel no esta disponible");
        } else {
            if (HappyTravel.base.ejecutar("INSERT INTO APP.RESERVAS (IDRESERVAS, "
                    + "IDCLIENTES, "
                    + "DESTINO, "
                    + "FECHALLEGADA, "
                    + "FECHASALIDA, "
                    + "AUTOBUS, "
                    + "NOMBREHOTEL, "
                    + "NINOS, "
                    + "ADULTOS) \n"
                    + " VALUES (" + (i + 1) + ","
                    + " " + j + ","
                    + "'" + jComDestino.getSelectedItem() + "', "
                    + "'" + yymmdd.convertir(fechAleat) + "', "
                    + "'" + yymmdd.convertir(fechSelect) + "', "
                    + "'" + jComAutobus.getSelectedItem() + "', "
                    + "'" + jComHotel.getSelectedItem() + "', "
                    + "" + ninos + ", "
                    + "" + adultos + ")")) {
                System.out.println("eEjecución correcta!");
            } else {
                JOptionPane.showMessageDialog(null, "Por favor revisa la entrada de los datos");
            }

            this.setVisible(false);
            HappyTravel.hotel1.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextNinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextNinosMouseClicked
        // TODO add your handling code here:
        jTextNinos.selectAll();
    }//GEN-LAST:event_jTextNinosMouseClicked

    private void jTextAdultosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAdultosMouseClicked
        // TODO add your handling code here:
        jTextAdultos.selectAll();
    }//GEN-LAST:event_jTextAdultosMouseClicked
                  
    private final JDateChooser dateChooser;
    private final JDateChooser dateChooser2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComAutobus;
    private javax.swing.JComboBox<String> jComDestino;
    public static javax.swing.JComboBox<String> jComHotel;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextAdultos;
    private javax.swing.JTextField jTextNinos;
    // End of variables declaration//GEN-END:variables
}
