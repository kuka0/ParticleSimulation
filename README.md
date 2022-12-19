# ParticleSimulation

Multiple Particles that bounce around

## Structure

        .
    ├── src/
    │   ├── components/
    │   │   ├── Particle
    │   │   └── Variables
    │   └── main/
    │       ├── Main
    │       ├── Panel
    │       ├── Simulation
    │       └── Window
    └── README.md

## main

* ### Main
    * Instantiates/Initializes a new Simulation Object
* ### Panel
    * creates new Paint Component using Graphics
    * spawns __n = PARTICLE_COUNT__ Particle Objects:
  ```
  if (Variables.PARTICLE_COUNT > 0) {
            Particle.spawn(
                    Variables.random.nextInt(Variables.VIEW_WIDTH),
                    Variables.random.nextInt(Variables.VIEW_HEIGHT),
                    Variables.randomDirection() * Variables.random.nextInt(1, 5),
                    Variables.randomDirection() * Variables.random.nextInt(1, 5)
            );
            Variables.PARTICLE_COUNT--;
        }
    ```
    * updates every Particle:
  ```
  for (Particle particle : Variables.particles) {
            particle.update();
            particle.draw(g);
        }
  ```

* ### Simulation
    * Simulation implements __Runnable__ to Run the Simulation Loop
    * Opens a new Thread and Loops the Simulation with constant FPS = __FPS_SET__
* ### Window
    * creates a JFrame Window and adds the JPanel Panel Object

## components

* ### Particle
  Particle Object with: <br><br>
    * Attributes:
        * x,y-Location
        * random width & height
        * x,y-Direction (1 or -1)
          <br><br>
    * Methods:
        * update():<br>
          updates x- and y- Direction based on x- and y- Location<br><br>
        * draw():<br>
          rectFills the Particle<br><br>
        * spawn():<br>
          spawns a Particle by adding a Particle Object Instance to Arraylist __particles__

* ### Variables
  Variable Library Object with:
    * __random:__ Random Object used to generate random Numbers
    * __VIEW_WIDTH, VIEW_HEIGHT:__ Window width and height
    * __FPS_SET:__ Fixed FPS amount
    * __PARTICLE_COUNT:__ Number of particles getting spawned
    * __Arraylist particles:__ Storage for all particle instances (used in Panel to update Particles)
    * __randomDirection():__ generates random Direction (-1 or 1)