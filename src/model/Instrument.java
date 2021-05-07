package model;

public abstract class Instrument{

	private String reference;
	
	//RelationShips:
	private DistributorCompany distributor;
	private Dimensions instrumentDimensions;
	private Ubication ubication;

	public Instrument( String reference, DistributorCompany distributor, Dimensions instrumentDimensions, Ubication ubication )
	{

		this.reference = reference;
		this.distributor = distributor; 
		this.instrumentDimensions = instrumentDimensions;
		this.ubication = ubication;

	}
	
	public String toString()
	{
		String out = "Reference: "+ reference +"\nDistributor: "+ distributor +"\nUbication: "+ ubication +"\nDimensions: " +instrumentDimensions+"\n";

		return out;

	}

	



}
