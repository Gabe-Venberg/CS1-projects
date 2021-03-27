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
public class quartsToGallons {
    public static void main(String[] args){
            //declare constant
            final int gallonsInQuart=4;
            
            //our 'inpt'
            int inputQuarts=23;
            
            //declare our outputs.
            int outputGallons;
            int outputQuarts;
            
            //calculate them
            outputGallons=inputQuarts/gallonsInQuart;
            outputQuarts=inputQuarts%gallonsInQuart;
            
            //output the whole thing.
            System.out.println(inputQuarts+" quarts is equal to "+outputGallons+" gallons and "+outputQuarts+" quarts");
    }
}
