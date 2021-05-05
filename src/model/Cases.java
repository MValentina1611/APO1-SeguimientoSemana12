package model;

public class Cases{

	//RelationShips:

	private Dimensions casesDimensions;
	
	public Cases( Dimensions casesDimensions )
	{
		this.casesDimensions = casesDimensions;
	}

	public String toString()
	{
		String out = casesDimensions.toString();
		return out;
	}
}

