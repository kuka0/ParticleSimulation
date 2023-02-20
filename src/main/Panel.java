package main;

import components.Particle;
import components.Variables;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class Panel extends JPanel {
    private MouseInputs mouseInputs;

    public Panel() {
        mouseInputs = new MouseInputs(this);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (Variables.PARTICLE_COUNT > 0) {
            Particle.spawn(
                    Variables.random.nextInt(Variables.VIEW_WIDTH),
                    Variables.random.nextInt(Variables.VIEW_HEIGHT),
                    0,
                    0
            );
            Variables.PARTICLE_COUNT--;
        }

        for (Particle particle : Variables.particles) {
            particle.update();
            particle.draw(g);
        }
    }
}
