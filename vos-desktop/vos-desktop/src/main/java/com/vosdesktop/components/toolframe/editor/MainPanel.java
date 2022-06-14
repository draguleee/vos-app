package com.vosdesktop.components.toolframe.editor;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private static final int MAX_COLS = 10000;
    private static final int MAX_ROWS = 10000;

    private static final int oX = 0;
    private static final int oY = 0;
    private static final int cellSide = 35;

    public MainPanel() {
        setBackground(new java.awt.Color(220, 220, 220));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i=0 ; i<MAX_ROWS+1; i++) {
            g.drawLine(oX, oY + i * cellSide, oX + MAX_COLS * cellSide, oY + i * cellSide);
        }
        for(int i=0 ; i<MAX_COLS+1 ; i++) {
            g.drawLine(oX + i * cellSide, oY, oX + i * cellSide, oY + MAX_ROWS * cellSide);
        }
    }

}
