package models;

public class Term {

	private String name;// attributes
	private double weight;
	private String text;

	public Term(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getWeight() 
	{
		return weight;
	}
}
