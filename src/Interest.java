import java.util.Scanner;

public class Interest {

    public static void main(String S[]){

        final byte MONTHS_in_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the principal amount : ");
        int principal = scanner.nextInt();

        System.out.print("Please enter the rate of interest ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTHS_in_YEAR;

        System.out.print("Periods(years) ");
        byte years = scanner.nextByte();
        int NumberOfPayments = years * MONTHS_in_YEAR;

        double mortgage = principal * monthlyInterest * years * NumberOfPayments;
        System.out.println("Your mortage is "+ mortgage);



    }
}
