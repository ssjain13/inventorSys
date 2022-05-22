package com.nirmiti.inventory.service;

import java.util.List;

import com.nirmiti.inventory.bean.Product;

public interface InventorySrvc {

	List<Product> getAllItems();
	Product getItemById(int id);
	Product getItemByName(String name);
	List<Product> getItemsByCategory(String category);
	
}
