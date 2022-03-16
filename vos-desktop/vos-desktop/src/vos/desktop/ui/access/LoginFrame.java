package vos.desktop.ui.access;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import vos.desktop.database.DatabaseHandler;
import vos.desktop.main.MainFrame;

public class LoginFrame extends javax.swing.JFrame {
    
    // Class variables
    private static int userID = -1;
    DatabaseHandler handler = null;
    UIManager uim = new UIManager();

    public LoginFrame() {
        handler = DatabaseHandler.getInstance();
        initComponents();
        setLFEmailFieldText();
        setLFPassFieldText();
        setStarsInvisible();
    }
    
    // Set the stars invisible
    private void setStarsInvisible() {
        LFEmailStar.setVisible(false);
        LFPassStar.setVisible(false);
    }
    
    // Set the stars
    private void setStarsVisible(boolean flag) {
        LFEmailStar.setVisible(flag);
        LFPassStar.setVisible(flag);
    }
    
    // Mark the empty fields
    private boolean markEmptyFields() {
        boolean isEmpty = false;
        if(LFEmailField.getForeground() == Color.gray) {
            isEmpty = true;
            LFEmailStar.setVisible(true);
        }
        if(LFPassField.getForeground() == Color.gray) {
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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LoginForm.setBackground(new java.awt.Color(51, 51, 51));

        LFText.setBackground(new java.awt.Color(51, 51, 51));

        LFMessage1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        LFMessage1.setForeground(new java.awt.Color(255, 255, 255));
        LFMessage1.setText("Log In");

        LFMessage2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LFMessage2.setForeground(new java.awt.Color(255, 255, 255));
        LFMessage2.setText("to start using VOS Desktop Application");

        javax.swing.GroupLayout LFTextLayout = new javax.swing.GroupLayout(LFText);
        LFText.setLayout(LFTextLayout);
        LFTextLayout.setHorizontalGroup(
            LFTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFTextLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LFTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LFMessage2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LFTextLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(LFMessage1)
                        .addGap(82, 82, 82)))
                .addContainerGap())
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

        LFEmailLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LFEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        LFEmailLabel.setText("E-mail");

        LFEmailField.setBackground(new java.awt.Color(204, 204, 204));
        LFEmailField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LFEmailField.setForeground(java.awt.Color.gray);
        LFEmailField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LFEmailField.setSelectionColor(new java.awt.Color(255, 102, 0));
        LFEmailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LFEmailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LFEmailFieldFocusLost(evt);
            }
        });

        LFPassLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LFPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        LFPassLabel.setText("Password");

        LFPassField.setBackground(new java.awt.Color(204, 204, 204));
        LFPassField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LFPassField.setForeground(java.awt.Color.gray);
        LFPassField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LFPassField.setSelectionColor(new java.awt.Color(255, 102, 0));
        LFPassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LFPassFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LFPassFieldFocusLost(evt);
            }
        });

        LFEmailStar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LFEmailStar.setForeground(new java.awt.Color(255, 153, 0));
        LFEmailStar.setText("*");

        LFPassStar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LFPassStar.setForeground(new java.awt.Color(255, 153, 0));
        LFPassStar.setText("*");

        javax.swing.GroupLayout LFUserDataLayout = new javax.swing.GroupLayout(LFUserData);
        LFUserData.setLayout(LFUserDataLayout);
        LFUserDataLayout.setHorizontalGroup(
            LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFUserDataLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LFEmailLabel)
                    .addComponent(LFPassLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LFPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(LFEmailField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LFPassStar)
                    .addComponent(LFEmailStar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(14, 14, 14))
        );

        LFButtons.setBackground(new java.awt.Color(51, 51, 51));

        LoginButton.setBackground(new java.awt.Color(102, 102, 102));
        LoginButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.setAutoscrolls(true);
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.setDoubleBuffered(true);
        LoginButton.setFocusCycleRoot(true);
        LoginButton.setFocusTraversalPolicyProvider(true);
        LoginButton.setHideActionText(true);
        LoginButton.setInheritsPopupMenu(true);
        LoginButton.setOpaque(true);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        NoAccButton.setBackground(new java.awt.Color(102, 102, 102));
        NoAccButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        NoAccButton.setForeground(new java.awt.Color(255, 255, 255));
        NoAccButton.setText("Don't have an account? Sign Up");
        NoAccButton.setAutoscrolls(true);
        NoAccButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NoAccButton.setDoubleBuffered(true);
        NoAccButton.setFocusCycleRoot(true);
        NoAccButton.setFocusTraversalPolicyProvider(true);
        NoAccButton.setHideActionText(true);
        NoAccButton.setInheritsPopupMenu(true);
        NoAccButton.setOpaque(true);
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
                    .addComponent(NoAccButton)
                    .addGroup(LFButtonsLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(LoginButton)))
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
            .addGroup(LoginFormLayout.createSequentialGroup()
                .addGroup(LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LFText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LoginFormLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(LFButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(LFUserData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LoginFormLayout.setVerticalGroup(
            LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFormLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(LFText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(LFUserData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(LFButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        WVOS_Login.setBackground(new java.awt.Color(51, 51, 51));
        WVOS_Login.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout WVOS_LoginLayout = new javax.swing.GroupLayout(WVOS_Login);
        WVOS_Login.setLayout(WVOS_LoginLayout);
        WVOS_LoginLayout.setHorizontalGroup(
            WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        WVOS_LoginLayout.setVerticalGroup(
            WVOS_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(WVOS_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(LoginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    // Event for Pass Field (focus gained)
    private void LFPassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LFPassFieldFocusGained
        if(LFPassField.getForeground() == Color.gray) {
            LFPassField.setText("");
            LFPassField.setEchoChar('*');
            LFPassField.setForeground(null);
        }
    }//GEN-LAST:event_LFPassFieldFocusGained

    // Event for Pass Field (focus lost)
    private void LFPassFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LFPassFieldFocusLost
        setLFPassFieldText();
    }//GEN-LAST:event_LFPassFieldFocusLost

    // Open the Signup Form by pressing "Don't Have An Account?" Button
    private void NoAccButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoAccButtonActionPerformed
        SignupFrame signupFrame = new SignupFrame();
        signupFrame.pack();
        signupFrame.setLocationRelativeTo(null);
        signupFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NoAccButtonActionPerformed

    // Event for the Login Button
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        setStarsVisible(false);
        if(markEmptyFields()) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Please enter all fields!", "", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if((userID = handler.checkCredentials(LFEmailField.getText(), String.valueOf(LFPassField.getPassword()))) > 0) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Log In Successful!", "Success!", JOptionPane.INFORMATION_MESSAGE);
            MainFrame main = new MainFrame();
            main.pack();
            main.setLocationRelativeTo(null);
            main.setVisible(true);
            this.dispose();
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Wrong username or password!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    // Function to setup the JOptionPane
    private void setJOptionPane() {
        uim.put("OptionPane.background",new ColorUIResource(51,51,51));
        uim.put("Panel.background",new ColorUIResource(51,51,51));
        uim.put("OptionPane.messageForeground", Color.white);
        uim.put("Button.background", Color.gray);
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
            LFPassField.setEchoChar((char) 0);
            LFPassField.setText("Password");
            LFPassField.setForeground(Color.gray);
        }
    }
    
    // Main method
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginForm;
    private javax.swing.JButton NoAccButton;
    private javax.swing.JPanel WVOS_Login;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
