package project1;

import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Wrapper;
import java.io.*;  
import java.sql.ResultSet;
import javax.swing.*; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class signup extends javax.swing.JFrame {
    // database URL
	static final String DB_URL = "jdbc:mysql://localhost/credentials?useSSL=false";
	//  Database credentials
	static final String USER = "hduser";
	static final String PASS = "anmol2810";
	protected static final String String = null;
	/**
	 * Launch the application.
	 */
        String defUsername = "Choose any username";
    public signup() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passcode = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        confirmPasscode = new javax.swing.JPasswordField();
        passwordMatch = new javax.swing.JPanel();
        TNC = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign Up");
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(33, 146, 240));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/imagePackage/admin10.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" Analytics Tool Portal");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Project by: Anmol (UE145018)");
        jLabel9.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel9)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, -2, 484, 500);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(104, 104, 104));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sign Up");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(540, 50, 140, 50);

        loginId.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        loginId.setForeground(new java.awt.Color(51, 51, 51));
        loginId.setText("Your E-Mail address goes here");
        loginId.setToolTipText("");
        loginId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        loginId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginIdFocusLost(evt);
            }
        });
        loginId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                loginIdKeyReleased(evt);
            }
        });
        jPanel1.add(loginId);
        loginId.setBounds(560, 140, 320, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Login ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(560, 110, 90, 30);

        username.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 51));
        username.setText("Choose any username");
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(560, 210, 320, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Username");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(560, 180, 80, 30);

        passcode.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        passcode.setForeground(new java.awt.Color(51, 51, 51));
        passcode.setText("password");
        passcode.setToolTipText("");
        passcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        passcode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passcodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passcodeFocusLost(evt);
            }
        });
        passcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passcodeKeyReleased(evt);
            }
        });
        jPanel1.add(passcode);
        passcode.setBounds(560, 280, 320, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Login Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(560, 250, 110, 30);

        signInButton.setBackground(new java.awt.Color(51, 102, 255));
        signInButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setText("Sign Up");
        signInButton.setBorder(null);
        signInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInButton.setEnabled(false);
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        signInButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                signInButtonKeyReleased(evt);
            }
        });
        jPanel1.add(signInButton);
        signInButton.setBounds(560, 430, 90, 30);

        loginLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(51, 102, 255));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Already a registered member? Click here");
        loginLabel.setToolTipText("");
        loginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLabelMouseClicked(evt);
            }
        });
        jPanel1.add(loginLabel);
        loginLabel.setBounds(680, 430, 230, 30);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(51, 102, 255));
        jCheckBox1.setText("I agree to all the terms of service");
        jCheckBox1.setEnabled(false);
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(560, 390, 205, 25);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/imagePackage/key.png"))); // NOI18N
        jLabel11.setToolTipText("");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(890, 280, 30, 30);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Confirm Password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(560, 320, 110, 30);

        confirmPasscode.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        confirmPasscode.setForeground(new java.awt.Color(51, 51, 51));
        confirmPasscode.setText("password");
        confirmPasscode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        confirmPasscode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPasscodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPasscodeFocusLost(evt);
            }
        });
        confirmPasscode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmPasscodeKeyReleased(evt);
            }
        });
        jPanel1.add(confirmPasscode);
        confirmPasscode.setBounds(560, 350, 320, 30);

        passwordMatch.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout passwordMatchLayout = new javax.swing.GroupLayout(passwordMatch);
        passwordMatch.setLayout(passwordMatchLayout);
        passwordMatchLayout.setHorizontalGroup(
            passwordMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        passwordMatchLayout.setVerticalGroup(
            passwordMatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(passwordMatch);
        passwordMatch.setBounds(890, 360, 10, 10);

        TNC.setBackground(new java.awt.Color(255, 255, 255));
        TNC.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        TNC.setForeground(new java.awt.Color(51, 102, 255));
        TNC.setText("Terms of service");
        TNC.setToolTipText("");
        TNC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TNCMouseClicked(evt);
            }
        });
        jPanel1.add(TNC);
        TNC.setBounds(810, 390, 130, 30);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(33, 146, 240));

        exit.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 926, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 970, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(968, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Wrapper conn = null;
    String loginID = "";
    String Username = "Guest";
    String password = "";

    public static final int PASSWORD_LENGTH = 8;    public static boolean is_Valid_Password(String password) {
        if (password.length() < PASSWORD_LENGTH) return false;
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }
    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    public static boolean is_Numeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        if (Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", loginID)){
                if (is_Valid_Password(password)) {
                    try{
                         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/credentials?useSSL=false", "hduser", "anmol2810");
                         Statement check =  con.createStatement();
                         String SQL = "select * from credentials.useraccounts where loginid ='"+ loginID +"'";
                         ResultSet rs = check.executeQuery(SQL);
                         if (rs.next()){
                             JOptionPane.showMessageDialog(null, "This E-Mail address already exists. Sign in");
                             dispose();
                             new login().setVisible(true);
                             return;
                         }   
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Database Connecivity error. This incident will be reported.");
                        return;
                    }
            }
                else{
                    JOptionPane.showMessageDialog(null, "Password is not valid. Please try again.");
                    return;
                }
            }
        else{
            JOptionPane.showMessageDialog(null, "This E-Mail address is not valid. Please enter a valid E-Mail address" + loginID);
            return;
        }
        try{
            String IQuery = "INSERT INTO credentials.useraccounts(loginid, username, password) VALUES('"+loginID+"', '"+Username+"', '"+password+"')";
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            JOptionPane.showMessageDialog(null, "Connected to MySQL Server on localhost successfully");
            ((Connection)conn).createStatement().execute(IQuery);//select the rows
            // define SMessage variable
            ((java.sql.Connection)conn).close();
            Project1.globalUsername = Username;
            dispose();
            // Welcome screen
            
            new welcome().setVisible(true);
            return;
        }
        catch (SQLException se){
            //handle errors for JDBC
            se.printStackTrace();
            JOptionPane.showMessageDialog(null, se);
        }
    }//GEN-LAST:event_signInButtonActionPerformed

    private void loginIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginIdFocusLost
        if ("".equals(loginId.getText())){
            loginId.setText("Your E-Mail address goes here");
        }
        else{
            loginID = loginId.getText();
        }
    }//GEN-LAST:event_loginIdFocusLost

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        if("".equals(username.getText())){
            username.setText("Choose any username");
        }
        else{
            Username = username.getText();
        }
    }//GEN-LAST:event_usernameFocusLost
