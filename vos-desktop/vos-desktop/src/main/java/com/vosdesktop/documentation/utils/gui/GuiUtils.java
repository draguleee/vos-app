package com.vosdesktop.documentation.utils.gui;

import javax.swing.*;
import java.awt.*;

public final class GuiUtils {

    private GuiUtils() {}

    public static void displayErrorMessage(Component parent, String message) {

        JOptionPane.showMessageDialog(parent, message, "Error", JOptionPane.YES_NO_OPTION);
    }
}
