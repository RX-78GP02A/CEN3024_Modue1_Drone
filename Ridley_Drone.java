// Name: Marcys Ridley
// Date: 5/16/2021

// Import Scanner class
import java.util.Scanner;

    // Declaration of Ridley_Drone class
    public class Ridley_Drone {

        // Declaration of Drone class with movement variables
        public static class Drone {
            // x variable handles up and down movement
            private int x;   //forward backward
            // y variable handles forward and backward movement
            private int y;   //right left
            // z variable handles right and left movement
            private int z;   //up down

            // Constructor
            public Drone() {
                x = 0;
                y = 0;
                z = 0;
            }