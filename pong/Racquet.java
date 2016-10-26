package pong;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by asus pc on 10/21/2016.
 */
public class Racquet {
    private static final int Y = 330; // fixed because the racquet won't move vertically, P1
    private static final int Y2 = 20; // fixed because the racquet won't move vertically, P2
    private static final int WIDTH = 60; // fixed width of the racquet
    private static final int HEIGHT = 10; // fix height of the racquet
    int x = 110; // racquet position x axis
    int xa = 0;
    int xa2 = 0;
    private Game game;

    public Racquet(Game game) {
        this.game = game;
    }

    //player 1
    public void move() {
        if (x + xa > 0 && x + xa < game.getWidth() - WIDTH) // controls the racquet doesn't go out of borders
            x = x + xa; // change the position of the racquet horizontally (left - or right +)
    }

    //player 2
    public void move2() {
        if (x + xa2 > 0 && x + xa2 < game.getWidth() - WIDTH) // controls the racquet doesn't go out of borders
            x = x + xa2; // change the position of the racquet horizontally (left - or right +)
    }

    // player 1 racquet modification
    public void paint1(Graphics2D g) {
        Graphics2D g1 = g;
        g1.setColor(Color.RED); //sets the color of the racquet
        g1.fillRect(x, Y, WIDTH, HEIGHT); // draws the racquet on the game
    }

    // player 2 racquet modification
    public void paint2(Graphics2D g) {
        g.setColor(Color.BLUE); //sets the color of the racquet
        g.fillRect(x, Y2, WIDTH, HEIGHT); // draws the racquet on the game
    }

    public void keyReleased(KeyEvent e) {
        xa = 0; // when there is no key pressed, makes the racquet stop
        xa2 = 0;
    }

    public void keyPressed(KeyEvent e) {
        // player 1
        if (e.getKeyCode() == KeyEvent.VK_LEFT) // if the key pressed if the left arrow key
            xa = -game.speed; // moves the racquet to the left
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) // if the key pressed if the right arrow key
            xa = game.speed; // moves the racquet to the right
        // player 2
        if (e.getKeyCode() == KeyEvent.VK_Z)
            xa2 = -game.speed;
        if (e.getKeyCode() == KeyEvent.VK_C)
            xa2 = game.speed;
    }

    // P1
    public Rectangle getBounds() {
        return new Rectangle(x, Y, WIDTH, HEIGHT); // indicates the position of the racquet for the collision with the ball
    }

    // P2
    public Rectangle getBounds2() {
        return new Rectangle(x, Y2, WIDTH, HEIGHT);
    }

    // P1
    public int getTopY() {
        return Y - HEIGHT;
    }

    // P2
    public int getBottomY() {
        return Y2 + HEIGHT;
    }
}