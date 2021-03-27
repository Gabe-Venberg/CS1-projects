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
public class Course {
    private int courseID;
    private int credits;
    private String instructorName;
    
    public Course( int startCourseID, int startCredits, String startInstructorName){
        courseID = startCourseID;
        credits=startCredits;
        instructorName=startInstructorName;
    }
    /**
     * returns courseID
     * @return 
     */
    public int getCourseID(){
        return courseID;
    }
    /**
     * returns credits
     * @return 
     */
    public int getCredits(){
        return credits;
    }
    /**
     * returns instructorName
     * @return 
     */
    public String getInstructorName(){
        return instructorName;
    }
    /**
     * outputs data about course as a string.
     * @return 
     */
    public String toString(){
        return ("courseID: "+courseID+", credits: "+credits+", instructor: "+instructorName);
    }
    /**
     * compares for equality with another course.
     * @param testCourse
     * @return 
     */
    public boolean equals(Course testCourse){
        return testCourse.getCourseID()==courseID&testCourse.getCredits()==credits
                &testCourse.getInstructorName().equals(instructorName);
    }
}
