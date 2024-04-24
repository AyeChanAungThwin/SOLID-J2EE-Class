package io.github.ayechanaungthwin.solid.lsp;

import lombok.Data;

@Data
public class Rectangle implements Shape {

	protected double width;
	protected double length;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*length;
	}

}
