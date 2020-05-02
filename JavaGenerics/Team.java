package com.abhishekVelankar;

public abstract class Team<T> implements Comparable<Team<T>> {

    private String name;
    private int numberOfPlayers;
    private int ranking;
    private int wins, losses, ties;


    public Team(String name, int numberOfPlayers, int wins, int losses, int ties) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.wins = wins;
        this.losses = losses;
        this.ties = ties;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }


    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getRanking() {
        return ranking;
    }

    public void rankTheTeam() {
        ranking = ((wins * ties) + losses) * 100;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking > team.ranking) {
            return -1;
        } else if (this.ranking < team.ranking) {
            return 1;
        } else {
            return 0;
        }
    }
}