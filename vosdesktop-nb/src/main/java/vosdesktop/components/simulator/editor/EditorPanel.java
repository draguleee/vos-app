package vosdesktop.components.simulator.editor;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class EditorPanel extends JPanel {
    
    // Variables for the grid
    private static final int MAX_COLS = 10000;
    private static final int MAX_ROWS = 10000;
    private static final int oX = 0;
    private static final int oY = 0;
    private static final int cellSide = 15;
    
    private static Font baseFont;
    
    // Constructor for EditorPanel
    public EditorPanel() {
        setBackground(new java.awt.Color(220, 220, 220));
        baseFont = new Font("Sans Serif", Font.BOLD, 11);
        this.setFont(baseFont);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g.create();
        for(int i=0 ; i<MAX_ROWS+1; i++) {
            g2d.drawLine(oX, oY + i * cellSide, oX + MAX_COLS * cellSide, oY + i * cellSide);
        }
        for(int i=0 ; i<MAX_COLS+1 ; i++) {
            g2d.drawLine(oX + i * cellSide, oY, oX + i * cellSide, oY + MAX_ROWS * cellSide);
        }
    }
    
}
