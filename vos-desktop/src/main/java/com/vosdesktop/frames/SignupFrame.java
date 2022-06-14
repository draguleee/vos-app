package com.vosdesktop.frames;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import java.net.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import com.vosdesktop.handlers.*;

public class SignupFrame extends javax.swing.JFrame {

    // Class variables
    DatabaseHandler handler = null;
    UIManager uim = new UIManager();

    // Variables declaration - do not modify
    private javax.swing.JLabel AboutOETPN;
    private javax.swing.JLabel AboutPNs;
    private javax.swing.JLabel AboutSystems;
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
    private javax.swing.JLabel TextAboutOETPN1;
    private javax.swing.JLabel TextAboutOETPN2;
    private javax.swing.JLabel TextAboutVOS;
    private javax.swing.JLabel TextEmail1;
    private javax.swing.JLabel TextEmail2;
    private javax.swing.JLabel WVOS_DesktopApp;
    private javax.swing.JPanel WVOS_Links;
    private javax.swing.JPanel WVOS_Signup;
    private javax.swing.JScrollPane WVOS_Text;
    private javax.swing.JPanel WVOS_Title;
    private javax.swing.JLabel WVOS_Welcome;
    private javax.swing.JTextArea WelcomeText;
    // End of variables declaration

    /**
     * SignupFrameFrame() <br>
     * Default constructor for SignupFrame class.
     * Calls all the methods defined in this class.
     */
    public SignupFrame() {

        handler = DatabaseHandler.getInstance();                                // Get / create the instance
        initComponents();                                                       // Initialize the components
        setTitle("Visual OETPN Simulator - Desktop Application (Sign Up)");     // Set frame title
        WelcomeText.setFocusable(false);

        // Set the hyperlinks
        setHomepageHyperlink();
        setAboutSystemsHyperlink();
        setAboutPNsHyperlink();
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

    /**
     * setStarsInvisible() <br>
     * Sets the markers for the e-mail and password field to invisible.
     * If one or both fields remain empty, the markers will be visible.
     * If one or both fields are filled in, the markers will not appear.
     *
     * @param
     * @return none
     */
    private void setStarsInvisible() {
        SFFNameStar.setVisible(false);
        SFLNameStar.setVisible(false);
        SFEmailStar.setVisible(false);
        SFPassStar.setVisible(false);
        SFRepPassStar.setVisible(false);
    }

    /**
     * markEmptyFields() <br>
     * Marks the empty fields after pressing the Log In button.
     * If there is one or both fields empty, they will be marked accordingly.
     * If there are both fields filled in, nothing happens.
     *
     * @param
     * @return the state of the fields (empty or filled in)
     */
    private boolean markEmptyFields() {
        boolean isEmpty = false;
        if(SFFNameField.getText().isEmpty() || SFFNameField.getForeground() == Color.gray) {
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

    /**
     * matchingPasswords() <br>
     * Checks if the inputed text in both "Password" and "Confirm Password" match.
     *
     * @param
     * @return the state of truth after comparing the two strings
     */
    private boolean matchingPasswords() {
        return (String.valueOf(SFRepPassField.getPassword()).equals(String.valueOf(SFPassField.getPassword())));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
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
        WVOS_Title = new javax.swing.JPanel();
        WVOS_Welcome = new javax.swing.JLabel();
        WVOS_DesktopApp = new javax.swing.JLabel();
        WVOS_Text = new javax.swing.JScrollPane();
        WelcomeText = new javax.swing.JTextArea();
        WVOS_Links = new javax.swing.JPanel();
        Email = new javax.swing.JLabel();
        TextEmail2 = new javax.swing.JLabel();
        AboutPNs = new javax.swing.JLabel();
        TextEmail1 = new javax.swing.JLabel();
        TextAboutCreator2 = new javax.swing.JLabel();
        TextAboutOETPN1 = new javax.swing.JLabel();
        GitHub = new javax.swing.JLabel();
        TextAboutOETPN2 = new javax.swing.JLabel();
        AboutVOS = new javax.swing.JLabel();
        TextAboutCreator3 = new javax.swing.JLabel();
        AboutOETPN = new javax.swing.JLabel();
        TextAboutVOS = new javax.swing.JLabel();
        AboutSystems = new javax.swing.JLabel();
        LinkedIn = new javax.swing.JLabel();
        TextAboutCreator1 = new javax.swing.JLabel();

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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(SFLNameStar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SFFNameStar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SFPassStar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SFRepPassStar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SFEmailStar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addContainerGap(51, Short.MAX_VALUE))
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
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LFButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                        .addGroup(SignupFormLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(SFUserData, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(39, Short.MAX_VALUE))
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

        WVOS_Title.setBackground(new java.awt.Color(51, 51, 51));

        WVOS_Welcome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        WVOS_Welcome.setText("Visual OETPN Simulator (VOS)");

        WVOS_DesktopApp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WVOS_DesktopApp.setText("Desktop Application");

        javax.swing.GroupLayout WVOS_TitleLayout = new javax.swing.GroupLayout(WVOS_Title);
        WVOS_Title.setLayout(WVOS_TitleLayout);
        WVOS_TitleLayout.setHorizontalGroup(
                WVOS_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_TitleLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(WVOS_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(WVOS_TitleLayout.createSequentialGroup()
                                                .addComponent(WVOS_Welcome)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WVOS_TitleLayout.createSequentialGroup()
                                                .addComponent(WVOS_DesktopApp)
                                                .addGap(159, 159, 159))))
        );
        WVOS_TitleLayout.setVerticalGroup(
                WVOS_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_TitleLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(WVOS_Welcome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WVOS_DesktopApp)
                                .addContainerGap())
        );

        WelcomeText.setEditable(false);
        WelcomeText.setBackground(java.awt.Color.darkGray);
        WelcomeText.setColumns(20);
        WelcomeText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WelcomeText.setRows(5);
        WelcomeText.setText("Visual OETPN Simulator (short: VOS) is an open-source tool that helps students learning in \ntechnical fields to understand, design and simulate Object-Enhanced Timed Petri Nets \n(OETPNs).\n\nVisual OETPN Simulator was developed by Automation and Applied Informatics student, \nDragu Andreea, as a bachelor's thesis, including researches on Petri Nets (specifically \nOETPNs) and Desktop Development technologies and programming languages (Java, \nSwing, MySQL).\n\nAnd, the most important thing of all, Visual OETPN Simulator is completely free to use. The \nuser must create a new account to start using the tool, or if they already have an account, \nthey must log into their account.");
        WelcomeText.setCaretColor(new java.awt.Color(0, 0, 0));
        WelcomeText.setFocusable(false);
        WVOS_Text.setViewportView(WelcomeText);

        WVOS_Links.setBackground(new java.awt.Color(51, 51, 51));

        Email.setText("e-mail");

        TextEmail2.setText("me directly.");

        AboutPNs.setText("About PNs,");

        TextEmail1.setText("Or,");

        TextAboutCreator2.setText("or");

        TextAboutOETPN1.setText("To find out more about systems, Petri Nets and OETPNs, please visit");

        GitHub.setText("GitHub");

        TextAboutOETPN2.setText("and");

        AboutVOS.setText("VOS Web - About VOS.");

        TextAboutCreator3.setText("profiles.");

        AboutOETPN.setText("About OETPNs.");

        TextAboutVOS.setText("To find out more about Visual OETPN Simulator, please visit");

        AboutSystems.setText("About Systems, ");

        LinkedIn.setText("LinkedIn");

        TextAboutCreator1.setText("To find out more about the creator of this tool, please visit my");

        javax.swing.GroupLayout WVOS_LinksLayout = new javax.swing.GroupLayout(WVOS_Links);
        WVOS_Links.setLayout(WVOS_LinksLayout);
        WVOS_LinksLayout.setHorizontalGroup(
                WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                                .addComponent(TextAboutVOS)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutVOS))
                                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                                .addComponent(TextAboutCreator1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(GitHub)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TextAboutCreator2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LinkedIn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TextAboutCreator3))
                                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                                .addComponent(TextEmail1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Email)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TextEmail2))
                                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                                .addComponent(TextAboutOETPN1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutSystems)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutPNs)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TextAboutOETPN2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutOETPN)))
                                .addContainerGap())
        );
        WVOS_LinksLayout.setVerticalGroup(
                WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextAboutOETPN1)
                                        .addComponent(AboutOETPN)
                                        .addComponent(AboutSystems)
                                        .addComponent(AboutPNs)
                                        .addComponent(TextAboutOETPN2))
                                .addGap(18, 18, 18)
                                .addGroup(WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextAboutVOS)
                                        .addComponent(AboutVOS))
                                .addGap(18, 18, 18)
                                .addGroup(WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextAboutCreator1)
                                        .addComponent(GitHub)
                                        .addComponent(TextAboutCreator2)
                                        .addComponent(LinkedIn)
                                        .addComponent(TextAboutCreator3))
                                .addGap(18, 18, 18)
                                .addGroup(WVOS_LinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextEmail1)
                                        .addComponent(TextEmail2)
                                        .addComponent(Email))
                                .addContainerGap())
        );

        javax.swing.GroupLayout WVOS_SignupLayout = new javax.swing.GroupLayout(WVOS_Signup);
        WVOS_Signup.setLayout(WVOS_SignupLayout);
        WVOS_SignupLayout.setHorizontalGroup(
                WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                .addGroup(WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(WVOS_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                                .addGap(97, 97, 97)
                                                .addComponent(WVOS_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(WVOS_Links, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        WVOS_SignupLayout.setVerticalGroup(
                WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(WVOS_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(WVOS_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(WVOS_Links, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }// </editor-fold>

    /**
     * SignupButtonActionPerformed(java.awt.event.ActionEvent evt) <br>
     * The action responsible for signing the user up for the application. <br>
     * If the Sign Up button is pressed and there are one or more fields
     * empty, a dialog with "Please enter all fields!" message will
     * appear. <br>
     * If the inputed passwords don't match, a dialog with "Passwords should
     * match" message will appear. <br>
     * If all the data was inputed correctly, the user will be signed up for the
     * application.
     *
     * @param evt the ActionEvent
     * @return none
     */
    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
    }

    /**
     * HaveAccButtonActionPerformed(java.awt.event.ActionEvent evt) <br>
     * The action responsible for redirecting the user to Log In form.
     * If the "Already have an account? Log In" button is pressed, the
     * user will be redirected to the Log In form.
     *
     * @param evt the ActionEvent
     * @return none
     */
    private void HaveAccButtonActionPerformed(java.awt.event.ActionEvent evt) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }

    /**
     * setJOptionPane() <br>
     * Sets the layout for the message dialogs.
     *
     * @param
     * @return none
     */
    private void setJOptionPane() {
        uim.put("OptionPane.background",new ColorUIResource(51,51,51));
        uim.put("Panel.background",new ColorUIResource(51,51,51));
        uim.put("OptionPane.messageForeground", Color.white);
        uim.put("Button.background", Color.darkGray);
        uim.put("Button.foreground", Color.white);
    }

    /**
     * setHomepageHyperlink() <br>
     * Links the VOS Web's homepage to a JLabel (WVOS_Welcome). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange WVOS_Welcome JLabel, they will be
     * redirected to "https://visual-oetpn-simulator.netlify.app/index.html".
     *
     * @param
     * @return none
     */
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

    /**
     * setAboutSystemsHyperlink() <br>
     * Links the VOS About Systems page to a JLabel (AboutSystems). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange AboutSystems JLabel, they will be
     * redirected to "https://visual-oetpn-simulator.netlify.app/pages/about-systems.html".
     *
     * @param
     * @return none
     */
    private void setAboutSystemsHyperlink() {
        AboutSystems.setForeground(Color.orange.darker());
        AboutSystems.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        AboutSystems.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-systems.html"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * setAboutPNsHyperlink() <br>
     * Links the VOS About Petri Nets page to a JLabel (AboutPNs). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange AboutPNs JLabel, they will be
     * redirected to "https://visual-oetpn-simulator.netlify.app/pages/about-petrinets.html".
     *
     * @param
     * @return none
     */
    private void setAboutPNsHyperlink() {
        AboutPNs.setForeground(Color.orange.darker());
        AboutPNs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        AboutPNs.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-petrinets.html"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * setAboutOETPNHyperlink() <br>
     * Links the VOS Web's homepage to a JLabel (WVOS_Welcome). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange WVOS_Welcome JLabel, they will be
     * redirected to "https://visual-oetpn-simulator.netlify.app/index.html".
     *
     * @param
     * @return none
     */
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

    /**
     * setAboutVOSHyperlink() <br>
     * Links the VOS About VOS page to a JLabel (AboutVOS). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange AboutVOS JLabel, they will be
     * redirected to "https://visual-oetpn-simulator.netlify.app/pages/about-vos.html".
     *
     * @param
     * @return none
     */
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

    /**
     * setGithubProfileHyperlink() <br>
     * Links the creator's GitHub profile to a JLabel (GitHub). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange GitHub JLabel, they will be
     * redirected to "https://github.com/draguleee".
     *
     * @param
     * @return none
     */
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

    /**
     * setLinkedinProfileHyperlink() <br>
     * Links the creator's LinkedIn profile to a JLabel (LinkedIn). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange LinkedIn JLabel, they will be
     * redirected to "https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/".
     *
     * @param
     * @return none
     */
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

    /**
     * setEmailOption() <br>
     * Links the electronic mail to a JLabel (Email). <br>
     * The receiver will be the creator of this application. The puropose
     * of this functionality is to get in touch with the creator if an user
     * wants to bring modifications to this application.
     *
     * @param
     * @return none
     */
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
}
