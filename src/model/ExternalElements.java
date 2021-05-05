package model;

public class ExternalElements{

	private String material;
	private int number;

	//RelationShips:

	private Dimensions exDimensions;

	public ExternalElements( String material, int number, Dimensions exDimensions)
	{
		this.material = material;
		this.number = number;
		this.exDimensions = exDimensions;
	}

	public String toString()
	{
		String out = "External Elements:\nMaterial: "+ material +"\nNumber: "+number+"\nDimensions: "+exDimensions+"\n";
		return out;

	}

}

