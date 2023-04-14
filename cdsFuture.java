import java.util.*;

public class cdsFuture {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        // prompt user for deposit amount
        System.out.print("Enter the initial deposit amount: ");

        double deposit = input.nextDouble();

        System.out.print("Enter anual percentage yield: ");

        double apy = input.nextDouble();

        System.out.print("Enter maturity period (number of months): ");

        int maturityPeriod = input.nextInt();

        // obtain monthly interest rate
        double monthlyInterestRate = deposit * (.0001 * apy);

        System.out.println("The monthly interest is : " + monthlyInterestRate);

        double cdValue;

        System.out.println("Month" + "\t" + "CD Value");
        for (int i = 1; i <= maturityPeriod; i++){

            cdValue = (deposit + deposit * apy / 1200)*(i);

            System.out.println(i + "\t" + cdValue   );

        }

    }

}
