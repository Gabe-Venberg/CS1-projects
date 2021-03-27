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
 *Stock class
 * @author toric
 */
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    /**
     * constructor that assigns symbol and name.
     * no blank constructor, as symbol and name do not have assignment methods.
     * @param startSymbol
     * @param startName 
     */
    public Stock(String startSymbol, String startName){
        symbol=startSymbol;
        name=startName;
    }
    
    /**
     * returns symbol
     * @return 
     */
    public String getSymbol(){
        return symbol;
    }
    /**
     * returns name
     * @return 
     */
    public String getName(){
        return name;
    }
    /**
     * returns previousClosingPrice
     * @return 
     */
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    /**
     * returns currentPrice
     * @return 
     */
    public double getCurrentPrice(){
        return currentPrice;
    }
    
    /**
     * sets previousClosingPrice
     * @param newPreviousClosingPrice 
     */
    public void setPreviousClosingPrice(double newPreviousClosingPrice){
        previousClosingPrice=newPreviousClosingPrice;
    }
    /**
     * sets currentPrice
     * @param newCurrentPrice 
     */
    public void setCurrentPrice(double newCurrentPrice){
        currentPrice=newCurrentPrice;
    }
    
    /**
     * returns the percentage change between the previousClosingPrice and the currentPrice.
     * @return 
     */
    public double changePercent(){
        return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
    }
}
