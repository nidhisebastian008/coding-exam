package com.everydayfood.model.service;

import java.util.List;

import com.everydayfood.model.beans.Item;

public interface ItemService {
	
	public Item createItem(Item item);
	public List<Item> fetchAllItems();

}
