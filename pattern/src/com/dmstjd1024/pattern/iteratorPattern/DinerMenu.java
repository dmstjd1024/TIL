package com.dmstjd1024.pattern.iteratorPattern;

public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		// TODO Auto-generated constructor stub
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("채식주의자용 BLT", "통밀 위에 (식물성)베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
		addItem("오늘의 스프", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
		addItem("핫도그", "사워크라우트, 갖은 양념, 양파 치즈가 곁들어진 핫도그", false, 3.05);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.out.println("죄송합니다 메뉴가 꽉 찼습니다. 더이상 추가 할 수 없습니다.");
		}else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	
}
