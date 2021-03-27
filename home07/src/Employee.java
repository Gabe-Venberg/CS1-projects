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
public abstract class Employee {
    private String firstName;
    private String lastName;
    private int SSN;
    
    public Employee(String startFirstName, String startLastName, int startSSN){
        firstName = startFirstName;
        lastName=startLastName;
        SSN = startSSN;
    }
    
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int getSSN(){return SSN;}
    
    public void setFirstName(String newFirstName){firstName = newFirstName;}
    public void setLastName(String newLastName){lastName = newLastName;}
    /*SSN's dont change, names do. But you told me to implement this. Im not sure why, and am actually quite curious to know.
    * Did you intend the set method to be public? Am I supposed to be calling the set methods in the constructor (dispite the data not needing validation)?
    */
    private void setSSN(int newSSN){SSN = newSSN;}
    
    public abstract double getEarnings();
    
    public String toString(){
        return lastName+", "+firstName+", SSN: "+SSN;
    }
    public boolean equals(Employee testEmployee){
        return firstName == testEmployee.getFirstName() && lastName == testEmployee.getLastName() && SSN == testEmployee.getSSN();
    }
}
