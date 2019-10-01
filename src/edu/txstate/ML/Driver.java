package edu.txstate.ML;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java .util.ArrayList;
import java.util.Collections;

public class Driver {
	
	
	static String [] gen = {"Cult", "Horror", "Drama", "Romance", "Sci-fi", "Comedy", "Action", "Anime" , "Fantasy", "Kids"};
	static String [] ratings = {"G", "PG", "PG-13", "R", "NC-17", "NA"};
	public static void execute(String filename)
	{
		
		DO check = new DO();
		
        String csvFile = "Input/" + filename;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List <String> history = new ArrayList<String>();
        int counter = 0;
        int avgRanking = 0;
        int avgRating = 0;
       

        try {

            br = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), "UTF-8"));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] entry = line.split(cvsSplitBy);
                history.add(entry[1]);
                counter++; // locally counts the number of movies watched
                
                avgRanking += Double.parseDouble(entry[5]);
                
                // part of calculating E[Rating].
                switch(entry[2])
                {
                case "G":
                	avgRating += 1;
                	break;
                case "PG":
                	avgRating += 2;
                	break;
                case "PG-13":
            	    avgRating += 3;
            	    break;
                case "R":
                	avgRating += 4;
                	break;
                case "NC-17":
                	avgRating += 5;
                	break;
                case"NA":
                	avgRating += 0;
                	break;
                
                }
                
               
                
                switch(entry[4].trim()) {
                
                case "Kids":
                	check.settKids();
                	check.setrKids(Double.parseDouble(entry[3]));
                	break;
                case "Action":
                	check.settACtion();
                	check.setrACtion(Double.parseDouble(entry[3]));
                	break;
                case "Drama":
                	check.settDrama();
                	check.setrDrama(Double.parseDouble(entry[3]));
                	break;
                case "Horror":
                	check.settHorror();
                	check.setrHorror(Double.parseDouble(entry[3]));
                	break;
                case "Cult":
                	check.settCult();
                	check.setrCult(Double.parseDouble(entry[3]));
                	break;
                case "Anime":
                	check.settAnime();
                	check.setrAnime(Double.parseDouble(entry[3]));
                	break;
                case "Sci-fi":
                	check.settSci();
                	check.setrSci(Double.parseDouble(entry[3]));
                	break;
                case "Comdey":
                	check.settComedy();
                	check.setrComedy(Double.parseDouble(entry[3]));
                	break;
                case "Fantasy":
                	check.settFantasy();
                	check.setrFantasy(Double.parseDouble(entry[3]));
                	break;
                case "Romance":
                	check.settRomance();
                	check.setrRomance(Double.parseDouble(entry[3]));
                	break;
                	
                }

            }
           
            
            List <Integer> genres = check.findGenres();
            System.out.println("Movies Watched:");
        	System.out.println();
            

        	
            for (int i = 0; i < history.size(); i++)
            {
            	System.out.println(history.get(i));
            	
            	
            }
            System.out.println("\n");
            System.out.print("Rating: " + ratings[avgRating / counter] + "\n");
            System.out.print("Ranking: " + avgRanking / counter + "\n");
            
            
           FilmReader c = new FilmReader();
           List<Film> inventory = c.readData();
           
           Reccomendations work = new Reccomendations();
           
           List<Film> suggestions = work.reccomend(history,inventory, genres ,avgRating / counter, avgRanking/ counter);
           
           System.out.println("\n");
           
           Collections.shuffle(suggestions);
    	   
           
           System.out.println("Reccommended Movies:");
           for (int i = 0; i < suggestions.size() ; i++)
           {
        	   System.out.println(suggestions.get(i).getTitle());
        	   //System.out.println("Rated: " + suggestions.get(i).getRating());
        	   //System.out.print("Score: " + suggestions.get(i).getRanking() + "/5");
        	   //System.out.println("\n");
        	   
        	   if (i > 6)
        	    break;
        	   
        	   
           }
           
           
           /*
           System.out.println("\n");
           System.out.println("Full list of Suggestions:");
           
           
           for (int i = 0; i < suggestions.size() ; i++)
           {
        	   System.out.println(suggestions.get(i).getTitle());
        	   System.out.println("Rated: " + suggestions.get(i).getRating());
        	   System.out.print("Score: " + suggestions.get(i).getRanking() + "/5");
        	   System.out.println();
        	   System.out.println("\n");
        	   
           }
          */

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
        

    }
		
		
		
		
		
		
	}
	
	
	


