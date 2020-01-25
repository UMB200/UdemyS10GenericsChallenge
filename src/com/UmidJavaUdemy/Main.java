package com.UmidJavaUdemy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
public class Main {

    public static void main(String[] args) {

        League<Team<BaseballPlayer>> baseballLeague = new League<>("USA");
        Team<BaseballPlayer> chicago = new Team<>("Chicago");
        Team<BaseballPlayer> newyork = new Team<>("New York");
        Team<BaseballPlayer> houston = new Team<>("Houston");

        chicago.defineResult(newyork, 100, 200);
        newyork.defineResult(chicago, 100, 400);
        houston.defineResult(chicago, 50, 100);
        houston.defineResult(newyork, 50, 99);
        newyork.defineResult(houston, 50, 99);
        chicago.defineResult(houston, 66, 55);

        baseballLeague.addTeam(chicago);
        baseballLeague.addTeam(newyork);
        baseballLeague.addTeam(houston);

        baseballLeague.sortRanking();


    }
}
