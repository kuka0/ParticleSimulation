package main;

import components.Variables;

import javax.swing.*;

public class Window {
    public Window(Panel panel) {

        JFrame jFrame = new JFrame();

        jFrame.setSize(Variables.VIEW_WIDTH, Variables.VIEW_HEIGHT + 28);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
