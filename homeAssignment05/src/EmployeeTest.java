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
public class EmployeeTest {
    public static void main(String[] args){
        System.out.println("you have "+Employee.getEmployeeCount()+" employees.");
        
        
       //turns out you can declare a new object inside declaring an object!
        Employee bob = new Employee("Bob", "Ross", new Date(1,1,1995), new Date(20,9,2007));
        Employee doug = new Employee("Douglass", "Mcdonell", new Date(5,7,1968), new Date(23,4,1992));
        Employee linus = new Employee("Linus", "Torvalds", new Date(28,12,1969), new Date(30,6,1985));
        
        //do I really have to explain these things?
        System.out.println(bob.toString());
        System.out.println(doug.toString());
        System.out.println(linus.toString());
        
        System.out.println("you have "+Employee.getEmployeeCount()+" employees.");
        
        System.out.println("is bob the same as doug? T/F: "+bob.equals(doug));
    }
}
