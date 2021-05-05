package model;

public class DistributorCompany{

	private String name;
	private String address;
	private String contactPhone;

	public DistributorCompany( String name, String address, String contactPhone )
	{
		this.name = name;
		this.address = address;
		this.contactPhone = contactPhone;
	}

	public String toString()
	{
		String out = "\n\tName: " + name +"\n\tAddress: " +address+"\n\tContact Phone: " + contactPhone +"\n";

		return out;
	}


}