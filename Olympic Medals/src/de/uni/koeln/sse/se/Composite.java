package de.uni.koeln.sse.se;

import java.util.ArrayList;

public class Composite implements OlympicsTeams{

    public ArrayList<OlympicsTeams> Teams=new ArrayList<OlympicsTeams>();

    public void addTeam (OlympicsTeams team){
        Teams.add(team);
    }
  

    public void show() {
        for (OlympicsTeams team : Teams) {
            team.show();
        }
    }

    
    public void showatleths() {
        for (OlympicsTeams team : Teams) {
            team.showatleths();
        }
    }

    
    public void showmedals() {
        for (OlympicsTeams team : Teams) {
            team.showmedals();
        }
    }
}