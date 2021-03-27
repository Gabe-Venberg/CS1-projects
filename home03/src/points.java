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
import java.awt.Point;
public class points {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        
        /*gathering the input. Should really use some string processing in order to have the use input be comma seperated values,
        but the spec doesnt reqire it, and havent done mutch string processing in java yet..
        */
        System.out.println("Enter the x cordinate for the first point >");
        int x1 = scan.nextInt();
        System.out.println("Enter the y cordinate for the first point >");
        int y1 = scan.nextInt();
        System.out.println("Enter the x cordinate for the second point >");
        int x2 = scan.nextInt();
        System.out.println("Enter the y cordinate for the second point >");
        int y2 = scan.nextInt();
        
        //take our x and y numbers and turn them into point objects.
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        
        /*outputing our inital values. a quote from the java 14 docs:
        Returns a string representation of this point and its location in the (x,y) coordinate space.
        This method is intended to be used only for debugging purposes, and the content and format of the returned string may vary between implementations.
        The returned string may be empty but may not be null.
        This is why it returns stuff like java.awt.point[x=3, y=12]
        If we want a clean output, we should use getX and getY individually.
        */
        System.out.println("The first point is at "+p1.toString());
        System.out.println("The second point is at "+p2.toString());
        
        //apply our changes
        p1.translate(5, 10);
        p2.move(15, 20);
        
        //output our new values.
        System.out.println("The first point is now at "+p1.toString());
        System.out.println("The second point is now at "+p2.toString());
    }
}
