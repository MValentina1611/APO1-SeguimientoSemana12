package model;

public class Bow{

	//Relationships:

	private Dimensions bowDimensions;

	public Bow( Dimensions bowDimensions )
	{
		this.bowDimensions = bowDimensions;
	}

	public String toString()
	{
		String out = "Bow Dimensions: " +bowDimensions;
		return out;
	}
}