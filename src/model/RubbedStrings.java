package model;

public class RubbedStrings extends StringInstruments{
	
	private int numberOfStrings;

	//Relationships:

	private Bow bowForStrings;

	public RubbedStrings( String reference, DistributorCompany distributor, Dimensions instrumentDimensions, Ubication ubication, int numberOfStrings, Bow bowForStrings )
	{
		super( reference, distributor, instrumentDimensions, ubication );
		this.numberOfStrings = numberOfStrings;
		this.bowForStrings = bowForStrings;
	}

	@Override 
	public String toString()
	{
		String out = super.toString()+"Number of Strings: "+ numberOfStrings+"\n"+ bowForStrings.toString();
		return out;
	}


}
