
package house_cleaning_booking_system;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class menu extends javax.swing.JFrame {

    
    public menu() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel2 = new javax.swing.JPanel();
        pi = new javax.swing.JButton();
        mb = new javax.swing.JButton();
        tc = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        so1 = new javax.swing.JButton();
        bh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tc1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        mini_homepage = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        personal_info = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        t1_txtname = new javax.swing.JLabel();
        t1_txtusername = new javax.swing.JLabel();
        t1_txtaddress = new javax.swing.JLabel();
        t1_txtphonenumber = new javax.swing.JLabel();
        t1_txtemail = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        t1_txtage = new javax.swing.JLabel();
        t1_txtgender = new javax.swing.JLabel();
        t1_txtbirthdate = new javax.swing.JLabel();
        updatebutton = new javax.swing.JButton();
        ai_address = new javax.swing.JTextField();
        ai_name = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        ai_username = new javax.swing.JTextField();
        ai_email = new javax.swing.JTextField();
        ai_phonenumber = new javax.swing.JTextField();
        ai_birthdate = new javax.swing.JTextField();
        ai_age = new javax.swing.JTextField();
        ai_gender = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        MY_BOOKINGS = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SERVICE_OFFER = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel24 = new javax.swing.JLabel();
        BOARDER_BOX1 = new javax.swing.JLabel();
        BOOKING_HISTORY = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        TERMS = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        BOARDER_BOX2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(233, 108, 108));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pi.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        pi.setText("PERSONAL INFO");
        pi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });
        jPanel2.add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 39));

        mb.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        mb.setText("SCHEDULE");
        mb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbActionPerformed(evt);
            }
        });
        jPanel2.add(mb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 40));

        tc.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tc.setText("BOOKING");
        tc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcActionPerformed(evt);
            }
        });
        jPanel2.add(tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 40));

        log_out.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        log_out.setText("LOG - OUT");
        log_out.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_outMouseClicked(evt);
            }
        });
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });
        jPanel2.add(log_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 110, 30));

        so1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        so1.setText("SERVICE OFFER");
        so1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        so1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so1ActionPerformed(evt);
            }
        });
        jPanel2.add(so1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 40));

        bh.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        bh.setText("BOOKINGS HISTORY");
        bh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhActionPerformed(evt);
            }
        });
        jPanel2.add(bh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 40));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "MY ACCOUNT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 390));

        tc1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tc1.setText("TERMS & CONDITION");
        tc1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tc1ActionPerformed(evt);
            }
        });
        jPanel2.add(tc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 400));

        jPanel6.setBackground(new java.awt.Color(204, 0, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255))));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HOUSE CLEANING BOOKING SYSTEM");
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "WELCOME TO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 8, 760, 80));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        mini_homepage.setBackground(new java.awt.Color(255, 102, 102));
        mini_homepage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HOUSE CLEANING BOOKING SYSTEM");
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "WELCOME TO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        mini_homepage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Experienced and trustworthy cleaners");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 220, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("OUR SERVICE OFFERS:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Customizable cleaning plans");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Eco-friendly cleaning products");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Affordable pricing");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Satisfaction guaranteed");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("WHY CHOOSE US?");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 20));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("BASIC HOUSE CLEANING");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 160, 30));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("DEEP CLEANING SERVICE");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("LAUNDRY CLEANING SERVICE");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("GREEN CLEANING SERVICE");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 150, -1));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("MOVE IN - MOVE OUT CLEANNING SERVICE");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("POST CONSTRUCTION CLEANING");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, 30));
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 30));
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 30));
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 30));
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 30));
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, 30));
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 30));

        mini_homepage.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 570, 280));

        jTabbedPane1.addTab("tab5", mini_homepage);

        personal_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "ACCOUNT INFORMATION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1_txtname.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtname.setText("NAME:");
        t1_txtname.setOpaque(true);
        jPanel1.add(t1_txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 93, 20));

        t1_txtusername.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtusername.setText("USERNAME:");
        t1_txtusername.setOpaque(true);
        jPanel1.add(t1_txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 93, 20));

        t1_txtaddress.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtaddress.setText("ADDRESS:");
        t1_txtaddress.setOpaque(true);
        jPanel1.add(t1_txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 93, 21));

        t1_txtphonenumber.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtphonenumber.setText("PHONE NUMBER:");
        t1_txtphonenumber.setOpaque(true);
        jPanel1.add(t1_txtphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 110, 26));

        t1_txtemail.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtemail.setText("EMAIL:");
        t1_txtemail.setOpaque(true);
        jPanel1.add(t1_txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 21));

        jLabel15.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel15.setText("ADDITIONAL INFO:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, -1));

        t1_txtage.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtage.setText("AGE:");
        t1_txtage.setOpaque(true);
        jPanel1.add(t1_txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 90, 20));

        t1_txtgender.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtgender.setText("GENDER:");
        t1_txtgender.setOpaque(true);
        jPanel1.add(t1_txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 90, 20));

        t1_txtbirthdate.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtbirthdate.setText("BIRTHDATE:");
        t1_txtbirthdate.setOpaque(true);
        jPanel1.add(t1_txtbirthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 90, 20));

        updatebutton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        updatebutton.setText("UPDATE");
        updatebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(updatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 100, 30));
        jPanel1.add(ai_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 230, -1));

        ai_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ai_nameActionPerformed(evt);
            }
        });
        jPanel1.add(ai_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 230, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 87, 334, 0));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 97, 334, 0));
        jPanel1.add(ai_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 230, -1));
        jPanel1.add(ai_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 230, -1));
        jPanel1.add(ai_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 230, -1));
        jPanel1.add(ai_birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 130, -1));
        jPanel1.add(ai_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 130, -1));
        jPanel1.add(ai_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 130, -1));

        personal_info.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 380));

        jLabel1.setOpaque(true);
        personal_info.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -100, -1, -1));

        jTabbedPane1.addTab("tab1", personal_info);

        MY_BOOKINGS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NAME:", "ADDRESS:", "PHONE NO:", "EMAIL:", "SERVICE:", "DURATION:", "DATE:", "TIME:", "AMOUNT:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(jTable1);

        MY_BOOKINGS.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 560, 330));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "MY SCHEDULE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18))); // NOI18N
        MY_BOOKINGS.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 590, 390));

        jLabel6.setMaximumSize(new java.awt.Dimension(580, 400));
        MY_BOOKINGS.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -100, -1, -1));

        jTabbedPane1.addTab("tab2", MY_BOOKINGS);

        SERVICE_OFFER.setAutoscrolls(true);
        SERVICE_OFFER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setOpaque(false);

        jTextPane1.setEditable(false);
        jTextPane1.setText("[BASIC HOUSE CLEANING]\nINCLUSION: DUSTING, VACUUMING, SWEEPING , MOPPING, CLEANING\n\nAREA COVER:\nBEDROOM\nBATHROOM\nLIVING ROOM\nDINING ROOM\nKITCHEN\nHOME OFFICE \nNURSERY ROOM\n\nPRICING: 3,500\nDURATION: 4 HOURS\n\n[DEEP CLEANING]\nINCLUSION: HAND WASHING CABINETS, APPLIANCES CLEANING, POLISHING WOODS\n\n AREA COVER:\nBEDROOM\nBATHROOM\nLIVING ROOM\nDINING ROOM\nKITCHEN\nHOME OFFICE \nNURSERY ROOM\n\nPRICING: 5,500                            \nDURATION: 6 HOURS\n\n[LAUNDRY SERVICE]\nINCLUSION: WASHING, FOLDING & DRYING\n\nDURATION:3 HOURS\nPRICING: 150 PER BASKET\n\n[GREEN CLEANING]\nINCLUSION: ECO FRIENDLY AND NON - TOXIC PRODUCTS\nRecommend: (FOR ALLERGIC TO CLEANING PRODUCTS & BABIES under 1-3 yrs. old)\n\nAREA COVER:\nBEDROOM\nBATHROOM\nLIVING ROOM\nDINING ROOM\nKITCHEN\nHOME OFFICE \nNURSERY ROOM\n\nPRICING: 5,000\nDURATION: minumum of 3 HOURS and 30 MINUTES\n\n[MOVE IN & MOVE OUTCLEANING]\n\nAREA COVER:\nBEDROOM\nBATHROOM\nLIVING ROOM\nDINING ROOM\nKITCHEN\nHOME OFFICE \nNURSERY ROOM\nBASEMENT \nGARAGE\n\nPRICING: 3200\nDURATION: 3 HOURS\n\nPOST CONSTRUCTION CLEANING]\n\nAREA COVER:\nBEDROOM\nBATHROOM\nLIVING ROOM\nDINING ROOM\nKITCHEN\nHOME OFFICE \nNURSERY ROOM\n\nPRICING: 2200\nDURATION: 4 HOURS");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextPane1.setOpaque(false);
        jScrollPane3.setViewportView(jTextPane1);

        SERVICE_OFFER.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 520, 310));

        jLabel24.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "SERVICE OFFER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 24))); // NOI18N
        SERVICE_OFFER.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 370));
        SERVICE_OFFER.add(BOARDER_BOX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -120, 820, 520));

        jTabbedPane1.addTab("tab3", SERVICE_OFFER);

        BOOKING_HISTORY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NAME:", "ADDRESS:", "PHONE NO:", "EMAIL:", "SERVICE:", "DURATION:", "DATE:", "TIME:", "AMOUNT:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane4.setViewportView(jTable2);

        BOOKING_HISTORY.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 540, 310));

        jLabel37.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel37.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "MY BOOKING HISTORY", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 24))); // NOI18N
        BOOKING_HISTORY.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 390));

        jTabbedPane1.addTab("tab6", BOOKING_HISTORY);

        TERMS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "TERMS & CONDITION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 24))); // NOI18N
        TERMS.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 380));

        jTextPane3.setText("1. Definitions\n\n\"Company\" refers to HOUSE CLEANING BOOKING SYSTEM , a professional house cleaning service.\n\"Cleaner\" refers to any employee or subcontractor of the Company who provides cleaning services.\n\"Client\" refers to any person or entity who hires the Company to provide cleaning services.\n\"Service\" refers to the cleaning services provided by the Company.\n\"Cleaning Visit\" refers to a single visit by a Cleaner to the Client's home to perform the Service.\n2. Contract\n\nThe Client agrees to the Company's terms and conditions by using the Company's services.\nThese terms and conditions take precedence over any other terms put forward by the Client.\n3. Payment\n\nThe Client will be invoiced for the Service after each Cleaning Visit.\nPayment is due within 7 days of the invoice date.\nLate payments may incur a late fee of $10 or 5% of the invoice total, whichever is greater.\nThe Company reserves the right to charge interest on late payments at a rate of 2% per month.\nThe Client is responsible for any expenses incurred by the Company during the Cleaning Visit, such as parking fees or the cost of replacement materials.\n4. Equipment\n\nThe Company will provide all necessary cleaning equipment and materials, unless otherwise agreed.\nThe Client is responsible for ensuring that all equipment and materials provided by the Client are in good working order.\nThe Company cannot accept liability for any damage to equipment or materials provided by the Client.\n5. Checklists\n\nThe Cleaner will use a checklist to ensure that all cleaning tasks are completed.\nThe Client may request a copy of the checklist at any time.\n6. Refunds\n\nThe Company does not offer refunds for unsatisfactory Service, except in exceptional circumstances.\nIf the Client is not satisfied with the Service, they must notify the Company within 24 hours of the Cleaning Visit.\nThe Company will make reasonable efforts to rectify any issues raised by the Client.\n7. Cancellation\n\nThe Client must give at least 24 hours' notice to cancel a Cleaning Visit.\nIf the Client cancels with less than 24 hours' notice, they will be charged for the full cost of the Cleaning Visit.\nThe Company reserves the right to cancel a Cleaning Visit at any time, in which case the Client will not be charged.\n8. Liability\n\nThe Company cannot accept liability for any loss or damage to the Client's property, except in cases of gross negligence or willful misconduct.\nThe Client is responsible for ensuring that the Cleaner has access to all areas of the home that require cleaning.\nThe Client is responsible for ensuring that any pets are kept under control during the Cleaning Visit.\n9. Confidentiality\n\nThe Company will treat all information about the Client and their home as confidential.\nThe Cleaner will not disclose any information about the Client or their home to any third party, except with the Client's written consent.\n10. Dispute Resolution\n\nAny disputes between the Company and the Client will be resolved through mediation or arbitration, as agreed by both parties.\nThe Company and the Client will make reasonable efforts to resolve any disputes through informal negotiation.\n11. Governing Law\n\nThese terms and conditions are governed by the laws of the state in which the Company is based.");
        jScrollPane1.setViewportView(jTextPane3);

        TERMS.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 520, 320));

        BOARDER_BOX2.setBackground(new java.awt.Color(255, 102, 102));
        TERMS.add(BOARDER_BOX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -120, 820, 520));

        jTabbedPane1.addTab("tab4", TERMS);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 600, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbActionPerformed
     jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_mbActionPerformed

    private void tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcActionPerformed
      jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_tcActionPerformed

    private void log_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_outMouseClicked
    }//GEN-LAST:event_log_outMouseClicked

    private void so1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so1ActionPerformed
       jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_so1ActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
       jTabbedPane1.setSelectedIndex(1);
      
       CREATE_ACCOUNT create = new CREATE_ACCOUNT();
       ai_name.setText(create.ca_fullname.getText());
       
    }//GEN-LAST:event_piActionPerformed

    private void bhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_bhActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        System.exit(0);
    }//GEN-LAST:event_log_outActionPerformed

    private void tc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tc1ActionPerformed
       BOOKING book = new BOOKING();
       book.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_tc1ActionPerformed

    private void ai_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ai_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ai_nameActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BOARDER_BOX1;
    private javax.swing.JLabel BOARDER_BOX2;
    private javax.swing.JPanel BOOKING_HISTORY;
    private javax.swing.JPanel MY_BOOKINGS;
    private javax.swing.JPanel SERVICE_OFFER;
    private javax.swing.JPanel TERMS;
    private javax.swing.JTextField ai_address;
    private javax.swing.JTextField ai_age;
    private javax.swing.JTextField ai_birthdate;
    private javax.swing.JTextField ai_email;
    private javax.swing.JTextField ai_gender;
    public javax.swing.JTextField ai_name;
    private javax.swing.JTextField ai_phonenumber;
    private javax.swing.JTextField ai_username;
    private javax.swing.JButton bh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JButton log_out;
    private javax.swing.JButton mb;
    private javax.swing.JPanel mini_homepage;
    private javax.swing.JPanel personal_info;
    private javax.swing.JButton pi;
    private javax.swing.JButton so1;
    private javax.swing.JLabel t1_txtaddress;
    private javax.swing.JLabel t1_txtage;
    private javax.swing.JLabel t1_txtbirthdate;
    private javax.swing.JLabel t1_txtemail;
    private javax.swing.JLabel t1_txtgender;
    private javax.swing.JLabel t1_txtname;
    private javax.swing.JLabel t1_txtphonenumber;
    private javax.swing.JLabel t1_txtusername;
    private javax.swing.JButton tc;
    private javax.swing.JButton tc1;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables

    private void LOGIN() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
