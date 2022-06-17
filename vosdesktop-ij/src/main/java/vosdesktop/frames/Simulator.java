package vosdesktop.frames;

import vosdesktop.components.mainframe.*;
import vosdesktop.components.mainframe.editor.*;
import vosdesktop.components.mainframe.menubar.menus.*;
import vosdesktop.components.mainframe.menubar.options.about.*;
import vosdesktop.components.mainframe.menubar.options.draw.*;
import vosdesktop.components.mainframe.menubar.options.draw.oetpn.*;
import vosdesktop.components.mainframe.menubar.options.edit.*;
import vosdesktop.components.mainframe.menubar.options.file.*;
import vosdesktop.components.mainframe.menubar.options.simulate.*;
import vosdesktop.components.mainframe.toolbar.sections.about.*;
import vosdesktop.components.mainframe.toolbar.sections.draw.*;
import vosdesktop.components.mainframe.toolbar.sections.edit.*;
import vosdesktop.components.mainframe.toolbar.sections.file.*;
import vosdesktop.components.mainframe.toolbar.sections.simulate.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.print.*;
import java.beans.ExceptionListener;
import java.io.*;
import java.net.*;

import java.beans.XMLEncoder;

public class Simulator extends JFrame {

    private Simulator mainFrame;
    private JMenuBar menuBar;
    private JToolBar toolBar;
    private MainPanel mainPanel;
    private JTabbedPane tabbedPane;
    private WelcomePanel welcomePanel;
    private JPanel toolPanel;
    private JScrollPane scrollPane1;
    private JTree tree;
    private JPanel simulationPanel;
    private JLabel label;
    private JScrollPane scrollPane2;
    private JTextArea manager;


    //
    private JFileChooser fileChooser;
    private final FileNameExtensionFilter filter = new FileNameExtensionFilter("OETPN Simulation", "xml");
    private BufferedImage image;
    private Graphics2D graphics2D;

    private Font baseFont = new Font("Sans Serif", Font.BOLD, 11);
    private int tabCount = 0;
    private int placeCount = 0;
    private int immediateTransitionCount = 0;
    private int timedTransitionCount = 0;
    private int annotationCount = 0;

    private VerticalSeparator[] separators = new VerticalSeparator[11];

    private DrawMenu drawMenu;
    private Annotation annotation;
    private AnimateModeOption animateModeOption;
    private EditModeOption editModeOption;
    private BackwardOption backwardOption;
    private ForwardOption forwardOption;
    private AnimateOption animateOption;

    private PlaceOption placeOption;
    private ImmediateTransitionOption immTransOption;
    private TimedTransitionOption timTransOption;
    private ArcOption arcOption;

    private AboutMenu aboutMenu;
    private GetStartedOption getStartedOption;
    private DocumentationOption documentationOption;
    private GoToMenu goToMenu;
    private AboutSystemsOption aboutSystemsOption;
    private AboutPnOption aboutPnOption;
    private AboutOetpnOption aboutOetpnOption;
    private AboutVosOption aboutVosOption;
    private GithubOption githubOption;
    private LinkedinOption linkedinOption;
    private EmailOption emailOption;

    private NewWindowButton newWindowButton;
    private NewSimulationButton newSimulationButton;
    private OpenSimulationButton openSimulationButton;
    private SaveButton saveButton;
    private PngButton pngButton;
    private JpegButton jpegButton;
    private PrintButton printButton;
    private UndoButton undoButton;
    private RedoButton redoButton;
    private CutButton cutButton;
    private CopyButton copyButton;
    private PasteButton pasteButton;
    private DeleteButton deleteButton;
    private SelectButton selectButton;
    private SelectAllButton selectAllButton;
    private PlaceButton placeButton;
    private ImmediateTransitionButton immTransButton;
    private TimedTransitionButton timTransButton;
    private ArcButton arcButton;
    private InhibatorArcButton inhArcButton;
    private AnnotationButton annotationButton;
    private AddTokenButton addTokenButton;
    private DeleteTokenButton deleteTokenButton;
    private AnimateModeButton animateModeButton;
    private EditModeButton editModeButton;
    private BackwardButton backwardButton;
    private ForwardButton forwardButton;
    private AnimateButton animateButton;
    private HomepageButton homepageButton;

