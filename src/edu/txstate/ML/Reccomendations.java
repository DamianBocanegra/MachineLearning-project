package edu.txstate.ML;

import java.util.List;
import java .util.ArrayList;
import java.util.Arrays;

public class Reccomendations {
	
	static String [] ratings = {"G", "PG", "PG-13", "R", "NC-17", "NA"};
	static String [] gen = {"Cult", "Horror", "Drama", "Romance", "Sci-fi", "Comedy", "Action", "Anime" , "Fantasy", "Kids"};
	
	List <Film> reccomend(List <String> h, List<Film> i, List<Integer> g,int rating, int ranking)
	{
		List<Film> recs = new ArrayList<Film>();
		
		//Desicion Tree Abstraction
		

		for (int x = 0; x < i.size(); x++)
		{
			//Root node is it in our history
			//System.out.println("Checking History");
			if (inHistory(h, i.get(x)))
			{
				//System.out.println("Checking Genre");
				//Next node is the genre correct
				if (correctGenre(g, i.get(x)))
				{
					//System.out.println("Checking Rating");
				  //Next node is it in the range of ratings
				  if (inRangeOfRating(rating, i.get(x)))
				  {
					  //System.out.println("Checking Ranking");
					//Final node in the range of rankings
					  if (inRangeOfRanking(ranking, i.get(x)))
					  {
						  recs.add(i.get(x));
						  //System.out.println("Added a Film");
					  }
				   }
				}			
			}			
		}
		
		
		
		return recs;
	}
	
	// Checks if the film has been seen by the user before.
	Boolean inHistory(List<String> h, Film f)
	{
		for (int i = 0; i < h.size(); i++)
		{
			if (f.getTitle().equals(h.get(i)))
			{
				return false;
			}
			
			if (f.getTitle().equals("The Emoji Movie"))
			{
				return false;
			}
		}
		
	   return true;
	}
	
	//Checks to see if this movie is in a genre the user would be intrested in.
	Boolean correctGenre(List<Integer> g, Film f)
	{
		for (int i = 0; i < g.size(); i++)
		{
           String ge = gen[g.get(i) - 1];
           
           //System.out.println(ge + "\n");
           //System.out.println(f.getGenre() + "\n");
           
          if (ge.equals(f.getGenre()))
          {
        	  return true;
          }
           
		}
		
		return false;
		
	}
	
	
	
	
	Boolean inRangeOfRating(int r, Film f)
	{
		
		int rating = Arrays.asList(ratings).indexOf(f.getRating());
		
		if (ratings[r] == "G" || ratings[r] == "PG")
		{
			if (rating < 2)
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		}
		
		if (rating < r + 3 && rating > r - 3 )
		{
			return true;
		}
		
		return false;
		
	}
	
	
	Boolean inRangeOfRanking(int r, Film f)
	{
		
		if (f.getRanking() > r - 2)
		{
			return true;
		}
		
		return false;
		
	}
	
	

}
