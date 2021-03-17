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

    private int display;

    private static final int colEditScreen = 2;

    private static final int colPhotoScreen = 1;

    private static final int colGalleryScreen = 3;


    public void updateScreen(){
            switch (display) {
                case colPhotoScreen:
                    break;

                case colEditScreen:

                    break;

                case colGalleryScreen:

                    break;
            }

        }

     public void setDisplay(int x){
             this.display = x;
             updateScreen();
         }

    public int getDisplay() {return display;}

    public void saveDatabase(String filename) throws IOException {
//        try {
////            FileOutputStream fos = new FileOutputStream(filename);
////            ObjectOutputStream os = new ObjectOutputStream(fos);
////            os.writeObject(ListPhoto);
////            os.close();
////        } catch (IOException ex) {
////            JOptionPane.showMessageDialog(null, "Error in saving db");
////            throw ex;
//        }
    }
}

