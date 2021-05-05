package model;

public class PluckedStrings extends StringInstruments{

	private int numberOfStrings;
	private int numberOfFrets;
	private boolean haveCase;

	public PluckedStrings( String reference, DistributorCompany distributor, Dimensions instrumentDimensions, Ubication ubication, int numberOfStrings, int numberOfFrets, boolean haveCase )
	{
		super( reference, distributor, instrumentDimensions, ubication );
		this.numberOfStrings = numberOfStrings;
		this.numberOfFrets = numberOfFrets;
		this.haveCase = haveCase;

	}

	@Override
	public String toString()
	{
		String out = super.toString()+"Number of Strings: "+ numberOfStrings+"\nNumber of Frets: "+ numberOfFrets+"\nHaveCase: "+haveCase;
		return out;
	}
	
}