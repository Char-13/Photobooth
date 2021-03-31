package PhotoBoothProgram;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.io.*;
import java.lang.ref.PhantomReference;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ListPhoto {

    private int display = 1;

    private static final int colCameraScreen = 1;
    private static final int colEditScreen = 2;
    private static final int colGalleryScreen = 3;

//    public Object editorScreen() {
//        return new editorScreen();
//    }

    public void updateScreen() {
        switch (display) {
            case colCameraScreen:
                break;

            case colEditScreen:
               // editorScreen();
                break;

            case colGalleryScreen:
                break;
        }

    }

    public void setDisplay(int x) {
        this.display = x;
        updateScreen();
    }

    public int getDisplay() {
        return display;
    }
}

