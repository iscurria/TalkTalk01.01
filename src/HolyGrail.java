import java.util.Objects;
import java.util.Scanner;


/**
 * Simple I/O project using Scanner.
 * @version 9.23.22
 * @author 24scurria
 */

public class HolyGrail {
    /**
     * Main method of class HolyGrail
     * @param args command line arguments, if needed.
     */
    public static void main(String[] args) {
        // declaring local variables
        String name, quest, color;
        Scanner in = new Scanner(System.in);

        System.out.println("* A chat with the bridge keeper *\n" +
                "Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");

        // getting user input
        System.out.print("What is your name? ");
        name = in.nextLine();
        if (Objects.equals(name, "julian cochran")) {
            System.out.println("Please give me an A+, I taught everyone how to make this Easter Egg");
        }
        System.out.print("What is your quest? ");
        quest = in.nextLine();
        System.out.print("What is your favorite color? ");
        color = in.nextLine();

        //summary of user input
        System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"");
        System.out.println("Your name is: " + name);
        System.out.println("Your quest is: " + quest);
        System.out.println("Your favorite color is: " + color);
        System.out.println("* end of program *");


    }
}
