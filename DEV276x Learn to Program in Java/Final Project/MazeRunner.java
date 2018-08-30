import java.util.Scanner;
public class MazeRunner {
  
  Maze myMap = new Maze();
  
  public static void main(String[] args) {
    intro();
    user_move();
    
  }

  public static void intro() {
    System.out.println("Welcom to Maze Runner!");
    System.out.println("Here is your current position:");
    myMap.printMap();
  }

  public static String user_move() {
    String input = new Scanner();
    System.out.print("Where would you like to move? (R, L, U, D) ");
    if (input.next() != "R" || input.next() != "L" || input.next() != "U" || input.next() != "D") {
      System.out.println("Oops, wrong input. Try again!");
      user_move();
    } else {
      return input.next();
    }
  }
  
  public static String 


}
