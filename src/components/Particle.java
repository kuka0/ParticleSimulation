package components;

import java.awt.*;

public class Particle {
    int x, y, w, h;
    int xDir, yDir;

    public Particle(int x, int y, int xDir, int yDir) {
        this.x = x;
        this.y = y;
        this.xDir = xDir;
        this.yDir = yDir;

        w = Variables.random.nextInt(5, 10);
        h = w;
    }

    public void update() {
        this.x += xDir;
        this.y += yDir;

        if((x+w) > Variables.VIEW_WIDTH || x < 5) {
            xDir *= -1;
        }

        if((y+h) > Variables.VIEW_HEIGHT || y < 5) {
            yDir *= -1;
        }
    }

    public void draw(Graphics g) {
        g.fillRect(x, y, w, h);
    }

    public static void spawn(int x, int y, int xDir, int yDir) {
        Variables.particles.add(new Particle(x, y, xDir, yDir));
    }
}
