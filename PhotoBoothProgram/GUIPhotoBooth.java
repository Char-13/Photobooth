package PhotoBoothProgram;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUIPhotoBooth extends JFrame implements ActionListener {

    /** JMenu bar that creates the possible menus in the program. **/
    private JMenuBar menus;

    /**The menu at the top right of the program that allows the user to interact with the program. **/
    private JMenu fileMenu;

    /**
     All the menu options available to the user when they run the program
     **/
    private JMenuItem EditorMode;
    private JMenuItem SavedGallery;
    private JMenuItem exitItem;



    private JPanel panel;
    //private JPanel panel2;


    /** GUIPhotoBooth constructor that creates a GUI for the program. **/
    public GUIPhotoBooth(){

        /**creates the menu and menu items. **/
        menus = new JMenuBar();
        fileMenu = new JMenu("File");
        exitItem = new JMenuItem("Exit");
        EditorMode = new JMenuItem("Editor Mode");
        SavedGallery= new JMenuItem("Open Photo");

        /**adds the menu items to the gui **/
        fileMenu.add(EditorMode);
        fileMenu.add(SavedGallery);
        fileMenu.add(exitItem);

        //adds the fileMenu to the gui
        menus.add(fileMenu);

        //creates action listeners for the file menu items.
        fileMenu.addActionListener(this);
        exitItem.addActionListener(this);
        EditorMode.addActionListener(this);
        SavedGallery.addActionListener(this);

        //sets menus variable to a JMenuBar
        setJMenuBar(menus);
        //closes JFrame on system exit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creates new panel variable.
        panel = new JPanel();
        //adds the panel variable and centers it in the middle of the gui.
        add(panel, BorderLayout.CENTER);

    }

    //action performed method that applies logic to all click events in the gui.
    public void actionPerformed(ActionEvent e){

        //Object comp = e.getSource();

//        if (e.getSource() == EditorMode){
//           // editorScreen gui = new editorScreen();
//
//        }
        // similar logic to the editor screen right as we are testing this feature and awaiting for camera
        // implementation.
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
               // newPhoto.setDisplay(2);
                //new editorScreen(lastImage);
                panel.add(label);
            }
        }
        
        //exits the program when the user hits exit on the file menu.
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
