package model;

public class RubbedOrPercussed extends PercussionInstruments{

	//RelationsShips:
	private ExternalElements externalElements;

	public RubbedOrPercussed( String reference, DistributorCompany distributor, Dimensions instrumentDimensions, Ubication ubication, ExternalElements externalElements)
	{
		super( reference, distributor, instrumentDimensions, ubication );
		this.externalElements = externalElements;
	}

	@Override
	public String toString()
	{
		String out = Instrument.toString+ "External Elements: " + externalElements;
	}
}
