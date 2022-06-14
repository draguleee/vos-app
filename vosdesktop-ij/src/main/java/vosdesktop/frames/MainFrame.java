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
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;

public class MainFrame extends JFrame {

    private MainFrame mainFrame;
    private JMenuBar menuBar;
    private JToolBar toolBar;
    private MainPanel mainPanel;

    //
    private JFileChooser fileChooser;
    private final FileNameExtensionFilter filter = new FileNameExtensionFilter("OETPN Simulation", "xml");
    private BufferedImage image;
    private Graphics2D graphics2D;

    Font baseFont = new Font("Sans Serif", Font.BOLD, 11);
    int placeCount = 0;
    int immediateTransitionCount = 0;
    int timedTransitionCount = 0;

    private Annotation annotation;


    private AnimateModeOption animateModeOption;
    private EditModeOption editModeOption;
    private BackwardOption backwardOption;
    private ForwardOption forwardOption;
    private AnimateOption animateOption;

    private AboutMenu aboutMenu;
    private GetStartedOption getStartedOption;
    private DocumentationOption documentationOption;
    private GoToMenu goToMenu;
    private AboutSystemsOption aboutSystemsOption;
    private AboutPnOption aboutPnOption;
    private AboutOetpnOption aboutOetpnOption;
    private AboutVosOption aboutVosOption;
    private AboutCreatorOption aboutCreatorOption;
    private GithubOption githubOption;
    private LinkedinOption linkedinOption;
    private EmailOption emailOption;

    private NewWindowButton newWindowButton;
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

    public MainFrame() {
        initComponents();
        setTitle("Visual OETPN Simulator - Desktop Application");
    }

    private void initComponents() {

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        setMenuBar();

        toolBar = new JToolBar();
        setToolBar();

        JScrollPane fileTree = new JScrollPane();
        JTree tree = new JTree();
        fileTree.setViewportView(tree);

        mainPanel = new MainPanel();

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1267, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fileTree, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fileTree, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        pack();
    }

