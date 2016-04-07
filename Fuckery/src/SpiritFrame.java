import java.awt.*;

/**
 * Created by h3dg3wytch on 4/7/16.
 */
public class SpiritFrame extends Example {

    public SpiritFrame(){
        initFrame("Spirit", new SpiritBoard(), 400, 500);
    }

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SpiritFrame frame = new SpiritFrame();
                frame.setVisible(true);
            }
        });
    }
}
