import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
    
        int spessore = 50;
        int lunghezza_linee = 900 - spessore * 2;

        g.setColor(Color.black);
        g.fillRect(290, spessore, spessore,lunghezza_linee);
        g.fillRect(590, spessore, spessore,lunghezza_linee);
        g.fillRect(spessore, 290, lunghezza_linee,spessore);
        g.fillRect(spessore, 590, lunghezza_linee,spessore);
        
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(900, 900);
    }
}