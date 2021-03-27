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
public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    
    public HourlyEmployee(String startFirstName, String startLastName, int startSSN, double startWage, double startHours){
        super(startFirstName, startLastName, startSSN);
        setWage(startWage);
        setHours(startHours);
    }
    
    public double getWage(){return wage;}
    public double getHours(){return hours;}
    
    public void setWage(double newWage){
        if (newWage > 0){
            wage = newWage;
        }
        else{
            throw new IllegalArgumentException("Wage must be > 0");
        }
    }
    
    public void setHours(double newHours){
        if (newHours > 0){
            hours = newHours;
        }
        else{
            throw new IllegalArgumentException("Hours must be > 0");
        }    
    }
    
    public String toString(){
        return super.toString()+", Hourly Wage: $"+wage+"/hr, Weekly Hours: "+hours;
    }
    
    public boolean equals(HourlyEmployee testEmployee){
        return super.equals(testEmployee) && hours == testEmployee.getHours() && wage == testEmployee.getWage();
    }
    
    public double getEarnings(){
        if (hours > 40){
            return 40*wage+(hours-40)*wage;
        }
        else{
            return hours*wage;
        }
    }
}
