package model;

public class WindInstruments extends Instrument{

	//RelationsShips:

	private Material windMaterial;
	
	public WindInstruments( String reference, DistributorCompany distributor, Dimensions instrumentDimensions, Ubication ubication, Material windMaterial )
	{
		super( reference, distributor, instrumentDimensions, ubication );
		this.windMaterial = windMaterial;

	}

	@Override
	public String toString()
	{
		String out = super.toString() +" Material: "+ windMaterial;

		return out;
	}
}

