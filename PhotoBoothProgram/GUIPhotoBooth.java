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
    private JMenuItem openPhoto;
    private JMenuItem savePhoto;
    private JMenuItem EditorMode;
    private JMenuItem SavedGallery;
    private JMenuItem exitItem;
    private JMenuItem takePhoto;

    private ListPhoto newPhoto = new ListPhoto();

    //    private ListPhoto PList;
    private JPanel panel;

    public GUIPhotoBooth(){
        menus = new JMenuBar();
        fileMenu = new JMenu("File");
        actionMenu = new JMenu("Action");
        exitItem = new JMenuItem("Exit");
        openPhoto = new JMenuItem("Open Photo");
        savePhoto = new JMenuItem("Save Photo");
        EditorMode = new JMenuItem("Editor Mode");
        SavedGallery= new JMenuItem("Saved Gallery");
        takePhoto = new JMenuItem("Take Photo");


        fileMenu.add(EditorMode);
        fileMenu.add(SavedGallery);
        fileMenu.add(exitItem);
        actionMenu.add(takePhoto);
        actionMenu.add(openPhoto);
        actionMenu.add(savePhoto);

        menus.add(fileMenu);
        menus.add(actionMenu);

        fileMenu.addActionListener(this);
        actionMenu.addActionListener(this);
        takePhoto.addActionListener(this);
        openPhoto.addActionListener(this);
        savePhoto.addActionListener(this);
        exitItem.addActionListener(this);
        EditorMode.addActionListener(this);
        SavedGallery.addActionListener(this);

        setJMenuBar(menus);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        //PList = new ListPhoto();
        //jListArea = new JTable(PList);
        //scrollList = new JScrollPane();
        // JScrollPane scrollList = new JScrollPane(jListArea);
        // scrollList.setPreferredSize(new Dimension(800, 300));
        //panel.add(scrollList);

        add(panel, BorderLayout.CENTER);

        //setVisible(true);
        //setSize(1024, 768);
        // jListArea.setAutoCreateRowSorter(true);
    }


    public void actionPerformed(ActionEvent e){

        Object comp = e.getSource();

        if (e.getSource() == EditorMode){
            GUIEditor eGui = new GUIEditor();
//            newPhoto.setDisplay(2);
//            newPhoto.updateScreen();

        }

//        if (e.getSource() == SavedGallery) {
//            JFileChooser chooser = new JFileChooser();
//            int status = chooser.showSaveDialog(null);
//            if (status == JFileChooser.APPROVE_OPTION) {
//                String filename = chooser.getSelectedFile().getAbsolutePath();
//                ImageIcon image = new ImageIcon(filename);
//                Image scaledImage = image.getImage();
//                Image newImg = scaledImage.getScaledInstance(400,400, Image.SCALE_SMOOTH);
//                ImageIcon lastImage = new ImageIcon(newImg);
//                JLabel label = new JLabel(lastImage);
//                newPhoto.setDisplay(2);
//                //new editorScreen(lastImage);
//                panel.add(label);
//            }
//        }

        if (e.getSource() == takePhoto  && newPhoto.getDisplay() == 1){

        }

        if (e.getSource() == openPhoto  && newPhoto.getDisplay() == 1){

        }

        if (e.getSource() == savePhoto  && newPhoto.getDisplay() == 1){

        }

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