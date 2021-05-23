// Name: Marcys Ridley
// Date: 5/16/2021
// Program Name: Ridley_Drone
// Purpose: Simulate using a button for the drones movement in a x,y,z location

// Import Scanner class
import java.util.Scanner;

    // Declaration of Ridley_Drone class
    public class Ridley_Drone {

        // Declaration of Drone class with movement variables
        public static class Drone {
            // x variable handles up and down movement
            private int x;   
            // y variable handles forward and backward movement
            private int y;   
            // z variable handles right and left movement
            private int z;   

            // Constructor
            public Drone() {
                x = 0;
                y = 0;
                z = 0;
            }

            // Parameterized constructor  that passes in movement data
            public Drone(int x, int y, int z) {
                this.x = x;
                this.y = y;
                this.z = z;
            }

            // movementUp method the allows the drone to move up
            public void movementUp() {
                x++;
                System.out.println("Moved up");
            }

            // movementDown method allows the drone to move down
            public void movementDown() {
                x--;
                System.out.println("Moved down"); 
            }