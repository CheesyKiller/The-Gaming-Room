package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 * @author jacob.abts@snhu.edu
 */
public class Game extends Entity {
	private static List<Team> teams = new ArrayList<Team>();;
	
	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * Constructor with an identifier and name
	 */
	public Team addTeam(String name) {
		// if an instance of a team is found with the same name, return the existing instance
		for (Team team : teams) {
			if (team.getName() == name) {
				return team;
			}
		}

		// since an instance team with the name was not found, make a new team instance and add to list of teams
		Team team = new Team(GameService.getInstance().getNextTeamId(), name);
		teams.add(team);

		// return the new/existing team instance to the caller
		return team;
	}

	@Override
	public String toString() {
		return "Game " + super.toString();
	}

}
