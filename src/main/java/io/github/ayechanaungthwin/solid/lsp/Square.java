package io.github.ayechanaungthwin.solid.lsp;

public class Square implements Shape {

	private Rectangle rectangle = new Rectangle();
	
	public Square() {
		
	}
	
	public void setSide(double side) {
		rectangle.width = side;
		rectangle.length = side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return rectangle.width*rectangle.length;
	}
	
	
}