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
public class Student {
    private int studentID;
    private double GPA;
    private String name;
    private char gender;
    private Course courseList[];
    private static int nextID = 1000;
    
    public Student(String startName, char startGender, Course [] startCourseList){
        studentID=nextID;
        nextID++;
        GPA=0.0;
        name=startName;
        gender=startGender;
        courseList =new Course[startCourseList.length];
        for (int i=0; i<startCourseList.length; i++){
            courseList[i]=startCourseList[i];
        }
    }
    /**
     * returns studentID
     * @return 
     */
    public int getStudentID(){
        return studentID;
    }
    /**
     * returns GPA
     * @return 
     */
    public double getGPA(){
        return GPA;
    }
    /**
     * returns name
     * @return 
     */
    public String getName(){
        return name;
    }
    /**
     * returns gender
     * @return 
     */
    public char getGender(){
        return gender;
    }
    /**
     * returns the students course list.
     * @return 
     */
    public Course [] getCourseList(){
        Course [] tmp = new Course [courseList.length];
        for (int i=0; i<courseList.length; i++){
          tmp[i]=courseList[i];  
        }
        return tmp;
    }
    /**
     * sets the students name
     * @param newName 
     */
    public void setName(String newName){
        name=newName;
    }
    /**
     * sets the students GPA
     * @param newGPA 
     */
    public void setGPA(double newGPA){
        GPA=newGPA;
    }
    /**
     * sets the students gender
     * @param newGender 
     */
    public void setGender(char newGender){
        gender=newGender;
    }
    /**
     * sets the students course list.
     * @param newCourseList 
     */
    public void setCourseList(Course [] newCourseList){
        for (int i=0; i<newCourseList.length; i++){
            courseList[i]=newCourseList[i];
        }
    }
    /**
     * returns data in human readable string
     * @return 
     */
    public String toString(){
        String courseListString = "";
        for (int i=0; i<courseList.length; i++){
            courseListString=courseListString+", "+courseList[i].toString();
        }
        return "Student ID: "+studentID+", name: "+name+", gender: "+gender+" GPA: "+GPA+
                ", Course List: "+courseListString;
    }
    /**
     * tests for equality with another student object. courses must be in the same order.
     * @param testStudent
     * @return 
     */
    public boolean equals(Student testStudent){
        return studentID==testStudent.getStudentID()&GPA==testStudent.getGPA()
                &testStudent.getName().equals(name)&testStudent.getGender()==gender
                &testStudent.getCourseList().equals(courseList);
    }
}
