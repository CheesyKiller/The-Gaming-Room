package com.gamingroom;

/**
 * A simple class to hold information about an entity
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a entity is
 * created.
 * </p>
 * @author jacob.abts@snhu.edu
 */
public class Entity {
	protected long id;
	protected String name;
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	protected Entity() {}
	
	/**
	 * Constructor with an identifier and name
	 */
	public Entity(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return this.id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "[id=" + this.id + ", name=" + this.name + "]";
	}
}