public static int count = 1;
    private void passcodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passcodeFocusLost
        if("".equals(passcode.getText())){
            passcode.setText("password");
        }
    }//GEN-LAST:event_passcodeFocusLost

    private void loginIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginIdFocusGained
        if (Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", loginID)){}
        else{
            loginId.setText("");
        }
    }//GEN-LAST:event_loginIdFocusGained

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        if(username.getText().equals("") || username.getText().equals(defUsername)){
            username.setText("");
        }
    }//GEN-LAST:event_usernameFocusGained

    private void passcodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passcodeFocusGained
        if(passcode.getText().equals("") || passcode.getText().equals("password")){
            passcode.setText("");
        }
        while(count > 0){
            count = 0;
            String msg = "1. A password must have at least eight characters.\n" +
                "2. A password must have only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +"";
            JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_passcodeFocusGained

    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseClicked
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_loginLabelMouseClicked

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void loginIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginIdKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(passcode.getText().equals(confirmPasscode.getText()) && (!confirmPasscode.getText().equals("password"))){
                if (Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", loginID)){
                    if(is_Valid_Password(password)){
                        jCheckBox1.setEnabled(true);
                    }
                    else{
                        jCheckBox1.setEnabled(false);
                        JOptionPane.showMessageDialog(null, "Password Invalid.");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "E-Mail address is invalid");
                    jCheckBox1.setEnabled(false);
                }
                loginID = loginId.getText();
                Username = username.getText();
            }
            else{
                password = "";
                confirmPasscode.setText("");
                jCheckBox1.setEnabled(false);
                signInButton.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Passwords don't match. Please try again");
            }
        }
    }//GEN-LAST:event_loginIdKeyReleased

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(passcode.getText().equals(confirmPasscode.getText()) && (!confirmPasscode.getText().equals("password"))){
                Username = username.getText();
                loginID = loginId.getText();
                if(is_Valid_Password(password)){
                    if(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", loginID)){
                        jCheckBox1.setEnabled(true);
                    }
                    else{
                        jCheckBox1.setEnabled(false);
                        JOptionPane.showMessageDialog(null, "E-Mail address is Invalid.");
                    }
                }
                else{
                    jCheckBox1.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Password Invalid.");
                }
            }
            else{
                password = "";
                confirmPasscode.setText("");
                jCheckBox1.setEnabled(false);
                signInButton.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Passwords don't match. Please try again");
            }
        }
    }//GEN-LAST:event_usernameKeyReleased

    private void passcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passcodeKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(passcode.getText().equals(confirmPasscode.getText()) && (!confirmPasscode.getText().equals("password"))){
                if (Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", loginID)){
                    if (is_Valid_Password(password)) {
                        jCheckBox1.setEnabled(true);
                        
                    }
                    else{
                        jCheckBox1.setEnabled(false);
                        JOptionPane.showMessageDialog(null, "Passwords don't match. Please try again");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "E-Mail address is invalid");
                    jCheckBox1.setEnabled(false);
                }
            }
            else{
                password = "";
                confirmPasscode.setText("");
                jCheckBox1.setEnabled(false);
                signInButton.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Passwords don't match. Please try again");
            }
        }
    }//GEN-LAST:event_passcodeKeyReleased

    private void signInButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signInButtonKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            signInButton.doClick();
    }
    }//GEN-LAST:event_signInButtonKeyReleased

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        if(jCheckBox1.isSelected()){
        signInButton.setEnabled(true);
        }
        else{
            signInButton.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void confirmPasscodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasscodeFocusGained
        
        if(confirmPasscode.getText().equals("") || confirmPasscode.getText().equals("password")){
            confirmPasscode.setText("");
        }
    }//GEN-LAST:event_confirmPasscodeFocusGained

    private void confirmPasscodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasscodeFocusLost
        if(confirmPasscode.getText().equals("")){
           confirmPasscode.setText("password");
        }
        if(passcode.getText().equals(confirmPasscode.getText()) && (!confirmPasscode.getText().equals("password"))){
            jCheckBox1.setEnabled(true);
            passwordMatch.setBackground(new java.awt.Color(0, 255, 0));
            password = confirmPasscode.getText();
        }
        else{
            password = "";
            confirmPasscode.setText("");
            jCheckBox1.setEnabled(false);
            signInButton.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Passwords don't match. Please try again");
        }
    }//GEN-LAST:event_confirmPasscodeFocusLost

    private void confirmPasscodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasscodeKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(passcode.getText().equals(confirmPasscode.getText()) && (!confirmPasscode.getText().equals("password"))){
                jCheckBox1.setEnabled(true);
            }
            else{
                password = "";
                confirmPasscode.setText("");
                jCheckBox1.setEnabled(false);
                signInButton.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Passwords don't match. Please try again");
            }
        }
    }//GEN-LAST:event_confirmPasscodeKeyReleased

    private void TNCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TNCMouseClicked
        JOptionPane.showMessageDialog(null, "By clicking OK, you have read the terms of usage");
    }//GEN-LAST:event_TNCMouseClicked
int xMouse, yMouse;
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TNC;
    private javax.swing.JPasswordField confirmPasscode;
    private javax.swing.JLabel exit;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField loginId;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField passcode;
    private javax.swing.JPanel passwordMatch;
    private javax.swing.JButton signInButton;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}