/* Homework1
Miguel Pereira

The program prompts the user to enter the #of months, weeks, days, hours, minutes, and seconds.
 */
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of months: ");
        int months = input.nextInt();

        int weeks = months*4;
        int days = weeks*7;
        int hours = days*24;
        int minutes = hours*60;
        int seconds = minutes*60;

        System.out.println("Weeks: "+weeks);
        System.out.println("Days: "+days);
        System.out.println("Hours: "+hours);
        System.out.println("Minutes: "+minutes);
        System.out.println("Seconds: "+seconds);



    }
}
