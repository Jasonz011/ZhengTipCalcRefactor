import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Welcome screen, asks user for number of people and the tip percentage
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        double tipPercent = scan.nextDouble() / 100;
        scan.nextLine();
        tipCalculator table = new tipCalculator(people, tipPercent);

        // initializing variables, getting the costs of the items from the user
        double cost = 0;
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            scan.nextLine();
            // if cost is -1, the cost and number of items won't update
            if (cost != -1) {
                table.addMeal(cost);
            }
        }

            // ending screen with calculations rounded to two decimal points
            System.out.println("----------------------------------");
            System.out.println("Total bill before tip: $" + table.getTotalBillBeforeTip());
            System.out.println("Total percentage : " + table.getTipPercentage() + "%");
            System.out.println("Total tip: $" + table.tipAmount());
            System.out.println("Total bill with tip : $" + table.totalBill());
            System.out.println("Per person cost before tip : $" + table.perPersonCostBeforeTip());
            System.out.println("Tip per person: $" + table.perPersonTipAmount());
            System.out.println("Total cost per person: $" + table.perPersonTotalCost());
            System.out.println("----------------------------------");
    }
}




