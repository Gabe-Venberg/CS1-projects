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
public class Employee {
    private int emplID;
    private static int nextID = 1000;
    private static int noOfEmployees = 0;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    /**
     * Constructor that assigns full name, birthdate, hiredate, as well as automatically assigning an ID.
     * @param startFirstName
     * @param startLastName
     * @param startBirthDate
     * @param startHireDate 
     */
    public Employee(String startFirstName, String startLastName, Date startBirthDate, Date startHireDate){
        setFirstName(startFirstName); // what does overridable method call in constructor mean?
        setLastName(startLastName);
        setBirthDate(startBirthDate);
        setHireDate(startHireDate);
        emplID=nextID;
        nextID++;
        noOfEmployees++;
    }
    
    //normally would go multiline, but get methods are so formulaic and short its just as readable on one line.
    /**
     * returns emplID
     * @return 
     */
    public int getemplID(){return emplID;}
    /**
     * returns firstName
     * @return 
     */
    public String getFirstName(){return firstName;}
    /**
     * returns lastName
     * @return 
     */
    public String getLastName(){return lastName;}
    /**
     * returns birthDate
     * @return 
     */
    public Date getBirthDate(){return birthDate;}
    /**
     * returns hireDate
     * @return 
     */
    public Date getHireDate(){return hireDate;}
    
    //names change, so they are public.
    /**
     * sets firstName
     * @param newFirstName 
     */
    public void setFirstName(String newFirstName){
        firstName=newFirstName;
    }
    /**
     * sets lastName
     * @param newLastName 
     */
    public void setLastName(String newLastName){
        lastName=newLastName;
    }
    
    //birth dates and hire dates dont change, so these are private.
    /**
     * sets birthDate
     * @param newBirthDate 
     */
    private void setBirthDate(Date newBirthDate) {
        birthDate=newBirthDate;
    }
    /**
     * sets hireDate
     * @param newHireDate 
     */
    private void setHireDate(Date newHireDate){
        hireDate=newHireDate;
    }
    /**
     * tests if all values are equal to another instance of Employee
     * @param testEmployee
     * @return 
     */
    public boolean equals(Employee testEmployee){
        return testEmployee.getFirstName().equals(firstName)&testEmployee.getLastName().equals(lastName)&  //multiline for readability. if statements would be slower, I think.
                testEmployee.getBirthDate().equals(birthDate)&testEmployee.getHireDate().equals(hireDate)&
                testEmployee.getemplID()==emplID;
    }
    /**
     * returns a human readable string representing Employee.
     * @return 
     */
     public String toString(){
         return (firstName+" "+lastName+", born "+birthDate.toString()+", hired "+hireDate.toString()+
                 " employee ID: "+emplID);
     }
     /**
      * returns the number of times an instance of Employee has been created.
      * @return 
      */
     static public int getEmployeeCount(){
         return noOfEmployees;
     }
    
}
