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
public class Train {
    ArrayList<Passenger> passengerList;
    
    public Train(){
        passengerList = new ArrayList<Passenger>();
    }
    
    /**
     * adds Passenger to the passengerList.
     * @param newPassenger 
     */
    public void addPassenger(Passenger newPassenger){
        passengerList.add(new Passenger(newPassenger.getName(), newPassenger.getServiceLevel())); //preserving encapsulation
    }
    /**
     * returns the passenger object at index position i
     * @param i
     * @return 
     */
    public Passenger getPassenger(int i){
        return new Passenger(passengerList.get(i).getName(), passengerList.get(i).getServiceLevel()); //preserving encapsulation
    }
    /**
     * returns number of passengers
     * @return 
     */
    public int getNoOfPassengers(){
        return passengerList.size();
    }
    /**
     * returns the percentage of all passengers that are first class.
     * @return 
     */
    public double getPercentFirstClass(){
        double firstClassPassengers = 0;
        for (int i=0;i<passengerList.size();i++){
            if (passengerList.get(i).getServiceLevel()==1){firstClassPassengers++;}
        }
        return firstClassPassengers/(double)passengerList.size();
    }
    /**
     * given the cost of a first and second class ticket, returns the total amount of revenue the trains current passengers are generating.
     * @param firstClassRate
     * @param secondClassRate
     * @return 
     */
    public double getRevenue(double firstClassRate, double secondClassRate){
        double firstClassPassengers = 0;
        double secondClassPassengers = 0;
        for (int i=0;i<passengerList.size();i++){
            if (passengerList.get(i).getServiceLevel()==1){firstClassPassengers++;}
            else {secondClassPassengers++;}
        }
        return (firstClassPassengers*firstClassRate)+(secondClassPassengers*secondClassRate);
    }
    /**
     * checks if a passenger matching the testPassenger object is on board.
     * @param testPassenger
     * @return 
     */
    public boolean checkIfPassengerPresent(Passenger testPassenger){
        for (int i=0; i<passengerList.size();i++){
            if (passengerList.get(i).equals(testPassenger)){
                return true;
            }
        }
        return false;
    }
    /**
     * returns a newline seperated list of all passengers onboard, in a human readable format.
     * @return 
     */
    public String toString(){
        String returnString = passengerList.get(0).toString();
        for (int i=1; i<passengerList.size(); i++){
            returnString = returnString+passengerList.get(i).toString()+'\n';
        }
        return returnString;
    }
    /**
     * test two train objects for equality.
     * @param testTrain
     * @return 
     */
    public boolean equals(Train testTrain){
        for (int i=0; i<passengerList.size(); i++){
            if (!passengerList.get(i).equals(testTrain.getPassenger(i)))
                return false;
        }
        return true;
    }
}
