package com.dmstjd1024.pattern.compositePattern;

import java.util.Iterator;

public class NullIterator implements Iterator{
	
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
	public NullIterator() {
		// TODO Auto-generated constructor stub
		throw new UnsupportedOperationException();
	}

}
