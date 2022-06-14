package vosdesktop.frames;

import vosdesktop.handlers.DatabaseHandler;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class SignupFrame extends JFrame {

    // Class variables
    DatabaseHandler handler = null;

    // Variables declaration - do not modify
    private JLabel AboutOETPN;
    private JLabel AboutPNs;
    private JLabel AboutSystems;
    private JLabel AboutVOS;
    private JLabel Email;
    private JLabel GitHub;
    private JLabel LinkedIn;
    private JTextField SFEmailField;
    private JLabel SFEmailStar;
    private JTextField SFFNameField;
    private JLabel SFFNameStar;
    private JTextField SFLNameField;
    private JLabel SFLNameStar;
    private JPasswordField SFPassField;
    private JLabel SFPassStar;
    private JPasswordField SFRepPassField;
    private JLabel SFRepPassStar;
    private JLabel WVOS_Welcome;
    private JTextArea WelcomeText;
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
        SFFNameStar.setVisible(false);
        SFLNameStar.setVisible(false);
        SFEmailStar.setVisible(false);
        SFPassStar.setVisible(false);
        SFRepPassStar.setVisible(false);
    }

    /**
     * markEmptyFields() <br>
     * Marks the empty fields after pressing the Login button.
     * If there is one or both fields empty, they will be marked accordingly.
     * If there are both fields filled in, nothing happens.
     *
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
     * Checks if the input text in both "Password" and "Confirm Password" match.
     *
     * @return the state of truth after comparing the two strings
     */
    private boolean matchingPasswords() {
        return (String.valueOf(SFRepPassField.getPassword()).equals(String.valueOf(SFPassField.getPassword())));
    }

    // <editor-fold default state="collapsed" desc="Generated Code">
    private void initComponents() {

        JPanel signupForm = new JPanel();
        JPanel SFText = new JPanel();
        JLabel SFMessage1 = new JLabel();
        JLabel SFMessage2 = new JLabel();
        JPanel SFUserData = new JPanel();
        JLabel SFFNameLabel = new JLabel();
        SFFNameField = new JTextField();
        JLabel SFLNameLabel = new JLabel();
        SFLNameField = new JTextField();
        JLabel SFEmailLabel = new JLabel();
        SFEmailField = new JTextField();
        JLabel SFPassLabel = new JLabel();
        SFPassField = new JPasswordField();
        JLabel SFRepPassLabel = new JLabel();
        SFRepPassField = new JPasswordField();
        SFFNameStar = new JLabel();
        SFLNameStar = new JLabel();
        SFEmailStar = new JLabel();
        SFPassStar = new JLabel();
        SFRepPassStar = new JLabel();
        JPanel LFButtons = new JPanel();
        JButton signupButton = new JButton();
        JButton haveAccButton = new JButton();
        JPanel WVOS_Signup = new JPanel();
        JPanel WVOS_Title = new JPanel();
        WVOS_Welcome = new JLabel();
        JLabel WVOS_DesktopApp = new JLabel();
        JScrollPane WVOS_Text = new JScrollPane();
        WelcomeText = new JTextArea();
        JPanel WVOS_Links = new JPanel();
        Email = new JLabel();
        JLabel textEmail2 = new JLabel();
        AboutPNs = new JLabel();
        JLabel textEmail1 = new JLabel();
        JLabel textAboutCreator2 = new JLabel();
        JLabel textAboutOETPN1 = new JLabel();
        GitHub = new JLabel();
        JLabel textAboutOETPN2 = new JLabel();
        AboutVOS = new JLabel();
        JLabel textAboutCreator3 = new JLabel();
        AboutOETPN = new JLabel();
        JLabel textAboutVOS = new JLabel();
        AboutSystems = new JLabel();
        LinkedIn = new JLabel();
        JLabel textAboutCreator1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(51, 51, 51));
        setResizable(false);

        signupForm.setBackground(new Color(51, 51, 51));

        SFText.setBackground(new Color(51, 51, 51));

        SFMessage1.setFont(new Font("Segoe UI", Font.PLAIN, 48)); // NOI18N
        SFMessage1.setText("Sign Up");

        SFMessage2.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        SFMessage2.setText("to start using VOS Desktop Application");

        GroupLayout SFTextLayout = new GroupLayout(SFText);
        SFText.setLayout(SFTextLayout);
        SFTextLayout.setHorizontalGroup(
                SFTextLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(SFTextLayout.createSequentialGroup()
                                .addGroup(SFTextLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(SFTextLayout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(SFMessage2))
                                        .addGroup(SFTextLayout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(SFMessage1)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SFTextLayout.setVerticalGroup(
                SFTextLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(SFTextLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(SFMessage1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SFMessage2)
                                .addContainerGap())
        );

        SFUserData.setBackground(new Color(51, 51, 51));

        SFFNameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        SFFNameLabel.setText("First Name");

        SFFNameField.setBackground(Color.darkGray);
        SFFNameField.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        SFLNameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        SFLNameLabel.setText("Last Name");

        SFLNameField.setBackground(Color.darkGray);
        SFLNameField.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        SFEmailLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        SFEmailLabel.setText("E-mail");

        SFEmailField.setBackground(Color.darkGray);
        SFEmailField.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        SFPassLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        SFPassLabel.setText("Password");

        SFPassField.setBackground(Color.darkGray);
        SFPassField.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        SFRepPassLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        SFRepPassLabel.setText("Confirm");

        SFRepPassField.setBackground(Color.darkGray);
        SFRepPassField.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        SFFNameStar.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        SFFNameStar.setText("*");

        SFLNameStar.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        SFLNameStar.setText("*");

        SFEmailStar.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        SFEmailStar.setText("*");

        SFPassStar.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        SFPassStar.setText("*");

        SFRepPassStar.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        SFRepPassStar.setText("*");

        GroupLayout SFUserDataLayout = new GroupLayout(SFUserData);
        SFUserData.setLayout(SFUserDataLayout);
        SFUserDataLayout.setHorizontalGroup(
                SFUserDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, SFUserDataLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(SFUserDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(SFFNameLabel, GroupLayout.Alignment.TRAILING)
                                        .addComponent(SFLNameLabel, GroupLayout.Alignment.TRAILING)
                                        .addComponent(SFEmailLabel, GroupLayout.Alignment.TRAILING)
                                        .addComponent(SFPassLabel, GroupLayout.Alignment.TRAILING)
                                        .addComponent(SFRepPassLabel, GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SFUserDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(SFFNameField)
                                        .addComponent(SFLNameField)
                                        .addComponent(SFEmailField)
                                        .addComponent(SFPassField)
                                        .addComponent(SFRepPassField, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SFUserDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(SFLNameStar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SFFNameStar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SFPassStar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SFRepPassStar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SFEmailStar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(42, 42, 42))
        );
        SFUserDataLayout.setVerticalGroup(
                SFUserDataLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(SFUserDataLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(SFUserDataLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(SFFNameLabel)
                                        .addComponent(SFFNameStar)
                                        .addComponent(SFFNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(SFUserDataLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(SFLNameStar)
                                        .addComponent(SFLNameLabel)
                                        .addComponent(SFLNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SFUserDataLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(SFEmailLabel)
                                        .addComponent(SFEmailStar)
                                        .addComponent(SFEmailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SFUserDataLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(SFPassStar)
                                        .addComponent(SFPassLabel)
                                        .addComponent(SFPassField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SFUserDataLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(SFRepPassStar)
                                        .addComponent(SFRepPassLabel)
                                        .addComponent(SFRepPassField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
        );

        LFButtons.setBackground(new Color(51, 51, 51));

        signupButton.setBackground(Color.darkGray);
        signupButton.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        signupButton.setText("Sign Up");
        signupButton.setBorderPainted(false);
        signupButton.addActionListener(this::SignupButtonActionPerformed);

        haveAccButton.setBackground(Color.darkGray);
        haveAccButton.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        haveAccButton.setText("Already have an account? Log In");
        haveAccButton.setBorderPainted(false);
        haveAccButton.addActionListener(this::HaveAccButtonActionPerformed);

        GroupLayout LFButtonsLayout = new GroupLayout(LFButtons);
        LFButtons.setLayout(LFButtonsLayout);
        LFButtonsLayout.setHorizontalGroup(
                LFButtonsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LFButtonsLayout.createSequentialGroup()
                                .addGroup(LFButtonsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(LFButtonsLayout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(haveAccButton))
                                        .addGroup(LFButtonsLayout.createSequentialGroup()
                                                .addGap(123, 123, 123)
                                                .addComponent(signupButton)))
                                .addContainerGap(51, Short.MAX_VALUE))
        );
        LFButtonsLayout.setVerticalGroup(
                LFButtonsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LFButtonsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(signupButton)
                                .addGap(18, 18, 18)
                                .addComponent(haveAccButton)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        GroupLayout SignupFormLayout = new GroupLayout(signupForm);
        signupForm.setLayout(SignupFormLayout);
        SignupFormLayout.setHorizontalGroup(
                SignupFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, SignupFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(SFText, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, SignupFormLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LFButtons, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                        .addGroup(SignupFormLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(SFUserData, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(39, Short.MAX_VALUE))
        );
        SignupFormLayout.setVerticalGroup(
                SignupFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(SignupFormLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(SFText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(SFUserData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LFButtons, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(54, Short.MAX_VALUE))
        );

        WVOS_Signup.setBackground(new Color(51, 51, 51));

        WVOS_Title.setBackground(new Color(51, 51, 51));

        WVOS_Welcome.setFont(new Font("Segoe UI", Font.PLAIN, 36)); // NOI18N
        WVOS_Welcome.setText("Visual OETPN Simulator (VOS)");

        WVOS_DesktopApp.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        WVOS_DesktopApp.setText("Desktop Application");

        GroupLayout WVOS_TitleLayout = new GroupLayout(WVOS_Title);
        WVOS_Title.setLayout(WVOS_TitleLayout);
        WVOS_TitleLayout.setHorizontalGroup(
                WVOS_TitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_TitleLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(WVOS_TitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(WVOS_TitleLayout.createSequentialGroup()
                                                .addComponent(WVOS_Welcome)
                                                .addContainerGap())
                                        .addGroup(GroupLayout.Alignment.TRAILING, WVOS_TitleLayout.createSequentialGroup()
                                                .addComponent(WVOS_DesktopApp)
                                                .addGap(159, 159, 159))))
        );
        WVOS_TitleLayout.setVerticalGroup(
                WVOS_TitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_TitleLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(WVOS_Welcome)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WVOS_DesktopApp)
                                .addContainerGap())
        );

        WelcomeText.setEditable(false);
        WelcomeText.setBackground(Color.darkGray);
        WelcomeText.setColumns(20);
        WelcomeText.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        WelcomeText.setRows(5);
        WelcomeText.setText("Visual OETPN Simulator (short: VOS) is an open-source tool that helps students learning in \ntechnical fields to understand, design and simulate Object-Enhanced Timed Petri Nets \n(OETPNs).\n\nVisual OETPN Simulator was developed by Automation and Applied Informatics student, \nDragu Andreea, as a bachelor's thesis, including researches on Petri Nets (specifically \nOETPNs) and Desktop Development technologies and programming languages (Java, \nSwing, MySQL).\n\nAnd, the most important thing of all, Visual OETPN Simulator is completely free to use. The \nuser must create a new account to start using the tool, or if they already have an account, \nthey must log into their account.");
        WelcomeText.setCaretColor(new Color(0, 0, 0));
        WelcomeText.setFocusable(false);
        WVOS_Text.setViewportView(WelcomeText);

        WVOS_Links.setBackground(new Color(51, 51, 51));

        Email.setText("e-mail");

        textEmail2.setText("me directly.");

        AboutPNs.setText("About PNs,");

        textEmail1.setText("Or,");

        textAboutCreator2.setText("or");

        textAboutOETPN1.setText("To find out more about systems, Petri Nets and OETPNs, please visit");

        GitHub.setText("GitHub");

        textAboutOETPN2.setText("and");

        AboutVOS.setText("VOS Web - About VOS.");

        textAboutCreator3.setText("profiles.");

        AboutOETPN.setText("About OETPNs.");

        textAboutVOS.setText("To find out more about Visual OETPN Simulator, please visit");

        AboutSystems.setText("About Systems, ");

        LinkedIn.setText("LinkedIn");

        textAboutCreator1.setText("To find out more about the creator of this tool, please visit my");

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
                                                .addComponent(textAboutOETPN1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutSystems)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutPNs)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textAboutOETPN2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AboutOETPN)))
                                .addContainerGap())
        );
        WVOS_LinksLayout.setVerticalGroup(
                WVOS_LinksLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_LinksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(WVOS_LinksLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textAboutOETPN1)
                                        .addComponent(AboutOETPN)
                                        .addComponent(AboutSystems)
                                        .addComponent(AboutPNs)
                                        .addComponent(textAboutOETPN2))
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
                                .addGap(18, 18, 18)
                                .addGroup(WVOS_LinksLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textEmail1)
                                        .addComponent(textEmail2)
                                        .addComponent(Email))
                                .addContainerGap())
        );

        GroupLayout WVOS_SignupLayout = new GroupLayout(WVOS_Signup);
        WVOS_Signup.setLayout(WVOS_SignupLayout);
        WVOS_SignupLayout.setHorizontalGroup(
                WVOS_SignupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                .addGroup(WVOS_SignupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(WVOS_Text, GroupLayout.PREFERRED_SIZE, 573, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                                .addGap(97, 97, 97)
                                                .addComponent(WVOS_Title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(WVOS_Links, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        WVOS_SignupLayout.setVerticalGroup(
                WVOS_SignupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(WVOS_SignupLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(WVOS_Title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(WVOS_Text, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(WVOS_Links, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(signupForm, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WVOS_Signup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(signupForm, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WVOS_Signup, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    /**
     * SignupButtonActionPerformed(java.awt.event.ActionEvent evt) <br>
     * The action responsible for signing the user up for the application. <br>
     * If the Sign-Up button is pressed and there are one or more fields
     * empty, a dialog with "Please enter all fields!" message will
     * appear. <br>
     * If the input passwords don't match, a dialog with "Passwords should
     * match" message will appear. <br>
     * If all the data was input correctly, the user will be signed up for the
     * application.
     *
     * @param evt the ActionEvent
     */
    private void SignupButtonActionPerformed(ActionEvent evt) {
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
     * user will be redirected to the Login form.
     *
     * @param evt the ActionEvent
     */
    private void HaveAccButtonActionPerformed(ActionEvent evt) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
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
