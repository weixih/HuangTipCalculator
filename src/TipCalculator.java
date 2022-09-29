import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to a tip calculator");

        //getting info
        System.out.print("Enter amount of people: ");
        int people = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the tip percentage without the percent sign: ");
        int percentage = scan.nextInt();
        scan.nextLine();

        //no negative tip percentage
        while (percentage < 0) {
            System.out.println("A tip percentage can not be negative.");
            System.out.print("Enter the tip percentage without the percent sign: ");
            percentage = scan.nextInt();
            scan.nextLine();
            }

        //adding the costs
        double money = 0;
        double adding = 0;
        while (adding != -1) {
            money +=adding;
            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            adding = scan.nextDouble();
            if((adding <0) && (adding != -1)) {
                adding = 0;
                System.out.println("The costs can not be negative.");
                System.out.print("Enter a cost in dollars and cents (-1 to end): ");
                adding = scan.nextDouble();
            }
            scan.nextLine();
        }

        //math
        double tip = (percentage/100.0)*money;
        double totalBill = tip+money;
        double costPerPerson = money/people;
        double tipPerPerson = tip/people;
        double totalCostPerPerson = totalBill/people;


        //print
        System.out.println("------------------------------------");
        System.out.println("Total bill before tip: $" + formatter.format(money));
        System.out.println("Tip percentage: "+ percentage+"%");
        System.out.println("Total tip: $" + formatter.format (tip));
        System.out.println("Total bill with tip: $"+formatter.format(totalBill));
        System.out.println("Per person cost before tip: $"+formatter.format(costPerPerson));
        System.out.println("Tip per person: $"+formatter.format(tipPerPerson));
        System.out.println("Total cost per person: $"+formatter.format(totalCostPerPerson));

        }

    }
