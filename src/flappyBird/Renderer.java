package flappyBird;

import javax.swing.JPanel;
import java.awt.*;

public class Renderer extends JPanel {

    private static final long servialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        flappyBird.flappyBird.repaint(g);
    }
}
