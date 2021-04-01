package PhotoBoothProgram;



import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;


public class GUIPhotoBooth extends JFrame implements ActionListener {

    // JMenu bar that creates the possible menus in the program.
    private JMenuBar menus;

    //Two menus at the top right of the program that allows the user to interact with the program.
    private JMenu fileMenu;
    private JMenu actionMenu;

    // All the menu options available to the user when they run the program.
    private JButton openPhoto;
    private JButton savePhoto;
    private JButton takePhoto;
    private JMenuItem EditorMode;
    private JMenuItem SavedGallery;
    private JMenuItem exitItem;

    private JRadioButton blackNWhite;
    private JScrollBar saturation;
    private JScrollBar bloom;


    private ListPhoto newPhoto = new ListPhoto();



    //    private ListPhoto PList;
    private JPanel panel;
    private JPanel panel2;

    public GUIPhotoBooth(){
        menus = new JMenuBar();
        fileMenu = new JMenu("File");
        exitItem = new JMenuItem("Exit");
        EditorMode = new JMenuItem("Editor Mode");
        SavedGallery= new JMenuItem("Saved Gallery");
        blackNWhite = new JRadioButton("Black/White");

        saturation = new JScrollBar(Adjustable.HORIZONTAL);
        bloom = new JScrollBar(Adjustable.HORIZONTAL);

        fileMenu.add(EditorMode);
        fileMenu.add(SavedGallery);
        fileMenu.add(exitItem);

        menus.add(fileMenu);
        //menus.add(actionMenu);

        fileMenu.addActionListener(this);
        //actionMenu.addActionListener(this);
        //takePhoto.addActionListener(this);
        //openPhoto.addActionListener(this);
        //savePhoto.addActionListener(this);
//        takeVideo.addActionListener(this);
//        stopVideo.addActionListener(this);
        exitItem.addActionListener(this);
        EditorMode.addActionListener(this);
        SavedGallery.addActionListener(this);

        setJMenuBar(menus);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        add(panel, BorderLayout.CENTER);

        panel.add(blackNWhite);
        panel.add(saturation);
        panel.add(bloom);



    }


    public void actionPerformed(ActionEvent e){

        Object comp = e.getSource();

        if (e.getSource() == EditorMode){
            editorScreen gui = new editorScreen();

        }

        if (e.getSource() == SavedGallery) {
            JFileChooser chooser = new JFileChooser();
            int status = chooser.showOpenDialog(null);
            if (status == JFileChooser.APPROVE_OPTION) {
                String filename = chooser.getSelectedFile().getAbsolutePath();
                ImageIcon image = new ImageIcon(filename);
                Image scaledImage = image.getImage();
                Image newImg = scaledImage.getScaledInstance(400,400, Image.SCALE_SMOOTH);
                ImageIcon lastImage = new ImageIcon(newImg);
                JLabel label = new JLabel(lastImage);
                newPhoto.setDisplay(2);
                //new editorScreen(lastImage);
                panel.add(label);
            }
        }

//        if (e.getSource() == takeVideo && newPhoto.getDisplay() == 1){
//
//        }
//
//        if (e.getSource() == takePhoto  && newPhoto.getDisplay() == 1){
//
//        }

        if (e.getSource() == openPhoto  && newPhoto.getDisplay() == 1){

        }

        if (e.getSource() == savePhoto  && newPhoto.getDisplay() == 1){

        }

//        if (e.getSource() == takeVideo  && newPhoto.getDisplay() == 1){
//
//        }

        if (e.getSource() == exitItem){
            System.exit(0);
        }

    }


    public static void main(String[] args){
        GUIPhotoBooth gui = new GUIPhotoBooth();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(1024, 768);
    }
}
