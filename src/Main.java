import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to a tip calculator");

        //getting info
        System.out.print("Enter amount of people: ");
        int people = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the tip percentage without the percent sign: ");
        double percentage = scan.nextDouble()/100;
        while (percentage < 0) {
            System.out.println("A tip percentage can not be negative.");
            System.out.print("Enter the tip percentage without the percent sign: ");
            percentage = scan.nextDouble()/100;
            scan.nextLine();
            }

        double money = 0;
        double adding = 0;
        while (adding != -1) {
            money +=adding;
            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            adding = scan.nextDouble();
        }


        //printing
        System.out.println("------------------------------------");
        System.out.println("Total bill before tip: $" + money);



        }

    }
