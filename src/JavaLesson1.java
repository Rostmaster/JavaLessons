import java.util.Scanner;

public class JavaLesson1 {

    static Scanner in = new Scanner(System.in);

    public static int getLines() {
        System.out.print("Enter the number of lines: ");
        int lines = in.nextInt();
        if (lines % 2 == 0) {
            lines = lines - 1;
            System.out.println("Number of lines must be odd! it will be " + lines + " now!");
            System.out.println();
        }
        return lines;
    }

    public static void drawMessageLine(String message, int wallThickness, int spacer) {
        for (int j = 0; j < wallThickness + spacer; j++) {
            System.out.print("*");
        }
        System.out.print(" " + message + " ");

        for (int j = 0; j < wallThickness; j++) {
            System.out.print("*");
        }
    }

    public static int spacerChecker(int line) {
        if (line + 1 >= 1000) return -3;
        if (line + 1 >= 100) return -2;
        if (line + 1 >= 10) return -1;
        return 0;
    }

    public static void drawMessageBox(String message, int lines) {
        int spacer;
        int wallThickness = (int) (lines * 1.4); //"wall" around the message
        int lineWidth = message.length() + (wallThickness * 2) + 2; //width of the blank line

        for (int i = 0; i < lines; i++) { //for each line
            spacer = spacerChecker(i);

            System.out.print(i + 1 + "  ");

            if (i == lines / 2) {// if  middle line draw message
                drawMessageLine(message, wallThickness, spacer);
            } else {
                for (int j = 0; j < lineWidth + spacer; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void run() {
        String message = "HELLO THIS IS A FIRST TASK DONE";

        int lines;

        String continueLoop = "y";

        while (continueLoop.equals("y")) {

            lines = getLines();// number of lines to draw

            drawMessageBox(message, lines);

            System.out.println();
            System.out.println("Want to continue? (y/n)");
            continueLoop = in.next().trim().toLowerCase();
        }
    }
}
