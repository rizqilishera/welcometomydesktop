package welcometomydesktop;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Counter extends javax.swing.JFrame {

    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    boolean state = true;
    String nama, kodeMember, statusLogin;
    Timer timer = new Timer(1000, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            seconds+=1;
            if (seconds > 60) {
                seconds = 0;
                minutes++;
            }
            if (minutes > 60) {
                seconds = 0;
                minutes = 0;
                hours++;
            }
            Second.setText("" + String.format("%02d", seconds));
            Minute.setText("" + String.format("%02d", minutes));
            Hour.setText("" + String.format("%02d", hours));
        }
    });
    
    //Fungsi untuk transfer data dari page Home untuk guest
    public Counter(String nama, String statusLogin) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.nama = nama;
        this.statusLogin = statusLogin;
        
        labelSalam.setText("Selamat datang, " + nama);
        labelStatus.setText("Guest");
        mulai();
    }
    
    //Fungsi untuk transfer data dari page Home untuk member
    public Counter(String nama, String statusLogin, String kode) {
        initComponents();
        this.setLocationRelativeTo(null);
        labelSalam.setText("Selamat datang, " + nama);
        this.nama = nama;
        this.kodeMember = kode;
        this.statusLogin = statusLogin;
        labelStatus.setText("Member");
        mulai();
    }
    
    //Fungsi untuk menghitung diskon member
    public int hitungDiskon(String kodeMember){
        int tahun = Integer.parseInt(kodeMember.substring(0,4));
        int bulan = Integer.parseInt(kodeMember.substring(4,6));
        int diskon;
        
        if (tahun < 2019){
            diskon = 2000;
        } else if (tahun == 2019){
            if (bulan <= 7) {
                diskon = 1000;
            } else {
                diskon = 0;
            }
        } else {
            diskon = 0;
        }
        return diskon;
    }
    
    //Fungsi untuk menghentikan timer
    public void stop() {
        timer.stop();
    }
    
    //Fungsi untuk memulai timer
    public void mulai() {
        timer.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnStop = new javax.swing.JLabel();
        Hour = new javax.swing.JLabel();
        Minute = new javax.swing.JLabel();
        Second = new javax.swing.JLabel();
        labelSalam = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));

        btnStop.setBackground(new java.awt.Color(241, 57, 83));
        btnStop.setFont(new java.awt.Font("Montserrat SemiBold", 0, 11)); // NOI18N
        btnStop.setForeground(new java.awt.Color(255, 255, 255));
        btnStop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnStop.setText("Stop Penggunaan");
        btnStop.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        btnStop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnStop.setMaximumSize(new java.awt.Dimension(160, 35));
        btnStop.setMinimumSize(new java.awt.Dimension(160, 35));
        btnStop.setOpaque(true);
        btnStop.setPreferredSize(new java.awt.Dimension(160, 35));
        btnStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStopMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnStopMousePressed(evt);
            }
        });

        Hour.setFont(new java.awt.Font("Montserrat SemiBold", 0, 60)); // NOI18N
        Hour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hour.setText("00");
        Hour.setMaximumSize(new java.awt.Dimension(100, 100));
        Hour.setMinimumSize(new java.awt.Dimension(100, 100));
        Hour.setPreferredSize(new java.awt.Dimension(100, 100));

        Minute.setFont(new java.awt.Font("Montserrat SemiBold", 0, 60)); // NOI18N
        Minute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minute.setText("00");
        Minute.setMaximumSize(new java.awt.Dimension(100, 100));
        Minute.setMinimumSize(new java.awt.Dimension(100, 100));
        Minute.setPreferredSize(new java.awt.Dimension(100, 100));

        Second.setFont(new java.awt.Font("Montserrat SemiBold", 0, 60)); // NOI18N
        Second.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Second.setText("00");
        Second.setMaximumSize(new java.awt.Dimension(100, 100));
        Second.setMinimumSize(new java.awt.Dimension(100, 100));
        Second.setPreferredSize(new java.awt.Dimension(100, 100));

        labelSalam.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        labelSalam.setText("Selamat Datang, null");

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Waktu Penggunaan:");

        labelStatus.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        labelStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStatus.setText("Member");

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel6.setText("Jam");

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel7.setText("Detik");

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel8.setText("Menit");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcometomydesktop/img/logosm.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel6)
                                    .addGap(91, 91, 91)
                                    .addComponent(jLabel8)
                                    .addGap(76, 76, 76)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Hour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Minute, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Second, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(labelSalam, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSalam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Second, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minute, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStopMouseEntered
        btnStop.setBackground(Color.decode("#D22F46"));
        btnStop.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnStopMouseEntered

    private void btnStopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStopMouseExited
        btnStop.setBackground(Color.decode("#F13953"));
    }//GEN-LAST:event_btnStopMouseExited

    private void btnStopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStopMousePressed
        int diskon;
        if (this.statusLogin.equals("member")){
            diskon = hitungDiskon(this.kodeMember);
        } else {
            diskon = 0;
        }
        
        //Menghentikan waktu
        JFrame jframe = new JFrame();
        
        int pilih = JOptionPane.showConfirmDialog(jframe, "Apakah anda yakin?", "Hentikan Penggunaan", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if(pilih == JOptionPane.YES_OPTION) {
            stop();
            String strJam = Hour.getText();
            String strMenit = Minute.getText();
            String strDetik = Second.getText();
            int jam = Integer.parseInt(strJam);
            int menit = Integer.parseInt(strMenit);
            int detik = Integer.parseInt(strDetik);
            if (detik > 0) {
                menit++;
            }
            if (menit > 0) {
                jam++;
            }
            int total = jam;
            Checkout pageCheckout = new Checkout(this.nama, total, diskon, strJam, strMenit, strDetik);
            pageCheckout.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnStopMousePressed

    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hour;
    private javax.swing.JLabel Minute;
    private javax.swing.JLabel Second;
    private javax.swing.JLabel btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelSalam;
    private javax.swing.JLabel labelStatus;
    // End of variables declaration//GEN-END:variables
}
