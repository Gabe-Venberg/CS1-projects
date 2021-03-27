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
/*going a bit above on this one.
in the US and europe (any country with a minimum wage), even commissioned employees are gaurenteed a minimum wage
no matter how little they sell on a given week. I will be implementing sutch a system.
Note this is different from a base+commission because it uses a floor, rather than an addition.
in the US, Every employee that recives commission must also recive a base pay, actually. The only weird thing is that the min base pay for tipped employees is lower.
But they still get a base pay. (The more you know!)
*/
public class CommissionEmployee extends Employee{
    
    private double grossSales;
    private double commissionRate;
    private double minWage;
    
    public CommissionEmployee(String startFirstName, String startLastName, int startSSN, double startGrossSales, double startCommissionRate, double startMinWage){
        super(startFirstName, startLastName, startSSN);
        setGrossSales(startGrossSales);
        setCommissionRate(startCommissionRate);
        setMinWage(startMinWage);
    }
    
    public double getGrossSales(){return grossSales;}
    public double getCommissionRate(){return commissionRate;}
    public double getMinWage(){return minWage;}
    
    public void setGrossSales(double newGrossSales){
        if (newGrossSales >= 0){
            grossSales = newGrossSales;
        }
        else{
            throw new IllegalArgumentException("grossSales cannot be negative");
        }
    }
    
    public void setCommissionRate(double newCommissionRate){
        if (newCommissionRate > 0){
            commissionRate = newCommissionRate;
        }
        else{
            throw new IllegalArgumentException("commissionRate must be >0");
        }
    }
    
    public void setMinWage(double newMinWage){
        if (newMinWage > 0){
            minWage = newMinWage;
        }
        else{
            throw new IllegalArgumentException("minWage must be > 0, and, legaly speaking, above or equal to your local minimum wage");
        }
    }
    
    public String toString(){
        return super.toString()+", Gross sales: $"+grossSales+", commissionRate: "+commissionRate+"%, minimum wage: $"+minWage;
    }
    
    public boolean equals(CommissionEmployee testEmployee){
        return super.equals(testEmployee) && grossSales == testEmployee.getGrossSales() && commissionRate == testEmployee.getCommissionRate()
                && minWage == testEmployee.getMinWage();
    }
    
    public double getEarnings(){
        return Math.max(minWage, (grossSales*commissionRate));
    }
    
}
