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
 *Calculates monthly payment and other values from annual interest rate, years of loan, and amount of loan.
 * @author toric
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Morgage {
    public static void main(String[] args){
        //initalizing things
            Scanner scan = new Scanner(System.in);
            NumberFormat percentFormat = NumberFormat.getPercentInstance();
            NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
            DecimalFormat twoDecimal = new DecimalFormat("##.00");
            double interestRate;
            double morgageYears;
            double morgageAmount;
            double monthlyPayment;
            double totalPayment;
            double totalInterest;
            double totalInterestPercent;
        
        //getting input.
            System.out.print("Enter the annual intrest rate as a decimal >> ");
            interestRate = scan.nextDouble();
            System.out.println();
            System.out.print("Enter length of the morgage >> ");
            morgageYears = scan.nextDouble();
            System.out.println();
            System.out.print("Enter the dollar amount of the morgage >> ");
            morgageAmount = scan.nextDouble();
            System.out.println();
            
        //calculations
            /* This formula, given by the assignment word doc, is wrong. using it (with no changes to the surrounding code)
            results in negative overpayment, and, in extreme cases, negative monthly payments. Go ahead, try it.
            uncomment the incorrect formula and comment out the correct one.
            */
            //monthlyPayment = ((interestRate/12)*morgageAmount)/(1-(1/Math.pow((1+interestRate),(12*morgageYears))));
            //it should be:
            monthlyPayment = ((interestRate)*morgageAmount)/(1-(1/Math.pow((1+interestRate),(morgageYears))));
            totalPayment = monthlyPayment*morgageYears;
            totalInterest = totalPayment-morgageAmount;
            totalInterestPercent = totalInterest/morgageAmount;
            
         //output
            System.out.println("Interest Rate: "+percentFormat.format(interestRate));
            System.out.println("Length of Morgage: "+morgageYears+ " Years");
            System.out.println("Monthly Payment: "+moneyFormat.format(monthlyPayment));
            System.out.println("Total Payment: "+moneyFormat.format(totalPayment));
            System.out.println("Overpayment: "+moneyFormat.format(totalInterest));
            System.out.println("Overpayment Percentage: "+percentFormat.format(totalInterestPercent));
    }
}
