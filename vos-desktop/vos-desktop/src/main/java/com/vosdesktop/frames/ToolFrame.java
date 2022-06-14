package com.vosdesktop.frames;

import com.vosdesktop.components.toolframe.HorizontalSeparator;
import com.vosdesktop.components.toolframe.editor.MainPanel;
import com.vosdesktop.components.toolframe.toolbar.ToolBar;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.ColorUIResource;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;


public class ToolFrame extends JFrame {

    private UIManager uim = new UIManager();
    private ToolFrame toolFrame;
    private LoginFrame loginFrame;
    private int count = 1;

    private Document document;
    private BufferedImage image;
    private Graphics2D graphics2D;
    private PrinterJob printerJob;

    private JScrollPane scrollPane;


    // Constructor for MainFrame class
    public ToolFrame() {
        initComponents();
        setTitle("Visual OETPN Simulator - Desktop Application");
    }

    private void initComponents() {

        // Setting the Menu Bar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Setting the Tool Bar
        toolBar = new ToolBar();

        // Setting the File Tree
        fileTree = new JScrollPane();
        tree = new JTree();
        fileTree.setViewportView(tree);

        // Setting the TabbedPane
        tabbedPane = new JTabbedPane();
        tabbedPane.setBackground(new java.awt.Color(51, 51, 51));

        // Setting the Main Panel
        mainPanel = new MainPanel();
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(mainPanel);

        // Add the first tabbed pane
        tabbedPane.addTab("OETPN 1", scrollPane);

        // Configure the File menu
        fileMenu();
        editMenu();
        viewMenu();
        drawMenu();
        simulateMenu();
        aboutMenu();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fileTree, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tabbedPane)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fileTree)
                                        .addComponent(tabbedPane))
                                .addContainerGap())
        );
        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(536, 536, 536)
                                .addContainerGap(552, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addContainerGap(433, Short.MAX_VALUE))
        );
        pack();
    }

    /**
     * fileMenu() <br>
     * Configures the File menu from the Menu Bar.
     */
    private void fileMenu() {
        file = new JMenu();
        file.setText("File");
        menuBar.add(file);

        newWindow = new JMenuItem(); newSimulation = new JMenuItem();
        openSimulation = new JMenuItem();
        save = new JMenuItem(); saveAs = new JMenuItem(); exportAs = new JMenu(); pdf = new JMenuItem(); png = new JMenuItem(); jpeg = new JMenuItem();
        print = new JMenuItem();
        restart = new JMenuItem(); close = new JMenuItem(); exit = new JMenuItem();

        file.add(newWindow); file.add(newSimulation); file.add(new HorizontalSeparator());file.add(openSimulation);
        file.add(new HorizontalSeparator());
        file.add(save); file.add(saveAs); file.add(exportAs);
        exportAs.add(pdf); exportAs.add(png); exportAs.add(jpeg);
        file.add(new HorizontalSeparator());
        file.add(print);
        file.add(new HorizontalSeparator());
        file.add(restart); file.add(close); file.add(exit);

        newWindowOption(); newSimulationOption();
        openSimulationOption();
        saveOption(); saveAsOption(); exportAsMenu();
        printOption();
        restartOption(); closeOption(); exitOption();
    }
    private void newWindowOption() {
        newWindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newWindow.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\new-window.png")); // NOI18N
        newWindow.setText("New Window");
        newWindow.setToolTipText("Creates a new window");
        newWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { NewWindowActionPerformed(evt); }
        });;
    }
    private void newSimulationOption() {
        newSimulation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newSimulation.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\new-simulation.png")); // NOI18N
        newSimulation.setText("New Simulation...");
        newSimulation.setToolTipText("Creates a new OETPN simulation");
        newSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { NewSimulationActionPerformed(evt); }
        });
    }
    private void openSimulationOption() {
        openSimulation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openSimulation.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\open-simulation.png")); // NOI18N
        openSimulation.setText("Open Simulation...");
        openSimulation.setToolTipText("Opens a saved simulation");
        openSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { OpenActionPerfomed(evt); }
        });
    }
    private void saveOption() {
        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        save.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\save.png")); // NOI18N
        save.setText("Save");
        save.setToolTipText("Saves the simulation");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { SaveActionPerformed(evt); }
        });
    }
    private void saveAsOption() {
        saveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveAs.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\save-as.png"));
        saveAs.setText("Save As...");
        saveAs.setToolTipText("Saves the simulation as a filetype");
        saveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsActionPerformed(evt);
            }
        });
    }   // TODO
    private void exportAsMenu() {
        exportAs.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\export.png")); // NOI18N
        exportAs.setText("Export as...");
        pdfOption(); pngOption(); jpegOption();
    }
    private void pdfOption() {
        pdf.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\pdf.png"));
        pdf.setText("PDF");
        pdf.setToolTipText("Exports the simulation as a PDF file");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { PdfActionPerformed(evt); }
        });
    }
    private void pngOption() {
        png.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\png.png")); // NOI18N
        png.setText("PNG");
        png.setToolTipText("Exports the simulation as a PNG file");
        png.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { PngActionPerformed(evt); }
        });
    }
    private void jpegOption() {
        jpeg.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\jpeg.png")); // NOI18N
        jpeg.setText("JPEG");
        jpeg.setToolTipText("Exports the simulation as a JPEG file");
        jpeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { JpegActionPerformed(evt); }
        });
    }
    private void printOption() {
        print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        print.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\print.png"));
        print.setText("Print...");
        print.setToolTipText("Prints the simulation");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { PrintActionPerformed(evt); }
        });
    }
    private void restartOption() {
        restart.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        restart.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\restart.png")); // NOI18N
        restart.setText("Restart VOS Desktop App");
        restart.setToolTipText("Restarts the application");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { RestartActionPerformed(evt); }
        });
    }
    private void closeOption() {
        close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        close.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\close.png"));
        close.setText("Close window");
        close.setToolTipText("Closes the current window");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
    }
    private void exitOption() {
        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exit.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\exit.png"));
        exit.setText("Exit VOS Desktop App");
        exit.setToolTipText("Exits the application");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
    }

    /**
     * editMenu() <br>
     * Configures the Edit menu from the Menu Bar.
     */
    private void editMenu() {
        edit = new JMenu();
        edit.setText("Edit");
        menuBar.add(edit);

        undo = new JMenuItem(); redo = new JMenuItem();
        cut = new JMenuItem(); copy = new JMenuItem(); paste = new JMenuItem(); delete = new JMenuItem();
        select = new JMenuItem(); selectAll = new JMenuItem();

        edit.add(undo); edit.add(redo);
        edit.add(new HorizontalSeparator());
        edit.add(cut); edit.add(copy); edit.add(paste); edit.add(delete);
        edit.add(new HorizontalSeparator());
        edit.add(select); edit.add(selectAll);

        undoOption(); redoOption();
        cutOption(); copyOption(); pasteOption(); deleteOption();
        selectOption(); selectAllOption();
    }
    private void undoOption() {
        undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        undo.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\undo.png"));
        undo.setText("Undo");
        undo.setToolTipText("Undo an operation");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // UndoActionPerformed(evt);
            }
        });
    }
    private void redoOption() {
        redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        redo.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\redo.png"));
        redo.setText("Redo");
        redo.setToolTipText("Redo an operation");
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // RedoActionPerformed(evt);
            }
        });
    }
    private void cutOption() {
        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cut.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\cut.png"));
        cut.setText("Cut");
        cut.setToolTipText("Cut an object");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // CutActionPerformed(evt);
            }
        });
    }
    private void copyOption() {
        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copy.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\copy.png"));
        copy.setText("Copy");
        copy.setToolTipText("Copy an object");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // CopyActionPerformed(evt);
            }
        });
    }
    private void pasteOption() {
        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        paste.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\paste.png"));
        paste.setText("Paste");
        paste.setToolTipText("Paste an object");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // PasteActionPerformed(evt);
            }
        });
    }
    private void deleteOption() {
        delete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        delete.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\delete.png"));
        delete.setText("Delete");
        delete.setToolTipText("Delete an object");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // DeleteActionPerformed(evt);
            }
        });
    }
    private void selectOption() {
        select.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        select.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\select.png"));
        select.setText("Select");
        select.setToolTipText("Select an object");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // SelectActionPerformed(evt);
            }
        });
    }
    private void selectAllOption() {
        selectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        selectAll.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\select-all.png"));
        selectAll.setText("Select All");
        selectAll.setToolTipText("Select all objects");
        selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // SelectAllActionPerformed(evt);
            }
        });
    }

    /**
     * viewMenu() <br>
     * Configures the View menu from the Menu Bar.
     */
    private void viewMenu() {
        view = new JMenu();
        view.setText("View");
        menuBar.add(view);

        zoomIn = new JMenuItem(); zoomOut = new JMenuItem(); zoom = new JMenu();
        grid = new JMenuItem(); drag = new JMenuItem();

        view.add(zoomIn); view.add(zoomOut); view.add(zoom);
        view.add(new HorizontalSeparator());
        view.add(grid); view.add(drag);

        zoomInOption(); zoomOutOption(); zoomMenu();
        gridOption(); dragOption();
    }
    private void zoomInOption() {
        zoomIn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_EQUALS, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        zoomIn.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\zoom-in.png"));
        zoomIn.setText("Zoom in");
        zoomIn.setToolTipText("Zooms in the grid");
        zoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // ZoomInActionPerformed(evt);
            }
        });
    }
    private void zoomOutOption() {
        zoomOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_MINUS, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        zoomOut.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\zoom-out.png"));
        zoomOut.setText("Zoom out");
        zoomOut.setToolTipText("Zooms out the grid");
        zoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // ZoomOutActionPerformed(evt);
            }
        });
    }
    private void zoomMenu() {
        zoom.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\zoom.png")); // NOI18N
        zoom.setText("Zoom");
    }
    private void gridOption() {
        grid.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, 0));
        grid.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\grid.png"));
        grid.setText("Grid");
        grid.setToolTipText("Change grid");
        grid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GridActionPerformed(evt);
            }
        });
    }
    private void dragOption() {
        drag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, 0));
        drag.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\drag.png"));
        drag.setToolTipText("Drag screen");
        drag.setText("Drag Screen");
        drag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // DragActionPerformed(evt);
            }
        });
    }

    /**
     * drawMenu() <br>
     * Configures the Simulate menu from the Menu Bar
     */
    private void drawMenu() {
        draw = new JMenu();
        draw.setText("Draw");
        menuBar.add(draw);

        place = new JMenuItem(); immTransition = new JMenuItem(); timTransition = new JMenuItem();
        arc = new JMenuItem(); inhArc = new JMenuItem(); annotation = new JMenuItem();
        addToken = new JMenuItem(); deleteToken = new JMenuItem();
        foldAction = new JMenuItem(); unfoldAction = new JMenuItem();

        draw.add(place); draw.add(immTransition); draw.add(timTransition); draw.add(arc); draw.add(inhArc); draw.add(annotation);
        draw.add(new HorizontalSeparator());
        draw.add(addToken); draw.add(deleteToken);
        draw.add(new HorizontalSeparator());
        draw.add(foldAction); draw.add(unfoldAction);

        placeOption(); immTransitionOption(); timTransitionOption();
        arcOption(); inhArcOption(); annotationOption();
        addTokenOption(); deleteTokenOption();
        foldActionOption(); unfoldActionOption();
    }
    private void placeOption() {
        place.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_P, 0));
        place.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\place.png"));
        place.setText("Place");
        place.setToolTipText("Insert a place");
        place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // PlaceActionPerformed(evt);
            }
        });
    }
    private void immTransitionOption() {
        immTransition.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_I, 0));
        immTransition.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\immediate-transition.png"));
        immTransition.setText("Immediate transition");
        immTransition.setToolTipText("Insert an immediate transition");
        immTransition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // ImmediateTransitionActionPerformed(evt);
            }
        });
    }
    private void timTransitionOption() {
        timTransition.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_T, 0));
        timTransition.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\timed-transition.png"));
        timTransition.setText("Timed transition");
        timTransition.setToolTipText("Insert a timed transition");
        timTransition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // TimedTransitionActionPerformed(evt);
            }
        });
    }
    private void arcOption() {
        arc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_A, 0));
        arc.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\arc.png"));
        arc.setText("Arc");
        arc.setToolTipText("Insert an arc");
        arc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // ArcActionPerformed(evt);
            }
        });
    }
    private void inhArcOption() {
        inhArc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_H, 0));
        inhArc.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\inhibitor-arc.png"));
        inhArc.setText("Inhibitor arc");
        inhArc.setToolTipText("Insert an inhibitor arc");
        inhArc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // InhibitorArcActionPerformed(evt);
            }
        });
    }
    private void annotationOption() {
        annotation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_N, 0));
        annotation.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\annotation.png"));
        annotation.setText("Annotation");
        annotation.setToolTipText("Insert an annotation");
        annotation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // AnnotationActionPerformed(evt);
            }
        });
    }
    private void addTokenOption() {
        addToken.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0));
        addToken.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\add-token.png"));
        addToken.setText("Add token");
        addToken.setToolTipText("Add a token");
        addToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // AddTokenActionPerformed(evt);
            }
        });
    }
    private void deleteTokenOption() {
        deleteToken.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0));
        deleteToken.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\delete-token.png"));
        deleteToken.setText("Delete token");
        deleteToken.setToolTipText("Delete a token");
        deleteToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // DeleteTokenActionPerformed(evt);
            }
        });
    }
    private void foldActionOption() {
        foldAction.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        foldAction.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\fold.png"));
        foldAction.setText("Fold action");
        foldAction.setToolTipText("Fold action");
        foldAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // FoldActionActionPerformed(evt);
            }
        });
    }
    private void unfoldActionOption() {
        unfoldAction.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        unfoldAction.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\unfold.png"));
        unfoldAction.setText("Unfold action");
        unfoldAction.setToolTipText("Unold action");
        unfoldAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // UnfoldActionActionPerformed(evt);
            }
        });
    }

    /**
     * simulateMenu() <br>
     * Configures the Simulate menu from the Menu Bar
     */
    private void simulateMenu() {
        simulate = new JMenu();
        simulate.setText("Simulate");
        menuBar.add(simulate);

        animateMode = new JMenuItem(); editMode = new JMenuItem();
        backward = new JMenuItem(); forward = new JMenuItem();
        random = new JMenuItem(); animate = new JMenuItem();

        simulate.add(animateMode); simulate.add(editMode);
        simulate.add(new HorizontalSeparator());
        simulate.add(backward); simulate.add(forward);
        simulate.add(new HorizontalSeparator());
        simulate.add(random); simulate.add(animate);

        animateModeOption(); editModeOption();
        backwardOption(); forwardOption();
        randomOption(); animateOption();
    }
    private void animateModeOption() {
        animateMode.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        animateMode.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\animate.png"));
        animateMode.setText("Animate Mode");
        animateMode.setToolTipText("Enter animate mode");
        animateMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // AnimateModeActionPerformed(evt);
            }
        });
    }
    private void editModeOption() {
        editMode.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        editMode.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\edit.png"));
        editMode.setText("Edit Mode");
        editMode.setToolTipText("Enter edit mode");
        editMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // EditModeActionPerformed(evt);
            }
        });
    }
    private void backwardOption() {
        backward.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_4, 0));
        backward.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\backward.png"));
        backward.setText("Backward");
        backward.setToolTipText("Go back one step");
        backward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // BackwardActionPerformed(evt);
            }
        });
    }
    private void forwardOption() {
        forward.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_5, 0));
        forward.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\forward.png"));
        forward.setText("Forward");
        forward.setToolTipText("Go forth one step");
        forward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // ForwardActionPerformed(evt);
            }
        });
    }
    private void randomOption() {
        random.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, 0));
        random.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\random.png"));
        random.setText("Random");
        random.setToolTipText("Executes a random transition");
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // RandomActionPerformed(evt);
            }
        });
    }
    private void animateOption() {
        animate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, 0));
        animate.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\start-sim.png"));
        animate.setText("Animate");
        animate.setToolTipText("Start the simulation");
        animate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // AnimateActionPerformed(evt);
            }
        });
    }

    /**
     * aboutMenu() <br>
     * Configures the About menu from the Menu Bar
     */
    private void aboutMenu() {
        about = new JMenu();
        about.setText("About");
        menuBar.add(about);

        getStarted = new JMenuItem(); documentation = new JMenuItem();
        aboutSystems = new JMenuItem(); aboutPn = new JMenuItem(); aboutOetpn = new JMenuItem(); aboutVos = new JMenuItem(); aboutCreator = new JMenuItem();
        goTo = new JMenu();
        goTo.add(aboutSystems); goTo.add(aboutPn); goTo.add(aboutOetpn); goTo.add(aboutVos); goTo.add(aboutCreator);
        github = new JMenuItem(); linkedin = new JMenuItem(); email = new JMenuItem();

        about.add(getStarted); about.add(documentation);
        about.add(new HorizontalSeparator());
        about.add(goTo);
        about.add(new HorizontalSeparator());
        about.add(github); about.add(linkedin); about.add(email);

        getStartedOption(); documentationOption();
        goToMenu();
        githubOption(); linkedinOption(); emailOption();
    }
    private void getStartedOption() {
        getStarted.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        getStarted.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\home.png"));
        getStarted.setText("Get Started");
        getStarted.setToolTipText("Get Started (VOS Web)");
        getStarted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetStartedActionPerformed(evt);
            }
        });
    }
    private void documentationOption() {
        documentation.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\documentation.png"));
        documentation.setText("Documentation");
        documentation.setToolTipText("Documentation (VOS Web");
        documentation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentationActionPerformed(evt);
            }
        });
    }
    private void goToMenu() {
        goTo.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\goto.png"));
        goTo.setText("Go to...");

        aboutSystemsOption(); aboutPnOption(); aboutOetpnOption(); aboutVosOption(); aboutCreatorOption();
    }
    private void aboutSystemsOption() {
        aboutSystems.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\systems.png"));
        aboutSystems.setText("About Systems");
        aboutSystems.setToolTipText("About Systems (VOS Web");
        aboutSystems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutSystemsActionPerformed(evt);
            }
        });
    }
    private void aboutPnOption() {
        aboutPn.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\petrinets.png"));
        aboutPn.setText("About Petri Nets");
        aboutPn.setToolTipText("About Petri Nets (VOS Web");
        aboutPn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutPNActionPerformed(evt);
            }
        });
    }
    private void aboutOetpnOption() {
        aboutOetpn.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\oetpn.png"));
        aboutOetpn.setText("About OETPNs");
        aboutOetpn.setToolTipText("About OETPNs (VOS Web)");
        aboutOetpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutOETPNActionPerformed(evt);
            }
        });
    }
    private void aboutVosOption() {
        aboutVos.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\info.png"));
        aboutVos.setText("About VOS");
        aboutVos.setToolTipText("About VOS (VOS Web)");
        aboutVos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutVOSActionPerformed(evt);
            }
        });
    }
    private void aboutCreatorOption() {
        aboutCreator.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\creator.png"));
        aboutCreator.setText("About The Creator");
        aboutCreator.setToolTipText("About The Creator (VOS Web)");
        aboutCreator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutCreatorActionPerformed(evt);
            }
        });
    }
    private void githubOption() {
        github.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\github.png"));
        github.setText("Go to Github");
        github.setToolTipText("Github");
        github.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { GithubActionPerformed(evt); }
        });
    }
    private void linkedinOption() {
        linkedin.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\linkedin.png"));
        linkedin.setText("Go to Linkedin");
        linkedin.setToolTipText("Linkedin");
        linkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { LinkedinActionPerformed(evt); }
        });
    }
    private void emailOption() {
        email.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\mail.png"));
        email.setText("Send an E-mail...");
        email.setToolTipText("Email");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendEmailActionPerformed(evt);
            }
        });
    }

    // Action performed for New Window option
    private void NewWindowActionPerformed(java.awt.event.ActionEvent evt) {
        toolFrame = new ToolFrame();
        toolFrame.pack();
        toolFrame.setLocationRelativeTo(null);
        toolFrame.setVisible(true);
        toolFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    // Action performed for New Simulation option
    private void NewSimulationActionPerformed(java.awt.event.ActionEvent evt) {
        count++;
        String name = "OETPN " + count;
        tabbedPane.addTab(name, new JPanel());
    }

    // Action performed for Open option
    private void OpenActionPerfomed(java.awt.event.ActionEvent evt) {
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showOpenDialog(getParent());
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " + fileChooser.getSelectedFile().getName());
        }
    }

    // Action performed for Save option
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {
        fileChooser = new JFileChooser();
        int userSelection = fileChooser.showSaveDialog(toolFrame);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
        }
    }

    // TODO
    private void SaveAsActionPerformed(java.awt.event.ActionEvent evt) { }

    // Action performed for Export As PDF option
    private void PdfActionPerformed(java.awt.event.ActionEvent evt) {
        mainPanel = new JPanel();
        document = new Document();
        image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        String suggestedDirectory = ".";
        fileChooser = new JFileChooser(suggestedDirectory);
        String EXTENSION = ".pdf";
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
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(newfile));
                document.open();
                PdfContentByte contentByte = writer.getDirectContent();
                double width = mainPanel.getWidth() * 0.5;
                double height = mainPanel.getHeight() * 0.5;
                PdfTemplate template = contentByte.createTemplate(mainPanel.getWidth(), mainPanel.getHeight());
                graphics2D = template.createGraphics((float)width,(float)height);
                graphics2D.scale(0.5,0.5);
                mainPanel.print(graphics2D);
                graphics2D.dispose();
                contentByte.addTemplate(template, 10, 300);
                document.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Action performed for Export As PNG option
    private void PngActionPerformed(java.awt.event.ActionEvent evt) {
        image = new BufferedImage(mainPanel.getWidth(), mainPanel.getHeight(), BufferedImage.TYPE_INT_RGB);
        graphics2D = image.createGraphics();
        mainPanel.paint(graphics2D);
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
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Action performed for Export As JPEG option
    private void JpegActionPerformed(java.awt.event.ActionEvent evt) {
        image = new BufferedImage(mainPanel.getWidth(), mainPanel.getHeight(), BufferedImage.TYPE_INT_RGB);
        graphics2D = image.createGraphics();
        mainPanel.paint(graphics2D);
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
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Action performed for Print option
    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {
        printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Print Simulation");
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if(pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                graphics2D = (Graphics2D) graphics;
                graphics2D.translate(pageFormat.getImageableX() * 2, pageFormat.getImageableY() * 2);
                graphics2D.scale(0.5, 0.5);
                mainPanel.paint(graphics2D);
                return Printable.PAGE_EXISTS;
            }
        });
        boolean result = printerJob.printDialog();
        if(result) {
            try {
                printerJob.print();
            }
            catch(PrinterException e) {
                JOptionPane.showMessageDialog(mainPanel, "Print error: " + e.getMessage());
            }
        }
    }

    // Action performed for Restart option
    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {
        Object[] options = {"Yes", "No"};
        setJOptionPane();
        int option = JOptionPane.showOptionDialog(this, "Restart VOS Desktop App? \n You might have unsaved changes...", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION){
            loginFrame = new LoginFrame();
            loginFrame.pack();
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setVisible(true);
            this.dispose();
        }
    }

    // Action performed for Close option
    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {
        Object[] options = {"Yes", "No"};
        setJOptionPane();
        int option = JOptionPane.showOptionDialog(this, "Close this window? \n You might have unsaved changes...", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }

    // Action performed for Exit option
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {
        Object[] options = {"Yes", "Cancel"};
        setJOptionPane();
        int option = JOptionPane.showOptionDialog(this, "Exit VOS Desktop App? \n You might have unsaved changes...", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }


    // Action performed for Grid option
    private void GridActionPerformed(java.awt.event.ActionEvent evt) {

    }



    // Action performed for Get Started option
    private void GetStartedActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/index.html"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    // Action performed for Documentation option
    private void DocumentationActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/documentation.html"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    // Action performed for About Systems option
    private void AboutSystemsActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-systems.html"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    // Action performed for About Petri Nets option
    private void AboutPNActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-petrinets.html"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    // Action performed for About OETPNs option
    private void AboutOETPNActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-oetpns.html"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    // Action performed for About VOS option
    private void AboutVOSActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-vos.html"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    // Action performed for About Creator option
    private void AboutCreatorActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://visual-oetpn-simulator.netlify.app/pages/about-creator.html"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    // Action performed for Github option
    private void GithubActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/draguleee"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    // Action performed for Linkedin option
    private void LinkedinActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/andreea-ioana-dragu-870a121a1/"));
        }
        catch(IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    // Action performed for Email option
    private void SendEmailActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String message = "mailto:aandreid14@gmail.com";
            URI uri = URI.create(message);
            Desktop.getDesktop().mail(uri);
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }


    // Function to set up the JOptionPane
    private void setJOptionPane() {
        uim.put("OptionPane.background",new ColorUIResource(51,51,51));
        uim.put("Panel.background",new ColorUIResource(51,51,51));
        uim.put("OptionPane.messageForeground", Color.white);
        uim.put("Button.background", Color.darkGray);
        uim.put("Button.foreground", Color.white);
    }


    // Variable declaration for the main components
    private JMenuBar menuBar;
    private JToolBar toolBar;
    private JScrollPane fileTree;
    private JTree tree;
    private JTabbedPane tabbedPane;
    private JPanel mainPanel;

    // Variable declarations for the File menu
    private JMenu file;
    private JMenuItem newWindow;
    private JMenuItem newSimulation;
    private JMenuItem openSimulation;
    private JFileChooser fileChooser;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("OETPN Simulation", "xml");
    private JMenuItem save;
    private JMenuItem saveAs;
    private JMenu exportAs;
    private JMenuItem pdf;
    private JMenuItem png;
    private JMenuItem jpeg;
    private JMenuItem print;
    private JMenuItem restart;
    private JMenuItem close;
    private JMenuItem exit;

    // Variable declaration for the Edit menu
    private JMenu edit;
    private JMenuItem undo;
    private JMenuItem redo;
    private JMenuItem cut;
    private JMenuItem copy;
    private JMenuItem paste;
    private JMenuItem delete;
    private JMenuItem select;
    private JMenuItem selectAll;

    // Variable declaration for the View menu
    private JMenu view;
    private JMenuItem zoomIn;
    private JMenuItem zoomOut;
    private JMenu zoom;
    private JMenuItem grid;
    private JMenuItem drag;

    // Variable declaration for the Draw menu
    private JMenu draw;
    private JMenuItem place;
    private JMenuItem immTransition;
    private JMenuItem timTransition;
    private JMenuItem arc;
    private JMenuItem inhArc;
    private JMenuItem annotation;
    private JMenuItem addToken;
    private JMenuItem deleteToken;
    private JMenuItem foldAction;
    private JMenuItem unfoldAction;

    // Variable declaration for the Simulate menu
    private JMenu simulate;
    private JMenuItem animateMode;
    private JMenuItem editMode;
    private JMenuItem backward;
    private JMenuItem forward;
    private JMenuItem random;
    private JMenuItem animate;

    private JMenu about;
    private JMenuItem getStarted;
    private JMenuItem documentation;
    private JMenu goTo;
    private JMenuItem aboutSystems;
    private JMenuItem aboutPn;
    private JMenuItem aboutOetpn;
    private JMenuItem aboutVos;
    private JMenuItem aboutCreator;
    private JMenuItem github;
    private JMenuItem linkedin;
    private JMenuItem email;
    // End of variable declaration

}
