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
public class Loan {
    private double interestRate;
    private double amount;
    private int years;
    private Date date;
    
    public Loan(double startInterestRate, double startAmount, int startYears, Date startDate){
        setInterestRate(startInterestRate);
        setAmount(startAmount);
        setYears(startYears);
        date=startDate;
    }
    /**
     * returns interestRate
     * @return 
     */
    public double getInterestRate(){
        return interestRate;
    }
    /**
     * returns amount
     * @return 
     */
    public double getAmount(){
        return amount;
    }
    /**
     * returns years
     * @return 
     */
    public double getYears(){
        return years;
    }
    /**
     * returns a string representing date.
     * @return 
     */
    public String getDate(){
        return date.toString();
    }
    /**
     * sets interest rate, making sure its not negative.
     * @param newInterestRate 
     */
    private void setInterestRate(double newInterestRate){
        if (newInterestRate >=0){
            interestRate=newInterestRate;
        }
        else{
            throw new IllegalArgumentException("Interest must be >= 0");
        }
    }
    /**
     * sets amount, making sure its not negative.
     * @param newAmount 
     */
    private void setAmount(double newAmount){
        if (newAmount >=0){
            amount=newAmount;
        }
        else{
            throw new IllegalArgumentException("Amount must be >= 0");
        }
    }
    /**
     * sets years, making sure its at least 1.
     * @param newYears 
     */
    private void setYears(int newYears){
        if (newYears >0){
            years=newYears;
        }
        else{
            throw new IllegalArgumentException("years must be > 0");
        }
    }
    /**
     * returns the monthly payment, assuming interest stays static throuought the rest of the loans term.
     * @return 
     */
    public double getMonthlyPayment(){
        return (((interestRate/12)*amount)/(1-(1/Math.pow((1+(interestRate/12)),(years*12)))));
    }
    /**
     * returns the total payment made throuhought the life of the loan.
     * @return 
     */
    public double getTotalPayment(){
        return getMonthlyPayment()*12*years;
    }
    /**
     * returns the total amount paid over the amount initally borrowed.
     * @return 
     */
    public double getOverpayment(){
       return getTotalPayment()-amount; 
    }
    
}
