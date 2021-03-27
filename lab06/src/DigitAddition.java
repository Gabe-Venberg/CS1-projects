
import java.util.Scanner;

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
 *Adds the digits of a three digit number together.
 * @author toric
 */
public class DigitAddition {
    public static void main(String[] args){
        //initalizing
            Scanner scan = new Scanner(System.in);
            int input;
            int digit1;
            int digit2;
            int digit3;
            int sum;
        
        //input
            System.out.print("Input a 3 digit number >> ");
            input = scan.nextInt();
            System.out.println();
        
        //calculations
            digit3 = input%10;
            //temporarily use digit2 to store the first 2 digits.
            digit2 = input/10;
            digit2 = digit2%10;
            digit1 = input/100;
            sum = digit1+digit2+digit3;
            
        //output
        System.out.println("You entered "+input+", the sum of "+digit1+"+"+digit2+"+"+digit3+" is "+sum);
    }
}
