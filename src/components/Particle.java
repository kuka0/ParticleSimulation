package components;

import java.awt.*;

public class Particle {
    double x, y;
    int w, h;
    double xVector, yVector;

    public Particle(double x, double y, double xVector, double yVector) {
        this.x = x;
        this.y = y;
        this.xVector = xVector;
        this.yVector = yVector;

        w = Variables.random.nextInt(5, 10);
        h = w;
    }

    /**
     * update
     * -----------------------------------------------------------------------------------------------------------------
     * Updates the x- and y- Particle location, by adding the directional Vector (xVector ,yVector) to it.
     * Changes the directional Vector based on x- and y- Location:
     * -if the Particle is close to a window edge
     * -----------------------------------------------------------------------------------------------------------------
     * Change directional Vector based on Cursor Location. Particles should be attracted toward cursor.
     */

    public void update() {

        double xVectorCopy = this.xVector;
        double yVectorCopy = this.yVector;

        if (Variables.mouseEntered) {

            double xVectorLong = Variables.xMouse - this.x;
            double yVectorLong = Variables.yMouse - this.y;
            double calcValue = Math.pow(xVectorLong, 2) * Math.pow(yVectorLong, 2);
            double vectorLength = Math.sqrt(calcValue);

            xVector = (xVectorLong / vectorLength) * 5;
            yVector = (yVectorLong / vectorLength) * 5;
        } else {
            xVector = xVectorCopy;
            yVector = yVectorCopy;
        }

        this.x += xVector;
        this.y += yVector;

        if ((x + w) > Variables.VIEW_WIDTH || x < 5) {
            xVector *= -1;
        }

        if ((y + h) > Variables.VIEW_HEIGHT || y < 5) {
            yVector *= -1;
        }

    }

    /**
     * draw
     * -----------------------------------------------------------------------------------------------------------------
     * Fills Particle Rectangles based on Location and Size.
     *
     * @param g Graphics object used to draw on JPanel
     *          -----------------------------------------------------------------------------------------------------------------
     */
    public void draw(Graphics g) {
        g.fillRect((int) x,(int) y, w, h);
    }

    /**
     * spawn
     * -----------------------------------------------------------------------------------------------------------------
     * Spawns a single Particle with assigned Location and Direction values.
     *
     * @param x       x- Location Coordinate
     * @param y       y- Location Coordinate
     * @param xVector x- Component of Directional Vector
     * @param yVector y- Component of Directional Vector
     *                -----------------------------------------------------------------------------------------------------------------
     */
    public static void spawn(double x, double y, double xVector, double yVector) {
        Variables.particles.add(new Particle(x, y, xVector, yVector));
    }
}
