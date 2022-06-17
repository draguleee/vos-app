package vosdesktop;

import com.formdev.flatlaf.FlatDarkLaf;
import vosdesktop.frames.Login;

import javax.swing.*;

public class Vos {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatDarkLaf());
            }
            catch (UnsupportedLookAndFeelException ex) {
                System.out.println(" ");
            }
            Login.setDefaultLookAndFeelDecorated(true);
            new Login();
        });
    }
}
