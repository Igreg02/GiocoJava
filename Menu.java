import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Menu {



    public Menu() {
        JFrame frame;
        JLabel label;
        JButton button1;
        JButton button2;

        frame = new JFrame("Gioco del trees");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Cosa vuoi fare?");

        button1 = new JButton("Hosta partita");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Premuto bottone 1");
                
            }
        });

        button2 = new JButton("Cerca Partita");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Premuto bottone 2");
            }
        });

        frame.add(label, BorderLayout.NORTH);
        frame.add(button1, BorderLayout.EAST);
        frame.add(button2, BorderLayout.WEST);
        frame.setVisible(true);
    }






    public static void main(String[] args) {
        new Menu();
    }
}