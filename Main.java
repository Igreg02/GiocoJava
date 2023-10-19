import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {

    private JFrame frame;
    private JLabel label;
    private JButton button1;
    private JButton button2;

    public Main() {
        frame = new JFrame("Gioco del trees");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Cosa vuoi fare");
        label.setFont(new Font("Arial", Font.PLAIN, 24));

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

        // Posiziona i bottoni negli angoli della finestra, senza toccarli
        button1.setBounds(0, frame.getHeight() - 50, 100, 50);
        button2.setBounds(frame.getWidth() - 100, 0, 50, 100);

        frame.add(label, BorderLayout.CENTER);
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}