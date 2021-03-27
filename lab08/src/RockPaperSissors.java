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
public class RockPaperSissors {
    public static void main(String args[]) {
        //initialization
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int wins=0;
        int losses=0;
        int comp;
        int human;
        int result;
        //humanChoice must be a string for the exit command. compChoice can just be a char.
        char humanChoice;
        char compChoice;
        
        while (true) {
            comp = random.nextInt(3);
            System.out.println("Enter \'R\', \'P\' or \'S\' for your input.");
            System.out.println("or enter \'Q\' to exit the game.");
            System.out.print(">");
            humanChoice = scan.next().charAt(0);
            if (humanChoice == 'Q'){
                System.out.println("You had "+wins+" victories and "+losses+" defeats.");
                break;
            }
            //converting between the numbers and the human readable stuff.
            switch(comp) {
                case 0:
                    compChoice = 'R';
                    break;
                case 1:
                    compChoice = 'P';
                    break;
                case 2:
                    compChoice = 'S';
                    break;
                default:
                    //compiler wont shut up if variable does not have a default.
                    compChoice = '?';
                    System.out.println("Something went wrong!");
                    continue;
            }
            switch(humanChoice) {
                case 'R':
                    human = 0;
                    break;
                case 'P':
                    human = 1;
                    break;
                case 'S':
                    human = 2;
                    break;
                default:
                    //compiler wont shut up if variable does not have a default.
                    //we restart the loop if the input is invalid.
                    human = 0;
                    System.out.println("Sorry, invalid input.");
                    continue;
            }
            //some modulus magic finds the winner.
            //Java does strange things with negative moduluses, so im adding a 3 in there so it is always positive.
            result = (comp-human+3)%3;
            
            System.out.println("You chose "+humanChoice+", and the computer chose "+compChoice);
            switch(result){
                case 0:
                    System.out.println("You tied.");
                    break;
                case 1:
                    System.out.println("You lost.");
                    losses++;
                    break;
                case 2:
                    System.out.println("You won!");
                    wins++;
                    break;
            }
        }
    }
}
