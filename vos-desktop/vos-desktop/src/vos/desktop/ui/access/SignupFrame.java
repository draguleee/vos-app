package vos.desktop.ui.access;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import vos.desktop.database.DatabaseHandler;

public class SignupFrame extends javax.swing.JFrame {

    // Class variables
    DatabaseHandler handler = null;
    UIManager uim = new UIManager();
    
    public SignupFrame() {
        handler = DatabaseHandler.getInstance();
        initComponents();        
        setStarsInvisible();
    }
    
    // Set the stars invisible
    private void setStarsInvisible() {
        SFFNameStar.setVisible(false);
        SFLNameStar.setVisible(false);
        SFEmailStar.setVisible(false);
        SFPassStar.setVisible(false);
        SFRepPassStar.setVisible(false);
    }
    
    /**
     * Function name: markEmptyFields()
     * @return
     * true - if there is at least one empty field <br>
     * false - if there are no empty fields
     */
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

    // Set the stars
    private void setStarsVisible(boolean flag) {
        SFFNameStar.setVisible(flag);
        SFLNameStar.setVisible(flag);
        SFEmailStar.setVisible(flag);
        SFPassStar.setVisible(flag);
        SFRepPassStar.setVisible(flag);
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
        NoAccButton = new javax.swing.JButton();
        WVOS_Signup = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        SignupForm.setBackground(new java.awt.Color(51, 51, 51));

        SFText.setBackground(new java.awt.Color(51, 51, 51));

        SFMessage1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        SFMessage1.setForeground(new java.awt.Color(255, 255, 255));
        SFMessage1.setText("Sign Up");

        SFMessage2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SFMessage2.setForeground(new java.awt.Color(255, 255, 255));
        SFMessage2.setText("to start using VOS Desktop Application");

        javax.swing.GroupLayout SFTextLayout = new javax.swing.GroupLayout(SFText);
        SFText.setLayout(SFTextLayout);
        SFTextLayout.setHorizontalGroup(
            SFTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SFTextLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(SFMessage2)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SFTextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SFMessage1)
                .addGap(92, 92, 92))
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

        SFFNameLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SFFNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        SFFNameLabel.setText("First Name");

