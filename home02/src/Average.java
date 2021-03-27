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
public class Average {
    public static void main(String[] arg){
        
        //declare input
        int in1 = 1;
        int in2 = 7;
        int in3 = 9;
        int in4 = 34;
        int noOfInputs = 4;
        
        //calculate
        double avg = (double)(in1+in2+in3+in4)/noOfInputs;
        
        //output
        System.out.println("the average of the inputs is "+avg);
    }
}
