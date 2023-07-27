package police_station;



import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Register extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement st = null;
    private String path;
    private String s;
    
    public Register() {
         super("Criminal Registration");
        conn = database.openConnection();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Upload = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        fullnames = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        fileNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nationality = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        offense = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bail = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jail = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        Register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 56, 213));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Criminal Page", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 3, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRIMINAL RECORD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 52, 275, 43));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel2.setText("Fullnames");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 113, 147, 40));

        Upload.setBackground(new java.awt.Color(0, 51, 204));
        Upload.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        Upload.setText("Upload Image");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });
        jPanel1.add(Upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 295, 137, -1));
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 118, 137, 153));

        fullnames.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fullnames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fullnames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnamesActionPerformed(evt);
            }
        });
        jPanel1.add(fullnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 114, 164, 40));

        age.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        age.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 231, 164, 40));

        fileNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fileNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(fileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 406, 164, 40));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel5.setText("Type of Offense");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 347, 147, 40));

        nationality.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        nationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Indian", "australian", "canadan", "bangladesh", "belgium", "american", "italian", "african", "others" }));
        nationality.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nationality.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalityActionPerformed(evt);
            }
        });
        jPanel1.add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 289, 164, 40));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 172, 147, 40));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel8.setText("Age");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 230, 147, 40));

        gender.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        gender.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 172, 164, 40));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel6.setText("Nationality");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 289, 147, 40));

        offense.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        offense.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Robbery", "Arson", "Bulgary", "Assault", "Kidnapping", "Violence", "Harassment", "others" }));
        offense.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        offense.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        offense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offenseActionPerformed(evt);
            }
        });
        jPanel1.add(offense, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 347, 164, 40));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel9.setText("Case/ File Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 405, 147, 40));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel10.setText("Bail Status");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 464, 147, 40));

        bail.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        bail.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        bail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bailActionPerformed(evt);
            }
        });
        jPanel1.add(bail, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 464, 164, 40));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel11.setText("Jail Term");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 522, 147, 40));

        jail.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jail.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1-5 years", "5-10 years", "10 - 20 years", "20-50 years", "50-100 years" }));
        jail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jailActionPerformed(evt);
            }
        });
        jPanel1.add(jail, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 522, 164, 40));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 597, 111, 43));

        Register.setBackground(new java.awt.Color(51, 255, 0));
        Register.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 597, 111, 43));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void offenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_offenseActionPerformed

    private void bailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bailActionPerformed

    private void jailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jailActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
        try{
            stmt = conn.createStatement();

            String q = "INSERT INTO registration values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            File file = new File(s);
            FileInputStream img = new FileInputStream(file);
            
            try(java.sql.PreparedStatement stmt = conn.prepareStatement(q)){
                
                stmt.setString(1, fullnames.getText());
                stmt.setString(2, (String) gender.getSelectedItem());
                stmt.setString(3, age.getText());
                stmt.setString(4, (String) nationality.getSelectedItem());
                stmt.setString(5, (String) offense.getSelectedItem());
                stmt.setString(6, fileNumber.getText());
                stmt.setString(7, (String) bail.getSelectedItem());
                stmt.setString(8, (String) jail.getSelectedItem());
                stmt.setBinaryStream(9, img, (int)file.length());
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "image is saved");

                setVisible(false);
                ShowRecords object = new ShowRecords();
                object.setVisible(true);
            }
        } catch (SQLException | HeadlessException e ){
            JOptionPane.showMessageDialog(null, e);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RegisterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      setVisible(false);
        Homepage b1 = new Homepage();
        b1.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "jpeg");
        chooser.setFileFilter(filter);
        int returnval = chooser.showOpenDialog(this);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (returnval == JFileChooser.APPROVE_OPTION)
        {
            File file = chooser.getSelectedFile();
            path = file.getAbsolutePath();
            img.setIcon(Resizeimage(path));
            s = path;
            System.out.println(s);
        }
    }//GEN-LAST:event_UploadActionPerformed

    private void fullnamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnamesActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Register;
    private javax.swing.JButton Upload;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox bail;
    private javax.swing.JTextField fileNumber;
    private javax.swing.JTextField fullnames;
    private javax.swing.JComboBox gender;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jail;
    private javax.swing.JComboBox nationality;
    private javax.swing.JComboBox offense;
    // End of variables declaration//GEN-END:variables
    
       private ImageIcon Resizeimage(String Imagepath) {
        ImageIcon myimage = new ImageIcon(Imagepath);
        Image imgs = myimage.getImage();
        Image newimg = imgs.getScaledInstance(img.getWidth(),img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        System.out.println(image);
    
        return image;
    }

}
