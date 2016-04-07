import javax.swing.*;

/**
 * Created by h3dg3wytch on 4/7/16.
 */
public abstract class Example extends JFrame {

    public void initFrame(String title, JPanel board, int width, int height){

        add(board);
        setSize(width, height);
        setResizable(false);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
