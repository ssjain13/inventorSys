package com.nirmiti.inventory;

import java.util.ArrayList;
import java.util.List;

import com.nirmiti.inventory.bean.Product;

public class MockData {

	List<Product> items = new ArrayList<>();
	
	public static void init() {
		Product i = new Product("Matte Lipstick", "Red Lipstick",500, "Lipstick", 1 );
		Product i2 = new Product("Shiny Nailpolish", "Brown Nailpolish",10, "Nailpolish", 2 );
		Product i3 = new Product("Glossy Lipstick", "Pink Lipstick",120, "Lipstick", 3 );
		
	}
}
