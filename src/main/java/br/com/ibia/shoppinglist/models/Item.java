package br.com.ibia.shoppinglist.models;

import lombok.Getter;
import lombok.Setter;

public class Item {
	@Getter @Setter
	private String name;

	public Item(String name) {
		this.name = name;
	}
}
