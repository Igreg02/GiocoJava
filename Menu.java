import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Menu {

    public Menu() {
        JFrame framemenu;
        JLabel label;
        JButton buttoneserver;
        JButton buttoneclient;

        framemenu = new JFrame("Gioco del trees");
        framemenu.setSize(400, 400);
        framemenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Cosa vuoi fare?");

        buttoneserver = new JButton("Hosta partita");
        buttoneserver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    label.setText("Premuto bottone server");
                    Connessione.Server();
                } catch (IOException a) {
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
                    Connessione.Client();
                } catch (IOException a) {
                    System.out.println("Errore " + a);
                }
            }
        });

        framemenu.add(label, BorderLayout.NORTH);
        framemenu.add(buttoneserver, BorderLayout.EAST);
        framemenu.add(buttoneclient, BorderLayout.WEST);
        framemenu.setVisible(true);
/*
        framegioco = new JFrame("Gioco del verooooo otrres");
        framegioco.setSize(400, 400);
        framegioco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        framegioco.setVisible(true);

        // Cerchi_prova.paintComponent(framegioco.getGraphics());
        framegioco.add(new MyPanel());
        // framegioco.add(Disegno);

        framegioco.pack();
 */
    }

    public static void main(String[] args) {
        new Menu();
    }
}