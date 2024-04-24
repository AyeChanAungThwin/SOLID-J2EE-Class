package io.github.ayechanaungthwin.solid;

import java.util.ArrayList;
import java.util.List;

import io.github.ayechanaungthwin.solid.dip.Car;
import io.github.ayechanaungthwin.solid.dip.PetrolEngine;
import io.github.ayechanaungthwin.solid.lsp.Rectangle;
import io.github.ayechanaungthwin.solid.lsp.Square;
import io.github.ayechanaungthwin.solid.srp.model.Color;
import io.github.ayechanaungthwin.solid.srp.model.Product;
import io.github.ayechanaungthwin.solid.srp.model.ProductFilter;
import io.github.ayechanaungthwin.solid.srp.model.Size;
import io.github.ayechanaungthwin.solid.srp.model.SizeCondition;

public class App {
	
    public static void main( String[] args ) {
        //srpAndOcp();
    	//lsp();
    	//dip();
    }
    
    public static void srpAndOcp() {
    	List<Product> products = new ArrayList<>();
        
        products.add(new Product("Apple", Color.Red, Size.M));
        products.add(new Product("Banana", Color.Yellow, Size.M));
        products.add(new Product("Strawberry", Color.Red, Size.S));
        products.add(new Product("Coconut", Color.Green, Size.L));
        products.add(new Product("Watermelon", Color.Green, Size.L));
        
        ProductFilter productFilter = new ProductFilter();
        
        //productFilter.filter(products, new ColorCondition(Color.Red));
        productFilter.filter(products, new SizeCondition(Size.S));
    }
    
    public static void lsp() {
    	Rectangle rectangle = new Rectangle();
    	rectangle.setWidth(5.0);
    	rectangle.setLength(2.0);
    	System.out.println(rectangle.area());
    	
    	Square square = new Square();
    	square.setSide(2.0);
    	System.out.println(square.area());
    }
    
    public static void dip() {
    	PetrolEngine engine1 = new PetrolEngine();
    	//GasEngine engine2 = new GasEngine();
    	
    	Car car = new Car(engine1);
    	car.startEngine();
    }
}
