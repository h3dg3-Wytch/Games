import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by h3dg3wytch on 4/7/16.
 */
public abstract class Sprite {

    protected int maxX;
    protected int maxY;
    //The current X
    protected int x;
    //The current Y
    protected int y;
    //The current change in x
    protected int dx;
    //The cyrrent change in y
    protected int dy;

    protected int width;
    protected int height;

    protected boolean visible;

    protected Image image;

    //Get the image
    protected void loadImage(String imagePath){
        ImageIcon ii = new ImageIcon(imagePath);
        this.image = ii.getImage();
    }

    protected void getDimension(){
        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    protected Rectangle getBounds(){
        return new Rectangle(x, y, width, height);
    }

    protected void move(){
        x += dx;
        y += dy;
    }

    protected void keyPressed(KeyEvent event){

        switch (event.getKeyCode()){
            case KeyEvent.VK_LEFT:
                dx = -1;
                break;
            case KeyEvent.VK_RIGHT:
                dx = 1;
                break;
            case KeyEvent.VK_UP:
                dy = -1;
                break;
            case KeyEvent.VK_DOWN:
                dy = 1;
                break;
        }
    }

    protected void keyReleased(KeyEvent event){

        switch (event.getKeyCode()){
            case KeyEvent.VK_LEFT:
                dx = 0;
                break;
            case KeyEvent.VK_RIGHT:
                dx = 0;
                break;
            case KeyEvent.VK_UP:
                dy = 0;
                break;
            case KeyEvent.VK_DOWN:
                dy = 0;

                break;
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
