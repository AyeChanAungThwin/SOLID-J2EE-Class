package io.github.ayechanaungthwin.solid;

import java.util.ArrayList;
import java.util.List;

import io.github.ayechanaungthwin.solid.model.Color;
import io.github.ayechanaungthwin.solid.model.ColorCondition;
import io.github.ayechanaungthwin.solid.model.Product;
import io.github.ayechanaungthwin.solid.model.ProductFilter;
import io.github.ayechanaungthwin.solid.model.Size;
import io.github.ayechanaungthwin.solid.model.SizeCondition;

public class App {
	
    public static void main( String[] args ) {
        List<Product> products = new ArrayList<>();
        
        products.add(new Product("Apple", Color.Red, Size.M));
        products.add(new Product("Banana", Color.Yellow, Size.M));
        products.add(new Product("Strawberry", Color.Red, Size.S));
        products.add(new Product("Coconut", Color.Green, Size.L));
        products.add(new Product("Watermelon", Color.Green, Size.L));
        
        ProductFilter productFilter = new ProductFilter();
        
        //productFilter.filter(products, new ColorCondition(Color.Red));
        //productFilter.filter(products, new SizeCondition(Size.M));
    }
}
