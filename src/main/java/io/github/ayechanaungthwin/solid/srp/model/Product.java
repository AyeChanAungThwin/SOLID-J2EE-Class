package io.github.ayechanaungthwin.solid.srp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {

	private String name;
	private Color color;
	private Size size;
}
