import java.util.Scanner;
public class FractionCalculator {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        intro();

        while(true) {
            System.out.println("------------------------------------------------------------");
            System.out.print("Please enter an operation (+, -, /, *, = or Q to quit): ");
            String ope = getOperation(input);
            if (ope.equals("q") || ope.equals("Q")) {
                break;
            } else {
                System.out.print("Please enter first fraction (a/b) or an integer (a): ");
                Fraction frac1 = getFraction(input);
                System.out.print("Please enter second fraction (a/b) or an integer (a): ");
                Fraction frac2 = getFraction(input);

                if (ope.equals("+")) {
                    System.out.println(frac1.toString() + " " + ope + " " + frac2.toString() + ": " + frac1.add(frac2).toString());
                } else if (ope.equals("-")) {
                    System.out.println(frac1.toString() + " " + ope + " " + frac2.toString() + ": " + frac1.subtract(frac2).toString());
                } else if (ope.equals("/")) {
                    System.out.println(frac1.toString() + " " + ope + " " + frac2.toString() + ": " + frac1.divide(frac2).toString());
                } else if (ope.equals("*")) {
                    System.out.println(frac1.toString() + " " + ope + " " + frac2.toString() + ": " + frac1.multiply(frac2).toString());
                } else if (ope.equals("=")) {
                    System.out.println(frac1.toString() + " " + ope + " " + frac2.toString() + ": " + frac1.equals(frac2));
                }
            }
        }

    }

    public static void intro() {
        System.out.println("This program is a fraction calculator.");
        System.out.println("It will add, subtract, multiply, and divide fractions until you type Q to quit.");
        System.out.println("Please enter your fraction in the form of a/b, where a and b are integers.");
    }


    public static String getOperation (Scanner input) {

        while (true) {
            String ope = input.nextLine();
            if (!ope.matches("[+\\-,/*=qQ]")) {
                System.out.print("Invalid input (+, -, /, *, = or Q to quit): ");
            } else {
                return ope;
            }
        }

    }

    public static boolean validFraction (String input) {
        if (input.indexOf("-") == 0 || input.indexOf("-") == -1) {
            if (input.indexOf("/") == -1) {
                return isNumber(input);
            } else if (input.indexOf("/") == 0 || input.indexOf("/") == input.length()-1) {
                return false;
            } else if ( isNumber(input.substring(0,input.indexOf("/"))) && isNumber(input.substring(input.indexOf("/")+1)) && Integer.parseInt(input.substring(input.indexOf("/")+1)) != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private static boolean isNumber (String input) {
        try
        {
            Integer.parseInt(input);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }


    public static Fraction getFraction(Scanner input) {
        while (true) {
            String frac = input.nextLine();
            if (validFraction(frac) == true) {
                if (frac.indexOf("/") == -1) {
                    return new Fraction(Integer.parseInt(frac));
                } else {
                    return new Fraction(Integer.parseInt(frac.substring(0,frac.indexOf("/"))),Integer.parseInt(frac.substring(frac.indexOf("/")+1)));
                }
            } else {
                System.out.print("Invalid fraction. Please enter (a/b) or (a), where a and b are integers and b is not zero: ");
            }
        }
    }




}
