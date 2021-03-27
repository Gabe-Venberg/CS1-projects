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
 * made for lab05
 * @author toric
 */
public class StringTest {
    public static void main(String[] args) {
        
        //inital assignment
        String string1 = new String("Hi");
        String string2 =  new String("Hello World");
        
        //finding the lengh of the two strings
        System.out.println("string1 is "+string1.length()+" characters long");
        System.out.println("string1 is "+string2.length()+" characters long");
        
        //find the first o in both strings
        System.out.println("the first o in string1 is at position "+string1.indexOf("o"));
        System.out.println("the first o in string2 is at position "+string2.indexOf("o"));
        
        //find the last o in each string
        System.out.println("the last o in string1 is at position "+string1.lastIndexOf("o"));
        System.out.println("the last o in string2 is at position "+string2.lastIndexOf("o"));
        
        //use substring() to make a variable containing "world"
        String substring = string2.substring(6);
        System.out.println("string2 starting with the 6th character is "+substring);
        
        //string2 all lowercase
        System.out.println("string2 in all lowercase is "+string2.toLowerCase());
        
        //string2 to all uppercase
        System.out.println("string2 in all uppercase is "+string2.toUpperCase());
    }
}