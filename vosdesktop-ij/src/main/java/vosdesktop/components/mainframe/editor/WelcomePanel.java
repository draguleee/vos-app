package vosdesktop.components.mainframe.editor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WelcomePanel extends JPanel {

    private JLabel welcome;
    private JLabel logo;
    private JLabel getStarted;
    private JTextArea instructions;
    private JScrollPane instructionsPane;
    private JLabel links;
    private JLabel vos;
    private JLabel repo;

    public WelcomePanel() {
        initComponents();
    }

    private void initComponents() {
        setBackground(new java.awt.Color(70, 73, 75));

        welcome = new JLabel();
        logo = new JLabel();
        getStarted = new JLabel();
        instructions = new JTextArea();
        instructionsPane = new JScrollPane();
        links = new JLabel();
        vos = new JLabel();
        vos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 1) {
                    try {
                        Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/index.php"));
                    } catch (IOException | URISyntaxException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        repo = new JLabel();
        repo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 1) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://github.com/draguleee/vos-app/tree/vos-desktop"));
                    } catch(IOException | URISyntaxException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        welcome.setBackground(new java.awt.Color(255, 102, 0));
        welcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 153, 0));
        welcome.setText("Welcome, User! Thank you for choosing to use VOS - Visual OETPN Simulator!");

        logo.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vosdesktop-ij\\src\\main\\java\\vosdesktop\\icons\\vos-nobg.png")); // NOI18N

        getStarted.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getStarted.setText("Get Started");

        instructions.setColumns(20);
        instructions.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        instructions.setRows(5);
        instructions.setText("-> Open a new window, create a new simulation, save and export your simulation with the options in the File menu.\n-> Undo / redo an operation, cut / copy / paste / delete an element, select / select all elements with the options in the Edit menu.\n-> Design a simulation with the options in the Draw menu: Place, Immediate Transition, Timed Transition, Arc, Inhibitor Arc, Annotation.\n-> Enter edit mode / animation mode with the option in the Simulate menu. (NOTE: when edit mode is enabled, animation mode is disabled\nand vice versa; please be aware of the mode you are currently in).\n-> Find out more about Visual OETPN Simulator with the options in the About menu.");
        instructionsPane.setViewportView(instructions);

        links.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        links.setText("Links");

        vos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vos.setForeground(new java.awt.Color(255, 153, 0));
        vos.setText("Visual OETPN Simulator - Homepage");

        repo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        repo.setForeground(new java.awt.Color(255, 153, 0));
        repo.setText("Github Repository - Open-Source Code");

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(this);
        setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
                welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(welcome)
                                .addGap(92, 92, 92))
                        .addGroup(welcomePanelLayout.createSequentialGroup()
                                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(welcomePanelLayout.createSequentialGroup()
                                                .addGap(222, 222, 222)
                                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(welcomePanelLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(getStarted)
                                                        .addComponent(links))
                                                .addGap(18, 18, 18)
                                                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vos)
                                                        .addComponent(instructions, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(repo))))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        welcomePanelLayout.setVerticalGroup(
                welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(welcomePanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(welcome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(instructions, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(getStarted))
                                .addGap(18, 18, 18)
                                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(vos)
                                        .addComponent(links))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(repo)
                                .addGap(35, 35, 35))
        );
    }
}
