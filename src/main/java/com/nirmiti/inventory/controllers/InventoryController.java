package com.nirmiti.inventory.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirmiti.inventory.bean.Product;

@RestController
public class InventoryController {

	@RequestMapping("/")
	public String sayHello() {
		return "Hello There";

	}

	public List<Product> getAllItems(){
		return null;
		
	}
	@RequestMapping("/save")
	public String saveInventoryItem(Product item) {
		
		return "OK";
	}
}
