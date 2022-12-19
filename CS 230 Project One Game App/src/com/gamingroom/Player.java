package com.gamingroom;

/**
 * A simple class to hold information about a player
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a player is
 * created.
 * </p>
 * @author coce@snhu.edu
 * @author jacob.abts@snhu.edu
 */
public class Player extends Entity {
	/*
	 * Constructor with an identifier and name
	 */
	public Player(long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player " + super.toString();
	}
}
