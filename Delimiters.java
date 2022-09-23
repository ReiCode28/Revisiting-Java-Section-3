import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Enter two integers (on the same line)");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter two very big integers (on the same line)");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();
        

        System.out.println("Enter two decimals (on the same line)");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();

        System.out.println("Enter two text values (on the same line)");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();

        System.out.println("\t Integers: " + num1 + " " + num2);
        System.out.println("\t BigIntegers: " + bigNum1 + " " + bigNum2);
        System.out.println("\t Decimals: " + decimal1 + " " + decimal2);
        System.out.println("\t Words: " + text1 + " " + text2);
    }
}


/* MY NOTES  */

/*METHODS THAT SKIP THE DELIMITER
 * scan.nextInt()
 * scan.nextLong()
 * scan.nextDouble()
 * scan.next()
 */

 /* nextLine() :
  * nextLine() captures every value on the next line
  * including all the whitespace between each value
  */

 /* The nextLine() Trap:
  * If I put nextLine() ahead of nextInt(), nextDouble(), nextLong(), or next(),
  * nextLine() will be wasted by reading an empty line.
  * To avoid this, I need to add a throwaway nextLine() before the real nextLine()
  */