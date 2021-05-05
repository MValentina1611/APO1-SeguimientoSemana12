package model;

public class Dimensions{

	private double height;
	private double lng;
	private double width;

	public Dimensions( double height , double lng, double width )
	{
		
		this.height = height;
		this.lng = lng;
		this.width = width;

	}  

	public String toString()
	{
		String out = "\n\tHeight: "+ height +"\n\tLong: "+ lng + "\n\tWidth: "+ width +"\n";

		return out;
	}

	//Getters and Setters

	public double getHeight()
	{
		return height;
	}


	public double getLng()
	{
		return lng;
	}


	public double getWidth()
	{
		return width;
	}

}