        SFFNameField.setBackground(new java.awt.Color(204, 204, 204));
        SFFNameField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SFFNameField.setForeground(new java.awt.Color(255, 255, 255));
        SFFNameField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SFFNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SFFNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SFFNameFieldFocusLost(evt);
            }
        });

        SFLNameLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SFLNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        SFLNameLabel.setText("Last Name");

        SFLNameField.setBackground(new java.awt.Color(204, 204, 204));
        SFLNameField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SFLNameField.setForeground(new java.awt.Color(255, 255, 255));
        SFLNameField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SFLNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SFLNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SFLNameFieldFocusLost(evt);
            }
        });

        SFEmailLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SFEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        SFEmailLabel.setText("E-mail");

        SFEmailField.setBackground(new java.awt.Color(204, 204, 204));
        SFEmailField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SFEmailField.setForeground(new java.awt.Color(255, 255, 255));
        SFEmailField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SFEmailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SFEmailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SFEmailFieldFocusLost(evt);
            }
        });

        SFPassLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SFPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        SFPassLabel.setText("Password");

        SFPassField.setBackground(new java.awt.Color(204, 204, 204));
        SFPassField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SFPassField.setForeground(new java.awt.Color(255, 255, 255));
        SFPassField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SFPassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SFPassFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SFPassFieldFocusLost(evt);
            }
        });

        SFRepPassLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SFRepPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        SFRepPassLabel.setText("Confirm");

        SFRepPassField.setBackground(new java.awt.Color(204, 204, 204));
        SFRepPassField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SFRepPassField.setForeground(new java.awt.Color(255, 255, 255));
        SFRepPassField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SFRepPassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SFRepPassFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SFRepPassFieldFocusLost(evt);
            }
        });

        SFFNameStar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SFFNameStar.setForeground(new java.awt.Color(255, 102, 0));
        SFFNameStar.setText("*");

        SFLNameStar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SFLNameStar.setForeground(new java.awt.Color(255, 102, 0));
        SFLNameStar.setText("*");

        SFEmailStar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SFEmailStar.setForeground(new java.awt.Color(255, 102, 0));
        SFEmailStar.setText("*");

        SFPassStar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SFPassStar.setForeground(new java.awt.Color(255, 102, 0));
        SFPassStar.setText("*");

        SFRepPassStar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SFRepPassStar.setForeground(new java.awt.Color(255, 102, 0));
        SFRepPassStar.setText("*");

        javax.swing.GroupLayout SFUserDataLayout = new javax.swing.GroupLayout(SFUserData);
        SFUserData.setLayout(SFUserDataLayout);
        SFUserDataLayout.setHorizontalGroup(
            SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SFUserDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SFLNameStar)
                    .addGroup(SFUserDataLayout.createSequentialGroup()
                        .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SFFNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SFLNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SFEmailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SFPassLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SFRepPassLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SFPassField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(SFEmailField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SFLNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SFFNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SFRepPassField))
                        .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SFUserDataLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(SFFNameStar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SFUserDataLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SFEmailStar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SFPassStar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SFRepPassStar, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(32, 32, 32))
        );
        SFUserDataLayout.setVerticalGroup(
            SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SFUserDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFFNameLabel)
                    .addComponent(SFFNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SFFNameStar))
                .addGap(12, 12, 12)
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFLNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SFLNameStar)
                    .addComponent(SFLNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFEmailLabel)
                    .addComponent(SFEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SFEmailStar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SFPassStar)
                    .addComponent(SFPassLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SFUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SFRepPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SFRepPassStar)
                    .addComponent(SFRepPassLabel))
                .addGap(15, 15, 15))
        );

        LFButtons.setBackground(new java.awt.Color(51, 51, 51));

        SignupButton.setBackground(new java.awt.Color(102, 102, 102));
        SignupButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SignupButton.setForeground(new java.awt.Color(255, 255, 255));
        SignupButton.setText("Signup");
        SignupButton.setToolTipText("");
        SignupButton.setAutoscrolls(true);
        SignupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignupButton.setDoubleBuffered(true);
        SignupButton.setFocusCycleRoot(true);
        SignupButton.setFocusTraversalPolicyProvider(true);
        SignupButton.setHideActionText(true);
        SignupButton.setInheritsPopupMenu(true);
        SignupButton.setVerifyInputWhenFocusTarget(false);
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });

        NoAccButton.setBackground(new java.awt.Color(102, 102, 102));
        NoAccButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        NoAccButton.setForeground(new java.awt.Color(255, 255, 255));
        NoAccButton.setText("Already have an account? Log In");
        NoAccButton.setToolTipText("");
        NoAccButton.setAutoscrolls(true);
        NoAccButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NoAccButton.setDoubleBuffered(true);
        NoAccButton.setFocusCycleRoot(true);
        NoAccButton.setFocusTraversalPolicyProvider(true);
        NoAccButton.setHideActionText(true);
        NoAccButton.setInheritsPopupMenu(true);
        NoAccButton.setVerifyInputWhenFocusTarget(false);
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
                        .addComponent(SignupButton)))
                .addContainerGap())
        );
        LFButtonsLayout.setVerticalGroup(
            LFButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LFButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignupButton)
                .addGap(18, 18, 18)
                .addComponent(NoAccButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout SignupFormLayout = new javax.swing.GroupLayout(SignupForm);
        SignupForm.setLayout(SignupFormLayout);
        SignupFormLayout.setHorizontalGroup(
            SignupFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignupFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LFButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(SignupFormLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(SFText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(SFUserData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        WVOS_Signup.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout WVOS_SignupLayout = new javax.swing.GroupLayout(WVOS_Signup);
        WVOS_Signup.setLayout(WVOS_SignupLayout);
        WVOS_SignupLayout.setHorizontalGroup(
            WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        WVOS_SignupLayout.setVerticalGroup(
            WVOS_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SignupForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(WVOS_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignupForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(WVOS_Signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Open the Login Form by pressing "Already Have An Account?" Button
    private void NoAccButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoAccButtonActionPerformed
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NoAccButtonActionPerformed

    // Event for First Name Field (focus gained)
    private void SFFNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SFFNameFieldFocusGained
        if(SFFNameField.getForeground() == Color.gray) {
            SFFNameField.setText("");
            SFFNameField.setForeground(null);
        }
    }//GEN-LAST:event_SFFNameFieldFocusGained

    // Event for First Name Field (focus lost)
    private void SFFNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SFFNameFieldFocusLost
        setSFFNameFieldText();
    }//GEN-LAST:event_SFFNameFieldFocusLost

    // Event for Last Name Field (focus gained)
    private void SFLNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SFLNameFieldFocusGained
        if(SFLNameField.getForeground() == Color.gray) {
            SFLNameField.setText("");
            SFLNameField.setForeground(null);
        }
    }//GEN-LAST:event_SFLNameFieldFocusGained

    // Event for Last Name Field (focus lost)
    private void SFLNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SFLNameFieldFocusLost
        setSFLNameFieldText();
    }//GEN-LAST:event_SFLNameFieldFocusLost

    // Event for Email Field (focus gained)
    private void SFEmailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SFEmailFieldFocusGained
        if(SFEmailField.getForeground() == Color.gray) {
            SFEmailField.setText("");
            SFEmailField.setForeground(null);
        }
    }//GEN-LAST:event_SFEmailFieldFocusGained

    // Event for Email Field (focus lost)
    private void SFEmailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SFEmailFieldFocusLost
        setSFEmailFieldText();
    }//GEN-LAST:event_SFEmailFieldFocusLost

    // Event for Pass Field (focus gained)
    private void SFPassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SFPassFieldFocusGained
        if(SFPassField.getForeground() == Color.gray) {
            SFPassField.setText("");
            SFPassField.setForeground(null);
        }
    }//GEN-LAST:event_SFPassFieldFocusGained

    // Event for Pass Field (focus lost)
    private void SFPassFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SFPassFieldFocusLost
        setSFPassFieldText();
    }//GEN-LAST:event_SFPassFieldFocusLost

    // Event for Repeat Password Field (focus gained)
    private void SFRepPassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SFRepPassFieldFocusGained
        if(SFRepPassField.getForeground() == Color.gray) {
            SFRepPassField.setText("");
            SFRepPassField.setForeground(null);
        }
    }//GEN-LAST:event_SFRepPassFieldFocusGained

    // Event for Repeat Password Field (focus lost)
    private void SFRepPassFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SFRepPassFieldFocusLost
        setSFRepPassFieldText();
    }//GEN-LAST:event_SFRepPassFieldFocusLost

    // Event for the Signup Button
    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupButtonActionPerformed
        setStarsInvisible();
        if(markEmptyFields()) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Please enter all fields!", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!matchingPasswords()) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Passwords should match!", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(handler.insertUser(SFFNameField.getText(), 
                              SFLNameField.getText(), 
                              SFEmailField.getText(), 
                              String.valueOf(SFPassField.getPassword()))) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Sign Up Successful!", "Success!", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "This e-mail is already registered!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SignupButtonActionPerformed

    // Function to setup the JOptionPane
    private void setJOptionPane() {
        uim.put("OptionPane.background",new ColorUIResource(51,51,51));
        uim.put("Panel.background",new ColorUIResource(51,51,51));
        uim.put("OptionPane.messageForeground", Color.white);
        uim.put("Button.background", Color.gray);
        uim.put("Button.foreground", Color.white);
    }
    
    // Function to set the First Name field's text (focus gained / lost)
    private void setSFFNameFieldText() {
        if(SFFNameField.getText().isEmpty()) {
            SFFNameField.setText("First Name");
            SFFNameField.setForeground(Color.gray);
        }
    }
    
    // Function to set the Last Name field's text (focus gained / lost)
    private void setSFLNameFieldText() {
        if(SFLNameField.getText().isEmpty()) {
            SFLNameField.setText("Last Name");
            SFLNameField.setForeground(Color.gray);
        }
    }
    
    // Function to set the Email field's text (focus gained / lost)
    private void setSFEmailFieldText() {
        if(SFEmailField.getText().isEmpty()) {
            SFEmailField.setText("E-mail");
            SFEmailField.setForeground(Color.gray);
        }
    }
    
    // Function to set the Pass field's text (focus gained / lost)
    private void setSFPassFieldText() {
        if(SFPassField.getText().isEmpty()) {
            SFPassField.setText("Password");
            SFPassField.setForeground(Color.gray);
        }
    }
    
    // Function to set the Repeat Password field's text (focus gained / lost)
    private void setSFRepPassFieldText() {
        if(SFRepPassField.getText().isEmpty()) {
            SFRepPassField.setText("Password");
            SFRepPassField.setForeground(Color.gray);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LFButtons;
    private javax.swing.JButton NoAccButton;
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
    private javax.swing.JPanel WVOS_Signup;
    // End of variables declaration//GEN-END:variables
}
