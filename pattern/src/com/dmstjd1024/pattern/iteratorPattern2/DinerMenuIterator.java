package com.dmstjd1024.pattern.iteratorPattern2;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator{

	MenuItem[] list;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}
	
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= list.length || list[position] == null) {
			return false;
		}else {
			return true;			
		}
	}
	
	public void remove() {
		if(position <= 0) {
			throw new IllegalStateException("next()를 한 번도 호출하지 않은 상태에서는 삭제 할 수 없습니다.");
		}
		if(list[position-1] != null) {
			for(int i = position-1; i < (list.length-1); i++) {
					list[i] = list[i+1];
				}
		}
		list[list.length-1] = null;
	}
}
