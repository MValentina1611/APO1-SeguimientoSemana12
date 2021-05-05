package model;

public class Shaken extends PercussionInstruments{

	private String material;

	public Shaken(String reference, DistributorCompany distributor, Dimensions instrumentDimensions, Ubication ubication, String material )
	{
		super( reference, distributor, instrumentDimensions, ubication );
		this.material  = material;
	}

	@Override
	public String toString()
	{
		String out = super.toString()+ "Material: "+ material;
		
		return out;
	}

}
