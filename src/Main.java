import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Tip Calculator:");
        System.out.print("Enter the cost of the meal: $");
        double mealAmount = s.nextDouble();
        System.out.print("Select how much you would like to tip: ");
        double tip = s.nextDouble();
        System.out.print("Select how many people are there: ");
        int numberOfPeople = s.nextInt();

        double tipPercentage = tip / 100;
        double totalTip = Math.round((mealAmount * tipPercentage) * 100.0) / 100.0;
        double tipPerPerson = Math.round((totalTip / numberOfPeople) * 100.0) / 100.0;
        double totalBill = Math.round((mealAmount + totalTip) * 100.0) / 100.0;
        double totalPerPerson = Math.round((totalBill / numberOfPeople) * 100.0) / 100.0;
        System.out.println("The total tip amount is: $" + totalTip);
        System.out.println("The individual tip amount is: $" + tipPerPerson);
        System.out.println("The total bill is: $" + totalBill);
        System.out.println("The individual total per person is: $" + totalPerPerson);
    }
}
