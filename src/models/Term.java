package models;

public class Term {
	
	private String name;//attributes
	private long weight;
	
	public Term(String name, long weight) 
	{
		super();
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public long getWeight() 
	{
		return weight;
	}

}
