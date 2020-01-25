package com.UmidJavaUdemy;
// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private int ranking;
    private ArrayList<T> teamArray = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRanking() {
        return ranking;
    }

    public boolean addTeam(T team) {
        if (teamArray.contains(team)) {
            System.out.println(team.gettName() + " alread exists");
            return false;
        } else {
            teamArray.add(team);
            System.out.println(team.gettName() + " added to the " + this.name + " league");
            return true;
        }
    }


    public void sortRanking() {
        Collections.sort(teamArray);
        for (T t : teamArray) {
            System.out.println(t.gettName() + " ranking: " + t.teamRank());
        }
    }


//    public void printTeams(){
//        Collections.sort();
//        for(int i =0; i < teamArray.size(); i++){
//            System.out.println("Team " + teamArray.get(i));
//        }
//
//    }
//    private int teamRank(){
//
//    }
//
//    @Override
//    public int compareTo(Team team) {
//
//        return 0;
//    }

}
