package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Term {

	private String name;// attributes
	private double weight;
	private String text;
	private List<String> words;

	public Term(String name, double weight) {
		super();//to call the method from the superclass
		this.name = name;
		this.weight = weight;
	}
//Getters
	public String getName() {
		return name;
	}

	public double getWeight() 
	{
		return weight;
	}
	
	public List<String> getSubstringList(String subString) {
		List<String> returnList = new ArrayList<String>();
		if (subString != null) {
			for (String s : words) {

				if (s.toLowerCase().contains(subString.toLowerCase()))//not case sensitive
					returnList.add(s);
			}
		}
		Collections.sort(returnList);//sorts the list
		return returnList;
	}
}
