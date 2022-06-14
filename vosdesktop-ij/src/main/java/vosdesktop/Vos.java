package vosdesktop;

import com.formdev.flatlaf.FlatDarkLaf;
import vosdesktop.frames.LoginFrame;

import javax.swing.*;

public class Vos {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                }
                catch (UnsupportedLookAndFeelException ex) {
                    System.out.println(" ");
                }
                LoginFrame.setDefaultLookAndFeelDecorated(true);
                new LoginFrame();
            }
        });
    }
}
