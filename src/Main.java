public class Main {
    public static void main(String[] args) {
        // Initialize Turtle.java
        Turtle leo = new Turtle();
        leo.speed(0);
        Turtle.bgcolor("black");

        // Using a bold white color against the black background.
        leo.penColor("white");
        leo.width(5);

        int verticalOffset = 25;
        int horizontalHalf = 45;

        for (int half = 0; half < 2; half++) {

            leo.up();
            leo.forward(horizontalHalf);
            leo.left(90);
            leo.forward(verticalOffset);
            leo.right(90);
            leo.down();


            leo.left(180);
            leo.forward(horizontalHalf * 2);


            for (int i = 0; i < 36; i++) {
                leo.forward(3);
                leo.left(10); // 36 * 10 = 360 degrees
            }


            leo.up();
            leo.left(180); // Face the opposite direction
            leo.forward(horizontalHalf);
            leo.right(90);
            leo.forward(verticalOffset);
            leo.left(90); // Reset heading to standard alignment


            leo.left(180);
        }

        leo.up();
        leo.right(90); leo.forward(70);
        leo.right(90); leo.forward(43);
        leo.left(180);

        // C
        leo.down(); leo.forward(10); leo.backward(10); leo.left(90); leo.forward(14); leo.right(90); leo.forward(10);
        leo.up(); leo.right(90); leo.forward(14); leo.left(90); leo.forward(5);

        // A
        leo.down(); leo.left(90); leo.forward(14); leo.right(90); leo.forward(10); leo.right(90); leo.forward(14);
        leo.backward(7); leo.right(90); leo.forward(10); leo.backward(10); leo.left(90); leo.forward(7); leo.left(90);
        leo.up(); leo.forward(5);

        // N
        leo.down(); leo.left(90); leo.forward(14); leo.right(145); leo.forward(17); leo.left(145); leo.forward(14);
        leo.backward(14); leo.right(90);
        leo.up(); leo.forward(5);

        // C
        leo.down(); leo.forward(10); leo.backward(10); leo.left(90); leo.forward(14); leo.right(90); leo.forward(10);
        leo.up(); leo.right(90); leo.forward(14); leo.left(90); leo.forward(5);

        // E
        leo.down(); leo.forward(10); leo.backward(10); leo.left(90); leo.forward(7); leo.right(90); leo.forward(8);
        leo.backward(8); leo.left(90); leo.forward(7); leo.right(90); leo.forward(10);
        leo.up(); leo.right(90); leo.forward(14); leo.left(90); leo.forward(5);

        // R
        leo.down(); leo.left(90); leo.forward(14); leo.right(90); leo.forward(10); leo.right(90); leo.forward(7);
        leo.right(90); leo.forward(10); leo.backward(10); leo.left(145); leo.forward(9); leo.left(35);
        leo.up();

        // --- LINE 2: DRAW "ZODIAC" ---
        leo.backward(85); // Backtrack to the left margin alignment
        leo.right(90); leo.forward(25); leo.left(90); // Drop down 25 units for the second line

        // Z
        leo.down(); leo.left(90); leo.forward(14); leo.right(90); leo.forward(10);
        leo.right(125); leo.forward(17); leo.left(125); leo.forward(10);
        leo.up(); leo.forward(5);

        // O
        leo.down(); leo.left(90); leo.forward(14); leo.right(90); leo.forward(10);
        leo.right(90); leo.forward(14); leo.right(90); leo.forward(10);
        leo.up(); leo.right(180); leo.forward(10); leo.forward(5);

        // D
        leo.down(); leo.left(90); leo.forward(14); leo.right(90); leo.forward(10);
        leo.right(90); leo.forward(14); leo.right(90); leo.forward(10);
        leo.up(); leo.right(180); leo.forward(10); leo.forward(5);

        // I
        leo.down(); leo.forward(10); leo.backward(5); leo.left(90); leo.forward(14);
        leo.left(90); leo.forward(5); leo.backward(10);
        leo.up(); leo.forward(5); leo.left(90); leo.forward(14); leo.left(90); leo.forward(5); leo.forward(5);

        // A
        leo.down(); leo.left(90); leo.forward(14); leo.right(90); leo.forward(10); leo.right(90); leo.forward(14);
        leo.backward(7); leo.right(90); leo.forward(10); leo.backward(10); leo.left(90); leo.forward(7); leo.left(90);
        leo.up(); leo.forward(5);

        // C
        leo.down(); leo.forward(10); leo.backward(10); leo.left(90); leo.forward(14); leo.right(90); leo.forward(10);
        leo.up(); leo.right(90); leo.forward(14); leo.left(90);


        leo.up();
        leo.forward(50);
        leo.left(90);
        leo.forward(65);

        // Star 1
        leo.down();
        for (int j = 0; j < 4; j++) { leo.forward(4); leo.left(90); } // Small square star


        leo.right(40);
        leo.forward(60);

        // Star 2
        for (int j = 0; j < 4; j++) { leo.forward(4); leo.left(90); }

        leo.right(25);
        leo.forward(45);

        // Star 3
        for (int j = 0; j < 4; j++) { leo.forward(4); leo.left(90); }


        leo.left(35);
        leo.forward(70);

        // Star 4
        for (int j = 0; j < 4; j++) { leo.forward(4); leo.left(90); }

        // Backtrack to Central Node
        leo.backward(70);
        leo.right(35);


        leo.right(45);
        leo.forward(55);
        // Star 5
        for (int j = 0; j < 4; j++) { leo.forward(4); leo.left(90); }

        // Hide
        leo.hide();
    }
}