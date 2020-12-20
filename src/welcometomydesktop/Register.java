package welcometomydesktop;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public String getTahun(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public String getBulan(){
        DateFormat dateFormat = new SimpleDateFormat("MM");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public String susunKode(String tahun, String bulan, String noUrut){
        String kodeMember = tahun + bulan + noUrut;
        return kodeMember;
    }
    
    public int getNomorUrut(String kodeMember){
        int nomorUrut = Integer.parseInt(kodeMember.substring(kodeMember.length() - 2));
        return nomorUrut;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JLabel();
        labelNama1 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtJudul1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDaftar = new javax.swing.JLabel();
        txtJudul2 = new javax.swing.JLabel();
        imgBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(771, 465));

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtJudul.setFont(new java.awt.Font("Montserrat SemiBold", 1, 18)); // NOI18N
        txtJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJudul.setText("\"RIA & IKA Co-Working Space\"");

        labelNama1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        labelNama1.setText("Nama");

        txtNama.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        txtJudul1.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        txtJudul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJudul1.setText("Welcome To My Desktop");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcometomydesktop/img/Logo.png"))); // NOI18N

        btnDaftar.setBackground(new java.awt.Color(241, 57, 83));
        btnDaftar.setFont(new java.awt.Font("Montserrat SemiBold", 0, 11)); // NOI18N
        btnDaftar.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDaftar.setText("Daftar");
        btnDaftar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
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

        txtJudul2.setFont(new java.awt.Font("Montserrat SemiBold", 1, 18)); // NOI18N
        txtJudul2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJudul2.setText("Registrasi");

        imgBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcometomydesktop/img/back-arrow.png"))); // NOI18N
        imgBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgBackMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJudul1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNama1)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtJudul2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(imgBack, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtJudul1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJudul)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txtJudul2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNama1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaftarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarMouseEntered
        btnDaftar.setBackground(Color.decode("#D22F46"));
        btnDaftar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnDaftarMouseEntered

    private void btnDaftarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarMouseExited
        btnDaftar.setBackground(Color.decode("#F13953"));
    }//GEN-LAST:event_btnDaftarMouseExited

    private void btnDaftarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarMousePressed
        String tahun = getTahun();
        String bulan = getBulan();
        String noUrut = "01";
        String kodeMember = susunKode(tahun, bulan, noUrut);
        boolean statusInput = true;

        while(statusInput){
            try {
                Connection myConn = Koneksi.getKoneksi();
                Statement myStmt = myConn.createStatement();
                String query = "INSERT INTO member VALUES('" + kodeMember + "', '" + txtNama.getText() + "')";
                PreparedStatement ps = myConn.prepareStatement(query);
                ps.executeUpdate();
                ps.close();
                statusInput = false;
            } catch (SQLException e) {
                int nomorUrutBaru = getNomorUrut(kodeMember) + 1;
                noUrut = String.format("%02d", nomorUrutBaru);
                kodeMember = susunKode(tahun, bulan, noUrut);
            }
        }

        JOptionPane.showMessageDialog(null, "Registrasi berhasil! \nNama: " + txtNama.getText() + "\nKode Membership: " + kodeMember, "Registrasi Berhasil", JOptionPane.INFORMATION_MESSAGE);
        Home homePage = new Home();
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDaftarMousePressed

    private void imgBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBackMouseClicked
        Home homePage = new Home();
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imgBackMouseClicked

    private void imgBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBackMouseEntered
        imgBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imgBackMouseEntered

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDaftar;
    private javax.swing.JLabel imgBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNama1;
    private javax.swing.JLabel txtJudul;
    private javax.swing.JLabel txtJudul1;
    private javax.swing.JLabel txtJudul2;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
