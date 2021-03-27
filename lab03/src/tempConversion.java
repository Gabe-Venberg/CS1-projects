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
 * @author gabriel.venberg
 */
public class tempConversion {
    public static void main(String[] args) {
        
        final double converCoeff = (double)5/(double)9;
        final int convertoffSet = 32;
        
        //would be better to store as array and loop through array, but have not covered arrays yet.
        double f1=32;
        double f2=72;
        double f3=0;
        double f4=212;
        
        double c1;
        double c2;
        double c3;
        double c4;
        
        //again, it would be better to loop through the array here...
        c1=(converCoeff*(f1-convertoffSet));
        c2=(converCoeff*(f2-convertoffSet));
        c3=(converCoeff*(f3-convertoffSet));
        c4=(converCoeff*(f4-convertoffSet));
        
        System.out.println(f1+" degrees F is "+c1+" degrees c");
        System.out.println(f2+" degrees F is "+c2+" degrees c");
        System.out.println(f3+" degrees F is "+c3+" degrees c");
        System.out.println(f4+" degrees F is "+c4+" degrees c");

    }
}