    // Function to configure the Menu Bar
    public void setMenuBar() {

        // Configure the File Menu
        // File menu
        FileMenu fileMenuOption = new FileMenu();
        NewWindowOption newWindowOption = new NewWindowOption();
        newWindowOption.addActionListener(this::NewWindowActionPerformed);
        fileMenuOption.add(newWindowOption);
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
        CloseOption closeOption = new CloseOption();
        closeOption.addActionListener(this::CloseActionPerformed);
        fileMenuOption.add(closeOption);
        ExitOption exitOption = new ExitOption();
        exitOption.addActionListener(this::ExitActionPerformed);
        fileMenuOption.add(exitOption);

        // Configure the Edit Menu
        // Edit menu
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
        // Draw menu
        DrawMenu drawMenu = new DrawMenu();
        PlaceOption placeOption = new PlaceOption();
        placeOption.addActionListener(this::PlaceActionPerformed);
        drawMenu.add(placeOption);
        ImmediateTransitionOption immediateTransitionOption = new ImmediateTransitionOption();
        immediateTransitionOption.addActionListener(this::ImmediateTransitionActionPerformed);
        drawMenu.add(immediateTransitionOption);
        TimedTransitionOption timedTransitionOption = new TimedTransitionOption();
        timedTransitionOption.addActionListener(this::TimedTransitionActionPerformed);
        drawMenu.add(timedTransitionOption);
        ArcOption arcOption = new ArcOption();
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
        aboutCreatorOption = new AboutCreatorOption();
        aboutCreatorOption.addActionListener(this::AboutCreatorActionPerformed);
        goToMenu.add(aboutCreatorOption);
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
        toolBar.add(new VerticalSeparator());
        openSimulationButton = new OpenSimulationButton();
        openSimulationButton.addActionListener(this::OpenSimulationActionPerformed);
        toolBar.add(openSimulationButton);
        toolBar.add(new VerticalSeparator());
        saveButton = new SaveButton();
        saveButton.addActionListener(this::SaveActionPerformed);
        toolBar.add(saveButton);
        pngButton = new PngButton();
        pngButton.addActionListener(this::PngActionPerformed);
        toolBar.add(pngButton);
        jpegButton = new JpegButton();
        jpegButton.addActionListener(this::JpegActionPerformed);
        toolBar.add(jpegButton);
        toolBar.add(new VerticalSeparator());
        printButton = new PrintButton();
        printButton.addActionListener(this::PrintActionPerformed);
        toolBar.add(printButton);
        toolBar.add(new VerticalSeparator());

        // Second section (Edit menu)
        undoButton = new UndoButton();
        undoButton.addActionListener(this::UndoActionPerformed);
        toolBar.add(undoButton);
        redoButton = new RedoButton();
        redoButton.addActionListener(this::RedoActionPerformed);
        toolBar.add(redoButton);
        toolBar.add(new VerticalSeparator());
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
        toolBar.add(new VerticalSeparator());
        selectButton = new SelectButton();
        selectButton.addActionListener(this::SelectActionPerformed);
        toolBar.add(selectButton);
        selectAllButton = new SelectAllButton();
        selectAllButton.addActionListener(this::SelectAllActionPerformed);
        toolBar.add(selectAllButton);
        toolBar.add(new VerticalSeparator());

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
        toolBar.add(new VerticalSeparator());
        addTokenButton = new AddTokenButton();
        addTokenButton.addActionListener(this::AddTokenActionPerformed);
        toolBar.add(addTokenButton);
        deleteTokenButton = new DeleteTokenButton();
        deleteTokenButton.addActionListener(this::DeleteTokenActionPerformed);
        toolBar.add(deleteTokenButton);
        toolBar.add(new VerticalSeparator());

        // Fifth section (Simulate)
        animateModeButton = new AnimateModeButton();
        animateModeButton.addActionListener(this::AnimateModeActionPerformed);
        toolBar.add(animateModeButton);
        editModeButton = new EditModeButton();
        editModeButton.addActionListener(this::EditModeActionPerformed);
        toolBar.add(editModeButton);
        toolBar.add(new VerticalSeparator());
        backwardButton = new BackwardButton();
        backwardButton.addActionListener(this::BackwardActionPerformed);
        toolBar.add(backwardButton);
        forwardButton = new ForwardButton();
        forwardButton.addActionListener(this::ForwardActionPerformed);
        toolBar.add(forwardButton);
        animateButton = new AnimateButton();
        animateButton.addActionListener(this::AnimateActionPerformed);
        toolBar.add(animateButton);
        toolBar.add(new VerticalSeparator());

        // Sixth section (About)
        homepageButton = new HomepageButton();
        homepageButton.addActionListener(this::GetStartedActionPerformed);
        toolBar.add(homepageButton);
    }

    // Action listeners for File menu
    public void NewWindowActionPerformed(ActionEvent evt) {
        mainFrame = new MainFrame();
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }            // DONE

