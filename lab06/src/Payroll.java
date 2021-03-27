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
 * calculates employee payroll statement given the employee name, no of hours worked, 
 * hourly pay rate, federal and state tax rates.
 * @author toric
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Payroll {
    public static void main(String[] args){
        //initialzing stuff.
            Scanner scan = new Scanner(System.in);
            NumberFormat percentFormat = NumberFormat.getPercentInstance();
            NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
            String employeeName;
            double hourlyPay;
            double hoursWorked;
            double stateTax;
            double fedTax;
            double grossIncome;
            double netIncome;
            double fedTaxWithheld;
            double stateTaxWithheld;
            double netTaxWithheld;
        
        //geting input.
            System.out.print("Enter your name >> ");
            employeeName = scan.next();
            System.out.println();
            System.out.print("enter your hourly wage >> ");
            hourlyPay = scan.nextDouble();
            System.out.println();
            System.out.print("enter the hours you worked this week >> ");
            hoursWorked = scan.nextDouble();
            System.out.println();
            System.out.print("enter your states tax rate as a decimal >> ");
            stateTax = scan.nextDouble();
            System.out.println();
            System.out.print("enter your federal tax rate  as a decimal >> ");
            fedTax = scan.nextDouble();
            System.out.println();
        
        //calculations
            grossIncome = hoursWorked * hourlyPay;
            fedTaxWithheld = grossIncome*fedTax;
            stateTaxWithheld = grossIncome*stateTax;
            netTaxWithheld = stateTaxWithheld+fedTaxWithheld;
            netIncome = grossIncome-netTaxWithheld;
       
        //output
            System.out.println("Name: "+employeeName);
            System.out.println("Hourly Pay: "+moneyFormat.format(hourlyPay));
            System.out.println("Hours Worked: "+hoursWorked);
            System.out.println("State Tax Rate: "+percentFormat.format(stateTax));
            System.out.println("Federal Tax Rate: "+percentFormat.format(fedTax));
            System.out.println("Gross Income: "+moneyFormat.format(grossIncome));
            System.out.println("State Tax Withheld: "+moneyFormat.format(stateTaxWithheld));
            System.out.println("Federal Tax Withheld: "+moneyFormat.format(fedTaxWithheld));
            System.out.println("Total Tax Withheld: "+moneyFormat.format(netTaxWithheld));
            System.out.println("Net Income: "+moneyFormat.format(netIncome));
    }
}
