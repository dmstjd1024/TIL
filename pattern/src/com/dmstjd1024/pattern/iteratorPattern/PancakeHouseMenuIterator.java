package com.dmstjd1024.pattern.iteratorPattern;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{

	ArrayList<MenuItem> items;
	int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
		// TODO Auto-generated constructor stub
		this.items = menuItems;
	}
	
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = (MenuItem)items.get(position);
		position = position + 1;
		return menuItem;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= items.size() || items.get(position) == null) {
			return false;
		}else {
			return true;			
		}
	}
}
