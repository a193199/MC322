package biblioteca.controllers;


public class CSingleton {
	private static CSingleton instance;
	private CSingleton() {
	
	}
	public static CSingleton getInstance() {
		if (instance == null) {
			instance = new CSingleton();
		}
	return instance;
	}
}
