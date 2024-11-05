package tampilann;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import kelas.user;

public class frameuser extends javax.swing.JFrame {

    public frameuser() {
        initComponents();
        loadTabel();
        reset();
    }
    
    void loadTabel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("User Name");
        model.addColumn("Email");
        model.addColumn("Full Name");
        model.addColumn("Status");
        
        
        try {
            user us = new user();
            ResultSet data = us.tampilUser();
            
            while(data.next()){
            model.addRow(new Object[]{
            data.getString("user_name"),
            data.getString("user_email"),
            data.getString("user_fullname"),
            data.getInt("user_status") == 1 ? "aktif" : "tidak aktif"
            
            });
        }     
    } catch (SQLException sQLException) {
}
        
        tUser.setModel(model);
    
    }
    
    void reset() {
        tUsername.setText(null);
        tUsername.setEditable(true);
        tEmail.setText(null);
        tPassword.setText(null);
        tFullname.setText(null);
        cStatus.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tUsername = new javax.swing.JTextField();
        tEmail = new javax.swing.JTextField();
        tFullname = new javax.swing.JTextField();
        bTambah = new javax.swing.JButton();
        cStatus = new javax.swing.JComboBox<>();
        tPassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tUser = new javax.swing.JTable();
        bHapus = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("Email");

        jLabel3.setText("Password");

        jLabel4.setText("Fullname");

        jLabel5.setText("Status");

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        cStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "aktif", "tidak aktif" }));

        tPassword.setText("jPasswordField1");

        tUser.setModel(new javax.swing.table.DefaultTableModel(
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
        tUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tUser);

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bTambah)
                        .addGap(18, 18, 18)
                        .addComponent(bHapus)
                        .addGap(18, 18, 18)
                        .addComponent(bUbah))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(tPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tUsername)
                                .addComponent(tEmail)
                                .addComponent(tFullname)
                                .addComponent(cStatus, 0, 143, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bTambah)
                            .addComponent(bHapus)
                            .addComponent(bUbah))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed

    user user = null;
        try {
            user = new user();
            user.setUser_name(tUsername.getText());
            user.setUser_email(tEmail.getText());
            user.setUser_password(tPassword.getText());
            user.setUser_fullname(tFullname.getText());
            
            if(cStatus.getSelectedItem().equals("aktif")) {
                user.setUser_status(1);        
            }else{
                user.setUser_status(0);
            }
            user.tambahUser();
        
        } catch (SQLException sQLException) {
            
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void tUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tUserMouseClicked
       int baris = tUser.rowAtPoint(evt.getPoint());
        String userName = tUser.getValueAt(baris, 0).toString();
        String email = tUser.getValueAt(baris, 1).toString();
        String fullName = tUser.getValueAt(baris, 2).toString();
        String status = tUser.getValueAt(baris, 3).toString();

        tUsername.setText(userName);
        tUsername.setEditable(false);
        tEmail.setText(email);
        tFullname.setText(fullName);
        cStatus.setSelectedItem(status);
    }//GEN-LAST:event_tUserMouseClicked

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        try {
            user usr = new user();
            usr.setUser_name(tUsername.getText());
            usr.hapusUser();
        }catch (SQLException sQLException) {            
        }
        loadTabel();
        reset();
    }//GEN-LAST:event_bHapusActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        try {
            user usr = new user();
            usr.setUser_name(tUsername.getText());
            usr.setUser_email(tEmail.getText());
            usr.setUser_password(tPassword.getText());
            usr.setUser_fullname(tFullname.getText());
             if (cStatus.getSelectedItem().equals("Aktif")) {
                usr.setUser_status(1);
            } else {
                usr.setUser_status(0);
            }
            usr.ubahUser();
        } catch (SQLException sQLException) {
        }
        loadTabel();
        reset();
    }//GEN-LAST:event_bUbahActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frameuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tFullname;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTable tUser;
    private javax.swing.JTextField tUsername;
    // End of variables declaration//GEN-END:variables
}
