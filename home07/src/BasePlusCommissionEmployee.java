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
public class BasePlusCommissionEmployee extends CommissionEmployee{
    public double baseSalary;
    
    public BasePlusCommissionEmployee(String startFirstName, String startLastName, int startSSN, double startGrossSales, double startCommissionRate, double startBaseSalary){
        //we simply set minWage as baseSalary (or something lower, but it doesnt matter), as we wont run into that problem with this type of employee.
        super(startFirstName, startLastName, startSSN, startGrossSales, startCommissionRate, startBaseSalary);
        setBaseSalary(startBaseSalary);
    }
    
    public double getBaseSalary(){return baseSalary;}
    
    public void setBaseSalary(double newBaseSalary){
        if (newBaseSalary > 0){
            baseSalary = newBaseSalary;
        }
        else{
            throw new IllegalArgumentException("Base salary must be > 0");
        }
    }
    
    public String toString(){
        return super.toString()+", Min wage same as base salary";
    }
    
    public boolean equals(BasePlusCommissionEmployee testEmployee){
        //dont actually need to test baseSalary, as it is set equal to minWage.
        return super.equals(testEmployee);
    }
    
    public double getEarnings(){
        return this.getCommissionRate()*this.getGrossSales()+baseSalary;
    }
}
