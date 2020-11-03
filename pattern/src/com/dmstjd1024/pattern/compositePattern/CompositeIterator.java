package com.dmstjd1024.pattern.compositePattern;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator{

	Stack stack = new Stack();

	public CompositeIterator(Iterator iterator) {
		// TODO Auto-generated constructor stub
		stack.push(iterator);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if(component instanceof Menu) {
				stack.push(component.createIterator() );
			}
			return component;
		}else {
			return null;
		}
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(stack.empty()) {
			return false;
		}else {
			Iterator iterator = (Iterator) stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			}else {
				return true;
			}
		}
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
