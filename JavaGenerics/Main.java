package com.abhishekVelankar;

public class Main {

    public static void main(String[] args) {

        cricketTeam csk = new cricketTeam("csk",11,24,12,4);
        cricketTeam mi = new cricketTeam("mi",11,20,13,1);
        cricketTeam kkr = new cricketTeam("kkr",11,15,10,3);
        cricketTeam kxip = new cricketTeam("kxip",11,13,12,4);
        cricketTeam rcb = new cricketTeam("rcb",11,5,15,1);

        footballTeam liverpool = new footballTeam("liverpool",11,24,12,4);
        basketballTeam theLosAngelesLakers = new basketballTeam("lheLosAngelesLakers",5,24,12,4);
        basketballTeam goldenStateWarriors = new basketballTeam("goldenStateWarriors",5,11,5,15);
        basketballTeam dukeBlueDevils = new basketballTeam("dukeBlueDevils",5,11,13,12);

        League<cricketTeam> indianPremierLeague = new League<>("IPL",2020);
        indianPremierLeague.addTeam(csk);
        indianPremierLeague.addTeam(mi);
        indianPremierLeague.addTeam(kkr);
        indianPremierLeague.addTeam(kxip);
        indianPremierLeague.addTeam(rcb);

        League<basketballTeam> nba = new League<>("NBA",2020);
        nba.addTeam(theLosAngelesLakers);
        nba.addTeam(goldenStateWarriors);
        nba.addTeam(dukeBlueDevils);

        indianPremierLeague.displayLeagueTable();
        System.out.println("");
        nba.displayLeagueTable();


    }
}