    public Simulator() {
        initComponents();
        setTitle("Visual OETPN Simulator - Desktop Application");
        editMode();
    }

    private void initComponents() {

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        setMenuBar();
        setResizable(false);

        toolBar = new JToolBar();
        setToolBar();

        toolPanel = new JPanel();
        toolPanel.setBackground(new java.awt.Color(70, 73, 75));

        scrollPane1 = new JScrollPane();
        tree = new JTree();
        scrollPane1.setViewportView(tree);
        add(scrollPane1);

        scrollPane2 = new JScrollPane();
        simulationPanel = new JPanel();

        label = new JLabel();
        label.setText("Simulation Manager");

        manager = new JTextArea();
        manager.setColumns(20);
        manager.setRows(5);
        manager.setEnabled(false);
        manager.setBackground(new Color(70,73,75));
        scrollPane2.setViewportView(manager);

        tabbedPane = new JTabbedPane();
        welcomePanel = new WelcomePanel();
        mainPanel = new MainPanel();
        tabbedPane.add("Welcome", welcomePanel);

        javax.swing.GroupLayout editorPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(editorPanelLayout);
        editorPanelLayout.setHorizontalGroup(
                editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 978, Short.MAX_VALUE)
        );
        editorPanelLayout.setVerticalGroup(
                editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 615, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout simulationPanelLayout = new javax.swing.GroupLayout(simulationPanel);
        simulationPanel.setLayout(simulationPanelLayout);
        simulationPanelLayout.setHorizontalGroup(
                simulationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(simulationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(simulationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(simulationPanelLayout.createSequentialGroup()
                                                .addComponent(label)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        simulationPanelLayout.setVerticalGroup(
                simulationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(simulationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane2)
                                .addContainerGap())
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(simulationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tabbedPane)
                                .addContainerGap())
                        .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tabbedPane)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(simulationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        pack();
    }

    // Function to configure the Menu Bar
    public void setMenuBar() {

        // Configure the File Menu
        FileMenu fileMenuOption = new FileMenu();
        NewWindowOption newWindowOption = new NewWindowOption();
        newWindowOption.addActionListener(this::NewWindowActionPerformed);
        fileMenuOption.add(newWindowOption);
        NewSimulationOption newSimulationOption = new NewSimulationOption();
        newSimulationOption.addActionListener(this::NewSimulationActionPerformed);
        fileMenuOption.add(newSimulationOption);
        fileMenuOption.add(new HorizontalSeparator());
        OpenSimulationOption openSimulationOption = new OpenSimulationOption();
        openSimulationOption.addActionListener(this::OpenSimulationActionPerformed);
        fileMenuOption.add(openSimulationOption);
        fileMenuOption.add(new HorizontalSeparator());
        SaveOption saveOption = new SaveOption();
        saveOption.addActionListener(this::SaveActionPerformed);
        fileMenuOption.add(saveOption);
        ExportAsMenu exportAsMenu = new ExportAsMenu();
        fileMenuOption.add(exportAsMenu);
        PngOption pngOption = new PngOption();
        pngOption.addActionListener(this::PngActionPerformed);
        exportAsMenu.add(pngOption);
        JpegOption jpegOption = new JpegOption();
        jpegOption.addActionListener(this::JpegActionPerformed);
        exportAsMenu.add(jpegOption);
        fileMenuOption.add(new HorizontalSeparator());
        PrintOption printOption = new PrintOption();
        printOption.addActionListener(this::PrintActionPerformed);
        fileMenuOption.add(printOption);
        fileMenuOption.add(new HorizontalSeparator());
        RestartOption restartOption = new RestartOption();
        restartOption.addActionListener(this::RestartActionPerformed);
        fileMenuOption.add(restartOption);
        CloseCurrentTabOption closeCurrentTabOption = new CloseCurrentTabOption();
        closeCurrentTabOption.addActionListener(this::CloseCurrentTabActionPerformed);
        fileMenuOption.add(closeCurrentTabOption);
        CloseOption closeOption = new CloseOption();
        closeOption.addActionListener(this::CloseActionPerformed);
        fileMenuOption.add(closeOption);
        ExitOption exitOption = new ExitOption();
        exitOption.addActionListener(this::ExitActionPerformed);
        fileMenuOption.add(exitOption);

        // Configure the Edit Menu
        EditMenu editMenu = new EditMenu();
        UndoOption undoOption = new UndoOption();
        undoOption.addActionListener(this::UndoActionPerformed);
        editMenu.add(undoOption);
        RedoOption redoOption = new RedoOption();
        redoOption.addActionListener(this::RedoActionPerformed);
        editMenu.add(redoOption);
        editMenu.add(new HorizontalSeparator());
        CutOption cutOption = new CutOption();
        cutOption.addActionListener(this::CutActionPerformed);
        editMenu.add(cutOption);
        CopyOption copyOption = new CopyOption();
        copyOption.addActionListener(this::CopyActionPerformed);
        editMenu.add(copyOption);
        PasteOption pasteOption = new PasteOption();
        pasteOption.addActionListener(this::PasteActionPerformed);
        editMenu.add(pasteOption);
        DeleteOption deleteOption = new DeleteOption();
        deleteOption.addActionListener(this::DeleteActionPerformed);
        editMenu.add(deleteOption);
        editMenu.add(new HorizontalSeparator());
        SelectOption selectOption = new SelectOption();
        selectOption.addActionListener(this::SelectActionPerformed);
        editMenu.add(selectOption);
        SelectAllOption selectAllOption = new SelectAllOption();
        selectAllOption.addActionListener(this::SelectAllActionPerformed);
        editMenu.add(selectAllOption);

        // Configure the Draw menu
        drawMenu = new DrawMenu();
        placeOption = new PlaceOption();
        placeOption.addActionListener(this::PlaceActionPerformed);
        drawMenu.add(placeOption);
        immTransOption = new ImmediateTransitionOption();
        immTransOption.addActionListener(this::ImmediateTransitionActionPerformed);
        drawMenu.add(immTransOption);
        timTransOption = new TimedTransitionOption();
        timTransOption.addActionListener(this::TimedTransitionActionPerformed);
        drawMenu.add(timTransOption);
        arcOption = new ArcOption();
        arcOption.addActionListener(this::ArcActionPerformed);
        drawMenu.add(arcOption);
        InhibatorArcOption inhibatorArcOption = new InhibatorArcOption();
        inhibatorArcOption.addActionListener(this::InhibitorArcActionPerformed);
        drawMenu.add(inhibatorArcOption);
        AnnotationOption annotationOption = new AnnotationOption();
        annotationOption.addActionListener(this::AnnotationActionPerformed);
        drawMenu.add(annotationOption);
        drawMenu.add(new HorizontalSeparator());
        AddTokenOption addTokenOption = new AddTokenOption();
        addTokenOption.addActionListener(this::AddTokenActionPerformed);
        drawMenu.add(addTokenOption);
        DeleteTokenOption deleteTokenOption = new DeleteTokenOption();
        deleteTokenOption.addActionListener(this::DeleteTokenActionPerformed);
        drawMenu.add(deleteTokenOption);

        // Configure the Simulate menu
        SimulateMenu simulateMenu = new SimulateMenu();
        animateModeOption = new AnimateModeOption();
        animateModeOption.addActionListener(this::AnimateModeActionPerformed);
        simulateMenu.add(animateModeOption);
        editModeOption = new EditModeOption();
        editModeOption.addActionListener(this::EditModeActionPerformed);
        simulateMenu.add(editModeOption);
        simulateMenu.add(new HorizontalSeparator());
        backwardOption = new BackwardOption();
        backwardOption.addActionListener(this::BackwardActionPerformed);
        simulateMenu.add(backwardOption);
        forwardOption = new ForwardOption();
        forwardOption.addActionListener(this::ForwardActionPerformed);
        simulateMenu.add(forwardOption);
        animateOption = new AnimateOption();
        animateOption.addActionListener(this::AnimateActionPerformed);
        simulateMenu.add(animateOption);

        // Configure the About menu
        aboutMenu = new AboutMenu();
        getStartedOption = new GetStartedOption();
        getStartedOption.addActionListener(this::GetStartedActionPerformed);
        aboutMenu.add(getStartedOption);
        documentationOption = new DocumentationOption();
        documentationOption.addActionListener(this::DocumentationActionPerformed);
        aboutMenu.add(documentationOption);
        aboutMenu.add(new HorizontalSeparator());
        goToMenu = new GoToMenu();
        aboutMenu.add(goToMenu);
        aboutSystemsOption = new AboutSystemsOption();
        aboutSystemsOption.addActionListener(this::AboutSystemsActionPerformed);
        goToMenu.add(aboutSystemsOption);
        aboutPnOption = new AboutPnOption();
        aboutPnOption.addActionListener(this::AboutPnActionPerformed);
        goToMenu.add(aboutPnOption);
        aboutOetpnOption = new AboutOetpnOption();
        aboutOetpnOption.addActionListener(this::AboutOetpnActionPerformed);
        goToMenu.add(aboutOetpnOption);
        aboutVosOption = new AboutVosOption();
        aboutVosOption.addActionListener(this::AboutVosActionPerformed);
        goToMenu.add(aboutVosOption);
        aboutMenu.add(new HorizontalSeparator());
        githubOption = new GithubOption();
        githubOption.addActionListener(this::GithubActionPerformed);
        aboutMenu.add(githubOption);
        linkedinOption = new LinkedinOption();
        linkedinOption.addActionListener(this::LinkedinActionPerformed);
        aboutMenu.add(linkedinOption);
        emailOption = new EmailOption();
        emailOption.addActionListener(this::EmailActionPerformed);
        aboutMenu.add(emailOption);

        menuBar.add(fileMenuOption);
        menuBar.add(editMenu);
        menuBar.add(drawMenu);
        menuBar.add(simulateMenu);
        menuBar.add(aboutMenu);

    }

    // Function to configure the Tool Bar
    public void setToolBar() {

        // First section (File menu)
        newWindowButton = new NewWindowButton();
        newWindowButton.addActionListener(this::NewWindowActionPerformed);
        toolBar.add(newWindowButton);
        newSimulationButton = new NewSimulationButton();
        newSimulationButton.addActionListener(this::NewSimulationActionPerformed);
        toolBar.add(newSimulationButton);
        toolBar.add(separators[0] = new VerticalSeparator());
        openSimulationButton = new OpenSimulationButton();
        openSimulationButton.addActionListener(this::OpenSimulationActionPerformed);
        toolBar.add(openSimulationButton);
        toolBar.add(separators[1] = new VerticalSeparator());
        saveButton = new SaveButton();
        saveButton.addActionListener(this::SaveActionPerformed);
        toolBar.add(saveButton);
        pngButton = new PngButton();
        pngButton.addActionListener(this::PngActionPerformed);
        toolBar.add(pngButton);
        jpegButton = new JpegButton();
        jpegButton.addActionListener(this::JpegActionPerformed);
        toolBar.add(jpegButton);
        toolBar.add(separators[2] = new VerticalSeparator());
        printButton = new PrintButton();
        printButton.addActionListener(this::PrintActionPerformed);
        toolBar.add(printButton);
        toolBar.add(separators[3] = new VerticalSeparator());

        // Second section (Edit menu)
        undoButton = new UndoButton();
        undoButton.addActionListener(this::UndoActionPerformed);
        toolBar.add(undoButton);
        redoButton = new RedoButton();
        redoButton.addActionListener(this::RedoActionPerformed);
        toolBar.add(redoButton);
        toolBar.add(separators[4] = new VerticalSeparator());
        cutButton = new CutButton();
        cutButton.addActionListener(this::CutActionPerformed);
        toolBar.add(cutButton);
        copyButton = new CopyButton();
        copyButton.addActionListener(this::CopyActionPerformed);
        toolBar.add(copyButton);
        pasteButton = new PasteButton();
        pasteButton.addActionListener(this::PasteActionPerformed);
        toolBar.add(pasteButton);
        deleteButton = new DeleteButton();
        deleteButton.addActionListener(this::DeleteActionPerformed);
        toolBar.add(deleteButton);
        toolBar.add(separators[5] = new VerticalSeparator());
        selectButton = new SelectButton();
        selectButton.addActionListener(this::SelectActionPerformed);
        toolBar.add(selectButton);
        selectAllButton = new SelectAllButton();
        selectAllButton.addActionListener(this::SelectAllActionPerformed);
        toolBar.add(selectAllButton);
        toolBar.add(separators[6] = new VerticalSeparator());

        // Fourth section (Draw menu)
        placeButton = new PlaceButton();
        placeButton.addActionListener(this::PlaceActionPerformed);
        toolBar.add(placeButton);
        immTransButton = new ImmediateTransitionButton();
        immTransButton.addActionListener(this::ImmediateTransitionActionPerformed);
        toolBar.add(immTransButton);
        timTransButton = new TimedTransitionButton();
        timTransButton.addActionListener(this::TimedTransitionActionPerformed);
        toolBar.add(timTransButton);
        arcButton = new ArcButton();
        arcButton.addActionListener(this::ArcActionPerformed);
        toolBar.add(arcButton);
        inhArcButton = new InhibatorArcButton();
        inhArcButton.addActionListener(this::InhibitorArcActionPerformed);
        toolBar.add(inhArcButton);
        annotationButton = new AnnotationButton();
        annotationButton.addActionListener(this::AnnotationActionPerformed);
        toolBar.add(annotationButton);
        toolBar.add(separators[7] = new VerticalSeparator());
        addTokenButton = new AddTokenButton();
        addTokenButton.addActionListener(this::AddTokenActionPerformed);
        toolBar.add(addTokenButton);
        deleteTokenButton = new DeleteTokenButton();
        deleteTokenButton.addActionListener(this::DeleteTokenActionPerformed);
        toolBar.add(deleteTokenButton);
        toolBar.add(separators[8] = new VerticalSeparator());

        // Fifth section (Simulate)
        animateModeButton = new AnimateModeButton();
        animateModeButton.addActionListener(this::AnimateModeActionPerformed);
        toolBar.add(animateModeButton);
        editModeButton = new EditModeButton();
        editModeButton.addActionListener(this::EditModeActionPerformed);
        toolBar.add(editModeButton);
        toolBar.add(separators[9] = new VerticalSeparator());
        backwardButton = new BackwardButton();
        backwardButton.addActionListener(this::BackwardActionPerformed);
        toolBar.add(backwardButton);
        forwardButton = new ForwardButton();
        forwardButton.addActionListener(this::ForwardActionPerformed);
        toolBar.add(forwardButton);
        animateButton = new AnimateButton();
        animateButton.addActionListener(this::AnimateActionPerformed);
        toolBar.add(animateButton);
        toolBar.add(separators[10] = new VerticalSeparator());

        // Sixth section (About)
        homepageButton = new HomepageButton();
        homepageButton.addActionListener(this::GetStartedActionPerformed);
        toolBar.add(homepageButton);
    }

    // Action listeners for File menu
    public void NewWindowActionPerformed(ActionEvent evt) {
        mainFrame = new Simulator();
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }               // DONE
    public void NewSimulationActionPerformed(ActionEvent evt) {
        tabCount++;
        mainPanel = new MainPanel();
        String name = "Simulation " + tabCount;
        tabbedPane.add(name, mainPanel);
    }           // DONE
    public void OpenSimulationActionPerformed(ActionEvent evt) {
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showOpenDialog(getParent());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " + fileChooser.getSelectedFile().getName());
        }
    }          // TODO
    public void SaveActionPerformed(ActionEvent evt) {
        try {
            Component selected = tabbedPane.getSelectedComponent();
            objectToXml(selected);
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }                    // TODO
    public void PngActionPerformed(ActionEvent evt) {
        Component selected = tabbedPane.getSelectedComponent();
        image = new BufferedImage(selected.getWidth(), selected.getHeight(), BufferedImage.TYPE_INT_RGB);
        graphics2D = image.createGraphics();
        selected.paint(graphics2D);
        String suggestedDirectory = ".";
        fileChooser = new JFileChooser(suggestedDirectory);
        String EXTENSION = ".png";
        JFrame choose = new JFrame();
        choose.setTitle("Save To ...");
        int status = fileChooser.showSaveDialog(choose);
        if (status == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                String newfile = selectedFile.getCanonicalPath();
                if (!newfile.endsWith(EXTENSION)) {
                    newfile = newfile + EXTENSION;
                }
                ImageIO.write(image, "png", new File(newfile));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }                     // DONE
    public void JpegActionPerformed(ActionEvent evt) {
        Component selected = tabbedPane.getSelectedComponent();
        image = new BufferedImage(selected.getWidth(), selected.getHeight(), BufferedImage.TYPE_INT_RGB);
        graphics2D = image.createGraphics();
        selected.paint(graphics2D);
        String suggestedDirectory = ".";
        fileChooser = new JFileChooser(suggestedDirectory);
        String EXTENSION = ".jpeg";
        JFrame choose = new JFrame();
        choose.setTitle("Save To ...");
        int status = fileChooser.showSaveDialog(choose);
        if (status == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                String newfile = selectedFile.getCanonicalPath();
                if (!newfile.endsWith(EXTENSION)) {
                    newfile = newfile + EXTENSION;
                }
                ImageIO.write(image, "jpeg", new File(newfile));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }                    // DONE
    public void PrintActionPerformed(ActionEvent evt) {
        Component selected = tabbedPane.getSelectedComponent();
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Print Simulation");
        printerJob.setPrintable((graphics, pageFormat, pageIndex) -> {
            if (pageIndex > 0) {
                return Printable.NO_SUCH_PAGE;
            }
            graphics2D = (Graphics2D) graphics;
            graphics2D.translate(pageFormat.getImageableX() * 2, pageFormat.getImageableY() * 2);
            graphics2D.scale(0.5, 0.5);
            selected.paint(graphics2D);
            return Printable.PAGE_EXISTS;
        });
        boolean result = printerJob.printDialog();
        if (result) {
            try {
                printerJob.print();
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(this.getContentPane(), "Print error: " + e.getMessage());
            }
        }
    }                   // DONE
    public void RestartActionPerformed(ActionEvent evt) {
        Object[] options = {"Yes", "No"};
        int option = JOptionPane.showOptionDialog(this, "Restart VOS Desktop App? \n You might have unsaved changes...", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION) {
            Login login = new Login();
            login.pack();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
            this.dispose();
        }
    }                 // DONE
    public void CloseCurrentTabActionPerformed(ActionEvent evt) {
        Object[] options = {"Yes", "No"};
        int option = JOptionPane.showOptionDialog(this, "Close this tab? \n You might have unsaved changes...", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        Component selected = tabbedPane.getSelectedComponent();
        if(selected != null) {
            if (option == JOptionPane.YES_OPTION) {
                tabbedPane.remove(selected);
            }
        }
    }         // DONE
    public void CloseActionPerformed(ActionEvent evt) {
        Object[] options = {"Yes", "No"};
        int option = JOptionPane.showOptionDialog(this, "Close this window? \n You might have unsaved changes...", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }                   // DONE
    public void ExitActionPerformed(ActionEvent evt) {
        Object[] options = {"Yes", "Cancel"};
        int option = JOptionPane.showOptionDialog(new Simulator(), "Exit VOS Desktop App? \n You might have unsaved changes...", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }                    // DONE

    // Action listeners for Edit menu
    public void UndoActionPerformed(ActionEvent evt) {

    }                 // TODO
    public void RedoActionPerformed(ActionEvent evt) {
    }                 // TODO
    public void CutActionPerformed(ActionEvent evt) {
    }                  // TODO
    public void CopyActionPerformed(ActionEvent evt) {
    }                 // TODO
    public void PasteActionPerformed(ActionEvent evt) {
    }                // TODO
    public void DeleteActionPerformed(ActionEvent evt) {
    }               // TODO
    public void SelectActionPerformed(ActionEvent evt) {

    }
    public void SelectAllActionPerformed(ActionEvent evt) {
    }            // TODO

    // Action listeners for Draw menu
    public void PlaceActionPerformed(ActionEvent evt) {
        placeCount++;
        String name = "P" + placeCount;
        Place place = new Place(name, baseFont, 60, 60);
        mainPanel.addPlace(place);
        mainPanel.repaint();
    }                   // DONE
    public void ImmediateTransitionActionPerformed(ActionEvent evt) {
        immediateTransitionCount++;
        String name = "it" + immediateTransitionCount;
        ImmediateTransition immediateTransition = new ImmediateTransition(name, baseFont, 30, 30);
        mainPanel.addImmediateTransition(immediateTransition);
    }     // DONE
    public void TimedTransitionActionPerformed(ActionEvent evt) {
        timedTransitionCount++;
        String name = "tt" + timedTransitionCount;
        TimedTransition timedTransition = new TimedTransition(name, baseFont, 60, 60);
        mainPanel.addTimedTransition(timedTransition);
    }         // DONE
    public void ArcActionPerformed(ActionEvent evt) {

    }                        // TODO
    public void InhibitorArcActionPerformed(ActionEvent evt) {
    }               // TODO
    public void AnnotationActionPerformed(ActionEvent evt) {
        annotationCount++;
        String text = "Annotation " + annotationCount;
        Annotation annotation = new Annotation(text, baseFont, 60, 60);
        mainPanel.addAnnotation(annotation);
    }
    public void AddTokenActionPerformed(ActionEvent evt) {

    }
    public void DeleteTokenActionPerformed(ActionEvent evt) {
    }                // TODO

    // Action listeners for Simulate menu
    public void AnimateModeActionPerformed(ActionEvent evt) {
        animateMode();
        JOptionPane.showMessageDialog(this,"Animate mode toggled.");
    }             // DONE
    public void EditModeActionPerformed(ActionEvent evt) {
        editMode();
        JOptionPane.showMessageDialog(this,"Edit mode toggled.");
    }                // DONE
    public void BackwardActionPerformed(ActionEvent evt) {
    }                   // TODO
    public void ForwardActionPerformed(ActionEvent evt) {
    }                    // TODO
    public void AnimateActionPerformed(ActionEvent evt) {
    }                    // TODO

    // Action listeners for About menu
    public void GetStartedActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/index.php"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }               // DONE
    public void DocumentationActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/pages/documentation.php"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }            // DONE
    public void AboutSystemsActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/pages/about-systems.php"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }             // DONE
    public void AboutPnActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/pages/about-petrinets.php"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }                  // DONE
    public void AboutOetpnActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/pages/about-oetpns.php"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }               // DONE
    public void AboutVosActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("http://localhost/vosweb-nb/pages/about-vos.php"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }                 // DONE
    public void GithubActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/draguleee"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }                   // DONE
    public void LinkedinActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }                 // DONE
    public void EmailActionPerformed(ActionEvent evt) {
        try {
            String message = "mailto:aandreid14@gmail.com";
            URI uri = URI.create(message);
            Desktop.getDesktop().mail(uri);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }                    // DONE

    // Togglers between animate mode and edit mode
    public void animateMode() {
        drawMenu.setVisible(false);
        placeButton.setVisible(false);
        immTransButton.setVisible(false);
        timTransButton.setVisible(false);
        arcButton.setVisible(false);
        inhArcButton.setVisible(false);
        annotationButton.setVisible(false);
        addTokenButton.setVisible(false);
        deleteTokenButton.setVisible(false);
        backwardButton.setVisible(true);
        forwardButton.setVisible(true);
        animateButton.setVisible(true);
        separators[7].setVisible(false);
        separators[8].setVisible(false);
    }
    public void editMode() {
        drawMenu.setVisible(true);
        placeButton.setVisible(true);
        immTransButton.setVisible(true);
        timTransButton.setVisible(true);
        arcButton.setVisible(true);
        inhArcButton.setVisible(true);
        annotationButton.setVisible(true);
        addTokenButton.setVisible(true);
        deleteTokenButton.setVisible(true);
        backwardButton.setVisible(false);
        forwardButton.setVisible(false);
        animateButton.setVisible(false);
        separators[8].setVisible(true);
        separators[10].setVisible(false);
    }

    // JAXB
    private static void objectToXml(Component component) throws IOException {
        FileOutputStream fos = new FileOutputStream("simulations.xml");
        XMLEncoder enc = new XMLEncoder(fos);
        enc.setExceptionListener(new ExceptionListener() {
            @Override
            public void exceptionThrown(Exception e) {
                System.out.println("Exception: " + e.toString());
            }
        });
        enc.writeObject(component);
        enc.close();
        fos.close();
    }


}
