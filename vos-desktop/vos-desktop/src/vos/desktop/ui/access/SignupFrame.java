package vos.desktop.ui.access;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.lang.System.Logger;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;
import vos.desktop.database.DatabaseHandler;
import vos.desktop.main.MainFrame;

public class SignupFrame extends javax.swing.JFrame {

    // Class variables
    DatabaseHandler handler = null;
    UIManager uim = new UIManager();
    
    // Constructor for SignupFrame
    public SignupFrame() {
        handler = DatabaseHandler.getInstance();
        initComponents();   
        
        setTitle("Visual OETPN Simulator - Desktop Application (Sign Up)");
        WelcomeText.setFocusable(false);
        
        // Set the hyperlinks
        setHomepageHyperlink();
        setAboutOETPNHyperlink();
        setAboutVOSHyperlink();
        setGithubProfileHyperlink();
        setLinkedinProfileHyperlink();
        setEmailOption();
        
        // Setup the frame (center location & visibility)
        setStarsInvisible();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    // Set the stars invisible
    private void setStarsInvisible() {
        SFFNameStar.setVisible(false);
        SFLNameStar.setVisible(false);
        SFEmailStar.setVisible(false);
        SFPassStar.setVisible(false);
        SFRepPassStar.setVisible(false);
    }
    
    // Mark the empty fields
    private boolean markEmptyFields() {
        boolean isEmpty = false;
        if(SFFNameField.getText().isEmpty()) {
            isEmpty = true;
            SFFNameStar.setVisible(true);
        }
        if(SFLNameField.getText().isEmpty()) {
            isEmpty = true;
            SFLNameStar.setVisible(true);
        }
        if(SFEmailField.getText().isEmpty()) {
            isEmpty = true;
            SFEmailStar.setVisible(true);
        }
        if(String.valueOf(SFPassField.getPassword()).isEmpty()) {
            isEmpty = true;
            SFPassStar.setVisible(true);
        }
        if(String.valueOf(SFRepPassField.getPassword()).isEmpty()) {
            isEmpty = true;
            SFRepPassStar.setVisible(true);
        }
        return isEmpty;
    }
    
    // Check if the passwords match
    private boolean matchingPasswords() {
        return (String.valueOf(SFRepPassField.getPassword()).equals(String.valueOf(SFPassField.getPassword())));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignupForm = new javax.swing.JPanel();
        SFText = new javax.swing.JPanel();
        SFMessage1 = new javax.swing.JLabel();
        SFMessage2 = new javax.swing.JLabel();
        SFUserData = new javax.swing.JPanel();
        SFFNameLabel = new javax.swing.JLabel();
        SFFNameField = new javax.swing.JTextField();
        SFLNameLabel = new javax.swing.JLabel();
        SFLNameField = new javax.swing.JTextField();
        SFEmailLabel = new javax.swing.JLabel();
        SFEmailField = new javax.swing.JTextField();
        SFPassLabel = new javax.swing.JLabel();
        SFPassField = new javax.swing.JPasswordField();
        SFRepPassLabel = new javax.swing.JLabel();
        SFRepPassField = new javax.swing.JPasswordField();
        SFFNameStar = new javax.swing.JLabel();
        SFLNameStar = new javax.swing.JLabel();
        SFEmailStar = new javax.swing.JLabel();
        SFPassStar = new javax.swing.JLabel();
        SFRepPassStar = new javax.swing.JLabel();
        LFButtons = new javax.swing.JPanel();
        SignupButton = new javax.swing.JButton();
        HaveAccButton = new javax.swing.JButton();
        WVOS_Signup = new javax.swing.JPanel();
        WVOS_Welcome = new javax.swing.JLabel();
        WVOS_DesktopApp = new javax.swing.JLabel();
        WVOS_Text = new javax.swing.JScrollPane();
        WelcomeText = new javax.swing.JTextArea();
        TextAboutOETPN = new javax.swing.JLabel();
        AboutOETPN = new javax.swing.JLabel();
        TextAboutVOS = new javax.swing.JLabel();
        AboutVOS = new javax.swing.JLabel();
        TextAboutCreator1 = new javax.swing.JLabel();
        GitHub = new javax.swing.JLabel();
        TextAboutCreator2 = new javax.swing.JLabel();
        LinkedIn = new javax.swing.JLabel();
        TextAboutCreator3 = new javax.swing.JLabel();
        TextEmail1 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        TextEmail2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        SignupForm.setBackground(new java.awt.Color(51, 51, 51));

        SFText.setBackground(new java.awt.Color(51, 51, 51));

        SFMessage1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        SFMessage1.setText("Sign Up");

        SFMessage2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SFMessage2.setText("to start using VOS Desktop Application");

        javax.swing.GroupLayout SFTextLayout = new javax.swing.GroupLayout(SFText);
        SFText.setLayout(SFTextLayout);
        SFTextLayout.setHorizontalGroup(
            SFTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SFTextLayout.createSequentialGroup()
                .addGroup(SFTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SFTextLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(SFMessage2))
                    .addGroup(SFTextLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(SFMessage1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SFTextLayout.setVerticalGroup(
            SFTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SFTextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SFMessage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SFMessage2)
                .addContainerGap())
        );

        SFUserData.setBackground(new java.awt.Color(51, 51, 51));

        SFFNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SFFNameLabel.setText("First Name");

        SFFNameField.setBackground(java.awt.Color.darkGray);
        SFFNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        SFLNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SFLNameLabel.setText("Last Name");

        SFLNameField.setBackground(java.awt.Color.darkGray);
        SFLNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        SFEmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SFEmailLabel.setText("E-mail");

        SFEmailField.setBackground(java.awt.Color.darkGray);
        SFEmailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        SFPassLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SFPassLabel.setText("Password");

        SFPassField.setBackground(java.awt.Color.darkGray);
        SFPassField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        SFRepPassLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SFRepPassLabel.setText("Confirm");

        SFRepPassField.setBackground(java.awt.Color.darkGray);
        SFRepPassField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        SFFNameStar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SFFNameStar.setText("*");

        SFLNameStar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SFLNameStar.setText("*");

        SFEmailStar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SFEmailStar.setText("*");

        SFPassStar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SFPassStar.setText("*");

        SFRepPassStar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SFRepPassStar.setText("*");

        javax.swing.GroupLayout SFUserDataLayout = new javax.swing.GroupLayout(SFUserData);
        SFUserData.setLayout(SFUserDataLayout);
        SFUserDataLayout.setHorizontalGroup(
            SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SFUserDataLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SFFNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SFLNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SFEmailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SFPassLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SFRepPassLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SFFNameField)
                    .addComponent(SFLNameField)
                    .addComponent(SFEmailField)
                    .addComponent(SFPassField)
                    .addComponent(SFRepPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SFLNameStar)
                    .addComponent(SFFNameStar)
                    .addComponent(SFEmailStar)
                    .addComponent(SFPassStar)
                    .addComponent(SFRepPassStar))
                .addGap(42, 42, 42))
        );
        SFUserDataLayout.setVerticalGroup(
            SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SFUserDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFFNameLabel)
                    .addComponent(SFFNameStar)
                    .addComponent(SFFNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFLNameStar)
                    .addComponent(SFLNameLabel)
                    .addComponent(SFLNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFEmailLabel)
                    .addComponent(SFEmailStar)
                    .addComponent(SFEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFPassStar)
                    .addComponent(SFPassLabel)
                    .addComponent(SFPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFRepPassStar)
                    .addComponent(SFRepPassLabel)
                    .addComponent(SFRepPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        LFButtons.setBackground(new java.awt.Color(51, 51, 51));

        SignupButton.setBackground(java.awt.Color.darkGray);
        SignupButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SignupButton.setText("Sign Up");
        SignupButton.setBorderPainted(false);
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });

        HaveAccButton.setBackground(java.awt.Color.darkGray);
        HaveAccButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HaveAccButton.setText("Already have an account? Log In");
        HaveAccButton.setBorderPainted(false);
        HaveAccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HaveAccButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LFButtonsLayout = new javax.swing.GroupLayout(LFButtons);
        LFButtons.setLayout(LFButtonsLayout);
        LFButtonsLayout.setHorizontalGroup(
            LFButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFButtonsLayout.createSequentialGroup()
                .addGroup(LFButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LFButtonsLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(HaveAccButton))
                    .addGroup(LFButtonsLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(SignupButton)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        LFButtonsLayout.setVerticalGroup(
            LFButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignupButton)
                .addGap(18, 18, 18)
                .addComponent(HaveAccButton)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SignupFormLayout = new javax.swing.GroupLayout(SignupForm);
        SignupForm.setLayout(SignupFormLayout);
        SignupFormLayout.setHorizontalGroup(
            SignupFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignupFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SFText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignupFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LFButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(SignupFormLayout.createSequentialGroup()
                .addComponent(SFUserData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        SignupFormLayout.setVerticalGroup(
            SignupFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignupFormLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(SFText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(SFUserData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LFButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        WVOS_Signup.setBackground(new java.awt.Color(51, 51, 51));

        WVOS_Welcome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        WVOS_Welcome.setText("Visual OETPN Simulator (VOS)");

        WVOS_DesktopApp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WVOS_DesktopApp.setText("Desktop Application");

        WelcomeText.setEditable(false);
        WelcomeText.setBackground(java.awt.Color.darkGray);
        WelcomeText.setColumns(20);
        WelcomeText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WelcomeText.setRows(5);
        WelcomeText.setText("Visual OETPN Simulator (short: VOS) is an open-source tool that helps students learning in \ntechnical fields to understand, design and simulate Object-Enhanced Timed Petri Nets \n(OETPNs).\n\nVisual OETPN Simulator was developed by Automation and Applied Informatics student, \nDragu Andreea, as a bachelor's thesis, including researches on Petri Nets (specifically \nOETPNs) and Desktop Development technologies and programming languages (Java, \nSwing, MySQL).\n\nAnd, the most important thing of all, Visual OETPN Simulator is completely free to use. The \nuser must create a new account to start using the tool, or if they already have an account, \nthey must log into their account.");
        WelcomeText.setCaretColor(new java.awt.Color(0, 0, 0));
        WelcomeText.setFocusable(false);
        WVOS_Text.setViewportView(WelcomeText);

        TextAboutOETPN.setText("To find out more about Petri Nets and OETPNs, please visit");

        AboutOETPN.setText("VOS Web - About OETPNs.");

        TextAboutVOS.setText("To find out more about Visual OETPN Simulator, please visit");

        AboutVOS.setText("VOS Web - About VOS.");

        TextAboutCreator1.setText("To find out more about the creator of this tool, please visit my");

        GitHub.setText("GitHub");

        TextAboutCreator2.setText("or");

        LinkedIn.setText("LinkedIn");

        TextAboutCreator3.setText("profiles.");

        TextEmail1.setText("Or,");

        Email.setText("e-mail");

        TextEmail2.setText("me directly.");

        javax.swing.GroupLayout WVOS_SignupLayout = new javax.swing.GroupLayout(WVOS_Signup);
        WVOS_Signup.setLayout(WVOS_SignupLayout);
        WVOS_SignupLayout.setHorizontalGroup(
            WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WVOS_SignupLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(WVOS_Welcome)
                .addGap(68, 68, 68))
            .addGroup(WVOS_SignupLayout.createSequentialGroup()
                .addGroup(WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WVOS_SignupLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(WVOS_DesktopApp))
                    .addGroup(WVOS_SignupLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                .addComponent(TextAboutOETPN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AboutOETPN))
                            .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                .addComponent(TextAboutVOS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AboutVOS))
                            .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                .addComponent(TextAboutCreator1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GitHub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextAboutCreator2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LinkedIn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextAboutCreator3))
                            .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                .addComponent(TextEmail1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextEmail2))
                            .addComponent(WVOS_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        WVOS_SignupLayout.setVerticalGroup(
            WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WVOS_SignupLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(WVOS_Welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WVOS_DesktopApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WVOS_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextAboutOETPN)
                    .addComponent(AboutOETPN))
                .addGap(18, 18, 18)
                .addGroup(WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextAboutVOS)
                    .addComponent(AboutVOS))
                .addGap(18, 18, 18)
                .addGroup(WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextAboutCreator1)
                    .addComponent(GitHub)
                    .addComponent(TextAboutCreator2)
                    .addComponent(LinkedIn)
                    .addComponent(TextAboutCreator3))
                .addGap(18, 18, 18)
                .addGroup(WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextEmail1)
                    .addComponent(TextEmail2)
                    .addComponent(Email))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SignupForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WVOS_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignupForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(WVOS_Signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Event for Sign Up button (action performed - signs the user up in the tool)
    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupButtonActionPerformed
        setStarsInvisible();
        if(markEmptyFields()) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Please enter all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!matchingPasswords()) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Passwords should match!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(handler.insertUser(SFFNameField.getText(), 
                              SFLNameField.getText(), 
                              SFEmailField.getText(), 
                              String.valueOf(SFPassField.getPassword()))) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Sign Up Successful! \nPlease log in to start using VOS!", "Success", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
            new LoginFrame().setLocationRelativeTo(null);
        }
        else {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "This e-mail is already registered!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SignupButtonActionPerformed

    // Event for HaveAcc button (action performed - opens the Log In form)
    private void HaveAccButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HaveAccButtonActionPerformed
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HaveAccButtonActionPerformed

    // Function to setup the JOptionPane
    private void setJOptionPane() {
        uim.put("OptionPane.background",new ColorUIResource(51,51,51));
        uim.put("Panel.background",new ColorUIResource(51,51,51));
        uim.put("OptionPane.messageForeground", Color.white);
        uim.put("Button.background", Color.darkGray);
        uim.put("Button.foreground", Color.white);
    }
    
    // Set homepage hyperlink
    private void setHomepageHyperlink() {
        WVOS_Welcome.setForeground(Color.orange.darker());
        WVOS_Welcome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        WVOS_Welcome.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/index.html"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Set About OETPN hyperlink
    private void setAboutOETPNHyperlink() {
        AboutOETPN.setForeground(Color.orange.darker());
        AboutOETPN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        AboutOETPN.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-oetpns.html"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                } 
            }
        });
    }
    
    // Set About VOS hyperlink
    private void setAboutVOSHyperlink() {
        AboutVOS.setForeground(Color.orange.darker());
        AboutVOS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        AboutVOS.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-vos.html"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Set Github profile hyperlink
    private void setGithubProfileHyperlink() {
        GitHub.setForeground(Color.orange.darker());
        GitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        GitHub.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://github.com/draguleee"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Set Linkedin profile hyperlink
    private void setLinkedinProfileHyperlink() {
        LinkedIn.setForeground(Color.orange.darker());
        LinkedIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        LinkedIn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Set E-mail option
    private void setEmailOption() {
        Email.setForeground(Color.orange.darker());
        Email.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Email.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
               try {
                   String message = "mailto:aandreid14@gmail.com";
                   URI uri = URI.create(message);
                   Desktop.getDesktop().mail(uri);
               }
               catch(IOException ex) {
                   ex.printStackTrace();
               }
           } 
        });
    }
    
    // Main method
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                }
                catch (UnsupportedLookAndFeelException ex) {
                    System.out.println(" ");
                }
                SignupFrame.setDefaultLookAndFeelDecorated(true);
                new SignupFrame();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutOETPN;
    private javax.swing.JLabel AboutVOS;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel GitHub;
    private javax.swing.JButton HaveAccButton;
    private javax.swing.JPanel LFButtons;
    private javax.swing.JLabel LinkedIn;
    private javax.swing.JTextField SFEmailField;
    private javax.swing.JLabel SFEmailLabel;
    private javax.swing.JLabel SFEmailStar;
    private javax.swing.JTextField SFFNameField;
    private javax.swing.JLabel SFFNameLabel;
    private javax.swing.JLabel SFFNameStar;
    private javax.swing.JTextField SFLNameField;
    private javax.swing.JLabel SFLNameLabel;
    private javax.swing.JLabel SFLNameStar;
    private javax.swing.JLabel SFMessage1;
    private javax.swing.JLabel SFMessage2;
    private javax.swing.JPasswordField SFPassField;
    private javax.swing.JLabel SFPassLabel;
    private javax.swing.JLabel SFPassStar;
    private javax.swing.JPasswordField SFRepPassField;
    private javax.swing.JLabel SFRepPassLabel;
    private javax.swing.JLabel SFRepPassStar;
    private javax.swing.JPanel SFText;
    private javax.swing.JPanel SFUserData;
    private javax.swing.JButton SignupButton;
    private javax.swing.JPanel SignupForm;
    private javax.swing.JLabel TextAboutCreator1;
    private javax.swing.JLabel TextAboutCreator2;
    private javax.swing.JLabel TextAboutCreator3;
    private javax.swing.JLabel TextAboutOETPN;
    private javax.swing.JLabel TextAboutVOS;
    private javax.swing.JLabel TextEmail1;
    private javax.swing.JLabel TextEmail2;
    private javax.swing.JLabel WVOS_DesktopApp;
    private javax.swing.JPanel WVOS_Signup;
    private javax.swing.JScrollPane WVOS_Text;
    private javax.swing.JLabel WVOS_Welcome;
    private javax.swing.JTextArea WelcomeText;
    // End of variables declaration//GEN-END:variables
}
