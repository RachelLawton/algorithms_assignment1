package models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordReader {
	private List<String> words;

	public static List<Term> terms = new ArrayList<Term>();

	public WordReader() throws IOException 
	{
		readWords();
	}

	public static void readWords() throws IOException 
	{
		String words = "wiktionary.txt";// reading in words
		File wiktionary = new File(words);
		Scanner inUsers = new Scanner(wiktionary);
		String delims = "\t";// telling it that there is tabs.
		inUsers.nextLine();// gets rid of first stray line
		while (inUsers.hasNextLine()) {
			String userDetails = inUsers.nextLine().trim();// cleans up white space at the start
			String[] userTokens = userDetails.split(delims);// splits the weight from the term

			// output user data to console.
			if (userTokens.length == 2) {
				Term t = new Term(userTokens[1], Long.parseLong(userTokens[0]));//instead of going to console it foes to the arraylist term
				terms.add(t);

			} else {
				inUsers.close();
				throw new IOException("Invalid length: " + userTokens.length);
			}
		}
		inUsers.close();
	}
}