package id.ac.uniska.pbo2.p03;
import com.formdev.flatlaf.FlatDarkLaf;         
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;


public class FormPendaftaran extends javax.swing.JFrame {
    
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPendaftaran.class.getName());
    
    public FormPendaftaran() {
        initComponents();
        
        namaField.putClientProperty("JTextField.placeholderText", "Nama lengkap");
        npmField.putClientProperty("JTextField.placeholderText", "Contoh: 2410010001");
        getRootPane().setDefaultButton(daftarButton);
    }
    
    private void tampilkanRingkasan() {
    String jenisKelamin = lakiRadio.isSelected() ? "Laki-laki" : "Perempuan";
    List<String> minat = new ArrayList<>();
    for (JCheckBox cb : List.of(javaCheck, pythonCheck, webCheck)) {
        if (cb.isSelected()) {
            minat.add(cb.getText());
        }
    }
    String pesan = "Nama: " + namaField.getText()
            + "\nNPM: " + npmField.getText()
            + "\nProgram Studi: " + prodiCombo.getSelectedItem()
            + "\nJenis Kelamin: " + jenisKelamin
            + "\nMinat: " + (minat.isEmpty() ? "-" : String.join(", ", minat));
    JOptionPane.showMessageDialog(this, pesan, "Data Pendaftaran",
            JOptionPane.INFORMATION_MESSAGE);
}

    private void gantiTema(boolean gelap) {
        if (gelap) {
            FlatDarkLaf.setup();
        } else {
            FlatLightLaf.setup();
        }
        FlatLaf.updateUI(); // terapkan tema baru ke semua jendela yang terbuka
        temaToggle.setText(gelap ? "Mode Terang" : "Mode Gelap");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jeniskelaminGroup = new javax.swing.ButtonGroup();
        namaLabel = new javax.swing.JLabel();
        npmLabel = new javax.swing.JLabel();
        prodiLabel = new javax.swing.JLabel();
        jenisKelaminLabel = new javax.swing.JLabel();
        minatLabel = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        npmField = new javax.swing.JTextField();
        prodiCombo = new javax.swing.JComboBox<>();
        lakiRadio = new javax.swing.JRadioButton();
        perempuanRadio = new javax.swing.JRadioButton();
        javaCheck = new javax.swing.JCheckBox();
        pythonCheck = new javax.swing.JCheckBox();
        webCheck = new javax.swing.JCheckBox();
        temaToggle = new javax.swing.JToggleButton();
        daftarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pendaftaran Workshop");

        namaLabel.setText("Nama");

        npmLabel.setText("NPM");

        prodiLabel.setText("Program Studi");

        jenisKelaminLabel.setText("Jenis Kelamin");

        minatLabel.setText("Minat");

        namaField.addActionListener(this::namaFieldActionPerformed);

        prodiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Sistem Informasi", "Manajemen Informatika", " " }));
        prodiCombo.addActionListener(this::prodiComboActionPerformed);

        jeniskelaminGroup.add(lakiRadio);
        lakiRadio.setSelected(true);
        lakiRadio.setText("Laki-laki");

        jeniskelaminGroup.add(perempuanRadio);
        perempuanRadio.setText("Perempuan");

        javaCheck.setText("Java");

        pythonCheck.setText("Python");
        pythonCheck.addActionListener(this::pythonCheckActionPerformed);

        webCheck.setText("Web");

        temaToggle.setText("Mode Gelap");
        temaToggle.addActionListener(this::temaToggleActionPerformed);

        daftarButton.setText("Daftar");
        daftarButton.addActionListener(this::daftarButtonActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaLabel)
                    .addComponent(npmLabel)
                    .addComponent(prodiLabel)
                    .addComponent(jenisKelaminLabel)
                    .addComponent(minatLabel))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaField)
                    .addComponent(npmField)
                    .addComponent(prodiCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lakiRadio)
                                .addGap(26, 26, 26)
                                .addComponent(perempuanRadio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(javaCheck)
                                .addGap(18, 18, 18)
                                .addComponent(pythonCheck)
                                .addGap(18, 18, 18)
                                .addComponent(webCheck))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(temaToggle)
                                .addGap(18, 18, 18)
                                .addComponent(daftarButton)))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel)
                    .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npmLabel)
                    .addComponent(npmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodiLabel)
                    .addComponent(prodiCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jenisKelaminLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lakiRadio)
                        .addComponent(perempuanRadio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minatLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(javaCheck)
                        .addComponent(pythonCheck)
                        .addComponent(webCheck)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temaToggle)
                    .addComponent(daftarButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaFieldActionPerformed

    private void prodiComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodiComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodiComboActionPerformed

    private void pythonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pythonCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pythonCheckActionPerformed

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
    tampilkanRingkasan();
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void temaToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temaToggleActionPerformed
    gantiTema(temaToggle.isSelected());
    }//GEN-LAST:event_temaToggleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormPendaftaran().setVisible(true));
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daftarButton;
    private javax.swing.JCheckBox javaCheck;
    private javax.swing.JLabel jenisKelaminLabel;
    private javax.swing.ButtonGroup jeniskelaminGroup;
    private javax.swing.JRadioButton lakiRadio;
    private javax.swing.JLabel minatLabel;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField npmField;
    private javax.swing.JLabel npmLabel;
    private javax.swing.JRadioButton perempuanRadio;
    private javax.swing.JComboBox<String> prodiCombo;
    private javax.swing.JLabel prodiLabel;
    private javax.swing.JCheckBox pythonCheck;
    private javax.swing.JToggleButton temaToggle;
    private javax.swing.JCheckBox webCheck;
    // End of variables declaration//GEN-END:variables
}
