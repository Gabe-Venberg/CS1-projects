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
public class Stack {
    private int [] list;
    private int count;
    
    public Stack () {
        list = new int [5];
        count=0;
    }
    
    public Stack (int [] startList){
        list = new int [startList.length];
        for (int i=0; i<startList.length; i++){
            list[i]=startList[i];
        }
        count=startList.length-1;
    }
    
    public int getSize(){return count;}
    
    public boolean isEmpty(){return count==0;} //dont need if, as == returns boolean.
    
    public boolean isFull(){return count>=list.length;} //still dont need if.
    
    private void addCapacity(){
        int [] temp = new int [list.length*2]; //new array
        
        for (int i=0; i<list.length;i++){//copying values into new array.
            temp[i]=list[i];
        }
        list=temp; // assign list to new, longer array
        temp=null; // make sure temp no longer points to anything.
    }
    
    public void push (int pushedValue){
        if (isFull()){
            addCapacity();
        }
        list[count]=pushedValue; //as count is initalized as 0, count is both the number of items in the stack as well as the index of the nex empty spot.
        count++;
    }
    
    public int pop(){
        count--; //as count is the index of the next free spot in list, we decrement count first. also, no need to write to the now empty slot, it will get overwritten at the next push.
        return list[count];
    }
    
    public int top(){
        return list[count-1]; // as we want this read to be non-destructive, we dont change count at all, we simply sub 1 from its value.
    }
    
    public int[] getList(){
        int [] temp = new int [count]; // returning a seperate, disposable array, to preserve encapsulation.
        for (int i = 0; i<count;i++){
            temp[i]=list[i];
        }
        return temp;
    }
    
    public String toString(){
        String temp = String.valueOf(list[0]); // manually populating with the first entry and starting at one to avoid trailing and leading commas.
        for (int i=1; i<count; i++){
            temp = temp+", "+list[i];
        }
        return temp;
    }
    
    public boolean equals(Stack testStack) {
        int [] temp = testStack.getList();
        for (int i=0; i<count;i++) {
            if (list[i]!=temp[i]){
                return false;
            }
        }
        return true; //if you get through the entire loop without finding a mismach, they must match.
    }
}