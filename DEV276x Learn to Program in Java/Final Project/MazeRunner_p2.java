import java.util.Scanner;
public class MazeRunner_p2 {
  
  public static void main(String[] args) {
    Maze myMap = new Maze();
    int moves = 0;
    intro();
    user_move(myMap, move);
    
  }

  public static void intro() {
    System.out.println("Welcom to Maze Runner!");
    System.out.println("Here is your current position:");
    myMap.printMap();
  }

  public static void user_move(Maze myMap, int moves) {
    String input = new Scanner();
    
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
      System.out.println("and you did it in " + moves + " moves");
    } else {
      user_move();
    }
  }
  
  public static String movesMessage(int moves) {
    if (moves == 50) {
      System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
    } else if (moves == 75) {
      System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
    } else if (moves == 90) {
      System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
    } else if (moves == 100) {
      System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
    }       
  }  

}
