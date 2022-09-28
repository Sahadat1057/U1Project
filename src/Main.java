import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            System.out.println("Tip Calculator:");


            System.out.print("Enter the cost of the meal: $");
            double mealAmount = s.nextDouble(); //Lines 9 and 10 ask the user to input a value for the cost of the meal
            System.out.print("Select how much you would like to tip: ");
            int tip = s.nextInt(); //Lines 11 and 12 ask the user to input a value for the amount of tip they would like to give
            System.out.print("Select how many people are there: ");
            int numberOfPeople = s.nextInt(); //Lines 13 and 14 ask the user to input a value for the amount of people that ate the meal


            double tipPercentage = tip / 100.0; //the variable tipPercentage calculates tip in a decimal form because the variable 'tip' is just a whole number
            double totalTip = Math.round((mealAmount * tipPercentage) * 100.0) / 100.0; //calculates the rounded total amount of tip everyone has to give
            double tipPerPerson = Math.round((totalTip / numberOfPeople) * 100.0) / 100.0; //calculates the rounded tip each person needs to give
            double totalBill = mealAmount + totalTip; //calculates the total bill for everyone including the total tip
            double totalPerPerson = Math.round((totalBill / numberOfPeople) * 100.0) / 100.0; //calculates the total each person needs to pay including the tip


            System.out.println("The total tip amount is: $" + totalTip); //print statement that prints total tip amount
            System.out.println("The individual tip amount is: $" + tipPerPerson); //print statement that prints the amount of tip each person needs to give
            System.out.println("The total bill is: $" + totalBill); //print statement that prints the total cost of the meal for everyone
            System.out.println("The individual total per person is: $" + totalPerPerson); //print statement that prints the total each person needs to pay for the meal
    }
}
