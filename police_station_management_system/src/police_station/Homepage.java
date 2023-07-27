package police_station;

public class Homepage extends javax.swing.JFrame {

    public Homepage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        editrecord = new javax.swing.JButton();
        showrecords = new javax.swing.JButton();
        viewAdminRecords = new javax.swing.JButton();
        SignIn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        addCriminal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.magenta);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Application Homepage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 3, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POLICE STATION MANAGEMENT SYSTEM");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 42, 940, 80));

        editrecord.setBackground(new java.awt.Color(255, 255, 0));
        editrecord.setForeground(new java.awt.Color(255, 255, 0));
        editrecord.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\Criminal-Record-Management-System-Project-In-Java-Source-Code\\crime-record-management--master\\src\\images\\avatar5.png")); // NOI18N
        editrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editrecordActionPerformed(evt);
            }
        });
        jPanel1.add(editrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 225, 174, 160));

        showrecords.setBackground(new java.awt.Color(255, 255, 0));
        showrecords.setForeground(new java.awt.Color(255, 255, 0));
        showrecords.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\Criminal-Record-Management-System-Project-In-Java-Source-Code\\crime-record-management--master\\src\\images\\group.jpg")); // NOI18N
        showrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showrecordsActionPerformed(evt);
            }
        });
        jPanel1.add(showrecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 225, -1, 148));

        viewAdminRecords.setBackground(new java.awt.Color(255, 255, 0));
        viewAdminRecords.setForeground(new java.awt.Color(255, 255, 0));
        viewAdminRecords.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\Criminal-Record-Management-System-Project-In-Java-Source-Code\\crime-record-management--master\\src\\images\\operation.png")); // NOI18N
        viewAdminRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdminRecordsActionPerformed(evt);
            }
        });
        jPanel1.add(viewAdminRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 464, -1, 141));

        SignIn.setBackground(new java.awt.Color(255, 255, 0));
        SignIn.setForeground(new java.awt.Color(255, 255, 0));
        SignIn.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\Criminal-Record-Management-System-Project-In-Java-Source-Code\\crime-record-management--master\\src\\images\\admin.jpg")); // NOI18N
        SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInActionPerformed(evt);
            }
        });
        jPanel1.add(SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 471, -1, 134));

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 51));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\Criminal-Record-Management-System-Project-In-Java-Source-Code\\crime-record-management--master\\src\\images\\add admin.jpg")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 471, -1, 134));

        addCriminal.setBackground(new java.awt.Color(255, 255, 0));
        addCriminal.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\Criminal-Record-Management-System-Project-In-Java-Source-Code\\crime-record-management--master\\src\\images\\new.jpg")); // NOI18N
        addCriminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCriminalActionPerformed(evt);
            }
        });
        jPanel1.add(addCriminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 225, 183, 160));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Criminal");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 412, 163, 41));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("View All Records");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 412, 172, 41));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Edit Criminal Record");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 412, -1, 41));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Admin SignIn");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 609, 174, 41));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("View Admin Records");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 609, -1, 41));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Admin SignUp");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 620, 163, 41));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("PIES CRIME MANAGEMENT SYSTEM");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        HomeSignup a1 = new HomeSignup();
        a1.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void addCriminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCriminalActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Register a2 = new Register();
        a2.setVisible(true);
    }//GEN-LAST:event_addCriminalActionPerformed

    private void showrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showrecordsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ShowRecords a3 = new ShowRecords();
        a3.setVisible(true);
    }//GEN-LAST:event_showrecordsActionPerformed

    private void SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        HomeSignIn  a4 = new HomeSignIn();
        a4.setVisible(true);
                             
    }//GEN-LAST:event_SignInActionPerformed

    private void viewAdminRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdminRecordsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        HomeView a5 = new HomeView();
        a5.setVisible(true);                       
    }//GEN-LAST:event_viewAdminRecordsActionPerformed

    private void editrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editrecordActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Edit a6 = new Edit();
        a6.setVisible(true);
    }//GEN-LAST:event_editrecordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignIn;
    private javax.swing.JButton addCriminal;
    private javax.swing.JButton editrecord;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton showrecords;
    private javax.swing.JButton viewAdminRecords;
    // End of variables declaration//GEN-END:variables
}
