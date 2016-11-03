package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Term;

public class Main {
	private Scanner input;
	private ArrayList<Term> terms;

	
	public static void main(String[] args) 
	{
		Main app = new Main();
	}
	
	public Main()
	{
		input = new Scanner(System.in);
		terms = new  ArrayList<Term>();
		runMenu();
	}
	
	private void runMenu()
	{
		
		//System.out.println("Term Search");
		
	}
}
