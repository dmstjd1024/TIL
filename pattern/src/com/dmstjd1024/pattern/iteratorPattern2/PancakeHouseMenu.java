package com.dmstjd1024.pattern.iteratorPattern2;

import java.util.ArrayList;
import java.util.Iterator;


public class PancakeHouseMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		// TODO Auto-generated constructor stub
		menuItems = new ArrayList<MenuItem>();

		addItem("K&B 펜케이크 세트", "스크램블드 에그와 토스트가 곁들여진 팬케이크", true, 2.99);
		addItem("레귤러 팬케이크 세트", "달걀후라이와 소시지가 곁들여진 팬케이크", false, 2.99);
		addItem("블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 케이크", true, 3.49);
		addItem("와플", "와플, 취향에 따라 블루베리나 딸기를 얹을 수 있습니다.", true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("죄송합니다 메뉴가 꽉 찼습니다. 더이상 추가 할 수 없습니다.");
		} else {
			menuItems.add(menuItem);
			numberOfItems = numberOfItems + 1;
		}
	}
		 
	public Iterator createIterator() {

		return menuItems.iterator();
	}
}
