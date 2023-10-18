import java.awt.Dimension;
import javax.swing.*;

public class Main {
    public static void main(String[] args) 
    {
        JFrame Menu = new JFrame("Gioco del threes");
        Menu.setSize(300, 300);
        Menu.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Menu.setVisible(true);

        JButton Bottone1 = new JButton("1");
        Bottone1.setMaximumSize(new Dimension(10, 10));
        Menu.add(Bottone1);
        

        JButton Bottone2 = new JButton("2");
        Bottone2.setMaximumSize(new Dimension(10, 10));
        Menu.add(Bottone2);

        // Visualizza il frame
        Menu.setVisible(true);




    }
}