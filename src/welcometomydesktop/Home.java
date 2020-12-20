package welcometomydesktop;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtKode = new javax.swing.JTextField();
        labelKode = new javax.swing.JLabel();
        btnMasukMember = new javax.swing.JLabel();
        btnMasukGuest = new javax.swing.JLabel();
        btnDaftar = new javax.swing.JLabel();
        txtJudul1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelMessage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(771, 475));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setPreferredSize(new java.awt.Dimension(550, 550));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcometomydesktop/img/Ilustration.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 400));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtJudul.setFont(new java.awt.Font("Montserrat SemiBold", 1, 18)); // NOI18N
        txtJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJudul.setText("\"RIA & IKA Co-Working Space\"");

        labelNama.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        labelNama.setText("Nama");

        txtNama.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        txtKode.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        labelKode.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        labelKode.setText("Kode Membership");

        btnMasukMember.setBackground(new java.awt.Color(241, 57, 83));
        btnMasukMember.setFont(new java.awt.Font("Montserrat SemiBold", 0, 11)); // NOI18N
        btnMasukMember.setForeground(new java.awt.Color(255, 255, 255));
        btnMasukMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMasukMember.setText("Masuk (Member)");
        btnMasukMember.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        btnMasukMember.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMasukMember.setMaximumSize(new java.awt.Dimension(160, 35));
        btnMasukMember.setMinimumSize(new java.awt.Dimension(160, 35));
        btnMasukMember.setOpaque(true);
        btnMasukMember.setPreferredSize(new java.awt.Dimension(160, 35));
        btnMasukMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMasukMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMasukMemberMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMasukMemberMousePressed(evt);
            }
        });

        btnMasukGuest.setBackground(java.awt.Color.white);
        btnMasukGuest.setFont(new java.awt.Font("Montserrat SemiBold", 0, 11)); // NOI18N
        btnMasukGuest.setForeground(new java.awt.Color(241, 57, 83));
        btnMasukGuest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMasukGuest.setText("Masuk (Guest)");
        btnMasukGuest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 57, 83), 2));
        btnMasukGuest.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMasukGuest.setMaximumSize(new java.awt.Dimension(160, 35));
        btnMasukGuest.setMinimumSize(new java.awt.Dimension(160, 35));
        btnMasukGuest.setOpaque(true);
        btnMasukGuest.setPreferredSize(new java.awt.Dimension(160, 35));
        btnMasukGuest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMasukGuestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMasukGuestMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMasukGuestMousePressed(evt);
            }
        });

        btnDaftar.setBackground(java.awt.Color.white);
        btnDaftar.setFont(new java.awt.Font("Montserrat SemiBold", 0, 11)); // NOI18N
        btnDaftar.setForeground(new java.awt.Color(130, 130, 130));
        btnDaftar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDaftar.setText("Daftar sebagai Member");
        btnDaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDaftar.setMaximumSize(new java.awt.Dimension(160, 35));
        btnDaftar.setMinimumSize(new java.awt.Dimension(160, 35));
        btnDaftar.setOpaque(true);
        btnDaftar.setPreferredSize(new java.awt.Dimension(160, 35));
        btnDaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDaftarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDaftarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDaftarMousePressed(evt);
            }
        });

        txtJudul1.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        txtJudul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJudul1.setText("Welcome To My Desktop");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcometomydesktop/img/Logo.png"))); // NOI18N

        labelMessage.setFont(new java.awt.Font("Montserrat SemiBold", 0, 11)); // NOI18N
        labelMessage.setForeground(new java.awt.Color(255, 0, 0));
        labelMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 8)); // NOI18N
        jLabel3.setText("*Masuk sebagai guest hanya perlu mengisi nama");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJudul1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelKode)
                                    .addComponent(txtKode)
                                    .addComponent(labelNama)
                                    .addComponent(txtNama)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMasukMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMasukGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtJudul1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelKode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMasukMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMasukGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasukMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMemberMouseEntered
        btnMasukMember.setBackground(Color.decode("#D22F46"));
        btnMasukMember.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnMasukMemberMouseEntered

    private void btnMasukMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMemberMouseExited
        btnMasukMember.setBackground(Color.decode("#F13953"));
    }//GEN-LAST:event_btnMasukMemberMouseExited

    private void btnMasukMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMemberMousePressed
        try {
            Connection myConn = Koneksi.getKoneksi();
            Statement myStmt = myConn.createStatement();
           
            String query = "SELECT * FROM member WHERE nama = '" + txtNama.getText() + "' AND kodemember = '" + txtKode.getText() + "'";
            ResultSet rs = myStmt.executeQuery(query);
            
            if(rs.next()){
                String nama = rs.getString("nama");
                String kodeMember = rs.getString("kodemember");
                Counter counterPage = new Counter(nama, "member", kodeMember);  
                counterPage.setVisible(true);
                this.dispose();
            }else{
                labelMessage.setText("Data tidak ditemukan!");
            }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnMasukMemberMousePressed

    private void btnMasukGuestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukGuestMouseEntered
        btnMasukGuest.setBackground(Color.decode("#F13953"));
        btnMasukGuest.setForeground(Color.WHITE);
        btnMasukGuest.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnMasukGuestMouseEntered

    private void btnMasukGuestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukGuestMouseExited
        btnMasukGuest.setBackground(Color.WHITE);
        btnMasukGuest.setForeground(Color.decode("#F13953"));
    }//GEN-LAST:event_btnMasukGuestMouseExited

    private void btnMasukGuestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukGuestMousePressed
        String nama = txtNama.getText();
        if (nama.equals("")) {
            labelMessage.setText("Nama tidak boleh kosong!");
        } else {
            Counter counterPage = new Counter(nama, "guest");
            counterPage.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnMasukGuestMousePressed
        
    
    private void btnDaftarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarMouseEntered
        Font font = btnDaftar.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);    
        btnDaftar.setFont(font.deriveFont(attributes));
        btnDaftar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnDaftarMouseEntered

    private void btnDaftarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarMouseExited
        Font font = btnDaftar.getFont();  
        btnDaftar.setFont(new Font(font.getName(), font.getStyle(), font.getSize()));
    }//GEN-LAST:event_btnDaftarMouseExited

    private void btnDaftarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarMousePressed
        Register registerPage = new Register();
        registerPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDaftarMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDaftar;
    private javax.swing.JLabel btnMasukGuest;
    private javax.swing.JLabel btnMasukMember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelKode;
    private javax.swing.JLabel labelMessage;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel txtJudul;
    private javax.swing.JLabel txtJudul1;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
