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
public class SalariedEmployee extends Employee{
    private double weeklySalary;
    
    public SalariedEmployee(String startFirstName, String startLastName, int startSSN, double startWeeklySalary){
        super(startFirstName, startLastName, startSSN);
        setWeeklySalary(startWeeklySalary);
    }
    
    public double getWeeklySalary(){return weeklySalary;}
    
    public void setWeeklySalary(double newWeeklySalary){
        if (newWeeklySalary > 0){
            weeklySalary = newWeeklySalary;
        }
        else{
            throw new IllegalArgumentException("Salary must be > 0");
        }
    }
    
    public String toString(){
        return super.toString()+", Weekly Salary: $"+weeklySalary;
    }
    
    public boolean equals(SalariedEmployee testEmployee){
        return super.equals(testEmployee) && weeklySalary == testEmployee.getWeeklySalary();
    }
    
    //Im assuming you want getEarnings to return weekly earnings.
    public double getEarnings(){
        return weeklySalary;
    }
}
