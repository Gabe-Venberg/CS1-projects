
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
 *takes an input temp and outputs a probable season using a highly accurate (tm)
 * and sophisticated (tm) algorithm (tm)
 * @author toric
 */
public class Seasons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double degreesF;
        
        System.out.print("Input a temperature in terms of degrees F >> ");
        degreesF = scan.nextDouble();
        System.out.println();
        
        //check the out of bounds first, so we dont have to inculde OR statements in the following statemnts
        if (degreesF>110||degreesF<-5){
            System.out.println("Outside the valid range");
        }
        else if (degreesF>=90){
            System.out.println("It is probably summer");
        }
        else if (degreesF>=70){
            System.out.println("It is probably spring");
        }
        else if (degreesF>=50){
            System.out.println("It is probably fall");
        }
        //Since we already checked if it is <-5 in error checking, and we checked that it is < 50 if it passed the above line, it must be winter.
        else {
            System.out.println("It is probably winter");
        }
    }
}