package vos.desktop.main;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import vos.desktop.ui.access.LoginFrame;
import vos.desktop.ui.access.SignupFrame;

public class MainFrame extends javax.swing.JFrame {
    
    // Class variables
    private LoginFrame loginFrame;
    private SignupFrame signupFrame;
    private MainFrame mainFrame;
    private UIManager uim = new UIManager();

    // Constructor for MainFrame class
    public MainFrame() {
        initComponents();
        setTitle("Visual OETPN Simulator - Desktop Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem71 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        NewWindow = new javax.swing.JMenuItem();
        NewSimulation = new javax.swing.JMenuItem();
        Separator1 = new javax.swing.JPopupMenu.Separator();
        OpenSimulation = new javax.swing.JMenuItem();
        OpenRecent = new javax.swing.JMenu();
        ClearHistory = new javax.swing.JMenuItem();
        Separator2 = new javax.swing.JPopupMenu.Separator();
        Save = new javax.swing.JMenuItem();
        SaveAs = new javax.swing.JMenuItem();
        Separator3 = new javax.swing.JPopupMenu.Separator();
        Move = new javax.swing.JMenuItem();
        Rename = new javax.swing.JMenuItem();
        Refresh = new javax.swing.JMenuItem();
        Separator4 = new javax.swing.JPopupMenu.Separator();
        Print = new javax.swing.JMenuItem();
        Separator5 = new javax.swing.JPopupMenu.Separator();
        Restart = new javax.swing.JMenuItem();
        Close = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        Undo = new javax.swing.JMenuItem();
        Redo = new javax.swing.JMenuItem();
        Separator6 = new javax.swing.JPopupMenu.Separator();
        Cut = new javax.swing.JMenuItem();
        Copy = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        Delete = new javax.swing.JMenuItem();
        Select = new javax.swing.JMenuItem();
        SelectAll = new javax.swing.JMenuItem();
        Separator7 = new javax.swing.JPopupMenu.Separator();
        View = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem30 = new javax.swing.JMenuItem();
        Draw = new javax.swing.JMenu();
        jMenuItem63 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem64 = new javax.swing.JMenuItem();
        jMenuItem65 = new javax.swing.JMenuItem();
        jMenuItem66 = new javax.swing.JMenuItem();
        jMenuItem67 = new javax.swing.JMenuItem();
        jMenuItem68 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem69 = new javax.swing.JMenuItem();
        jMenuItem70 = new javax.swing.JMenuItem();
        Simulate = new javax.swing.JMenu();
        jMenuItem62 = new javax.swing.JMenuItem();
        About = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        jMenuItem57 = new javax.swing.JMenuItem();
        jMenuItem58 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem59 = new javax.swing.JMenuItem();
        jMenuItem60 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem61 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem71.setText("jMenuItem71");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        File.setText("File");

        NewWindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        NewWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new-window.jpg"))); // NOI18N
        NewWindow.setText("New Window");
        NewWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewWindowActionPerformed(evt);
            }
        });
        File.add(NewWindow);

        NewSimulation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        NewSimulation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new-simulation.jpg"))); // NOI18N
        NewSimulation.setText("New Simulation...");
        NewSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSimulationActionPerformed(evt);
            }
        });
        File.add(NewSimulation);
        File.add(Separator1);

        OpenSimulation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        OpenSimulation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-simulation.jpg"))); // NOI18N
        OpenSimulation.setText("Open Simulation...");
        OpenSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenSimulationActionPerformed(evt);
            }
        });
        File.add(OpenSimulation);

        OpenRecent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open-recent.jpg"))); // NOI18N
        OpenRecent.setText("Open Recent Simulations");

        ClearHistory.setText("Clear History...");
        ClearHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearHistoryActionPerformed(evt);
            }
        });
        OpenRecent.add(ClearHistory);

        File.add(OpenRecent);
        File.add(Separator2);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.jpg"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        File.add(Save);

        SaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save-as.jpg"))); // NOI18N
        SaveAs.setText("Save As...");
        SaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsActionPerformed(evt);
            }
        });
        File.add(SaveAs);
        File.add(Separator3);

        Move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/move.jpg"))); // NOI18N
        Move.setText("Move...");
        Move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveActionPerformed(evt);
            }
        });
        File.add(Move);

        Rename.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        Rename.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rename.jpg"))); // NOI18N
        Rename.setText("Rename...");
        Rename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenameActionPerformed(evt);
            }
        });
        File.add(Rename);

        Refresh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh.jpg"))); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        File.add(Refresh);
        File.add(Separator4);

        Print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/print.jpg"))); // NOI18N
        Print.setText("Print...");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        File.add(Print);
        File.add(Separator5);

        Restart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/restart.jpg"))); // NOI18N
        Restart.setText("Restart VOS Desktop App");
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });
        File.add(Restart);

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.jpg"))); // NOI18N
        Close.setText("Close Window");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        File.add(Close);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.jpg"))); // NOI18N
        Exit.setText("Exit VOS Desktop App");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        jMenuBar1.add(File);

        Edit.setText("Edit");

        Undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/undo.jpg"))); // NOI18N
        Undo.setText("Undo");
        Edit.add(Undo);

        Redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Redo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/redo.jpg"))); // NOI18N
        Redo.setText("Redo");
        Edit.add(Redo);
        Edit.add(Separator6);

        Cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cut.jpg"))); // NOI18N
        Cut.setText("Cut");
        Edit.add(Cut);

        Copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/copy.jpg"))); // NOI18N
        Copy.setText("Copy");
        Edit.add(Copy);

        Paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paste.jpg"))); // NOI18N
        Paste.setText("Paste");
        Edit.add(Paste);

        Delete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.jpg"))); // NOI18N
        Delete.setText("Delete");
        Edit.add(Delete);

        Select.setText("Select");
        Edit.add(Select);

        SelectAll.setText("Select All");
        Edit.add(SelectAll);
        Edit.add(Separator7);

        jMenuBar1.add(Edit);

        View.setText("View");

        jMenuItem19.setText("Zoom in");
        View.add(jMenuItem19);

        jMenuItem7.setText("Zoom out");
        View.add(jMenuItem7);

        jMenu3.setText("Zoom");

        jMenuItem20.setText("40%");
        jMenu3.add(jMenuItem20);

        jMenuItem21.setText("60%");
        jMenu3.add(jMenuItem21);

        jMenuItem22.setText("80%");
        jMenu3.add(jMenuItem22);

        jMenuItem23.setText("100%");
        jMenu3.add(jMenuItem23);

        jMenuItem24.setText("120%");
        jMenu3.add(jMenuItem24);

        jMenuItem25.setText("140%");
        jMenu3.add(jMenuItem25);

        jMenuItem26.setText("160%");
        jMenu3.add(jMenuItem26);

        jMenuItem27.setText("180%");
        jMenu3.add(jMenuItem27);

        jMenuItem28.setText("200%");
        jMenu3.add(jMenuItem28);

        jMenuItem29.setText("300%");
        jMenu3.add(jMenuItem29);

        View.add(jMenu3);
        View.add(jSeparator7);

        jMenuItem30.setText("Change grid");
        View.add(jMenuItem30);

        jMenuBar1.add(View);

        Draw.setText("Draw");

        jMenuItem63.setText("Select");
        Draw.add(jMenuItem63);
        Draw.add(jSeparator10);

        jMenuItem64.setText("Place");
        Draw.add(jMenuItem64);

        jMenuItem65.setText("Immediate Transition");
        Draw.add(jMenuItem65);

        jMenuItem66.setText("Timed Transition");
        Draw.add(jMenuItem66);

        jMenuItem67.setText("Arc");
        Draw.add(jMenuItem67);

        jMenuItem68.setText("Annotation");
        Draw.add(jMenuItem68);
        Draw.add(jSeparator11);

        jMenuItem69.setText("Add token");
        Draw.add(jMenuItem69);

        jMenuItem70.setText("Delete token");
        Draw.add(jMenuItem70);

        jMenuBar1.add(Draw);

        Simulate.setText("Simulate");

        jMenuItem62.setText("Run Simulation");
        Simulate.add(jMenuItem62);

        jMenuBar1.add(Simulate);

        About.setText("About");

        jMenuItem31.setText("Get Started");
        About.add(jMenuItem31);

        jMenu7.setText("Command info");

        jMenuItem33.setText("jMenuItem33");
        jMenu7.add(jMenuItem33);

        jMenuItem32.setText("jMenuItem32");
        jMenu7.add(jMenuItem32);

        jMenuItem34.setText("jMenuItem34");
        jMenu7.add(jMenuItem34);

        jMenuItem35.setText("jMenuItem35");
        jMenu7.add(jMenuItem35);

        jMenuItem36.setText("jMenuItem36");
        jMenu7.add(jMenuItem36);

        jMenuItem37.setText("jMenuItem37");
        jMenu7.add(jMenuItem37);

        jMenuItem38.setText("jMenuItem38");
        jMenu7.add(jMenuItem38);

        jMenuItem39.setText("jMenuItem39");
        jMenu7.add(jMenuItem39);

        jMenuItem40.setText("jMenuItem40");
        jMenu7.add(jMenuItem40);

        jMenuItem41.setText("jMenuItem41");
        jMenu7.add(jMenuItem41);

        jMenuItem42.setText("jMenuItem42");
        jMenu7.add(jMenuItem42);

        jMenuItem43.setText("jMenuItem43");
        jMenu7.add(jMenuItem43);

        jMenuItem44.setText("jMenuItem44");
        jMenu7.add(jMenuItem44);

        jMenuItem45.setText("jMenuItem45");
        jMenu7.add(jMenuItem45);

        jMenuItem46.setText("jMenuItem46");
        jMenu7.add(jMenuItem46);

        jMenuItem47.setText("jMenuItem47");
        jMenu7.add(jMenuItem47);

        jMenuItem48.setText("jMenuItem48");
        jMenu7.add(jMenuItem48);

        jMenuItem49.setText("jMenuItem49");
        jMenu7.add(jMenuItem49);

        jMenuItem50.setText("jMenuItem50");
        jMenu7.add(jMenuItem50);

        jMenuItem51.setText("jMenuItem51");
        jMenu7.add(jMenuItem51);

        jMenuItem52.setText("jMenuItem52");
        jMenu7.add(jMenuItem52);

        jMenuItem53.setText("jMenuItem53");
        jMenu7.add(jMenuItem53);

        jMenuItem54.setText("jMenuItem54");
        jMenu7.add(jMenuItem54);

        jMenuItem55.setText("jMenuItem55");
        jMenu7.add(jMenuItem55);

        jMenuItem56.setText("jMenuItem56");
        jMenu7.add(jMenuItem56);

        jMenuItem57.setText("jMenuItem57");
        jMenu7.add(jMenuItem57);

        About.add(jMenu7);

        jMenuItem58.setText("Documentation");
        About.add(jMenuItem58);
        About.add(jSeparator8);

        jMenuItem59.setText("Go to Webpage");
        About.add(jMenuItem59);

        jMenuItem60.setText("Go to Github");
        About.add(jMenuItem60);
        About.add(jSeparator9);

        jMenuItem61.setText("About...");
        About.add(jMenuItem61);

        jMenuBar1.add(About);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1547, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Event for NewWindow option from File menu (opens a new VOS Desktop App window)
    private void NewWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewWindowActionPerformed
        mainFrame = new MainFrame();
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_NewWindowActionPerformed

    // Event for NewSimulation option from File menu (opens a new simulation on the current window)
    private void NewSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSimulationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewSimulationActionPerformed

    // Event for OpenSimulation option from File menu (opens an existing simulation on the current window)
    private void OpenSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenSimulationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenSimulationActionPerformed

    // Event for ClearHistory option from File -> Open Recent Simulations (clears all the recently created simulations)
    private void ClearHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearHistoryActionPerformed

    // Event for Save option from File menu (saves the current simulation in the current window)
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    // Event for Save As option from File menu (saves the current simulation in the current window under a name)
    private void SaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveAsActionPerformed

    // Event for Move option from File menu (moves a simulation in another folder)
    private void MoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoveActionPerformed

    // Event for Rename option from File menu (renames an opened simulation)
    private void RenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RenameActionPerformed

    // Event for Refresh option from File menu (refreshes the current window)
    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        
    }//GEN-LAST:event_RefreshActionPerformed

    // Event for Print option from File menu (prints the simulation from the current window)
    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintActionPerformed

    // Event for Restart option from File menu (restarts VOS Desktop App)
    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
        loginFrame = new LoginFrame();
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RestartActionPerformed

    // Event for Close option from File menu (closes the current window)
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        Object[] options = {"Yes", "Cancel"};
        setJOptionPane();
        int option = JOptionPane.showOptionDialog(this, "Exit VOS Desktop App?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_CloseActionPerformed

    // Event for Exit option from File menu (exits VOS Desktop App)
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        Object[] options = {"Yes", "Cancel"};
        setJOptionPane();
        int option = JOptionPane.showOptionDialog(this, "Exit VOS Desktop App?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    // Function to setup the JOptionPane
    private void setJOptionPane() {
        uim.put("OptionPane.background",new ColorUIResource(51,51,51));
        uim.put("Panel.background",new ColorUIResource(51,51,51));
        uim.put("OptionPane.messageForeground", Color.white);
        uim.put("Button.background", Color.darkGray);
        uim.put("Button.foreground", Color.white);
    }
    
    // Main method
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JMenuItem ClearHistory;
    private javax.swing.JMenuItem Close;
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JMenuItem Delete;
    private javax.swing.JMenu Draw;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem Move;
    private javax.swing.JMenuItem NewSimulation;
    private javax.swing.JMenuItem NewWindow;
    private javax.swing.JMenu OpenRecent;
    private javax.swing.JMenuItem OpenSimulation;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JMenuItem Print;
    private javax.swing.JMenuItem Redo;
    private javax.swing.JMenuItem Refresh;
    private javax.swing.JMenuItem Rename;
    private javax.swing.JMenuItem Restart;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem SaveAs;
    private javax.swing.JMenuItem Select;
    private javax.swing.JMenuItem SelectAll;
    private javax.swing.JPopupMenu.Separator Separator1;
    private javax.swing.JPopupMenu.Separator Separator2;
    private javax.swing.JPopupMenu.Separator Separator3;
    private javax.swing.JPopupMenu.Separator Separator4;
    private javax.swing.JPopupMenu.Separator Separator5;
    private javax.swing.JPopupMenu.Separator Separator6;
    private javax.swing.JPopupMenu.Separator Separator7;
    private javax.swing.JMenu Simulate;
    private javax.swing.JMenuItem Undo;
    private javax.swing.JMenu View;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem57;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem59;
    private javax.swing.JMenuItem jMenuItem60;
    private javax.swing.JMenuItem jMenuItem61;
    private javax.swing.JMenuItem jMenuItem62;
    private javax.swing.JMenuItem jMenuItem63;
    private javax.swing.JMenuItem jMenuItem64;
    private javax.swing.JMenuItem jMenuItem65;
    private javax.swing.JMenuItem jMenuItem66;
    private javax.swing.JMenuItem jMenuItem67;
    private javax.swing.JMenuItem jMenuItem68;
    private javax.swing.JMenuItem jMenuItem69;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem70;
    private javax.swing.JMenuItem jMenuItem71;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
