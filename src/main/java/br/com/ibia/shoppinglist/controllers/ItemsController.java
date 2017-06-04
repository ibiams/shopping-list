package br.com.ibia.shoppinglist.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ibia.shoppinglist.models.Item;

@RestController
@RequestMapping("/api")
public class ItemsController {
	
	private Item[] items = new Item[3];
	
	public ItemsController() {
		items[0] = new Item("breibs");
		items[1] = new Item("feijão");
		items[2] = new Item("Arroz");
	}
	
	@RequestMapping(value="items",
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Item[] getItems() { return items; }
}
