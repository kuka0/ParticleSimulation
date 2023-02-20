package components;

import java.util.ArrayList;
import java.util.Random;

public class Variables {
    public static Random random = new Random();
    public static int VIEW_WIDTH = 400, VIEW_HEIGHT = 400;
    public static int FPS_SET = 120;
    public static int PARTICLE_COUNT = 100;
    public static ArrayList<Particle> particles = new ArrayList<>();
    public static int xMouse, yMouse;
    public static boolean mouseEntered = false;

    public static void setMousePosition(int x, int y) {
        xMouse = x;
        yMouse = y;
    }

    public static void mouseEntered() {
        mouseEntered = true;
    }

    public static void mouseExited() {
        mouseEntered = false;
    }

    /**
     * randomDirection
     * -----------------------------------------------------------------------------------------------------------------
     * Outputs a random number (Directional Array Component) [-1,1] from directions array.
     * @return int -1 or 1
     * -----------------------------------------------------------------------------------------------------------------
     */
    public static int randomDirection() {
        int[] directions = {-1, 1};
        return directions[random.nextInt(0, 1)];
    }
}
