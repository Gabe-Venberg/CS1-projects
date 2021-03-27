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
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Grades {
    public static void main(String args[]) throws IOException {
        //initialization
        int grade=0;
        int as=0, bs=0, cs=0, ds=0, fs=0;
        int passed;
        int studentCount=0;
        int highestGrade=0;
        int lowestGrade=100;
        int average=0;
        
        File inputFile = new File("grades.txt");
        Scanner file = new Scanner(inputFile);
        
        //start iterating over file.
        while(file.hasNext()) {
            grade = file.nextInt();
            studentCount ++;
            //for now we use average to keep a rolling total. we will divide by num of students after.
            average = average+grade;
            highestGrade = Math.max(grade, highestGrade);
            lowestGrade = Math.min(grade, lowestGrade);
            
            //calculate whether this was an a, b, c, d, or f.
            if (grade>=90){
                as++;
            }
            else if (grade>=80) {
                bs++;
            }
            else if (grade>=70) {
                cs++;
            }
            else if (grade>=60) {
                ds++;
            }
            else {
                fs++;
            }
        }
        
        //final calcs, now that we have the whole file.
        average = average/studentCount;
        passed = as+bs+cs+ds;
        
        //output everything.
        System.out.println("Pleas put the data in a text file, labeled \'grades.txt\', and format it as one grade per line.");
        System.out.println("Out of "+studentCount+" students, "+passed+" passed,"+'\n'+
                as+" got A's, "+bs+" got B's, "+cs+" got C's, "+ds+" got D's, and "+fs+" failed.");
        System.out.println("The hightest grade was "+highestGrade+" and the lowest grade was "+lowestGrade+'.'+'\n'+
                "The average of all the grades was "+average+'.');
    }
}
