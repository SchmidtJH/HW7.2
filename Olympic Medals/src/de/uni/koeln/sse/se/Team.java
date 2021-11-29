package de.uni.koeln.sse.se;

public class Team implements OlympicsTeams {
	
	public String name; 
	public int atleths;
	public int medals;
	
	public Team(String name,int atleths, int medals) {
		
		this.name = name; 
		this.atleths = atleths; 
		this.medals = medals; 
	}
	
	public void show() {
		System.out.println("Name: " + name + " Number of Athlets: " + atleths + " Anzahl der Medallien Medals: " + medals);
		
	}
	public void showatleths() {
		System.out.println ("Name: " + name + " Number of Athlets: " + atleths);
	}
	public void showmedals() { 
		System.out.println("Name: " + name+ " Number of Athlets: "+ medals);
		
	}

}
