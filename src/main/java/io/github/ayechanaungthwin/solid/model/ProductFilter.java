package io.github.ayechanaungthwin.solid.model;

import java.util.List;

public class ProductFilter implements Filter<Product> {

	@Override
	public void filter(List<Product> items, Condition<Product> item) {
		// TODO Auto-generated method stub
		for(Product out: items) {
			if (item.isMatched(out)) System.out.println(out.getName());
		}
	}

	/*
	 * public void filter(List<Product> products, Color color) { for (Product out:
	 * products) { if (out.getColor()==color) System.out.println(out.getName()); } }
	 * 
	 * public void filter(List<Product> products, Size size) { for (Product out:
	 * products) { if (out.getSize()==size) System.out.println(out.getName()); } }
	 * 
	 * public void filter(List<Product> products, Color color, Size size) { for
	 * (Product out: products) { if (out.getColor()==color && out.getSize()==size)
	 * System.out.println(out.getName()); } }
	 */
}
