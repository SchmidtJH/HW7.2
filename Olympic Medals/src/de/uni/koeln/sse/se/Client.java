package de.uni.koeln.sse.se;

public class Client {

	public static void main(String[] args) {
		
			Composite AllOlympicTeams =new Composite();		
		
			Composite AsiaTeam =new Composite();
	        Composite AfricaTeam =new Composite();
	        Composite EuropeTeam =new Composite();
	        Composite SouthAmericaTeam =new Composite();
	        
	        AllOlympicTeams.addTeam(AsiaTeam);
	        AllOlympicTeams.addTeam(AfricaTeam);
	        AllOlympicTeams.addTeam(EuropeTeam);
	        AllOlympicTeams.addTeam(SouthAmericaTeam);
	        
	        Composite ChinaTeam =new Composite();
	        Composite GermanyTeam =new Composite();
	        Composite AfghanistanTeam =new Composite();
	        Composite ItalyTeam =new Composite();
	        Composite KongoTeam =new Composite(); 
	        
	        // Asian Team
	        
	        AsiaTeam.addTeam(ChinaTeam);
	        AsiaTeam.addTeam(AfghanistanTeam);
	        
	        Composite WomansTeamChina =new Composite();
	        Composite MensTeamChina =new Composite();
	        
	        ChinaTeam.addTeam(WomansTeamChina);
	        ChinaTeam.addTeam(MensTeamChina);
	        
	        //African Team 
	        
	        AfricaTeam.addTeam(KongoTeam);
	        
	        Composite WomansTeamKongo =new Composite();
	        Composite MensTeamKongo =new Composite();
	        
	        //European Team 
	        
	        EuropeTeam.addTeam(ItalyTeam);
	        EuropeTeam.addTeam(GermanyTeam);
	        
	        Composite WomansTeamItaly =new Composite();
	        Composite MensTeamItaly =new Composite();
	        
	        Composite WomansTeamGermany =new Composite();
	        Composite MensTeamGermany =new Composite();
	        
	        
	        //South America Team 
	        
	        

	        //Disciplines	
		
		
		 	Team Teakwondo = new Team("Teakwondo",30,4);
	        Team Waterpolo = new Team("Waterpolo", 25,3);
	        Team ArtisticGymnastics =new Team("ArtisticGymnastics", 18,5);
	        Team Shooting =new Team("Shooting", 15, 4);
	        Team Cycling =new Team ("Cycling", 60,2);
	        Team Tennis =new Team("Tennis", 8,1);
	        Team TableTennis =new Team ("TableTennis", 18, 8);
	        Team Football_GE =new Team("Football", 50, 1);
	        Team AlpineSky =new Team("AlpineSky", 16, 6);
	        Team Football_IT =new Team("Football", 50,0);
	        Team Swimming=new Team("Swimming", 9,2);
	        Team Sprintingteam =new Team("Sprinting", 5,9);
	        Team Climbing = new Team("Climbing", 6,1);

	        
	              
	        // China Team Sports 
	       	        
	        WomansTeamChina.addTeam(Teakwondo);
	        WomansTeamChina.addTeam(Waterpolo);
	        WomansTeamChina.addTeam(ArtisticGymnastics);
	        MensTeamChina.addTeam(Shooting);
	        
	        // German Team Sports

	        WomansTeamGermany.addTeam(Cycling);
	        WomansTeamGermany.addTeam(Tennis);
	        MensTeamGermany.addTeam(TableTennis);
	        MensTeamGermany.addTeam(Football_GE);

	        //Italy Team Sports
	        
	        WomansTeamItaly.addTeam(AlpineSky);
	        MensTeamItaly.addTeam(Football_IT);
	        MensTeamItaly.addTeam(Swimming);

	        
	        //Kongo Team Sports 
	        
	        MensTeamKongo.addTeam(Sprintingteam);
	        WomansTeamKongo.addTeam(Climbing);
	       
	      // Task 2: Added paths Africa --> Kongo --> Men --> Sprinting &
	      //   					 Africa --> Kongo --> Woman --> Climbing

	      //Task 3
	        // a)

	        System.out.println("German Team Men:");
	        MensTeamGermany.showatleths();
	        
	        // b)
	        System.out.println("German Medals");
	        MensTeamGermany.showmedals();
	        
	        // c)
	        System.out.println("Temas from Asia");
	        AsiaTeam.showmedals();
	        
	        // d)
	        System.out.println("All Olympic Atleths");
	        AllOlympicTeams.showatleths();




	    }

	}


