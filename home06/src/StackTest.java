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
import java.lang.Math;
public class StackTest {
    public static void main(String[] args){
        int [] testArray = new int [10];
        
        for (int i=0; i<testArray.length; i++){ //populate with random numbers.
            testArray[i]=(int)(Math.random()*100);
        }
        
        Stack testStack = new Stack(testArray);

        System.out.println("the stack contains "+testStack.toString());
        
        testStack.push(32);
        testStack.push(5);
        testStack.push(73);
        testStack.push(82);
        testStack.push(19);
        
        System.out.println("the stack contains "+testStack.toString());
        
        int maxValue = 0;
        for (int i=0; i<testStack.getList().length; i++) {
            maxValue=Math.max(maxValue, testStack.getList()[i]);
        }
        System.out.println("the max value is "+maxValue);
        
        System.out.println("popped value is "+testStack.pop());
        
        System.out.println("the stack contains "+testStack.toString());
        
        System.out.println("the top value is "+testStack.top());
        
        System.out.println("popped value is "+testStack.pop());
        
        System.out.println("the top value is "+testStack.top());
        
        System.out.println("the stack contains "+testStack.toString());
        
        System.out.println("popped value is "+testStack.pop());
                
        System.out.println("the top value is "+testStack.top());
        
        System.out.println("the stack contains "+testStack.toString());

    }
}
