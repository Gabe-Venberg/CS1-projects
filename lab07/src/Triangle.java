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
 *Takes three numerical inputs as the length of three sides to a triangle, determines
 * whether they are valid inputs, and if so, returns the perimeter.
 * @author toric
 */
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        //setup
        Scanner scan = new Scanner(System.in);
        
        double side1;
        double side2;
        double side3;
        double perimeter;
        
        //gathering input
        System.out.print("Enter the length of side 1 of the triangle >> ");
        side1 = scan.nextDouble();
        System.out.println();
        System.out.print("Enter the length of side 2 of the triangle >> ");
        side2 = scan.nextDouble();
        System.out.println();
        System.out.print("Enter the length of side 3 of the triangle >> ");
        side3 = scan.nextDouble();
        System.out.println();
        
        /*find 0's and negatives first, as many 0's and negatives will also satisfy the second condition.
        * we want the returns to be intuitive, so we want the 0 or negative one to be first in priority.
        */
        if (side1<=0||side2<=0||side3<=0) {
            System.out.println("Inputs invalid: one or more sides is zero or negative.");
        }
        else if ((side1+side2<=side3)||(side1+side3<=side2)||(side2+side3<=side1)) {
            System.out.println("Inputs invalid: sum of two edges greater than third edge.");
        }
        else {
            perimeter = side1+side2+side3;
            System.out.println("The perimeter of the triangle is: "+perimeter);
        }
        
        
    }
}