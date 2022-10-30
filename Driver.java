import java.sql.SQLOutput;
import java.util.Scanner;


public class Driver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buying price per share: ");
        //Object to capture input
        double buyingPrice = scan.nextDouble();
        //Tracking days since buying
        int day = 1;
        //Positive number to trigger the while loop
        double closingPrice = 0.1;
        while (true) {
            System.out.println("Enter the closing price for day " + day + " (any negative value to exit program: ) ");
            closingPrice = scan.nextDouble();
            //anything less than 0 will break loop
            if (closingPrice < 0.0) break;
            //Return value
            double earnings = closingPrice - buyingPrice;
            if (earnings > 0.0) {
                System.out.println("After day " + day + ", you earned " + earnings + " per share.");

            }
            //Loss value if you don't make money
            else if (earnings < 0.0) {
                System.out.println("After day " + day + ", you lost " + (-earnings) + " per share.");
            } else {
                System.out.println("After day " + day + ", you have " + "no earnings per share (broke even).");
            }
            day++;
        }
        scan.close();
    }
}
