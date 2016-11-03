package controllers;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.WordReader;

public class BruteForceTest {
	
	private BruteAutoComplete BruteForce;
	private WordReader Words;
	private ArrayList<String> filtered;
	private ArrayList<String> filtered2;

	
	
	
	@Before
	public void setUp() throws IOException 
	{
		BruteForce = new BruteAutoComplete();
		Words = new WordReader();
		filtered = new ArrayList<String>();
		filtered.add(Words.terms.get(262).getName());
		filtered.add(Words.terms.get(611).getName());
		filtered.add(Words.terms.get(717).getName());
		filtered.add(Words.terms.get(856).getName());
		filtered.add(Words.terms.get(1124).getName());
		filtered.add(Words.terms.get(1257).getName());
		filtered2 = new ArrayList<String>();
		filtered2.add(Words.terms.get(56).getName());
		filtered2.add(Words.terms.get(94).getName());
		filtered2.add(Words.terms.get(200).getName());
		filtered2.add(Words.terms.get(247).getName());
		filtered2.add(Words.terms.get(251).getName());
		filtered2.add(Words.terms.get(429).getName());
		
	}
	
	
	
	@Test 
	public void weightOf()
	{
		assertEquals(1276970,  BruteForce.weightOf("rachel"), 0.01);
		assertEquals(24413800, BruteForce.weightOf("law"), 0.01);
		assertEquals(1008850,  BruteForce.weightOf("tons"), 0.01);
		assertEquals(42240700, BruteForce.weightOf("lord"), 0.01);
		assertEquals(31564200, BruteForce.weightOf("money"), 0.01);
		assertEquals(990816,   BruteForce.weightOf("monarchy"), 0.01);	
	}
	
	@Test 
	public void bestMatch()
	{
		assertEquals (Words.terms.get(262).getName(),BruteForce.bestMatch("ra"));
		assertEquals (Words.terms.get(56).getName(),BruteForce.bestMatch("do"));
		assertEquals (Words.terms.get(144).getName(),BruteForce.bestMatch("ey"));
		assertEquals (Words.terms.get(231).getName(),BruteForce.bestMatch("ga"));
		assertEquals (Words.terms.get(52).getName(),BruteForce.bestMatch("mo"));
		assertEquals (Words.terms.get(0).getName(),BruteForce.bestMatch("th"));	
	}
	
	@Test 
	public void matches()
	{
		assertEquals(filtered, BruteForce.matches("ra",6));
		assertEquals(filtered2, BruteForce.matches("do",6));
		
	}
	
	@After
	public void tearDown()
	{
		BruteForce = null;
	}
}
