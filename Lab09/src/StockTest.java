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
public class StockTest {
    public static void main(String[] args){
        Stock mmm = new Stock("MMM","3M");
        //set monetary values
        mmm.setPreviousClosingPrice(165.51);
        mmm.setCurrentPrice(150);
        //print info.
        System.out.println("Yesterdays closing price for "+mmm.getName()+" was "+mmm.getPreviousClosingPrice()+".");
        System.out.println("The current price for "+mmm.getName()+" is "+mmm.getCurrentPrice()+".");
        System.out.println(mmm.getName()+" has changed by "+mmm.changePercent()+"%.");
    }
}
