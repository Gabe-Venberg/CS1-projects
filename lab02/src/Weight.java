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
 * @author gabriel.venberg
 */
public class Weight
{

    /**
     * Your comments go here
     * @param args
     */
     
    public static void main(String[] args)
    {
        //create 3 variables to store the different weights 10, 20, 30
        int kg1 = 10;
        int kg2 = 20;
        int kg3 = 30;
        //create a variable to store the conversion factor to convert 1Kg to pounds
        double kToLb = 2.20462;
        //create 3 variables to store the results of the conversion
        float lb1;
        float lb2;
        float lb3;
	lb1 = (float) (kg1/kToLb);
	lb2 = (float) (kg2/kToLb);
	lb3 = (float) (kg3/kToLb);
        //print the results of the conversion to the output window
	System.out.println(lb1);
	System.out.println(lb2);
	System.out.println(lb3);
    }
}
