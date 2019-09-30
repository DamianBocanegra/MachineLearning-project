package edu.txstate.ML;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class DO {
	
	// Retention times by genre
	private double rDrama = 0;
	private double rACtion = 0;
	private double rKids = 0;
	private double rHorror = 0;
	private double rFantasy = 0;
	private double rAnime = 0;
	private double rComedy = 0;
	private double rCult = 0;
	private double rSci = 0;
	private double rRomance = 0;
	
	//Total number of films by Genre
	private double tDrama = 0;
	private double tACtion = 0;
	private double tKids = 0;
	private double tHorror = 0;
	private double tFantasy = 0;
	private double tAnime = 0;
	private double tComedy = 0;
	private double tCult = 0;
	private double tSci = 0;
	private double tRomance = 0;
	
	//List that holds genre values to calculate e[x]
	 int [] genres = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private  List <Double> gen = new ArrayList<Double>();
	
	
	
	public double getrDrama() {
		return rDrama;
	}

	public void setrDrama(double r) {
		rDrama = rDrama + r;
	}

	public double getrACtion() {
		return rACtion;
	}

	public void setrACtion(double r) {
		rACtion = rACtion + r ;
	}

	public double getrKids() {
		return rKids;
	}

	public void setrKids(double r) {
		rKids = rKids + r;
	}

	public double getrHorror() {
		return rHorror;
	}

	public void setrHorror(double r) {
		rHorror = rHorror + r;
	}

	public double getrFantasy() {
		return rFantasy;
	}

	public void setrFantasy(double r) {
		rFantasy = rFantasy + r;
	}

	public double getrAnime() {
		return rAnime;
	}

	public void setrAnime(double r) {
	     rAnime = rAnime + r;
	}

	public double getrComedy() {
		return rComedy;
	}

	public void setrComedy(double r) {
		rComedy = rComedy + r;
	}

	public double getrCult() {
		return rCult;
	}

	public void setrCult(double r) {
		rCult = rCult + r;
	}

	public double getrSci() {
		return rSci;
	}

	public void setrSci(double r) {
		rSci = rSci + r;
	}

	public double gettDrama() {
		return tDrama;
	}

	public void settDrama() {
		tDrama = tDrama + 1.0;
	}

	public double gettACtion() {
		return tACtion;
	}

	public void settACtion() {
		tACtion = tACtion + 1.0;
	}

	public double gettKids() {
		return tKids;
	}

	public void settKids() {
		tKids = tKids + 1.0;
	}

	public double gettHorror() {
		return tHorror;
	}

	public void settHorror() {
		tHorror += 1.0;
	}

	public double gettFantasy() {
		return tFantasy;
	}

	public void settFantasy() {
		tFantasy += 1.0;
	}

	public double gettAnime() {
		return tAnime;
	}

	public void settAnime() {
		tAnime += 1.0;
	}

	public double gettComedy() {
		return tComedy;
	}

	public void settComedy() {
		tComedy += 1.0;
	}

	public double gettCult() {
		return tCult;
	}

	public void settCult() {
		tCult += 1.0;
	}

	public double gettSci() {
		return tSci;
	}

	public void settSci() {
		tSci = tSci + 1.0;
	}
    
	
	
	public double getrRomance() {
		return rRomance;
	}

	public void setrRomance(double r) {
		rRomance = rRomance + r;
	}

	public double gettRomance() {
		return tRomance;
	}

	public void settRomance() {
		tRomance = tRomance + 1.0;
	}

	public List <Integer> findGenres()
	{
		double total = tDrama + tACtion + tKids + tHorror + tFantasy + tAnime + tComedy + tCult + tSci + tRomance;
	    double [] retention = {rCult / total, 
	    		rHorror / total, 
	    		rDrama / total, 
	    		rRomance/ total ,
	    		rSci / total,  
	    		rComedy / total,  
	    		rACtion / total,  
	    		tAnime / total,  
	    		tFantasy / total,  
	    		tKids / total};
	    
	    List <Integer> g = new ArrayList<Integer>();
	    
	    

		//System.out.print(total);
		//System.out.print("\n");
       
	    for (int i = 0; i < retention.length; i++)
	    {
            
	        //System.out.println(i + " " + retention[i]);
	        //System.out.print("\n");
	        
	        gen.add(retention[i]);
	    
	    
	    }
	    
	    Collections.sort(gen);
	    if (gen.contains(1.0))
	    {
	    	//System.out.println(gen.indexOf(1.0));
	    	g.add(gen.indexOf(1.0) + 1);
	    	g.add(gen.indexOf(1.0) + 1);
	    	g.add(gen.indexOf(1.0) + 1);
	    	
	    	return g;
	    }
	    
	    Collections.reverse(gen);
       
	    
	    //System.out.println(gen);
        //System.out.print("\n");
        
        for (int i = 0; i < retention.length; i++)
        {
    	    //System.out.println(retention[i]);
            //System.out.print("\n");
    	    //System.out.println(gen.get(0));
            //System.out.print("\n");
            
            
          if (gen.get(0) != 0 && gen.get(1) != 0 && gen.get(2) != 0)
          {
        	if (retention[i] == gen.get(0))
        		{g.add(i + 1);}
        	if (retention[i] == gen.get(1))
        		{g.add(i + 1);}
        	if (retention[i] == gen.get(2))
        		{g.add(i + 1);}
        	if (g.size() == 3)
        		break;
          }
          
          
          
          if (gen.get(0) != 0 && gen.get(1) != 0 && gen.get(2) == 0)
          {
        	if (retention[i] == gen.get(0))
        		{g.add(i + 1);}
        	if (retention[i] == gen.get(1))
        		{g.add(i + 1);}
        	if (g.size() == 3)
        		break;
          }
        }
	    
	     return g; 
          
	}
	
	
	
	
	
}
