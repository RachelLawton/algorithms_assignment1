package models;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import controllers.BruteAutoComplete;

public class WordReaderTest {
	private WordReaderTest WordTest;
	private WordReader Words;
	private Term term26;
	private Term term36;
	private Term term50;
	private Term term255;
	private Term term947;
	private Term term994;
	@Before
	
	
	public void setUp() throws IOException 
	{
		WordTest = new WordReaderTest();
		Words = new WordReader();
	    term26 = new Term("from",410811100);
	    term36 = new Term("me",302713400);
	    term50 = new Term("there",196120000);
	    term255= new Term("Gutenberg",32832400);
	    term947 = new Term("ladies",8291800);
	    term994 = new Term("roman",7948210);
	    
	}

	
	
	@Test
	public void readWords() {
		assertEquals(Words.terms.get(26).getWeight(),term26.getWeight(),0.01);//test the names and weights of 6 known terms and weight to see if they are as whats expected
		assertEquals(Words.terms.get(26).getName(),term26.getName());
		assertEquals(Words.terms.get(36).getWeight(),term36.getWeight(),0.01);
		assertEquals(Words.terms.get(36).getName(),term36.getName());
		assertEquals(Words.terms.get(50).getWeight(),term50.getWeight(),0.01);
		assertEquals(Words.terms.get(50).getName(),term50.getName());
		assertEquals(Words.terms.get(255).getWeight(),term255.getWeight(),0.01);
		assertEquals(Words.terms.get(255).getName(),term255.getName());
		assertEquals(Words.terms.get(947).getWeight(),term947.getWeight(),0.01);
		assertEquals(Words.terms.get(947).getName(),term947.getName());
		assertEquals(Words.terms.get(994).getWeight(),term994.getWeight(),0.01);
		assertEquals(Words.terms.get(994).getName(),term994.getName());
		
		
	}

}
