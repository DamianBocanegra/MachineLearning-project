package edu.txstate.ML;

import java.util.Scanner;

public class MainP {
	
	
	public static void main(String[] args)
	{
		String input = "";
		Scanner scanner = new Scanner( System.in );
	while (input != "n" )
	{

	    System.out.println( "Which User would you like to view?");
	    System.out.println("0 - Kids using parents account");
	    System.out.println("1 - Guy who watches multiple genres");
	    System.out.println("2 - 5-star guy");
	    System.out.println("3 - Damian's histoy");
	    System.out.println("4 - Ryan's history");
	    System.out.println("5 - Run all.");
	    System.out.println("Enter here: ");
	    
	    input = scanner.nextLine();

	    switch (input)
	    {
	    case "0":
	    	Driver.execute("C1.csv");
	    	break;
	    case "1":
	    	Driver.execute("c2.csv");
	    	break;
	    case "2":
	    	Driver.execute("c3.csv");
	    	break;
	    case "3":
	    	Driver.execute("Personal_his.csv");
	    	break;
	    case "4":
	    	Driver.execute("Personal_his2.csv");
	    	break;    	
	    case "n":
	    	System.out.println("Thanks for using!");
	    	scanner.close();
	    	return;
	    default:
	    	Driver.execute("C1.csv");

	        System.out.println("...");
	        new java.util.Scanner(System.in).nextLine();
	        
	    	Driver.execute("c2.csv");
	        System.out.println("...");
	        new java.util.Scanner(System.in).nextLine();
	    	Driver.execute("c3.csv");
	        System.out.println("...");
	        new java.util.Scanner(System.in).nextLine();
	    	Driver.execute("Personal_his.csv");
	        System.out.println("...");
	        new java.util.Scanner(System.in).nextLine();
	    	Driver.execute("Personal_his2.csv");
	        System.out.println("...");
	        new java.util.Scanner(System.in).nextLine();
	        scanner.close();
	        System.out.println("Thanks for using!");
	        return;	
	    	
	    }
		
	    System.out.println("...");
	    new java.util.Scanner(System.in).nextLine();
		
	};	
		
	scanner.close();
	return;
	
	
	}
	

}
