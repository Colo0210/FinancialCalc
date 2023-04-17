import java.util.*;

     class annuityValue {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
// prompts user to establish payment variables
            System.out.print("Enter the periodic payment: ");
            double pmt = sc.nextDouble();

            System.out.print("Enter the interest rate per period (as a decimal): ");
            double rate = sc.nextDouble();

            System.out.print("Enter the number of periods: ");
            int n = sc.nextInt();
//inputs customer given variables into equation to calculate
            double presentValue = pmt * ((1 - Math.pow(1 + rate, -n)) / rate);
//presents value
            System.out.println("The present value of the ordinary annuity is: $" + presentValue);

            sc.close();
        }
    }

