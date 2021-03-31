package PhotoBoothProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GUIPhotoBooth extends JFrame implements ActionListener{
    // JMenu bar that creates the possible menus in the program.
    private JMenuBar menus;

    //Two menus at the top right of the program that allows the user to interact with the program.
    private JMenu fileMenu;

    // All the menu options available to the user when they run the program.
    private JMenuItem savePhoto;
    private JMenuItem EditorMode;
    private JMenuItem SavedGallery;
    private JMenuItem exitItem;
    private JButton takePhoto;

    private ListPhoto newPhoto = new ListPhoto();

    private JPanel panel;
    private JLabel image;


    public GUIPhotoBooth(){
        menus = new JMenuBar();
        fileMenu = new JMenu("File");

        exitItem = new JMenuItem("Exit");
        savePhoto = new JMenuItem("Save Photo");
        EditorMode = new JMenuItem("Editor Mode");
        SavedGallery= new JMenuItem("Open");

        takePhoto = new JButton("Take Photo");

        panel = new JPanel();

        fileMenu.add(EditorMode);
        fileMenu.add(SavedGallery);
        fileMenu.add(exitItem);

        menus.add(fileMenu);

        panel.add(takePhoto);

        fileMenu.addActionListener(this);
        savePhoto.addActionListener(this);
        exitItem.addActionListener(this);
        EditorMode.addActionListener(this);
        SavedGallery.addActionListener(this);

        takePhoto.addActionListener(this);

        setJMenuBar(menus);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
//        Object comp = e.getSource();

        if (e.getSource() == EditorMode) {
//            newPhoto.setDisplay(2);
//            newPhoto.updateScreen();
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


            if (e.getSource() == takePhoto && newPhoto.getDisplay() == 1) {

            }

            if (e.getSource() == savePhoto && newPhoto.getDisplay() == 1) {

            }

            if (e.getSource() == exitItem) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        GUIPhotoBooth GUI = new GUIPhotoBooth();
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setVisible(true);
        GUI.setSize(1000, 1000);
    }

}
