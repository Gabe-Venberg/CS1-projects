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
 *inputs an inital investment and a percent intrest, and calculates balance after 5, 10, and 15 years.
 * @author toric
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Investment {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
        
        //get input
        System.out.print("Enter your intrest rate as a decimal (6.5% - .065) >");
        double intrest = scan.nextDouble();
        System.out.print("enter your inital investment >");
        double investment = scan.nextDouble();
        //could easily get this from a user input as well...
        int year;
        
        //calculate 5 years
        year = 5;
        double year5Value = investment*Math.pow(1+intrest, year);
        
        //calculate 10 years
        year = 10;
        double year10Value = investment*Math.pow(1+intrest, year);
        
        //calculate 20 years
        year = 20;
        double year20Value = investment*Math.pow(1+intrest, year);
        
        //print the values.
        System.out.println("After 5 years, you will have "+priceFormat.format(year5Value));
        System.out.println("After 10 years, you will have "+priceFormat.format(year10Value));
        System.out.println("After 20 years, you will have "+priceFormat.format(year20Value));
    }
}
