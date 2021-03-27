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
 *the assignment didnt specify what to put in this class in terms of methods, so I guessed.
 * @author toric
 */
public class Passenger {
    private String name;
    private int serviceLevel;
    
    public Passenger(String startName, int startServiceLevel){
        name = startName;
        setServiceLevel(startServiceLevel);
    }
    /**
     * sets serviceLevel
     * @param newServiceLevel 
     */
    public void setServiceLevel(int newServiceLevel){
        if (newServiceLevel==1 || newServiceLevel==2){
            serviceLevel=newServiceLevel;
        }
        else{
            throw new IllegalArgumentException("serviceLevel must be 1 or 2");
        }
    }
    /**
     * gets serviceLevel
     * @return 
     */
    public int getServiceLevel(){return serviceLevel;}
    /**
     * gets name
     * @return 
     */
    public String getName(){return name;}
    /**
     * converts object into a human readable string.
     * @return 
     */
    public String toString(){
        return "Name: "+name+", service level: "+serviceLevel+".";
    }
    /**
     * tests equality with another passenger object.
     * @param testPassenger
     * @return 
     */
    public boolean equals(Passenger testPassenger){
        return (name.equals(testPassenger.getName()) && serviceLevel==testPassenger.getServiceLevel());
    }
}
