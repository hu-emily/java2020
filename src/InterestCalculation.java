//10-19-20
/*
Emily Hu
what this program is about...
first ask the user for the initial investment, number of years,
  interest rate in %, increment of investment per year(scanner)
print headings for your table method
for the number years
   method to calculate the interest(amountInvested*interestRate/100)
   amount = amount + interest + increment
   print table method
 */
import java.util.*;
public class InterestCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount of your initial investment: ");
        double initialInvestment = input.nextDouble();
        System.out.print("Please enter the amount of years you'd like to invest: ");
        int years = input.nextInt();
        System.out.print("Please enter the yearly interest rate in %: ");
        double interestRate = input.nextDouble();
        System.out.print("Please enter the amount of your yearly deposit: ");
        double yearlyDespoit = input.nextDouble();

//        double finalBalance = calculateInterest(initialInvestment,years,interestRate,yearlyDespoit);
//        System.out.printf("The final balance is %2f \n",finalBalance);

        System.out.println("Year\tBalance\t\tInterest\tNew Deposit\t\tNew Balance");
        System.out.println();

        double amount = initialInvestment;
        for(int i = 1; i <= years; i++){
            System.out.print(i+"\t\t");
            System.out.printf("%.2f",amount);
            System.out.print("\t\t");

            double amt = amount+calculateInterest(amount,interestRate);
            double balance = calculateInterest(amount,interestRate);

            System.out.printf("%.2f\t\t",balance);
            System.out.print(yearlyDespoit+"\t\t");
            System.out.print("\t");

            double finalBalance = amt;
            System.out.printf("%.2f\t",finalBalance);
            System.out.println();

            amount = finalBalance+yearlyDespoit;
        }

    }

    public static double calculateInterest(double balance, double interestRate){
        balance = balance*interestRate/100;
        return balance;
    }
}
/*
A certain bank offers 6.5% interest on savings accounts, compounded annually. Create a table that shows how much
money a person will accumulate over a period of 25 years, assuming that the person makes an initial investment of
$1000 and deposits $100 each year after the first. Your table should indicate for each year the current balance, the
interest, the new deposit, and the new balance
 */