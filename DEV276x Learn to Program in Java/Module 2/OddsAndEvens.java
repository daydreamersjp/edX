import java.sql.SQLOutput;
import java.util.*;

public class OddsAndEvens {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Part 1 - Pick odds or evens
        System.out.println("Let’s play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String target_oe = input.next();
        System.out.println();

        if (target_oe.equals("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }

        System.out.println("--------------------");
        System.out.println();

        // Part 2 - Play the Game
        System.out.print("How many \"fingers\" do you put out? ");
        int player = input.nextInt();

        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays number " + computer + " \"fingers\".");

        System.out.println("--------------------");
        System.out.println();

        int sum = player + computer ;
        boolean oddOrEven = (sum%2 == 0);
        System.out.println(player + " + " + computer + " = " + sum);
        if (oddOrEven == true) {
            System.out.println(sum + " is ...even!");
        } else {
            System.out.println(sum + " is ...odd!");
        }

        // Part 3 - Who won?
        if ((target_oe.equals("E") && (oddOrEven == true)) | (target_oe.equals("O") && (oddOrEven != true))) {
            System.out.println("That means " + name + " wins! :)");
        } else {
            System.out.println("That means computer wins... :(");
        }

        System.out.println("--------------------");
        System.out.println();

    }



}
