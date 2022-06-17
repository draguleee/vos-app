package vosdesktop.frames;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

import vosdesktop.handlers.DatabaseHandler;


public class Login extends javax.swing.JFrame {

    private final DatabaseHandler handler;
    private int userID = -1;

    public Login() {
        initComponents();

        handler = DatabaseHandler.getInstance();

        setTitle("Visual OETPN Simulator - Desktop Application (Log In)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setHomepageHyperlink();
        setAboutSystemsHyperlink();
        setAboutPnHyperlink();
        setAboutOetpnHyperlink();
        setAboutVosHyperlink();
        setGithubProfileHyperlink();
        setLinkedinProfileHyperlink();
        setLoginHyperlink();
        setSignupHyperlink();
        setEmailOption();

        setUsernameFieldText();
        setPasswordFieldText();
        setStarsInvisible();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void setStarsInvisible() {
        usernameStar.setVisible(false);
        passwordStar.setVisible(false);
    }

    private boolean markEmptyFields() {
        boolean isEmpty = false;
        if(usernameField.getText().isEmpty() || usernameField.getForeground() == Color.gray) {
            isEmpty = true;
            usernameStar.setVisible(true);
        }
        if(String.valueOf(passwordField.getPassword()).isEmpty() || passwordField.getForeground() == Color.gray) {
            isEmpty = true;
            passwordStar.setVisible(true);
        }
        return isEmpty;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        vosWelcome = new javax.swing.JPanel();
        vosMessage = new javax.swing.JPanel();
        vos = new javax.swing.JLabel();
        vosDesktopApp = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        vosText = new javax.swing.JTextArea();
        vosLinks = new javax.swing.JPanel();
        aboutSystems = new javax.swing.JLabel();
        aboutSystemsLink = new javax.swing.JLabel();
        aboutPn = new javax.swing.JLabel();
        aboutPnLink = new javax.swing.JLabel();
        aboutOetpn = new javax.swing.JLabel();
        aboutOetpnLink = new javax.swing.JLabel();
        aboutVos = new javax.swing.JLabel();
        aboutVosLink = new javax.swing.JLabel();
        aboutDev1 = new javax.swing.JLabel();
        aboutDev2 = new javax.swing.JLabel();
        githubLink = new javax.swing.JLabel();
        linkedinLink = new javax.swing.JLabel();
        emailLink = new javax.swing.JLabel();
        vosLogin = new javax.swing.JPanel();
        vosLoginPrompt = new javax.swing.JPanel();
        loginLink = new javax.swing.JLabel();
        vosUse = new javax.swing.JLabel();
        vosLoginForm = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        usernameStar = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordStar = new javax.swing.JLabel();
        vosLoginButtons = new javax.swing.JPanel();
        noAccButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        vosWelcome.setBackground(new java.awt.Color(51, 51, 51));

        vosMessage.setBackground(new java.awt.Color(51, 51, 51));

        vos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        vos.setForeground(new java.awt.Color(204, 153, 0));
        vos.setText("Visual OETPN Simulator (VOS)");

        vosDesktopApp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vosDesktopApp.setText("Desktop Application");

        javax.swing.GroupLayout vosMessageLayout = new javax.swing.GroupLayout(vosMessage);
        vosMessage.setLayout(vosMessageLayout);
        vosMessageLayout.setHorizontalGroup(
                vosMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosMessageLayout.createSequentialGroup()
                                .addGroup(vosMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(vosMessageLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(vos))
                                        .addGroup(vosMessageLayout.createSequentialGroup()
                                                .addGap(161, 161, 161)
                                                .addComponent(vosDesktopApp)))
                                .addContainerGap())
        );
        vosMessageLayout.setVerticalGroup(
                vosMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosMessageLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(vos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vosDesktopApp)
                                .addContainerGap())
        );

        vosText.setBackground(new java.awt.Color(55, 55, 55));
        vosText.setColumns(20);
        vosText.setRows(5);
        vosText.setText("Thank you very much for choosing Visual OETPN Simulator (VOS)!\n\nVisual OETPN Simulator (short: VOS) is a tool that helps its users to specify, implement, design and simulate Object-\nEnhanced Timed Petri Nets (OETPNs). \n\nVisual OETPN Simulator was developed using the Java programming language, the NetBeans IDE and Swing & AWT \ntechnologies for designing the UI. \n\nVisual OETPN Simulator is completely free to use. The user must create an account in the webpage linked below, then\nuse the credentials to log in and get the application. After getting the application, the user must log into it to get \nacces to the main editor frame.\n\nEnjoy using Visual OETPN Simulator!\n");
        vosText.setFocusable(false);
        scrollPane.setViewportView(vosText);

        vosLinks.setBackground(new java.awt.Color(51, 51, 51));

        aboutSystems.setText("To find out more about systems, please visit ");

        aboutSystemsLink.setForeground(new java.awt.Color(204, 153, 0));
        aboutSystemsLink.setText("VOS - About Systems.");

        aboutPn.setText("To find out more about Petri nets, please visit");

        aboutPnLink.setForeground(new java.awt.Color(204, 153, 0));
        aboutPnLink.setText("VOS - About Petri Nets.");

        aboutOetpn.setText("To find out more about OETPNs, please visit");

        aboutOetpnLink.setForeground(new java.awt.Color(204, 153, 0));
        aboutOetpnLink.setText("VOS - About OETPNs.");

        aboutVos.setText("To find out more about Visual OETPN Simulator, please visit");

        aboutVosLink.setForeground(new java.awt.Color(204, 153, 0));
        aboutVosLink.setText("VOS - About VOS.");

        aboutDev1.setText("To find out more about the developer of VOS, please visit");

        aboutDev2.setText("or get in touch via");

        githubLink.setForeground(new java.awt.Color(204, 153, 0));
        githubLink.setText("GitHub,");

        linkedinLink.setForeground(new java.awt.Color(204, 153, 0));
        linkedinLink.setText("LinkedIn");

        emailLink.setForeground(new java.awt.Color(204, 153, 0));
        emailLink.setText("E-mail.");

        javax.swing.GroupLayout vosLinksLayout = new javax.swing.GroupLayout(vosLinks);
        vosLinks.setLayout(vosLinksLayout);
        vosLinksLayout.setHorizontalGroup(
                vosLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosLinksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(vosLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(vosLinksLayout.createSequentialGroup()
                                                .addComponent(aboutPn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(aboutPnLink))
                                        .addGroup(vosLinksLayout.createSequentialGroup()
                                                .addComponent(aboutSystems)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(aboutSystemsLink))
                                        .addGroup(vosLinksLayout.createSequentialGroup()
                                                .addComponent(aboutOetpn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(aboutOetpnLink))
                                        .addGroup(vosLinksLayout.createSequentialGroup()
                                                .addComponent(aboutVos)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(aboutVosLink))
                                        .addGroup(vosLinksLayout.createSequentialGroup()
                                                .addComponent(aboutDev1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(githubLink)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(linkedinLink)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(aboutDev2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(emailLink)))
                                .addContainerGap())
        );
        vosLinksLayout.setVerticalGroup(
                vosLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosLinksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(vosLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(aboutSystems)
                                        .addComponent(aboutSystemsLink))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(vosLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(aboutPn)
                                        .addComponent(aboutPnLink))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(vosLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(aboutOetpn)
                                        .addComponent(aboutOetpnLink))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(vosLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(aboutVos)
                                        .addComponent(aboutVosLink))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(vosLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(aboutDev1)
                                        .addComponent(githubLink)
                                        .addComponent(linkedinLink)
                                        .addComponent(aboutDev2)
                                        .addComponent(emailLink))
                                .addContainerGap())
        );

        javax.swing.GroupLayout vosWelcomeLayout = new javax.swing.GroupLayout(vosWelcome);
        vosWelcome.setLayout(vosWelcomeLayout);
        vosWelcomeLayout.setHorizontalGroup(
                vosWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vosWelcomeLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vosMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109))
                        .addGroup(vosWelcomeLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(vosWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vosLinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        vosWelcomeLayout.setVerticalGroup(
                vosWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosWelcomeLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(vosMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vosLinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        vosLogin.setBackground(new java.awt.Color(51, 51, 51));

        vosLoginPrompt.setBackground(new java.awt.Color(51, 51, 51));

        loginLink.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        loginLink.setForeground(new java.awt.Color(204, 153, 0));
        loginLink.setText("Log In");

        vosUse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vosUse.setText("to start using Visual OETPN Simulator (VOS)");

        javax.swing.GroupLayout vosLoginPromptLayout = new javax.swing.GroupLayout(vosLoginPrompt);
        vosLoginPrompt.setLayout(vosLoginPromptLayout);
        vosLoginPromptLayout.setHorizontalGroup(
                vosLoginPromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosLoginPromptLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(vosLoginPromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vosUse)
                                        .addGroup(vosLoginPromptLayout.createSequentialGroup()
                                                .addGap(122, 122, 122)
                                                .addComponent(loginLink)))
                                .addContainerGap())
        );
        vosLoginPromptLayout.setVerticalGroup(
                vosLoginPromptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosLoginPromptLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginLink)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vosUse)
                                .addContainerGap())
        );

        vosLoginForm.setBackground(new java.awt.Color(51, 51, 51));

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameLabel.setText("Username");

        usernameField.setBackground(new java.awt.Color(60, 60, 60));
        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });

        usernameStar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameStar.setForeground(new java.awt.Color(204, 153, 0));
        usernameStar.setText("*");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordLabel.setText("Password");

        passwordField.setBackground(new java.awt.Color(60, 60, 60));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });

        passwordStar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordStar.setForeground(new java.awt.Color(204, 153, 0));
        passwordStar.setText("*");

        javax.swing.GroupLayout vosLoginFormLayout = new javax.swing.GroupLayout(vosLoginForm);
        vosLoginForm.setLayout(vosLoginFormLayout);
        vosLoginFormLayout.setHorizontalGroup(
                vosLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosLoginFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(vosLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(passwordLabel)
                                        .addComponent(usernameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(vosLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(usernameField)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(vosLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameStar)
                                        .addComponent(passwordStar))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        vosLoginFormLayout.setVerticalGroup(
                vosLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosLoginFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(vosLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameLabel)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameStar))
                                .addGap(18, 18, 18)
                                .addGroup(vosLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passwordLabel)
                                        .addGroup(vosLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(passwordStar)))
                                .addContainerGap())
        );

        vosLoginButtons.setBackground(new java.awt.Color(51, 51, 51));

        noAccButton.setBackground(new java.awt.Color(60, 60, 60));
        noAccButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        noAccButton.setText("Don't have an Account?");
        noAccButton.setBorderPainted(false);

        loginButton.setBackground(new java.awt.Color(60, 60, 60));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton.setText("Log In");
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vosLoginButtonsLayout = new javax.swing.GroupLayout(vosLoginButtons);
        vosLoginButtons.setLayout(vosLoginButtonsLayout);
        vosLoginButtonsLayout.setHorizontalGroup(
                vosLoginButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosLoginButtonsLayout.createSequentialGroup()
                                .addGroup(vosLoginButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(vosLoginButtonsLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(noAccButton))
                                        .addGroup(vosLoginButtonsLayout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(loginButton)))
                                .addContainerGap())
        );
        vosLoginButtonsLayout.setVerticalGroup(
                vosLoginButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosLoginButtonsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginButton)
                                .addGap(18, 18, 18)
                                .addComponent(noAccButton)
                                .addContainerGap())
        );

        javax.swing.GroupLayout vosLoginLayout = new javax.swing.GroupLayout(vosLogin);
        vosLogin.setLayout(vosLoginLayout);
        vosLoginLayout.setHorizontalGroup(
                vosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosLoginLayout.createSequentialGroup()
                                .addContainerGap(33, Short.MAX_VALUE)
                                .addGroup(vosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vosLoginLayout.createSequentialGroup()
                                                .addComponent(vosLoginButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(91, 91, 91))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vosLoginLayout.createSequentialGroup()
                                                .addComponent(vosLoginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vosLoginLayout.createSequentialGroup()
                                                .addComponent(vosLoginPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30))))
        );
        vosLoginLayout.setVerticalGroup(
                vosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vosLoginLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(vosLoginPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(vosLoginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(vosLoginButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(vosWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vosLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(vosLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(vosWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {
        if(usernameField.getForeground() == Color.gray) {
            usernameField.setText("");
            usernameField.setForeground(null);
        }
    }
    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {
        setUsernameFieldText();
    }

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {
        if(passwordField.getForeground() == Color.gray) {
            passwordField.setText("");
            passwordField.setEchoChar('*');
            passwordField.setForeground(null);
        }
    }
    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {
        setPasswordFieldText();
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setStarsInvisible();
        if(markEmptyFields()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if((userID = handler.checkCredentials(usernameField.getText(), String.valueOf(passwordField.getPassword()))) > 0) {
            JOptionPane.showMessageDialog(null, "Log In Successful! \nWelcome to VOS!", "Success", JOptionPane.INFORMATION_MESSAGE);
            Simulator simulator = new Simulator();
            simulator.pack();
            simulator.setLocationRelativeTo(null);
            simulator.setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "Wrong username or password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setHomepageHyperlink() {
        vos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        vos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/index.php"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.getMessage();
                }
            }
        });
    }
    private void setAboutSystemsHyperlink() {
        aboutSystemsLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aboutSystemsLink.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/pages/about-systems.php"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.getMessage();
                }
            }
        });
    }
    private void setAboutPnHyperlink() {
        aboutPnLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aboutPnLink.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/pages/about-petrinets.php"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.getMessage();
                }
            }
        });
    }
    private void setAboutOetpnHyperlink() {
        aboutOetpnLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aboutOetpnLink.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/pages/about-oetpns.php"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.getMessage();
                }
            }
        });
    }
    private void setAboutVosHyperlink() {
        aboutVosLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aboutVosLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/pages/about-vos.php"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.getMessage();
                }
            }
        });
    }
    private void setGithubProfileHyperlink() {
        githubLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        githubLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://github.com/draguleee"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.getMessage();
                }
            }
        });
    }
    private void setLinkedinProfileHyperlink() {
        linkedinLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        linkedinLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.getMessage();
                }
            }
        });
    }
    private void setEmailOption() {
        emailLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        emailLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    String message = "mailto:aandreid14@gmail.com";
                    URI uri = URI.create(message);
                    Desktop.getDesktop().mail(uri);
                }
                catch(IOException ex) {
                    ex.getMessage();
                }
            }
        });
    }
    private void setLoginHyperlink() {
        loginLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/pages/login.php"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.getMessage();
                }
            }
        });
    }
    private void setSignupHyperlink() {
        noAccButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        noAccButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/pages/signup.php"));
                }
                catch(IOException | URISyntaxException ex) {
                    ex.getMessage();
                }
            }
        });
    }

    private void setUsernameFieldText() {
        if(usernameField.getText().isEmpty()) {
            usernameField.setText("Username...");
            usernameField.setForeground(Color.gray);
        }
    }
    private void setPasswordFieldText() {
        if(String.valueOf(passwordField.getPassword()).isEmpty()) {
            passwordField.setEchoChar('*');
            passwordField.setText("Password");
            passwordField.setForeground(Color.gray);
        }
    }

    private JPanel vosWelcome;
    private JPanel vosMessage;
    private JLabel vos;
    private JLabel vosDesktopApp;
    private JScrollPane scrollPane;
    private JTextArea vosText;
    private JPanel vosLinks;
    private JLabel aboutSystems;
    private JLabel aboutSystemsLink;
    private JLabel aboutPn;
    private JLabel aboutPnLink;
    private JLabel aboutOetpn;
    private JLabel aboutOetpnLink;
    private JLabel aboutVos;
    private JLabel aboutVosLink;
    private JLabel aboutDev1;
    private JLabel aboutDev2;
    private JLabel githubLink;
    private JLabel linkedinLink;
    private JLabel emailLink;

    private JPanel vosLogin;
    private JPanel vosLoginPrompt;
    private JLabel loginLink;
    private JLabel vosUse;
    private JPanel vosLoginForm;
    private JLabel usernameLabel;
    private JTextField usernameField;
    private JLabel usernameStar;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JLabel passwordStar;
    private JPanel vosLoginButtons;
    private JButton loginButton;
    private JButton noAccButton;

}
