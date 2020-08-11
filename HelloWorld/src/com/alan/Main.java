package com.alan;
import java.io.IOException;  // Import the IOException class to handle errors
import java.text.NumberFormat;
import java.util.Scanner;

import com.alan.loggers.AppendToLog;
import com.alan.loggers.Logger01;
import com.alan.loggers.Print;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Print.main(args);
        Logger01.main(args);
        System.out.print("put in a number: ");
        int principal = scanner.nextInt();
        AppendToLog.usingBufferedWritter();
    }

    public static class MortgageCalculator {

        public static void main(String[] args) {
            final byte MONTHS_IN_YEAR = 12;
            final byte PERCENT = 100;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Principal: ");
            int principal = scanner.nextInt();
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            int numberOfPayments = years * MONTHS_IN_YEAR;

            double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1+monthlyInterest, numberOfPayments)- 1);

            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage: "+ mortgageFormatted);
        }
    }
}
