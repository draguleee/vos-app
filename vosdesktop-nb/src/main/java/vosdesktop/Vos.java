/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vosdesktop;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vosdesktop.frames.Login;

/**
 *
 * @author aandr
 */
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
                Login.setDefaultLookAndFeelDecorated(true);
                new Login();
            }
        });
    }
}