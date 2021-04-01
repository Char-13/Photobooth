package Photobooth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

    public class editorScreen extends JFrame implements ActionListener{

        // JMenu bar that creates the possible menus in the program.
        private JMenuBar menus;

        //Two menus at the top right of the program that allows the user to interact with the program.
        private JMenu fileMenu;

        // All the menu options available to the user when they run the program.
        private JMenuItem openPhoto;
        private JMenuItem exitItem;

        //    private ListPhoto PList;
        private JPanel panel;

        //Editor Buttons


        public editorScreen() {
            menus = new JMenuBar();
            fileMenu = new JMenu("File");
            exitItem = new JMenuItem("Exit");
            openPhoto = new JMenuItem("Open Photo");

            fileMenu.add(openPhoto);
            fileMenu.add(exitItem);

            menus.add(fileMenu);

            fileMenu.addActionListener(this);
            openPhoto.addActionListener(this);
            exitItem.addActionListener(this);

            setJMenuBar(menus);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            panel = new JPanel();

            add(panel, BorderLayout.CENTER);

        }

        public void actionPerformed(ActionEvent e){

            if (e.getSource() == openPhoto) {
                JFileChooser chooser = new JFileChooser();
                int status = chooser.showSaveDialog(null);
                if (status == JFileChooser.APPROVE_OPTION) {
                    String filename = chooser.getSelectedFile().getAbsolutePath();
                    ImageIcon image = new ImageIcon(filename);
                    Image scaledImage = image.getImage();
                    Image newImg = scaledImage.getScaledInstance(400,400, Image.SCALE_SMOOTH);
                    ImageIcon lastImage = new ImageIcon(newImg);
                    JLabel label = new JLabel(lastImage);
                    //newPhoto.setDisplay(2);
                    //new editorScreen(lastImage);
                    panel.add(label);
                }
            }

            if (e.getSource() == exitItem){
                System.exit(0);
            }
        }

//        public static void main(String[] args){
//            GUIPhotoBooth gui = new GUIPhotoBooth();
//            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            gui.setVisible(true);
//            gui.setSize(1024, 768);
//        }

    }
