package com.vosdesktop.components.toolframe.menubar.options.draw;

import com.vosdesktop.components.toolframe.editor.MainPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class PlaceOption {

    public PlaceOption() {

    }

    private final MainPanel mainPanel = new MainPanel();

    private JMenuItem placeOption() {
        JMenuItem place = new JMenuItem("Place");
        place.setAccelerator(javax.swing.KeyStroke.getKeyStroke(KeyEvent.VK_P, 0));
        place.setIcon(new javax.swing.ImageIcon("C:\\vos-app\\vos-desktop\\src\\main\\java\\com\\vosdesktop\\icons\\place.png"));
        place.setToolTipText("Insert a place");
        place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int[] placeValues = generateRandomValues(35, 35, 35, 35);
                int x = placeValues[0];
                int y = placeValues[1];
                int width = placeValues[2];
                int height = width;
                Place place = new Place(x, y, width, height);
                mainPanel.addPlace(place);
            }

        });
        return place;
    }

    private int[] generateRandomValues(int maxX, int maxY, int minSize, int maxSize) {
        Random random = new Random();
        int[] values = new int[3];
        values[0] = random.nextInt(maxX);
        values[1] = random.nextInt(maxY);
        values[2] = Math.min(random.nextInt(maxSize) + minSize, maxSize);
        return values;
    }

    class Place {

        int x, y, width, height;

        public Place(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public void draw(Graphics g) {
            g.drawOval(x, y, width, height);
        }
    }
}
