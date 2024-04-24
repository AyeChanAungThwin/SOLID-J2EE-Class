package io.github.ayechanaungthwin.solid.dip;

public class Car {

	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void startEngine() {
		this.engine.start();
	}
}
