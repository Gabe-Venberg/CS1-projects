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
public class InchesToFeetInches {
    public static void main(String[] args){
        
        //declare input
        int inputInches = 100;
        
        //declare constants
        final int inchesInFoot = 12;
        
        //declare variables
        int outputFeet;
        int outputInches;
        
        //compute
        outputFeet = inputInches/inchesInFoot;
        outputInches = inputInches%inchesInFoot;
        
        //output
        System.out.println(inputInches+" inches is equal to "+outputFeet+" feet, "+outputInches+" inches.");
        
    }
}
