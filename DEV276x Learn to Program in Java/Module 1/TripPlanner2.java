import java.util.Scanner;
public class TripPlanner2 {

    public static void main(String[] args) {

        intro();

        budget();

        time();

        distance();

    }

    public static void intro(){
        Scanner input = new Scanner(System.in);
        //takes users' names and destinations

        System.out.println("Welcome to Vacation Planner");
        System.out.print("What is your name ?");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you traveling to? ");
        String destination = input.nextLine();
        System.out.println("Great! " + destination + " sounds like a great trip");
        closingSection();
    }

    public static void budget(){
        Scanner input = new Scanner(System.in);
        //takes in days planned on trip, allowance, and converting info

        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int budget_usd = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency_sym = input.next();
        System.out.print("How many " + currency_sym + " are there in 1 USD? ");
        double fx = input.nextDouble();
        System.out.println();

        System.out.println("If you are travelling for " + days + " days that is the same as " + days*24 + " hours or " + days*24*60 + " minutes");
        System.out.println("If you are going spend $" + budget_usd + " USD that means per day you can spend up to $" + (int)( (double)budget_usd/days * 100 )/100.0 + " USD");
        double budget_loc = budget_usd * fx;
        System.out.println("Your total budget in " + currency_sym + " is " + budget_loc + " " + currency_sym +", which per day is " + (int)( budget_loc/days * 100 )/100.0 + " " + currency_sym);
        closingSection();

    }

    public static void time(){
        Scanner input = new Scanner(System.in);
        //takes in the time difference between home and destination

        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int time_diff = input.nextInt();
        System.out.print("That means that when it is midnight at home it will be " + time_diff + ":00 in your travel destination");
        System.out.println("and when it is noon at home it will be " + (12+time_diff) % 24 + ":00");
        closingSection();

    }

    public static void distance(){
        Scanner input = new Scanner(System.in);
        //takes in distance between home and destination in sq km and converts it into sq miles.
        //km * 0.62137 = mile

        System.out.print("What is the square area of your destination country in km2? ");
        int area_km = input.nextInt();
        System.out.println("In mile2 that is " + (int)(area_km * Math.pow(0.62137, 2) * 10)/10.0 );
        closingSection();
    }

    public static void closingSection(){
        System.out.println("**********");
        System.out.println();

    }

}
