package com.dmstjd1024.pattern.iteratorPattern;

public class DinerMenuIterator implements Iterator{

	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		// TODO Auto-generated constructor stub
		this.items = items;
	}
	
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= items.length || items[position] == null) {
			return false;
		}else {
			return true;			
		}
	}
}
