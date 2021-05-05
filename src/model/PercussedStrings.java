package model;

public class PercussedStrings extends StringInstruments{

	private double totalDimensions;
	
	//Relationships:

	private Keyboard keyboard;
	private Orientation orientation;
	private Cases cases;
	
	public PercussedStrings( String reference, DistributorCompany distributor, Dimensions instrumentDimensions, Ubication ubication, Keyboard keyboard, Orientation orientation, Cases cases )
	{
		super( reference, distributor, instrumentDimensions, ubication );
		this.keyboard = keyboard;
		this.orientation = orientation;
		this.cases = cases;

	}

	@Override 
	public String toString()
	{
		String out = super.toString() +"\nKeyboard: "+ keyboard + "\nOrientation: "+orientation+"\nCase: "+ cases;
		return out;
	}

}