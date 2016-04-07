import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by h3dg3wytch on 4/7/16.
 */
public class SpiritBoard extends JPanel implements ActionListener {

    private Timer timer;
    private Sprite spirit;
    private final int DELAY = 10;

    public SpiritBoard(){
        initUI();
    }

    private void initUI() {

        addKeyListener(new SpiritAdapter());
        setFocusable(true);
        setBackground(Color.black);

        spirit = new Spirit();

        ImageIcon ii = new ImageIcon();

        timer = new Timer(DELAY, this);
        timer.start();


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(spirit.getImage(), spirit.getX(), spirit.getY(),this );

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        spirit.move();
        repaint();

    }


    private class SpiritAdapter implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            //CGO AWAAAY
        }

        @Override
        public void keyPressed(KeyEvent e) {

            spirit.keyPressed(e);

        }

        @Override
        public void keyReleased(KeyEvent e) {

            spirit.keyReleased(e);

        }
    }
}
