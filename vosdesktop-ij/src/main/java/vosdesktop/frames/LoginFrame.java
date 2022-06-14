package vosdesktop.frames;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import vosdesktop.handlers.DatabaseHandler;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class LoginFrame extends JFrame {

    private final DatabaseHandler handler;
    private int userID = -1;

    // Variables declaration - do not modify
    private JLabel AboutOETPN;
    private JLabel AboutPNs;
    private JLabel AboutSystems;
    private JLabel AboutVOS;
    private JLabel Email;
    private JLabel GitHub;
    private JTextField LFEmailField;
    private JLabel LFEmailStar;
    private JPasswordField LFPassField;
    private JLabel LFPassStar;
    private JLabel LinkedIn;
    private JLabel WVOS_Welcome;
    // End of variables declaration

    /**
     * LoginFrame() <br>
     * Default constructor for LoginFrame class.
     * Calls all the methods defined in this class.
     */
    public LoginFrame() {

        handler = DatabaseHandler.getInstance();                            // Get / create the instance
        initComponents();                                                   // Initialize the components
        setTitle("Visual OETPN Simulator - Desktop Application (Log In)");  // Set frame title


        // Set the hyperlinks
        setHomepageHyperlink();
        setAboutSystemsHyperlink();
        setAboutPNsHyperlink();
        setAboutOETPNHyperlink();
        setAboutVOSHyperlink();
        setGithubProfileHyperlink();
        setLinkedinProfileHyperlink();
        setEmailOption();

        // Set the placeholders
        setLFEmailFieldText();
        setLFPassFieldText();

        // Set up the frame (center location & visibility)
        setStarsInvisible();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * setStarsInvisible() <br>
     * Sets the markers for the e-mail and password field to invisible.
     * If one or both fields remain empty, the markers will be visible.
     * If one or both fields are filled in, the markers will not appear.
     */
    private void setStarsInvisible() {
        LFEmailStar.setVisible(false);
        LFPassStar.setVisible(false);
    }

    /**
     * markEmptyFields() <br>
     * Marks the empty fields after pressing the Login button.
     * If there is one or both fields empty, they will be marked accordingly.
     * If there are both fields filled in, nothing happens.
     */
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

    // <editor-fold defaul tstate="collapsed" desc="Generated Code">
    private void initComponents() {

        JScrollPane jScrollPane1 = new JScrollPane();
        JTextArea jTextArea1 = new JTextArea();
        JPanel loginForm = new JPanel();
        JPanel LFText = new JPanel();
        JLabel LFMessage1 = new JLabel();
        JLabel LFMessage2 = new JLabel();
        JPanel LFUserData = new JPanel();
        JLabel LFEmailLabel = new JLabel();
        LFEmailField = new JTextField();
        JLabel LFPassLabel = new JLabel();
        LFPassField = new JPasswordField();
        LFEmailStar = new JLabel();
        LFPassStar = new JLabel();
        JPanel LFButtons = new JPanel();
        JButton loginButton = new JButton();
        JButton noAccButton = new JButton();
        JPanel WVOS_Login = new JPanel();
        JPanel WVOS_Title = new JPanel();
        WVOS_Welcome = new JLabel();
        JLabel WVOS_DesktopApp = new JLabel();
        JScrollPane WVOS_Text = new JScrollPane();
        JTextArea welcomeText = new JTextArea();
        JPanel WVOS_Links = new JPanel();
        JLabel textAboutVOS = new JLabel();
        AboutVOS = new JLabel();
        JLabel textAboutCreator1 = new JLabel();
        GitHub = new JLabel();
        JLabel textAboutCreator2 = new JLabel();
        LinkedIn = new JLabel();
        JLabel textAboutCreator3 = new JLabel();
        JLabel textEmail1 = new JLabel();
        Email = new JLabel();
        JLabel textEmail2 = new JLabel();
        JLabel textAbout1 = new JLabel();
        AboutSystems = new JLabel();
        AboutPNs = new JLabel();
        AboutOETPN = new JLabel();
        JLabel textAbout2 = new JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(0, 0, 0));
        setResizable(false);

        loginForm.setBackground(new Color(51, 51, 51));

        LFText.setBackground(new Color(51, 51, 51));

        LFMessage1.setFont(new Font("Segoe UI", Font.PLAIN, 48)); // NOI18N
        LFMessage1.setText("Log In");

        LFMessage2.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        LFMessage2.setText("to start using VOS Desktop Application");

        GroupLayout LFTextLayout = new GroupLayout(LFText);
        LFText.setLayout(LFTextLayout);
        LFTextLayout.setHorizontalGroup(
                LFTextLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LFTextLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LFMessage2)
                                .addGap(19, 19, 19))
                        .addGroup(LFTextLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(LFMessage1)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LFTextLayout.setVerticalGroup(
                LFTextLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LFTextLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LFMessage1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LFMessage2)
                                .addContainerGap())
        );

        LFUserData.setBackground(new Color(51, 51, 51));

        LFEmailLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        LFEmailLabel.setText("E-mail");

        LFEmailField.setBackground(Color.darkGray);
        LFEmailField.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        LFEmailField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                LFEmailFieldFocusGained(evt);
            }
            public void focusLost(FocusEvent evt) {
                LFEmailFieldFocusLost(evt);
            }
        });

        LFPassLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        LFPassLabel.setText("Password");

        LFPassField.setBackground(Color.darkGray);
        LFPassField.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        LFPassField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                LFPassFieldFocusGained(evt);
            }
            public void focusLost(FocusEvent evt) {
                LFPassFieldFocusLost(evt);
            }
        });

        LFEmailStar.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        LFEmailStar.setText("*");

        LFPassStar.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        LFPassStar.setText("*");

        GroupLayout LFUserDataLayout = new GroupLayout(LFUserData);
        LFUserData.setLayout(LFUserDataLayout);
        LFUserDataLayout.setHorizontalGroup(
                LFUserDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LFUserDataLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LFUserDataLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(LFPassLabel)
                                        .addComponent(LFEmailLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LFUserDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LFPassField, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(LFEmailField))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LFUserDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(LFEmailStar)
                                        .addComponent(LFPassStar))
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        LFUserDataLayout.setVerticalGroup(
                LFUserDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LFUserDataLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LFUserDataLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(LFEmailLabel)
                                        .addComponent(LFEmailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LFEmailStar))
                                .addGap(18, 18, 18)
                                .addGroup(LFUserDataLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(LFPassField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LFPassLabel)
                                        .addComponent(LFPassStar))
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        LFButtons.setBackground(new Color(51, 51, 51));

        loginButton.setBackground(Color.darkGray);
        loginButton.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        loginButton.setText("Log In");
        loginButton.setBorderPainted(false);
        loginButton.setRequestFocusEnabled(false);
        loginButton.addActionListener(this::LoginButtonActionPerformed);

        noAccButton.setBackground(Color.darkGray);
        noAccButton.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        noAccButton.setText("Don't have an account? Sign up");
        noAccButton.setBorderPainted(false);
        noAccButton.addActionListener(this::NoAccButtonActionPerformed);

        GroupLayout LFButtonsLayout = new GroupLayout(LFButtons);
        LFButtons.setLayout(LFButtonsLayout);
        LFButtonsLayout.setHorizontalGroup(
                LFButtonsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LFButtonsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LFButtonsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, LFButtonsLayout.createSequentialGroup()
                                                .addComponent(loginButton)
                                                .addGap(73, 73, 73))
                                        .addComponent(noAccButton, GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );
        LFButtonsLayout.setVerticalGroup(
                LFButtonsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LFButtonsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginButton)
                                .addGap(18, 18, 18)
                                .addComponent(noAccButton)
                                .addContainerGap())
        );

        GroupLayout LoginFormLayout = new GroupLayout(loginForm);
        loginForm.setLayout(LoginFormLayout);
        LoginFormLayout.setHorizontalGroup(
                LoginFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, LoginFormLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LFButtons, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                        .addGroup(LoginFormLayout.createSequentialGroup()
                                .addGroup(LoginFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(LoginFormLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(LFText, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(LoginFormLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(LFUserData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        LoginFormLayout.setVerticalGroup(
                LoginFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LoginFormLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(LFText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(LFUserData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(LFButtons, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(84, Short.MAX_VALUE))
        );

        WVOS_Login.setBackground(new Color(51, 51, 51));
        WVOS_Login.setForeground(new Color(255, 255, 255));

        WVOS_Title.setBackground(new Color(51, 51, 51));

        WVOS_Welcome.setFont(new Font("Segoe UI", Font.PLAIN, 36)); // NOI18N
        WVOS_Welcome.setText("Visual OETPN Simulator (VOS)");

        WVOS_DesktopApp.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        WVOS_DesktopApp.setText("Desktop Application");

        GroupLayout WVOS_TitleLayout = new GroupLayout(WVOS_Title);
        WVOS_Title.setLayout(WVOS_TitleLayout);
        WVOS_TitleLayout.setHorizontalGroup(
                WVOS_TitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, WVOS_TitleLayout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addGroup(WVOS_TitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(WVOS_Welcome)
                                        .addGroup(WVOS_TitleLayout.createSequentialGroup()
                                                .addGap(150, 150, 150)
                                                .addComponent(WVOS_DesktopApp)))
                                .addContainerGap())
        );
        WVOS_TitleLayout.setVerticalGroup(
                WVOS_TitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, WVOS_TitleLayout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(WVOS_Welcome)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WVOS_DesktopApp))
        );

        welcomeText.setEditable(false);
        welcomeText.setBackground(Color.darkGray);
        welcomeText.setColumns(20);
        welcomeText.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        welcomeText.setRows(5);
        welcomeText.setText("Visual OETPN Simulator (short: VOS) is an open-source tool that helps students learning in \ntechnical fields to understand, design and simulate Object-Enhanced Timed Petri Nets (OETPNs).\n\nVisual OETPN Simulator was developed by Automation and Applied Informatics student, Dragu \nAndreea, as a bachelor's thesis, including researches on Petri Nets (specifically OETPNs) and \nDesktop Development technologies and programming languages (Java, Swing, MySQL).\n\nAnd, the most important thing of all, Visual OETPN Simulator is completely free to use. The user \nmust create a new account to start using the tool, or if they already have an account, they must \nlog into their account.");
        welcomeText.setCaretColor(new Color(0, 0, 0));
        welcomeText.setFocusable(false);
        WVOS_Text.setViewportView(welcomeText);

        WVOS_Links.setBackground(new Color(51, 51, 51));

        textAboutVOS.setText("To find out more about Visual OETPN Simulator, please visit");

        AboutVOS.setText("About VOS.");

        textAboutCreator1.setText("To find out more about the creator of this tool, please visit my");

        GitHub.setText("GitHub");

        textAboutCreator2.setText("or");

        LinkedIn.setText("LinkedIn");

        textAboutCreator3.setText("profiles.");

        textEmail1.setText("Or,");

        Email.setText("e-mail");

        textEmail2.setText("me directly.");

        textAbout1.setText("To find out more about systems, Petri Nets and OETPNs, please visit ");

        AboutSystems.setText("About Systems,");

        AboutPNs.setText("About PNs,");

        AboutOETPN.setText("About OETPNs.");

        textAbout2.setText("and");

        GroupLayout WVOS_LinksLayout = new GroupLayout(WVOS_Links);
        WVOS_Links.setLayout(WVOS_LinksLayout);
        WVOS_LinksLayout.setHorizontalGroup(
                WVOS_LinksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(WVOS_LinksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                                .addComponent(textAboutVOS)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutVOS))
                                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                                .addComponent(textAboutCreator1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(GitHub)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textAboutCreator2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LinkedIn)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textAboutCreator3))
                                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                                .addComponent(textEmail1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Email)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textEmail2))
                                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                                .addComponent(textAbout1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutSystems)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutPNs)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textAbout2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutOETPN)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WVOS_LinksLayout.setVerticalGroup(
                WVOS_LinksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(WVOS_LinksLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textAbout1)
                                        .addComponent(AboutSystems)
                                        .addComponent(AboutPNs)
                                        .addComponent(AboutOETPN)
                                        .addComponent(textAbout2))
                                .addGap(18, 18, 18)
                                .addGroup(WVOS_LinksLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textAboutVOS)
                                        .addComponent(AboutVOS))
                                .addGap(18, 18, 18)
                                .addGroup(WVOS_LinksLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textAboutCreator1)
                                        .addComponent(GitHub)
                                        .addComponent(textAboutCreator2)
                                        .addComponent(LinkedIn)
                                        .addComponent(textAboutCreator3))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(WVOS_LinksLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textEmail1)
                                        .addComponent(textEmail2)
                                        .addComponent(Email))
                                .addContainerGap())
        );

        GroupLayout WVOS_LoginLayout = new GroupLayout(WVOS_Login);
        WVOS_Login.setLayout(WVOS_LoginLayout);
        WVOS_LoginLayout.setHorizontalGroup(
                WVOS_LoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_LoginLayout.createSequentialGroup()
                                .addGap(12, 30, Short.MAX_VALUE)
                                .addGroup(WVOS_LoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, WVOS_LoginLayout.createSequentialGroup()
                                                .addComponent(WVOS_Links, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25))
                                        .addGroup(GroupLayout.Alignment.TRAILING, WVOS_LoginLayout.createSequentialGroup()
                                                .addComponent(WVOS_Title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(87, 87, 87))))
                        .addGroup(WVOS_LoginLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(WVOS_Text, GroupLayout.PREFERRED_SIZE, 608, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        WVOS_LoginLayout.setVerticalGroup(
                WVOS_LoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_LoginLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(WVOS_Title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(WVOS_Text, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(WVOS_Links, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(WVOS_Login, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginForm, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(loginForm, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WVOS_Login, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    /**
     * LFEmailFieldFocusGained(java.awt.event.FocusEvent evt) <br>
     * The e-mail field gains focus when clicked.
     * The e-mail field has gained focus when there is a blinking cursor
     * and the field's background text has disappeared.
     * */
    private void LFEmailFieldFocusGained(FocusEvent evt) {
        if(LFEmailField.getForeground() == Color.gray) {
            LFEmailField.setText("");
            LFEmailField.setForeground(null);
        }
    }

    /**
     * LFEmailFieldFocusLost(java.awt.event.FocusEvent evt) <br>
     * The e-mail field loses focus when there is another field clicked.
     * The e-mail field has lost focus when the blinking cursor is missing
     * and the field's background text is visible.
     */
    private void LFEmailFieldFocusLost(FocusEvent evt) {
        setLFEmailFieldText();
    }

    /**
     * LFPassFieldFocusGained(java.awt.event.FocusEvent evt) <br>
     * The password field gains focus when clicked.
     * The password field has gained focus when there is a blinking cursor
     * and the field's background text has disappeared.
     * */
    private void LFPassFieldFocusGained(FocusEvent evt) {
        if(LFPassField.getForeground() == Color.gray) {
            LFPassField.setText("");
            LFPassField.setEchoChar('*');
            LFPassField.setForeground(null);
        }
    }

    /**
     * LFPassFieldFocusLost(java.awt.event.FocusEvent evt) <br>
     * The password field loses focus when there is another field clicked.
     * The password field has lost focus when the blinking cursor is missing
     * and the field's background text is visible.
     */
    private void LFPassFieldFocusLost(FocusEvent evt) {
        setLFPassFieldText();
    }

    /**
     * LoginButtonActionPerformed(java.awt.event.ActionEvent evt) <br>
     * The action responsible for logging the user into the application. <br>
     * If the Login button is pressed and there are one or both fields
     * empty, a dialog with "Please enter all fields!" message will
     * appear. <br>
     * If the credentials match the credentials registered in the database, the
     * user will be logged in successfully. <br>
     * If one or both credentials are wrong, a dialog with "Wrong username or password!"
     * message will appear.
     *
     * @param evt the ActionEvent
     */
    private void LoginButtonActionPerformed(ActionEvent evt) {
        setStarsInvisible();
        if(markEmptyFields()) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Please enter all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if((userID = handler.checkCredentials(LFEmailField.getText(), String.valueOf(LFPassField.getPassword()))) > 0) {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Log In Successful! \nWelcome to VOS!", "Success", JOptionPane.INFORMATION_MESSAGE);
            MainFrame mainFrame = new MainFrame();
            mainFrame.pack();
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setVisible(true);
            this.dispose();
        }
        else {
            setJOptionPane();
            JOptionPane.showMessageDialog(null, "Wrong username or password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * NoAccButtonActionPerformed(java.awt.event.ActionEvent evt) <br>
     * The action responsible for redirecting the user to Sign Up form.
     * If the "Don't have an account? Sign Up" button is pressed, the
     * user will be redirected to the Sign-Up form.
     *
     * @param evt the ActionEvent
     */
    private void NoAccButtonActionPerformed(ActionEvent evt) {
        SignupFrame signupFrame = new SignupFrame();
        signupFrame.pack();
        signupFrame.setLocationRelativeTo(null);
        signupFrame.setVisible(true);
        this.dispose();
    }

    /**
     * setJOptionPane() <br>
     * Sets the layout for the message dialogs.
     */
    private void setJOptionPane() {
        UIManager.put("OptionPane.background",new ColorUIResource(51,51,51));
        UIManager.put("Panel.background",new ColorUIResource(51,51,51));
        UIManager.put("OptionPane.messageForeground", Color.white);
        UIManager.put("Button.background", Color.darkGray);
        UIManager.put("Button.foreground", Color.white);
    }

    /**
     * setLFEmailFieldText() <br>
     * Sets the background text for the e-mail field when focus is lost. <br>
     * This method will be called in:
     * <br> - The LFEmailFieldFocusLost event (for setting the background text when focus is lost)
     * <br> - The LoginFrame's class constructor (for general setup)
     *
     */
    private void setLFEmailFieldText() {
        if(LFEmailField.getText().isEmpty()) {
            LFEmailField.setText("E-mail");
            LFEmailField.setForeground(Color.gray);
        }
    }

    /**
     * setLFPassFieldText() <br>
     * Sets the background text for the password field when focus is lost. <br>
     * This method will be called in:
     * <br> - The LFPassFieldFocusLost event (for setting the background text when focus is lost)
     * <br> - The LoginFrame's class constructor (for general setup)
     *
     */
    private void setLFPassFieldText() {
        if(String.valueOf(LFPassField.getPassword()).isEmpty()) {
            LFPassField.setEchoChar('*');
            LFPassField.setText("Password");
            LFPassField.setForeground(Color.gray);
        }
    }

    /**
     * setHomepageHyperlink() <br>
     * Links the VOS Web's homepage to a JLabel (WVOS_Welcome). <br>
     * To differentiate this label from the rest of the text, the function
     * will change its colour to orange. <br>
     * When the user clicks the orange WVOS_Welcome JLabel, they will be
     * redirected to "https://visual-oetpn-simulator.netlify.app/index.html".
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
     * The receiver will be the creator of this application. The purpose
     * of this functionality is to get in touch with the creator if a user
     * wants to bring modifications to this application.
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
