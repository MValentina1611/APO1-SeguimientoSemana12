package ui;

import model.MusicShop;
import model.Instrument;
import model.Dimensions;
import model.Material;
import model.Ubication;
import model.DistributorCompany;
import model.ExternalElements;
import model.Orientation;
import model.Keyboard;
import model.Bow;
import model.Cases;
import model.RubbedStrings;
import model.Shaken;
import model.PercussedStrings;
import model.PluckedStrings;
import model.WindInstruments;

public class Main{

	private MusicShop enClaveDeSol;

	public static void main(String args[])
	{

		Main mn = new Main();
		mn.showScenario();
		
	}

	public Main()
	{
		
		//Create a Fiddle
		Bow fiddleBow = new Bow( new Dimensions( 2.25, 1.2, 1.5) );
		Dimensions fiddleDimensions = new Dimensions(10,20,15);
		DistributorCompany fiddleDistributor = new DistributorCompany("Music.Co", "Calle 24 5-7","0354768924");

		Instrument instrument1 = new RubbedStrings( "F-188565", fiddleDistributor, fiddleDimensions , Ubication.STORE, 4, fiddleBow );


		//Create a Guitar
		Dimensions guitarDimensions = new Dimensions(100, 40, 30);
		DistributorCompany guitarDistributor = new DistributorCompany("Musiquita", "Calle 37 28-7","0359875699");

		Instrument instrument2 = new  PluckedStrings( "G-234876", guitarDistributor, guitarDimensions, Ubication.EXHIBITION, 6, 24, true );

		//Create a Flute
		Dimensions fluteDimensions = new Dimensions(50, 2, 2);
		DistributorCompany fluteDistributor = new DistributorCompany("Yamaho", "Calle 20 15-7","0356788765");

		Instrument instrument3 = new WindInstruments( "Fl-098567", fluteDistributor, fluteDimensions, Ubication.DISTRIBUTOR, Material.METAL );
		
		//Create a Piano

		Dimensions pianoDimensions  = new Dimensions(100, 200, 300);
		DistributorCompany pianoDistributor = new DistributorCompany("Jamaha", "Calle 19-7","0356733765");
		Keyboard pianoKeyboard = new Keyboard("Wood", 6, new Dimensions(50, 100, 150));
		Cases pianoCase = new Cases(new Dimensions(50,100,150));

		Instrument instrument4 = new PercussedStrings( "P-921123", pianoDistributor, pianoDimensions, Ubication.DISTRIBUTOR, pianoKeyboard, Orientation.HORIZONTAL, pianoCase );

		//MusicShop
		
		//Create a Maracas
		DistributorCompany maracasDistributor = new DistributorCompany("Shake it", "Calle 98-2","0356733123");
		Dimensions maracasDimensions = new Dimensions(20,10,8);

		Instrument instrument5 = new Shaken("M-567342", maracasDistributor, maracasDimensions, Ubication.STORE, "Tapara Bark");
				

		enClaveDeSol = new MusicShop("En Clave de Sol", instrument1, instrument2, instrument3, instrument4, instrument5 );

		
	}
	
	public void showScenario()
	{
		
			System.out.println( enClaveDeSol.toString() );
			System.out.println("\nInstrument: Fiddle\n"+ enClaveDeSol.getInstrument1().toString());			
			System.out.println("\nInstrument: Guitar\n"+ enClaveDeSol.getInstrument2().toString());
			System.out.println("\nInstrument: Flute\n"+ enClaveDeSol.getInstrument3().toString());
			System.out.println("\nInstrument: Piano\n"+ enClaveDeSol.getInstrument4().toString());
			System.out.println("\nInstrument: Maracas\n"+ enClaveDeSol.getInstrument5().toString());
	}


}











