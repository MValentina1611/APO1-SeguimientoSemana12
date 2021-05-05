package model;

public class MusicShop{

	private String name;

	//Relationships:

	private Instrument instrument1;
	private Instrument instrument2;
	private Instrument instrument3;
	private Instrument instrument4;
	private Instrument instrument5;

	public MusicShop( String name,  Instrument instrument1, Instrument instrument2, Instrument instrument3, Instrument instrument4, Instrument instrument5 )
	{
		this.name = name;
		this.instrument1 = instrument1;
		this.instrument2 = instrument2;
		this.instrument3 = instrument3;
		this.instrument4 = instrument4;
		this.instrument5 = instrument5;

	}

	public String toString()
	{
		String out = "Music Shop's Name: " + name;
		return out;
	}

	//getters

	public Instrument getInstrument1()
	{
		return instrument1;
	}

	public Instrument getInstrument2()
	{
		return instrument2;
	}

	public Instrument getInstrument3()
	{
		return instrument3;
	}

	public Instrument getInstrument4()
	{
		return instrument4;
	}

	public Instrument getInstrument5()
	{
		return instrument5;
	}


}