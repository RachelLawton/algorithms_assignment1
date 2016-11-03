package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Term;

public class Main {
	private Scanner input;
	private ArrayList<Term> terms;
	private boolean bruteForce;
	private BruteAutoComplete bruteAuto;
	

	
	public static void main(String[] args) throws IOException 
	{
		Main app = new Main();
	}
	
	public Main() throws IOException
	{
		input = new Scanner(System.in);
		terms = new  ArrayList<Term>();
		runMenu();
	}
	
	private int mainMenu() 
	{
	
	
	    System.out.println("---------");   
	    System.out.println("  1) BruteForce AutoComplete");   
	    System.out.println("---------");   
	    System.out.println("---------");         
	    System.out.print("==>> ");
	       int option = input.nextInt();
	       return option;
		
	}
	
	
	private void runMenu() throws IOException
	 {
		 int option = 0;
	       do //prevents it from duplicating itself many times
	       {
	    	    option = mainMenu();
	    	    
	    	   switch (option)
	           {
	              case 1:    runBruteForce();
	            	  		    break;           
	             default:    System.out.println("Invalid number Inserted: " + option);
	                         break;
	           }
	       }while
	       (option != 0);
	   }
	
	private void runBruteForce() throws IOException {
		
		
		if (bruteForce != true);
		{
			bruteAuto = new BruteAutoComplete();
		}
		System.out.println("Please insert String");
		String prefix = input.nextLine();
		prefix = input.nextLine();
		
		System.out.println("How many options of the string would you like?");
		int k = input.nextInt();
	    System.out.println(bruteAuto.matches(prefix, k));
		
	}
}
