package pong;

import java.awt.*;

/**
 * Created by asus pc on 10/21/2016.
 */
public class Ball {
    private static final int DIAMETER = 30; // diameter constant to the class Racquet

    int x = 0; // initial position of the ball (upper left)
    int y = 0; // initial position of the ball (upper left)
    int xa = 1; // speed which the ball is moving, x
    int ya = 1; // speed which the ball is moving, y
    private Game game;

    public Ball() {

    }

    public Ball(Game game) {
        this.game = game;
    }

    void move() throws InterruptedException {

        boolean changeDirection = true;
        if (x + xa < 0)
            xa = game.speed; // ball moves to the right
        else if (x + xa > game.getWidth() - DIAMETER) // right border
            xa = -game.speed; // ball moves to the left

        else if (y + ya > game.getHeight() - DIAMETER) { // the ball goes beyond the bottom of the window
            game.score++;
            game.gameOver();
        }
        else if (y + ya < 0) { // the ball goes beyond the top of the window
            game.score2++;
            game.gameOver();
        }
        else if (collision()){ // the ball hits the lower racquet
            ya = -game.speed; // ball bounces upward
            y = game.racquet.getTopY() - DIAMETER; // exact position where to put the ball so that it is on top of the racquet
            game.speed++; // increment the speed of the ball
        }
        else if (collision2()) { // the ball hits the upper racquet
            ya = game.speed; // ball moves down
            y = game.racquet2.getBottomY() + DIAMETER; // exact position where to put the ball so that it is at the bottom of the racquet
            game.speed2++;
        } else
            changeDirection = false;

        if (changeDirection)
            Sound.BALL.play(); // plays the ball bounce sound effect
        x = x + xa; // change the position of the ball
        y = y + ya; // change the position of the ball
    }

    private boolean collision() {
        //returns true if the rectangle occupied by the racquet intersects with the rectangle occupied by the ball
        return game.racquet.getBounds().intersects(getBounds());
    }

    private boolean collision2() {
        //returns true if the rectangle occupied by the racquet2 intersects with the rectangle occupied by the ball
        return game.racquet2.getBounds2().intersects(getBounds());
    }

    public void paint(Graphics2D g) {
        g.setColor(Color.ORANGE); // set the color of the ball
        g.fillOval(x, y, DIAMETER, DIAMETER); // draws the ball on the screen
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER); // indicates the position of the ball for the collision with the racquet
    }
}