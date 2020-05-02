package com.abhishekVelankar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League <T extends Team> {
    
    private String name;
    private int year;

    private ArrayList<T> listOfTeams = new ArrayList<>();

    public League(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void addTeam(T team) {
        if(!listOfTeams.contains(team) ) {
            listOfTeams.add(team);
            team.rankTheTeam();
        }
        else
            System.out.println(team.getName() + " is already added in the league table !");
    }

    public void displayLeagueTable() {

        System.out.println(" ----- " + name + " -----");
        Collections.sort(listOfTeams);
        for(T team : listOfTeams ) {
            System.out.println(team.getName() + "   " + team.getRanking());
        }

    }
}
