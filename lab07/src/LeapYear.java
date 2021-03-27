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
 *Takes a year as input and tells you whether that year is a leap year.
 * @author toric
 */
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        //setup
        Scanner scan = new Scanner(System.in);
        
        int inputYear;
        final int earliestYear = 1582;
        
        //get input
        System.out.print("Enter a year in the format yyyy >> ");
        inputYear = scan.nextInt();
        System.out.println();
        
        //calculation stages. As usual, do the error checking with priority.
        if (inputYear < earliestYear) {
            System.out.println("The gregorian calander did not exist at this time in history.");
        }
        else if ((inputYear%400==0)||(inputYear%4==0 && inputYear%100!=0)) {
            System.out.println("This year was a leap year.");
        }
        else {
            System.out.println("This year was not a leap year.");
        }
    }
}
