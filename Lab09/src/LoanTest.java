/*
 * Copyright (C) 2020 Gabriel Venberg
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author toric
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class LoanTest {
    public static void main(String[] args){
        //setup
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
        Scanner scan = new Scanner(System.in);
        double interestRate, amount;
        int years;
        int year, month, day;
        boolean wantsToContinue = true;
        char tempInput;
        
        while (wantsToContinue){
        //getting input
        System.out.print("intput the annual interest rate as a decimal >");
        interestRate = scan.nextDouble();
        System.out.print("input the number of years the loan will be held >");
        years = scan.nextInt();
        System.out.print("input the amount borrowed >");
        amount = scan.nextDouble();
        System.out.print("input the year >");
        year = scan.nextInt();
        System.out.print("input the month >");
        month = scan.nextInt();
        System.out.print("input the day >");
        day = scan.nextInt();
        
        Date loanDate = new Date(day, month, year);
        Loan testLoan = new Loan(interestRate, amount, years, loanDate);
        
        //some minor calculation in order to keep the line from getting too long.
        double overpaymentPercent = testLoan.getOverpayment()/testLoan.getTotalPayment();
        
        System.out.println("SUCSESS!");
        System.out.println("Loan created.");
        System.out.println("You have sucsessfully signed up for a loan!");
        System.out.println("You have an interest rate of "+percentFormat.format(testLoan.getInterestRate()));
        System.out.println("You borrowed"+moneyFormat.format(testLoan.getAmount()));
        System.out.println("You will be paying us "+moneyFormat.format(testLoan.getMonthlyPayment())+" a month for "+years+" years.");
        System.out.println("Even assuming you pay on time every month, by the end of the loan you will have paid us "+moneyFormat.format(testLoan.getTotalPayment())+",");
        System.out.println(moneyFormat.format(testLoan.getOverpayment())+" of whitch will be pure profit for us!");
        System.out.println("That is, you will have paid "+percentFormat.format(overpaymentPercent)+" more than you initaly borrowed!");
        System.out.println("Isnt capitalism great!");
        System.out.println("Press y to register for another loan.");
        tempInput = scan.next().charAt(0);
        
        switch(tempInput) {
                case 'y':
                    wantsToContinue = true;
                    break;
                default:
                    wantsToContinue = false;
                    break;

        }
    }
    }
}
