import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Menu {



    public Menu() {
        JFrame frame;
        JLabel label;
        JButton buttoneserver;
        JButton buttoneclient;


        frame = new JFrame("Gioco del trees");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Cosa vuoi fare?");


        buttoneserver = new JButton("Hosta partita");
        buttoneserver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                label.setText("Premuto bottone server");
                Server.start();
                } 
                    catch (IOException a) {
                System.out.println("Errore " + a);
                    }
            }
        });


        buttoneclient = new JButton("Cerca Partita");
        buttoneclient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    label.setText("Premuto bottone client");
                    Client.start();
                    } 
                    catch (IOException a) {
                System.out.println("Errore " + a);
                    }
            }
        });


        
        frame.add(label, BorderLayout.NORTH);
        frame.add(buttoneserver, BorderLayout.EAST);
        frame.add(buttoneclient, BorderLayout.WEST);
        frame.setVisible(true);
    }






    public static void main(String[] args) {
        new Menu();
    }
}