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
public class StudentTest {
    public static void main(String[] args){
        Course CS1 = new Course(160, 4, "Pratap Kotala");
        Course linearAlgebra = new Course(129, 4, "Michal Roberts");
        Course startCourseList[]={CS1, linearAlgebra};
        Student johnDoe = new Student ("John Doe", 'm', startCourseList);
        startCourseList[0]=linearAlgebra; startCourseList[1]=CS1;
        Student johnDoe2 = new Student ("John Doe", 'm', startCourseList);
        
        //the only interesting thing about this class is that equals is order sensitive witht the course list.
        
        System.out.println(johnDoe.equals(johnDoe2));
    }
}
