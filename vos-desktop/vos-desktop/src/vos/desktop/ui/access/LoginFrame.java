package vos.desktop.ui.access;

import com.formdev.flatlaf.FlatDarkLaf;
import com.mysql.cj.x.protobuf.MysqlxNotice.Warning.Level;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.lang.System.Logger;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;
import vos.desktop.database.DatabaseHandler;
import vos.desktop.main.MainFrame;

public class LoginFrame extends javax.swing.JFrame {
    
    // Class variables
    private static int userID = -1;
    DatabaseHandler handler = null;
    UIManager uim = new UIManager();

    // Constructor for LoginFrame
    public LoginFrame() {
        handler = DatabaseHandler.getInstance();
        initComponents();
        
        setTitle("Visual OETPN Simulator - Desktop Application (Log In)");
        WelcomeText.setFocusable(false);
        
        // Set the hyperlinks
        setHomepageHyperlink();
        setAboutOETPNHyperlink();
        setAboutVOSHyperlink();
        setGithubProfileHyperlink();
        setLinkedinProfileHyperlink();
        setEmailOption();
        
        // Set the placeholders and visibility of the stars
        setLFEmailFieldText();
        setLFPassFieldText();
        setStarsInvisible();
        
        // Setup the frame (center location & visibility)
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    // Set the stars invisible
    private void setStarsInvisible() {
        LFEmailStar.setVisible(false);
        LFPassStar.setVisible(false);
    }
    
    // Mark the empty fields
    private boolean markEmptyFields() {
        boolean isEmpty = false;
        if(LFEmailField.getText().isEmpty() || LFEmailField.getForeground() == Color.gray) {
            isEmpty = true;
            LFEmailStar.setVisible(true);
        }
        if(String.valueOf(LFPassField.getPassword()).isEmpty() || LFPassField.getForeground() == Color.gray) {
            isEmpty = true;
            LFPassStar.setVisible(true);
        }
        return isEmpty;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        LoginForm = new javax.swing.JPanel();
        LFText = new javax.swing.JPanel();
        LFMessage1 = new javax.swing.JLabel();
        LFMessage2 = new javax.swing.JLabel();
        LFUserData = new javax.swing.JPanel();
        LFEmailLabel = new javax.swing.JLabel();
        LFEmailField = new javax.swing.JTextField();
        LFPassLabel = new javax.swing.JLabel();
        LFPassField = new javax.swing.JPasswordField();
        LFEmailStar = new javax.swing.JLabel();
        LFPassStar = new javax.swing.JLabel();
        LFButtons = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        NoAccButton = new javax.swing.JButton();
        WVOS_Login = new javax.swing.JPanel();
        WVOS_Welcome = new javax.swing.JLabel();
        WVOS_DesktopApp = new javax.swing.JLabel();
        WVOS_Text = new javax.swing.JScrollPane();
        WelcomeText = new javax.swing.JTextArea();
        TextAboutOETPN = new javax.swing.JLabel();
        AboutOETPN = new javax.swing.JLabel();
        TextAboutVOS = new javax.swing.JLabel();
        AboutVOS = new javax.swing.JLabel();
        TextAboutCreator1 = new javax.swing.JLabel();
        TextAboutCreator2 = new javax.swing.JLabel();
        TextAboutCreator3 = new javax.swing.JLabel();
        GitHub = new javax.swing.JLabel();
        LinkedIn = new javax.swing.JLabel();
        TextEmail1 = new javax.swing.JLabel();
        TextEmail2 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        LoginForm.setBackground(new java.awt.Color(51, 51, 51));

        LFText.setBackground(new java.awt.Color(51, 51, 51));

        LFMessage1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        LFMessage1.setText("Log In");

        LFMessage2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LFMessage2.setText("to start using VOS Desktop Application");

        javax.swing.GroupLayout LFTextLayout = new javax.swing.GroupLayout(LFText);
        LFText.setLayout(LFTextLayout);
        LFTextLayout.setHorizontalGroup(
            LFTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFTextLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LFMessage2)
                .addGap(19, 19, 19))
            .addGroup(LFTextLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(LFMessage1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LFTextLayout.setVerticalGroup(
            LFTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFTextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LFMessage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LFMessage2)
                .addContainerGap())
        );

        LFUserData.setBackground(new java.awt.Color(51, 51, 51));

        LFEmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LFEmailLabel.setText("E-mail");

        LFEmailField.setBackground(java.awt.Color.darkGray);
        LFEmailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LFEmailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LFEmailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LFEmailFieldFocusLost(evt);
            }
        });

        LFPassLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LFPassLabel.setText("Password");

        LFPassField.setBackground(java.awt.Color.darkGray);
        LFPassField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LFPassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LFPassFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LFPassFieldFocusLost(evt);
            }
        });

        LFEmailStar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LFEmailStar.setText("*");

        LFPassStar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LFPassStar.setText("*");

        javax.swing.GroupLayout LFUserDataLayout = new javax.swing.GroupLayout(LFUserData);
        LFUserData.setLayout(LFUserDataLayout);
        LFUserDataLayout.setHorizontalGroup(
            LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFUserDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LFPassLabel)
                    .addComponent(LFEmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LFPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(LFEmailField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LFEmailStar)
                    .addComponent(LFPassStar))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        LFUserDataLayout.setVerticalGroup(
            LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFUserDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LFEmailLabel)
                    .addComponent(LFEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LFEmailStar))
                .addGap(18, 18, 18)
                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LFPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LFPassLabel)
                    .addComponent(LFPassStar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        LFButtons.setBackground(new java.awt.Color(51, 51, 51));

        LoginButton.setBackground(java.awt.Color.darkGray);
        LoginButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoginButton.setText("Log In");
        LoginButton.setBorderPainted(false);
        LoginButton.setRequestFocusEnabled(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        NoAccButton.setBackground(java.awt.Color.darkGray);
        NoAccButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NoAccButton.setText("Don't have an account? Sign up");
        NoAccButton.setBorderPainted(false);
        NoAccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoAccButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LFButtonsLayout = new javax.swing.GroupLayout(LFButtons);
        LFButtons.setLayout(LFButtonsLayout);
        LFButtonsLayout.setHorizontalGroup(
            LFButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LFButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LFButtonsLayout.createSequentialGroup()
                        .addComponent(LoginButton)
                        .addGap(73, 73, 73))
                    .addComponent(NoAccButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        LFButtonsLayout.setVerticalGroup(
            LFButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginButton)
                .addGap(18, 18, 18)
                .addComponent(NoAccButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout LoginFormLayout = new javax.swing.GroupLayout(LoginForm);
        LoginForm.setLayout(LoginFormLayout);
        LoginFormLayout.setHorizontalGroup(
            LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginFormLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(LFButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(LoginFormLayout.createSequentialGroup()
                .addGroup(LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginFormLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(LFText, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginFormLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(LFUserData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginFormLayout.setVerticalGroup(
            LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFormLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(LFText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(LFUserData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(LFButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        WVOS_Login.setBackground(new java.awt.Color(51, 51, 51));
        WVOS_Login.setForeground(new java.awt.Color(255, 255, 255));

        WVOS_Welcome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        WVOS_Welcome.setText("Visual OETPN Simulator (VOS)");

        WVOS_DesktopApp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WVOS_DesktopApp.setText("Desktop Application");

        WelcomeText.setEditable(false);
        WelcomeText.setBackground(java.awt.Color.darkGray);
        WelcomeText.setColumns(20);
        WelcomeText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WelcomeText.setRows(5);
        WelcomeText.setText("Visual OETPN Simulator (short: VOS) is an open-source tool that helps students learning in \ntechnical fields to understand, design and simulate Object-Enhanced Timed Petri Nets (OETPNs).\n\nVisual OETPN Simulator was developed by Automation and Applied Informatics student, Dragu \nAndreea, as a bachelor's thesis, including researches on Petri Nets (specifically OETPNs) and \nDesktop Development technologies and programming languages (Java, Swing, MySQL).\n\nAnd, the most important thing of all, Visual OETPN Simulator is completely free to use. The user \nmust create a new account to start using the tool, or if they already have an account, they must \nlog into their account.");
        WelcomeText.setCaretColor(new java.awt.Color(0, 0, 0));
        WelcomeText.setFocusable(false);
        WVOS_Text.setViewportView(WelcomeText);

        TextAboutOETPN.setText("To find out more about Petri Nets and OETPNs, please visit");

        AboutOETPN.setText("VOS Web - About OETPNs.");

        TextAboutVOS.setText("To find out more about Visual OETPN Simulator, please visit");

        AboutVOS.setText("VOS Web - About VOS.");

        TextAboutCreator1.setText("To find out more about the creator of this tool, please visit my");

        TextAboutCreator2.setText("or");

        TextAboutCreator3.setText("profiles.");

        GitHub.setText("GitHub");

        LinkedIn.setText("LinkedIn");

        TextEmail1.setText("Or,");

        TextEmail2.setText("me directly.");

        Email.setText("e-mail");

        javax.swing.GroupLayout WVOS_LoginLayout = new javax.swing.GroupLayout(WVOS_Login);
        WVOS_Login.setLayout(WVOS_LoginLayout);
        WVOS_LoginLayout.setHorizontalGroup(
            WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WVOS_LoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(WVOS_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WVOS_LoginLayout.createSequentialGroup()
                .addGap(12, 29, Short.MAX_VALUE)
                .addGroup(WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WVOS_LoginLayout.createSequentialGroup()
                        .addComponent(TextAboutOETPN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AboutOETPN))
                    .addGroup(WVOS_LoginLayout.createSequentialGroup()
                        .addComponent(TextAboutVOS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AboutVOS))
                    .addGroup(WVOS_LoginLayout.createSequentialGroup()
                        .addComponent(TextAboutCreator1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GitHub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextAboutCreator2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LinkedIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextAboutCreator3))
                    .addGroup(WVOS_LoginLayout.createSequentialGroup()
                        .addComponent(TextEmail1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextEmail2)))
                .addGap(140, 140, 140))
            .addGroup(WVOS_LoginLayout.createSequentialGroup()
                .addGroup(WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WVOS_LoginLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(WVOS_Welcome))
                    .addGroup(WVOS_LoginLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(WVOS_DesktopApp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WVOS_LoginLayout.setVerticalGroup(
            WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WVOS_LoginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(WVOS_Welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WVOS_DesktopApp)
                .addGap(18, 18, 18)
                .addComponent(WVOS_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextAboutOETPN)
                    .addComponent(AboutOETPN))
                .addGap(18, 18, 18)
                .addGroup(WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextAboutVOS)
                    .addComponent(AboutVOS))
                .addGap(18, 18, 18)
                .addGroup(WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextAboutCreator1)
                    .addComponent(GitHub)
                    .addComponent(TextAboutCreator2)
                    .addComponent(LinkedIn)
                    .addComponent(TextAboutCreator3))
                .addGap(18, 18, 18)
                .addGroup(WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextEmail1)
                    .addComponent(TextEmail2)
                    .addComponent(Email))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(WVOS_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(WVOS_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Event for E-mail field (focus gained)
    private void LFEmailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LFEmailFieldFocusGained
        if(LFEmailField.getForeground() == Color.gray) {
            LFEmailField.setText("");
            LFEmailField.setForeground(null);
        }
    }//GEN-LAST:event_LFEmailFieldFocusGained

    // Event for E-mail field (focus lost)
    private void LFEmailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LFEmailFieldFocusLost
        setLFEmailFieldText();
    }//GEN-LAST:event_LFEmailFieldFocusLost

    // Event for Pass field (focus gained)
    private void LFPassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LFPassFieldFocusGained
        if(LFPassField.getForeground() == Color.gray) {
            LFPassField.setText("");
            LFPassField.setEchoChar('*');
            LFPassField.setForeground(null);
        }
    }//GEN-LAST:event_LFPassFieldFocusGained

    // Event for Pass field (focus lost)
    private void LFPassFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LFPassFieldFocusLost
        setLFPassFieldText();
    }//GEN-LAST:event_LFPassFieldFocusLost

    // Event for Log In button (action performed - logs the user into the tool)
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        setStarsInvisible();
        if(markEmptyFields()) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Please enter all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if((userID = handler.checkCredentials(LFEmailField.getText(), String.valueOf(LFPassField.getPassword()))) > 0) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Log In Successful! \nWelcome to VOS!", "Success", JOptionPane.INFORMATION_MESSAGE);
            MainFrame main = new MainFrame();
            main.pack();
            main.setLocationRelativeTo(null);
            main.setVisible(true);
            this.dispose();
        }
        else {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Wrong username or password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    // Event for NoAcc button (action performed - opens the Sign Up form)
    private void NoAccButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoAccButtonActionPerformed
        SignupFrame signupFrame = new SignupFrame();
        signupFrame.pack();
        signupFrame.setLocationRelativeTo(null);
        signupFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NoAccButtonActionPerformed

    // Function to setup the JOptionPane
    private void setJOptionPane() {
        uim.put("OptionPane.background",new ColorUIResource(51,51,51));
        uim.put("Panel.background",new ColorUIResource(51,51,51));
        uim.put("OptionPane.messageForeground", Color.white);
        uim.put("Button.background", Color.darkGray);
        uim.put("Button.foreground", Color.white);
    }
    
    // Function to set the E-mail field's text (focus gained / lost)
    private void setLFEmailFieldText() {
        if(LFEmailField.getText().isEmpty()) {
            LFEmailField.setText("E-mail");
            LFEmailField.setForeground(Color.gray);
        }
    }
    
    // Function to set the Password field's text (focus gained / lost)
    private void setLFPassFieldText() {
        if(String.valueOf(LFPassField.getPassword()).isEmpty()) {
            LFPassField.setEchoChar('*');
            LFPassField.setText("Password");
            LFPassField.setForeground(Color.gray);
        }
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
                LoginFrame.setDefaultLookAndFeelDecorated(true);
                new LoginFrame();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutOETPN;
    private javax.swing.JLabel AboutVOS;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel GitHub;
    private javax.swing.JPanel LFButtons;
    private javax.swing.JTextField LFEmailField;
    private javax.swing.JLabel LFEmailLabel;
    private javax.swing.JLabel LFEmailStar;
    private javax.swing.JLabel LFMessage1;
    private javax.swing.JLabel LFMessage2;
    private javax.swing.JPasswordField LFPassField;
    private javax.swing.JLabel LFPassLabel;
    private javax.swing.JLabel LFPassStar;
    private javax.swing.JPanel LFText;
    private javax.swing.JPanel LFUserData;
    private javax.swing.JLabel LinkedIn;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginForm;
    private javax.swing.JButton NoAccButton;
    private javax.swing.JLabel TextAboutCreator1;
    private javax.swing.JLabel TextAboutCreator2;
    private javax.swing.JLabel TextAboutCreator3;
    private javax.swing.JLabel TextAboutOETPN;
    private javax.swing.JLabel TextAboutVOS;
    private javax.swing.JLabel TextEmail1;
    private javax.swing.JLabel TextEmail2;
    private javax.swing.JLabel WVOS_DesktopApp;
    private javax.swing.JPanel WVOS_Login;
    private javax.swing.JScrollPane WVOS_Text;
    private javax.swing.JLabel WVOS_Welcome;
    private javax.swing.JTextArea WelcomeText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
