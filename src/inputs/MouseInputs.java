package inputs;

import components.Variables;
import main.Panel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener, MouseMotionListener {

    private Panel panel;
    public MouseInputs(Panel panel) {
        this.panel = panel;
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Variables.mouseEntered();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Variables.mouseExited();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Variables.setMousePosition(e.getX(), e.getY());
    }
}
