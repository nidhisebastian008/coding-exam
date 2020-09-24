package com.everydayfood.model.dao;

import com.everydayfood.model.beans.Item;

public interface ItemDao {
	
	public Item store(Item item);
	public Item fetch(Item item);

}
