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
import java.util.ArrayList;
import java.lang.Math;
public class salesTax {
    public static void main(String[] args){
        //declaring variables
        double [][] salesTax = new double [50][10];
        ArrayList<Integer> statesWithLowTax = new ArrayList<Integer>(); //we dont know at first how many states will fall in this category.
        final double lowTaxThreshold = .001;
        double [] highestTaxPerState = new double [50];
        int stateWithHighestAvgTax = 0;
        
        
        //declaring computation only variables outside the loop, will be initalized on first loop run.
        double highestAvgTax = 0;
        boolean stateHasLowSalesTax;
        double highestLocalTax;
        double localAvgTax;
        
        System.out.println("printing a table. each row is the last 10 years of a states sales tax.");
        //we can put all the computation into the same loop, so we arent iterating over the same, unchanged loop multiple times.
        for (int i=0;i<salesTax.length;i++){
            
            //resetting these variables, as moving on to new state.
            stateHasLowSalesTax = false; 
            highestLocalTax = 0;
            localAvgTax = 0;
            
            for (int j=0;j<salesTax[i].length;j++){
                salesTax[i][j]=Math.random()*.06;
                
                //printing without a linebreak in order to produce a table.
                System.out.print(String.format("%f", salesTax[i][j])+"\t"); //$f means outputting as a decimal that never goes into scientific notation.
                if (salesTax[i][j] < lowTaxThreshold){
                    stateHasLowSalesTax = true; //marking this state, doesnt matter if it is already marked.
                }
                
                highestLocalTax = Math.max(salesTax[i][j], highestLocalTax);
                
                //accumulate inside this loop, will divide in outer loop.
                localAvgTax = localAvgTax+salesTax[i][j];
            }
            highestTaxPerState[i]=highestLocalTax;
            
            // compiling this list this way so we dont get the same state in the list multiple times.
            if (stateHasLowSalesTax){
                statesWithLowTax.add(i);
            }
            
            //convert the sum into an average over the years.
            localAvgTax = localAvgTax/salesTax[i].length;
            if (highestAvgTax<localAvgTax){
                stateWithHighestAvgTax = i;
            }
            highestAvgTax = Math.max(highestAvgTax, localAvgTax);
            
            System.out.println();
        }
        
        System.out.println("The state with the highest average tax rate over the last 10 years is "+stateWithHighestAvgTax);

        //print out a list of states with low taxes
        System.out.print("The following states had at least one year with extremely low sales tax: ");
        System.out.print(statesWithLowTax.get(0)); //doing this trick again for string formatting. the first number should not have a preceeding comma.
        for (int i=1; i<statesWithLowTax.size();i++){
            System.out.print(", "+statesWithLowTax.get(i));
        }
        System.out.println();
        
        for (int i=0;i<highestTaxPerState.length;i++){
            System.out.println("State "+i+" had a max sales tax of "+highestTaxPerState[i]);
        }
    }
}