    public void OpenSimulationActionPerformed(ActionEvent evt) {
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showOpenDialog(getParent());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " + fileChooser.getSelectedFile().getName());
        }
    }       // TODO

    public void SaveActionPerformed(ActionEvent evt) {
        fileChooser = new JFileChooser();
        int userSelection = fileChooser.showSaveDialog(mainFrame);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
        }
    }                 // TODO

    public void PngActionPerformed(ActionEvent evt) {
        image = new BufferedImage(this.getContentPane().getWidth(), this.getContentPane().getHeight(), BufferedImage.TYPE_INT_RGB);
        graphics2D = image.createGraphics();
        this.getContentPane().paint(graphics2D);
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
    }                  // DONE

    public void JpegActionPerformed(ActionEvent evt) {
        image = new BufferedImage(this.getContentPane().getWidth(), this.getContentPane().getHeight(), BufferedImage.TYPE_INT_RGB);
        graphics2D = image.createGraphics();
        this.getContentPane().paint(graphics2D);
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
    }                 // DONE

    public void PrintActionPerformed(ActionEvent evt) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Print Simulation");
        printerJob.setPrintable((graphics, pageFormat, pageIndex) -> {
            if (pageIndex > 0) {
                return Printable.NO_SUCH_PAGE;
            }
            graphics2D = (Graphics2D) graphics;
            graphics2D.translate(pageFormat.getImageableX() * 2, pageFormat.getImageableY() * 2);
            graphics2D.scale(0.5, 0.5);
            this.getContentPane().paint(graphics2D);
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
    }                // DONE

    public void RestartActionPerformed(ActionEvent evt) {
        Object[] options = {"Yes", "No"};
        setJOptionPane();
        int option = JOptionPane.showOptionDialog(this, "Restart VOS Desktop App? \n You might have unsaved changes...", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION) {
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.pack();
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setVisible(true);
            this.dispose();
        }
    }              // DONE

    public void CloseActionPerformed(ActionEvent evt) {
        Object[] options = {"Yes", "No"};
        setJOptionPane();
        int option = JOptionPane.showOptionDialog(this, "Close this window? \n You might have unsaved changes...", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }                // DONE

    public void ExitActionPerformed(ActionEvent evt) {
        Object[] options = {"Yes", "Cancel"};
        setJOptionPane();
        int option = JOptionPane.showOptionDialog(new MainFrame(), "Exit VOS Desktop App? \n You might have unsaved changes...", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }                 // DONE

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
    }               // TODO

    public void SelectAllActionPerformed(ActionEvent evt) {
    }            // TODO

    // Action listeners for Draw menu
    public void PlaceActionPerformed(ActionEvent evt) {
        placeCount++;
        String name = "P" + placeCount;
        Place place = new Place(name, baseFont, 60, 60);
        mainPanel.addPlace(place);
    }

    public void ImmediateTransitionActionPerformed(ActionEvent evt) {
        immediateTransitionCount++;
        String name = "it" + immediateTransitionCount;
        ImmediateTransition immediateTransition = new ImmediateTransition(name, baseFont, 30, 30);
        mainPanel.addImmediateTransition(immediateTransition);
    }

    public void TimedTransitionActionPerformed(ActionEvent evt) {
        timedTransitionCount++;
        String name = "tt" + timedTransitionCount;
        TimedTransition timedTransition = new TimedTransition(name, baseFont, 60, 60);
        mainPanel.addTimedTransition(timedTransition);
    }

    public void ArcActionPerformed(ActionEvent evt) {

    }

    public void InhibitorArcActionPerformed(ActionEvent evt) {
    }         // TODO

    public void AnnotationActionPerformed(ActionEvent evt) {
        annotation = new Annotation("Annotation...");
        mainPanel.add(annotation);
        mainPanel.setVisible(true);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public void AddTokenActionPerformed(ActionEvent evt) {
    }             // TODO

    public void DeleteTokenActionPerformed(ActionEvent evt) {
    }          // TODO

    // Action listeners for Simulate menu
    public void AnimateModeActionPerformed(ActionEvent evt) {
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
    }

    public void EditModeActionPerformed(ActionEvent evt) {
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
    }

    public void BackwardActionPerformed(ActionEvent evt) {
    }             // TODO

    public void ForwardActionPerformed(ActionEvent evt) {
    }              // TODO

    public void AnimateActionPerformed(ActionEvent evt) {
    }              // TODO

    // Action listeners for About menu
    public void GetStartedActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/index.html"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void DocumentationActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/documentation.html"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void AboutSystemsActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-systems.html"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void AboutPnActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-petrinets.html"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void AboutOetpnActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-oetpns.html"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void AboutVosActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-vos.html"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void AboutCreatorActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-creator.html"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void GithubActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/draguleee"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void LinkedinActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public void EmailActionPerformed(ActionEvent evt) {
        try {
            String message = "mailto:aandreid14@gmail.com";
            URI uri = URI.create(message);
            Desktop.getDesktop().mail(uri);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Function to set up the JOptionPane
    private void setJOptionPane() {
        UIManager.put("OptionPane.background", new ColorUIResource(51, 51, 51));
        UIManager.put("Panel.background", new ColorUIResource(51, 51, 51));
        UIManager.put("OptionPane.messageForeground", Color.white);
        UIManager.put("Button.background", Color.darkGray);
        UIManager.put("Button.foreground", Color.white);
    }

}
