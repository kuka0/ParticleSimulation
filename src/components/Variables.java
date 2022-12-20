package components;

import java.util.ArrayList;
import java.util.Random;

public class Variables {
    public static Random random = new Random();
    public static int VIEW_WIDTH = 400, VIEW_HEIGHT = 400;
    public static int FPS_SET = 120;
    public static int PARTICLE_COUNT =50;
    public static ArrayList<Particle> particles = new ArrayList<>();
    public static int xMouse = 200, yMouse = 200;

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
