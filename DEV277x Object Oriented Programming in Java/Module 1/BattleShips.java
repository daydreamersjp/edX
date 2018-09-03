import java.util.Scanner;
import java.util.Random;

public class BattleShips {

    public static void main(String[] args) {
        // Step 1 – Create the ocean map
        String[][] map = new String[10][10];
        String[][] mapComShoot = new String[10][10]; //map to store coordinates the computer shoots

        System.out.println("**** Welcome to Battle Ships game *****");
        System.out.println();
        System.out.println("Right now, the sea is empty.");
        System.out.println();
        initMap(map);
        initMap(mapComShoot);
        printMapToPlayer(map);
        System.out.println();

        // Step 2 – Deploy player’s ships
        int playerShips = 5;
        int comShips = 5;
        deployPlayer(map, playerShips);

        // Step 3 – Deploy computer’s ships
        deployComputer(map, comShips);
        printMapToPlayer(map);
        //printFullMap(map);
        System.out.println("-------------------");
        System.out.println();

        // Step 4 – Battle
        while ((countComShips(map) > 0) && (countPlayerShips(map) > 0)) {
            System.out.println("YOUR TURN");
            playerShoots(map);
            System.out.println();
            System.out.println("COMPUTER'S TURN");
            comShoots(map, mapComShoot);
            System.out.println();
            printMapToPlayer(map);
            System.out.println();
            System.out.println("Your ships: " + countPlayerShips(map) + " | " + "Computer ships: " + countComShips(map));
            System.out.println("-------------------");
            System.out.println();
        }

        // Step 5 – Game Over
        if (countPlayerShips(map) == 0) {
            if (countComShips(map) > 0) {
                System.out.println("You lost... :(");
            } else {
                System.out.println("Both have no ship. It's tie.");
            }
        } else {
            System.out.println("Hooray! You won the battle :)");
        }

    }

    public static void initMap(String[][] map) {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[0].length; x++) {
                map[y][x] = " ";
            }
        }
    }

    public static void printFullMap(String[][] map) {

        System.out.println("   0123456789   ");
        for (int y = 0; y < map.length; y++) {
            System.out.print(y + " |");
            for (int x = 0; x < map[0].length; x++) {
                System.out.print(map[y][x]);
            }
            System.out.println("| " + y);
        }
        System.out.println("   0123456789   ");
    }

    /* MAP ENCODE
    " " " "   No action taken
    "1" "@"   player live ship
    "2"	" "   com live ship
    "3"	"x"   player ship sunk by player
    "4"	"x"   player ship sunk by com
    "5"	"!"   com ship sunk by player
    "6"	"!"   com ship sunk by com
    "8"	"-"   missed by player
    // "9"	" "   missed by com
    */
    public static void printMapToPlayer(String[][] map) {

        System.out.println("   0123456789   ");
        for (int y = 0; y < map.length; y++) {
            System.out.print(y + " |");
            for (int x = 0; x < map[0].length; x++) {
                if (map[y][x].equals(" ")) {
                    System.out.print(" ");
                } else if (map[y][x].equals("1")) {
                    System.out.print("@");
                } else if (map[y][x].equals(("2"))){
                    System.out.print(" ");
                } else if (map[y][x].equals(("3"))){
                    System.out.print("x");
                } else if (map[y][x].equals(("4"))){
                    System.out.print("x");
                } else if (map[y][x].equals(("5"))){
                    System.out.print("!");
                } else if (map[y][x].equals(("6"))){
                    System.out.print("!");
                } else if (map[y][x].equals(("8"))){
                    System.out.print("-");
                } else if (map[y][x].equals(("9"))){
                    System.out.print(" ");
                } else {
                    System.out.print("?");
                }
             }
            System.out.println("| " + y);
        }
        System.out.println("   0123456789   ");

    }


    public static void deployPlayer(String[][] map, int playerShips) {
        Scanner input = new Scanner(System.in);

        System.out.println("Deploy your ships: ");
        for (int s = 0; s < playerShips; s++) {
            System.out.print("Enter X coordinate for your #" + s + " ship: ");
            int x = input.nextInt();
            System.out.print("Enter Y coordinate for your #" + s + " ship: ");
            int y = input.nextInt();
            if ((y > map.length - 1) || (x > map[0].length - 1)) {
                System.out.println("That coordinate is out of the sea. Input again.");
                s--;
            } else if (checkExist(map, x, y) == true) {
                System.out.println("That coordinate has an existing ship. Input again.");
                s--;
            }  else {
                map[y][x] = "1";
            }
        }
    }

    public static void deployComputer(String[][] map, int comShips) {
        Random rand = new Random();

        System.out.println("Computer is deploying ships: ");
        for (int s = 0; s < comShips; s++) {
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            if ((y > map.length - 1) || (x > map[0].length - 1)) {
                s--;
            } else if (checkExist(map, x, y) == true) {
                s--;
            }  else {
                map[y][x] = "2";
                System.out.println("#" + s + " ship deployed");
            }
        }
    }

    public static boolean checkExist(String[][] map, int x, int y) {
        if (!map[y][x].equals(" ")) {
            return true;
        } else {
            return false;
        }
    }

    public static void playerShoots(String[][] map) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter X coordinate: ");
        int x = input.nextInt();
        System.out.print("Enter Y coordinate: ");
        int y = input.nextInt();
        if ((y > map.length - 1) || (x > map[0].length - 1)) {
            System.out.println("That coordinate is out of the sea. Input again.");
            playerShoots(map);
        } else if (map[y][x].equals("2")) {
            System.out.println("BOOM! Your sunk the ship!");
            map[y][x] = "5";
        } else if (map[y][x].equals("1")) {
            System.out.println("Oh no, you sunk your own ship :(");
            map[y][x] = "3";
        } else {
            System.out.println("Sorry, you missed");
            map[y][x] = "8";
        }

    }

    public static void comShoots(String[][] map, String[][] mapComShoot) {
        Random rand = new Random();

        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        if ((y > map.length - 1) || (x > map[0].length - 1)) {
            comShoots(map, mapComShoot);
        } else if (mapComShoot[y][x].equals("1")) {
            comShoots(map, mapComShoot);
        } else if (map[y][x].equals("1")) {
            System.out.println("The Computer sunk one of your ships!");
            map[y][x] = "4";
            mapComShoot[y][x] = "1";
        } else if (map[y][x].equals("2")) {
            System.out.println("The Computer sunk one of its own ships");
            map[y][x] = "6";
            mapComShoot[y][x] = "1";
        } else {
            System.out.println("The Computer missed!");
            mapComShoot[y][x] = "1";
        }

    }

    public static int countPlayerShips(String[][] map) {
        int playerShips = 0;
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[0].length; x++) {
                if (map[y][x].equals("1")) {
                    playerShips++;
                }
            }
        }
        return playerShips;
    }

    public static int countComShips(String[][] map) {
        int comShips = 0;
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[0].length; x++) {
                if (map[y][x].equals("2")) {
                    comShips++;
                }
            }
        }
        return comShips;
    }

}
