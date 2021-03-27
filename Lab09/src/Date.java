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
import java.util.GregorianCalendar;
import java.util.Calendar;
public class Date {
    private int day, month, year;
    
    public Date (int startDay, int startMonth, int startYear){
        setYear(startYear);
        setMonth(startMonth);
        setDay(startDay);
    }
    /**
     * returns day
     * @return 
     */
    public int getDay(){
        return day;
    }
    /**
     * returns month
     * @return 
     */
    public int getMonth(){
        return month;
    }
    /**
     * returns year
     * @return 
     */
    public int getYear(){
        return year;
    }
    
    /**
     * sets the day, throws error if day is impossible under the gregorian calander.
     * @param newDay 
     */
    private void setDay(int newDay){
        GregorianCalendar checker = new GregorianCalendar(year, month, day);
        //found in javadoc for gregoriancalander. will also take into account leap years.
        int daysInMonth = checker.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        if (newDay<=daysInMonth){
            day=newDay;
        }
        else {
            throw new IllegalArgumentException("newDay out of range for set month and year");
        }
    }
    /**
     * sets month, throws error if month is above 12.
     * @param newMonth 
     */
    private void setMonth(int newMonth){
        if (newMonth<=12){
            month=newMonth;
        }
        else {
            throw new IllegalArgumentException("newMonth must be <= 12");
        }
    }
    /**
     * sets year, returns error if year is before 1582
     * @param newYear 
     */
    private void setYear(int newYear){
        if (newYear>=1582){
            year=newYear;
        }
        else {
            throw new IllegalArgumentException("newYear must be >= 1582, the year the gregorian calander was adopted.");
        }
    }
    
    /**
     * outputs a string representation of the date in mm/dd/yyyy format.
     * @return 
     */
    public String toString(){
        return (month+"/"+day+"/"+year);
    }
    
    /**
     * tests if date obgect is equal to another date object.
     * @param testDate
     * @return 
     */
    public boolean equals(Date testDate){
       return  testDate.getDay()==day&testDate.getMonth()==month&testDate.getYear()==year;
    }
    
    
}
