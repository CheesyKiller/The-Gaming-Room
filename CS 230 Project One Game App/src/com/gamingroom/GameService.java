package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 * @author jacob.abts@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	/*
	 * Holds the next game identifier
	 */
	private static long nextTeamId = 1;
	
	/*
	 * Holds the next game identifier
	 */
	private static long nextPlayerId = 1;

	/**
	 * @Singleton instance created and loaded into memory
	 */
	private static GameService gameServiceInstance = new GameService();
	
	/**
	 * Private constructor to limit the amount of GameService objects able to be created in memory
	 */
	private GameService() {}
	
	/**
	 * Public get function to provide the singleton instance already created in memory
	 */
	public static GameService getInstance() {
		return gameServiceInstance;
	}

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// if an instance of a game is found with the same name, return the existing instance
		for (Game game : games) {
			if (game.getName() == name) {
				return game;
			}
		}

		// since an instance game with the name was not found, make a new game instance and add to list of games
		Game game = new Game(nextGameId++, name);
		games.add(game);

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// if a game is found, return that game instance
		for (Game game : games) {
			if (game.getId() == id) {
				return game;
			}
		}

		return null; // an instance of a game with that id was not found
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// if a game is found, return that game instance
		for (Game game : games) {
			if (game.getName() == name) {
				return game;
			}
		}

		return null; // an instance of a game with that id was not found
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	/**
	 * Returns the next team id
	 * 
	 * @return the next team id
	 */
	public long getNextTeamId() {
		return nextTeamId++;
	}
	
	/**
	 * Returns the next player id
	 * 
	 * @return the next player id
	 */
	public long getNextPlayerId() {
		return nextPlayerId++;
	}
}
