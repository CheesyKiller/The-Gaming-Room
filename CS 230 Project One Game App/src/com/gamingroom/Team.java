package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 * @author jacob.abts@snhu.edu
 */
public class Team extends Entity {
	private static List<Player> players = new ArrayList<Player>();;
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Player addPlayer(String name) {
		// if an instance of a player is found with the same name, return the existing instance
		for (Player player : players) {
			if (player.getName() == name) {
				return player;
			}
		}

		// since an instance player with the name was not found, make a new team instance and add to list of teams
		Player player = new Player(GameService.getInstance().getNextPlayerId(), name);
		players.add(player);

		// return the new/existing player instance to the caller
		return player;
	}

	@Override
	public String toString() {
		return "Team " + super.toString();
	}
}
