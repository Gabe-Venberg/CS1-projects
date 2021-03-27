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
import java.util.ArrayList;

public class EmployeesClient {
    public static ArrayList<Employee> GenerateEmployees(){
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        int empType;
        for (int i=0; i<10; i++){
            empType = (int)(Math.random()*4);
            //the random numbers are a bit of a mess, I should really write a random number method.
            switch(empType){
                case 0:
                    employeeList.add(new SalariedEmployee("Clone"+(i+1), "Venberg", (int)Math.random()*900000000+100000000, Math.random()*2701+300));
                    break;
                case 1:
                    employeeList.add(new HourlyEmployee("Clone"+i, "Venberg", (int)Math.random()*900000000+100000000, Math.random()*41+10, Math.random()*51+10));
                    break;
                case 2:
                    employeeList.add(new CommissionEmployee("Clone"+i, "Venberg", (int)Math.random()*900000000+100000000, Math.random()*10000, Math.random()*.1, Math.random()*701+300));
                    break;
                case 3:
                    employeeList.add(new BasePlusCommissionEmployee("Clone"+i, "Venberg", (int)Math.random()*900000000+100000000, Math.random()*10000, Math.random()*.1, Math.random()*2701+300));
                    break;
            }
        }
        return employeeList;
    }
    public static void main(String[] args){
        ArrayList<Employee> employeeList = GenerateEmployees();
        for (int i=0; i<employeeList.size(); i++){
            System.out.println(employeeList.get(i).toString()+", Earning $"+employeeList.get(i).getEarnings()+" this week.");
        }
    }
}
