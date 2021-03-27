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
 * @author Gabriel Venberg
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.text.NumberFormat;

public class TrainTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //initial, boilerplate initialization.
        File inputFile = new File("passengers.txt");
        Scanner file = new Scanner(inputFile);
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
        
        Train testTrain = new Train();
        double firstClassRate=10;
        double secondClassRate=2;
        
        while(file.hasNext()){
            String line = file.nextLine();
            String[] data = line.split("\s"); // \s matches any whitespace char.
            testTrain.addPassenger(new Passenger(data[0], Integer.parseInt(data[1])));
        }
        
        System.out.println("The current Passengers are:");
        for (int i=0; i<testTrain.getNoOfPassengers(); i++){
            System.out.println(testTrain.getPassenger(i).getName());
        }
        
        System.out.println("There are "+testTrain.getNoOfPassengers()+" passengers"
                + "on the train right now.");
        System.out.println(percentFormat.format(testTrain.getPercentFirstClass())+
                " of passengers are first class");
        System.out.println("the total revenue generated this trip is "+
                moneyFormat.format(testTrain.getRevenue(firstClassRate, secondClassRate)));
    }
}
