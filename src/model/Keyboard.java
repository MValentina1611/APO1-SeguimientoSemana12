package model;

public class Keyboard{

	private String material;
	private int numberOfOctaves;

	//Relationships:

	private Dimensions keyboardDimensions;

	public Keyboard( String material, int numberOfOctaves, Dimensions keyboardDimensions )
	{
		this.material = material;
		this.numberOfOctaves = numberOfOctaves;
		this.keyboardDimensions = keyboardDimensions;			
	}
	
	public String toString()
	{
		String out = "\n\tMaterial: "+ material + "\n\tNumber of Octave: " + numberOfOctaves + "\n\t" + keyboardDimensions.toString();
		
		return out;
	}
}
