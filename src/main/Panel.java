package main;

import components.Particle;
import components.Variables;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (Variables.PARTICLE_COUNT > 0) {
            Particle.spawn(
                    Variables.random.nextInt(Variables.VIEW_WIDTH),
                    Variables.random.nextInt(Variables.VIEW_HEIGHT),
                    Variables.randomDirection() * Variables.random.nextInt(1, 5),
                    Variables.randomDirection() * Variables.random.nextInt(1, 5)
            );
            Variables.PARTICLE_COUNT--;
        }

        for (Particle particle : Variables.particles) {
            particle.update();
            particle.draw(g);
        }
    }
}
