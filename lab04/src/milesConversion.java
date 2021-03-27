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
public class milesConversion {
    public static void main(String[] args){
        //declare constants
        final int yardsInMile=1760;
        final int feetInMile=5280;
        final int inchesInMile=63360;
        
        //our input
        int inputMiles=4;
        
        //declare output variables
        int outputInches;
        int outputFeet;
        int outputYards;
        
        //calculate them
        outputInches=inputMiles*inchesInMile;
        outputFeet=inputMiles*feetInMile;
        outputYards=inputMiles*yardsInMile;
        
        //and output them.
        System.out.println(inputMiles+" miles is equal to "+outputYards+" yards, "+outputFeet+" feet, or "+outputInches+" inches.");
    }
}
