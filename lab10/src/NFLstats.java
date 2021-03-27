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
 *I know nothing about football, and especially nothing about football stats...
 *
 * @author toric
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NFLstats {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // initalizing.
        File inputFile = new File("stats.txt");
        Scanner file = new Scanner(inputFile);
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        //getting file line size, to instatiate array.
        Path path = Paths.get("stats.txt");
        //first line defines columns.
        int lines = (int) Files.lines(path).count() - 1;
        double[] yards = new double[lines];
        int[] attempts = new int[lines];
        int[] completions = new int[lines];
        double[] yardsPerAttempt = new double[lines];
        double[] completionPercentage = new double[lines];
        int highYardGames = 0;
        final double highYardThreshold = 275;
        double totalYards = 0;
        double highYards = 0;

        //skip the first line, first line contains colum defs.
        /*why am I reading all this info from a file, you might ask? well, this assignment didnt tell me what input method to use.
        i didnt want to hardcode it, and no way was i entering all that data manually every run.*/
        file.nextLine();
        for (int i = 0; i < lines; i++) {
            String line = file.nextLine();
            String[] data = line.split(",");

            //column order is game,attempts,completions,yards. not using game this program.
            attempts[i] = Integer.parseInt(data[1]);
            completions[i] = Integer.parseInt(data[2]);
            yards[i] = Double.parseDouble(data[3]);
        }

        //we can put all the arrayprocessing in one loop.
        for (int i = 0; i < yards.length; i++) {
            //System.out.println(yards[i] + "," + completions[i] + "," + attempts[i]);
            totalYards = totalYards + yards[i];
            completionPercentage[i] = (double)completions[i] / (double)attempts[i];
            yardsPerAttempt[i] = yards[i] / attempts[i];
            if (yards[i] >= highYardGames) {
                highYardGames++;
            }
            highYards = Math.max(yards[i], highYards);
        }

        //print stuff. not sure why you only had us print a few of the completed values...
        for (int i = 0; i < completionPercentage.length; i++) {
            System.out.println("Game " + (i + 1) + " had a completion percentage of " + percentFormat.format(completionPercentage[i]));
        }
        System.out.println("The most yards thrown during any game was " + highYards + ".");
    }
}
