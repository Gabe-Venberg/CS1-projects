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
import java.util.Random;
public class HiLo {
    public static void main(String args[]) {
        //initialization
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int target;
        int guess=0;
        int tries = 1;
        String input;
        final int SENTINEL = -1;
        final int maxTarget = 100;
        final int minTarget = 1;
        
        //generate our target.
        target = random.nextInt((maxTarget-minTarget)+1)+minTarget;
        
        //explain the game.
        System.out.println("I have chosen a number between "+minTarget+" and "+maxTarget+".");
        System.out.println("Each time you guess, I will tell you if your guess is high or low.");
        System.out.println("The goal is to get the number in an few tries as possible.");
        System.out.println("If you want to stop playing, type \'exit\'");
        
        while(guess!=SENTINEL) {
            //get next guess.
            System.out.println("Try "+tries);
            System.out.print("Enter your guess >");
            input = scan.nextLine();
            System.out.println();
            
            
            //figure out what our output should be
            if (input.equals("exit")){
                //why cant we just use a break here?
                guess = SENTINEL;
            }
            else{
                //if we are not exiting, convert the input to a proper integer, and do the comparison.
                guess = Integer.valueOf(input);
                if (guess < target) {
                   System.out.println("Your guess is too low.");
                   tries ++;
                }
                else if (guess > target) {
                    System.out.println("your guess is too high");
                    tries ++;
                }
                else if (guess == target) {
                    System.out.println("Your guess is correct!");
                    System.out.println("It took you "+tries+" tries to guess it.");
                    //if I didnt have to use a sentinel value here, I could have prevented the nested if statements and just used a break.
                    guess = SENTINEL;
                }
            }
        }
    }
}
