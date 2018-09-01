import java.util.Scanner;
public class MazeRunner_part2 {

    static Maze myMap = new Maze();

    public static void main(String[] args) {

        int moves_cnt = 0;
        intro();
        user_move(moves_cnt);

    }

    public static void intro() {
        System.out.println("Welcom to Maze Runner!");
        System.out.println("Here is your current position:");
        myMap.printMap();
    }

    public static void user_move(int moves_cnt) {
        Scanner input = new Scanner(System.in);

        System.out.print("Where would you like to move? (R, L, U, D) ");
        String move = input.next();
        if (!move.equals("R") && !move.equals("L") && !move.equals("U") && !move.equals("D")) {
            System.out.println("Oops, wrong input. Try again!");
            user_move(moves_cnt);
        } else if ( (move.equals("R") && myMap.canIMoveRight() == false) || (move.equals("L") && myMap.canIMoveLeft() == false) || (move.equals("U") && myMap.canIMoveUp() == false) || (move.equals("D") && myMap.canIMoveDown() == false) ){
            System.out.println("Sorry, you’ve hit a wall.");
            user_move(moves_cnt);
        } else if (move.equals("R")) {
            myMap.moveRight();
            moves_cnt++;
            myMap.printMap();
            movesMessage(moves_cnt);
        } else if (move.equals("L")) {
            myMap.moveLeft();
            moves_cnt++;
            myMap.printMap();
            movesMessage(moves_cnt);
        } else if (move.equals("U")) {
            myMap.moveUp();
            moves_cnt++;
            myMap.printMap();
            movesMessage(moves_cnt);
        } else {
            myMap.moveDown();
            moves_cnt++;
            myMap.printMap();
            movesMessage(moves_cnt);
        }

        if (myMap.didIWin() == true) {
            System.out.println("Congratulations, you made it out alive!");
            System.out.println("and you did it in " + moves_cnt + " moves");
        } else if (moves_cnt == 100) {
            System.out.println("Sorry, but you didn't escape in time- you lose!");
        } else {
            user_move(moves_cnt);
        }
    }

    public static void movesMessage(int moves_cnt) {
        if (moves_cnt == 50) {
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        } else if (moves_cnt == 75) {
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        } else if (moves_cnt == 90) {
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        } else if (moves_cnt == 100) {
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
        }
    }

}
