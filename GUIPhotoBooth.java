package PhotoBoothProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private JMenuItem takeVideo;
    private JMenuItem stopVideo;






//    private ListPhoto PList;
    private JPanel panel;

    private JTable jListArea;

    private JScrollPane scrollList;


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
        takeVideo = new JMenuItem("Take Video");
        stopVideo = new JMenuItem("Stop Video");


        fileMenu.add(EditorMode);
        fileMenu.add(SavedGallery);
        fileMenu.add(exitItem);
        actionMenu.add(takePhoto);
        actionMenu.add(openPhoto);
        actionMenu.add(savePhoto);
        actionMenu.add(takeVideo);
        actionMenu.add(stopVideo);

        menus.add(fileMenu);
        menus.add(actionMenu);

        fileMenu.addActionListener(this);
        actionMenu.addActionListener(this);
        takePhoto.addActionListener(this);
        openPhoto.addActionListener(this);
        savePhoto.addActionListener(this);
        takeVideo.addActionListener(this);
        stopVideo.addActionListener(this);
        exitItem.addActionListener(this);
        EditorMode.addActionListener(this);
        SavedGallery.addActionListener(this);

        setJMenuBar(menus);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
//        PList = new ListPhoto();
//       jListArea = new JTable(PList);
        scrollList = new JScrollPane();
        JScrollPane scrollList = new JScrollPane(jListArea);
        scrollList.setPreferredSize(new Dimension(800, 300));
        panel.add(scrollList);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
        setSize(1024, 768);
       // jListArea.setAutoCreateRowSorter(true);
    }


    public void actionPerformed(ActionEvent e){

        Object comp = e.getSource();

        if (EditorMode == e.getSource()){
           // PList.setDisplay(2);

        }

        if (SavedGallery == e.getSource()){
            //PList.setDisplay(3);

        }

        if (takeVideo == e.getSource()){

        }

        if (takePhoto == e.getSource()){

        }

        if (openPhoto == e.getSource()){

        }

        if (savePhoto == e.getSource()){

        }

        if (stopVideo == e.getSource()){

        }

        if (takeVideo == e.getSource()){

        }

    }





    public static void main(String[] args){new GUIPhotoBooth();}
}
