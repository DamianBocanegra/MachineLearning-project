package edu.txstate.ML;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;


public class FilmReader {
	
	List <Film> readData()
	{
		List <Film> films = new ArrayList<Film>();
		
        String csvFile = "Input/ML_films.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try 
        {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) 
            {

                // use comma as separator
                String[] entry = line.split(cvsSplitBy);
                Film newFilm = new Film(1 , entry[1], entry[2], entry[3], Integer.parseInt(entry[4]), entry[5], Integer.parseInt(entry[6]));

               films.add(newFilm);

            }

        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally 
        {
            if (br != null) 
            {
                try 
                {
                    br.close();
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
		
		
		
		return films;
		
	}

	
	
	
	
	
}
