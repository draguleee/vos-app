package com.vosdesktop.constants;

import java.awt.*;

public class GuiConstants {

    public static final String PROPERTY_FILE_EXTENSION = ".properties";
    public static final String PROPERTY_FILE_DESC = "VOS Properties file";
    public static final int PLACE = 105;
    public static final int IMMTRANS = 106;
    public static final int TIMEDTRANS = 114;
    public static final int ADDTOKEN = 107;
    public static final int DELTOKEN = 108;
    public static final int ANNOTATION = 109;
    public static final int SELECT = 110;
    public static final int ARC = 112;
    public static final int INHIBARC = 116;
    public static final int DRAW = 115;
    public static final int RATE = 117;
    public static final int MARKING = 118;
    public static final int DRAG = 120;
    public static final int PLACE_TRANSITION_HEIGHT = 30;
    public static final Color ENABLED_TRANSITION_COLOUR = new Color(192, 0, 0);
    public static final Color ELEMENT_LINE_COLOUR = Color.BLACK;
    public static final Color ELEMENT_FILL_COLOUR = Color.WHITE;
    public static final Color SELECTION_LINE_COLOUR = new Color(0, 0, 192);
    public static final Color SELECTION_FILL_COLOUR = new Color(192, 192, 255);
    public static final int ARC_CONTROL_POINT_CONSTANT = 3;
    public static final int ARC_PATH_SELECTION_WIDTH = 6;
    public static final int ARC_PATH_PROXIMITY_WIDTH = 10;
    public static final int SELECTION_LAYER_OFFSET = 90;
    public static final int LOWEST_LAYER_OFFSET = 0;
    public static final int RESERVED_BORDER = 12;
    public static final int ANNOTATION_SIZE_OFFSET = 4;
    public static final int ANNOTATION_MIN_WIDTH = 40;
    public static final Color NOTE_DISABLED_COLOUR = Color.BLACK;
    public static final Color NOTE_EDITING_COLOUR = Color.BLACK;
    public static final Color RESIZE_POINT_DOWN_COLOUR = new Color(220, 220, 255);
    public static final String ANNOTATION_DEFAULT_FONT = "Helvetica";
    public static final int ANNOTATION_DEFAULT_FONT_SIZE = 12;
    public static final int LABEL_DEFAULT_FONT_SIZE = 10;
    public static final int NAMELABEL_OFFSET = 12;
    public static final int ZOOM_DELTA = 10;
    public static final int ZOOM_MAX = 300;
    public static final int ZOOM_MIN = 40;
    public static final Color BACKGROUND_COLOR = new Color(255, 255, 255, 200);

    private GuiConstants() {
    }
}
