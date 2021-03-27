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
 * @author gabriel.venberg
 */
public class timeCalc {
    public static void main(String[] args){
        final int secInHour=3600;
        final int secInMin=60;
        
        int inputSec=8732;
        
        int outputHour;
        int outputMin;
        int outputSec;
        
        //hours
        outputHour=inputSec/secInHour;
        //remainder in sec
        outputSec=inputSec%secInHour;
        //minutes 
        outputMin=outputSec/secInMin;
        //remainder in sec
        outputSec=outputSec%secInMin;
        
        System.out.println(inputSec+" seconds is equal to "+outputHour+":"+outputMin+":"+outputSec);
    }
    
}
