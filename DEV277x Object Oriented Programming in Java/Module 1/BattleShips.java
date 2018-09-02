import java.util.Scanner;

public class BattleShips {

    public static void main(String[] args) {
        // Step 1 – Create the ocean map
        String[][] map = new String[10][10];
        initMap(map);
        printMap(map);


    }

    public static void initMap(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = " ";
            }
        }
    }


    public static void printMap(String[][] map) {

        System.out.println("   0123456789   ");
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println("| " + i);
        }
        System.out.println("   0123456789   ");


    }


}
