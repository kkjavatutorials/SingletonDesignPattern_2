package com.kkjavatutorials.singleton;
/**
 * @author KK Java Tutorials
 *Singleton class
 */
public class Singleton {

	private static Singleton INSTANCE = null;
	
	private Singleton() {
		
	}
	
	static {
		try {
			if(INSTANCE == null) {
				INSTANCE = new Singleton();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Singleton getInstance() {
		return INSTANCE;
		
	}
}
