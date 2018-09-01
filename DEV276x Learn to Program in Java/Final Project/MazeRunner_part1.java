import java.util.Scanner;
public class MazeRunner_part1 {

    static Maze myMap = new Maze();

    public static void main(String[] args) {

        intro();
        user_move();

    }

    public static void intro() {
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position:");
        myMap.printMap();
    }

    public static void user_move() {
        Scanner input = new Scanner(System.in);

        System.out.print("Where would you like to move? (R, L, U, D) ");
        String move = input.next();
        if (move != "R" && move != "L" && move != "U" && move != "D") {
            System.out.println("Oops, wrong input. Try again!");
            user_move();
        } else if ( (move == "R" && myMap.canIMoveRight() == false) || (move == "L" && myMap.canIMoveLeft() == false) || (move == "U" && myMap.canIMoveUp() == false) || (move == "D" && myMap.canIMoveDown() == false) ){
            System.out.println("Sorry, you’ve hit a wall.");
            user_move();
        } else if (move == "R") {
            myMap.moveRight();
            myMap.printMap();
        } else if (move == "L") {
            myMap.moveLeft();
            myMap.printMap();
        } else if (move == "U") {
            myMap.moveUp();
            myMap.printMap();
        } else {
            myMap.moveDown();
            myMap.printMap();
        }

        if (myMap.didIWin() == true) {
            System.out.println("Congratulations, you made it out alive!");
        } else {
            user_move();
        }
    }

}
