package com.dmstjd1024.pattern.templateMethodPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeinBeverageWithHook{

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("설탕과 커피를 추가하는 중");
	}
	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("필터로 커피를 우려내는 중");
	}
	
	public boolean customerWantsCondiments() {
		
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getUserInput() {
		String answer = null;
		
		System.out.println("커피에 우유와 설탕을 넣어드릴까요? (y/n) ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(answer == null) {
			return "no";
		}
		
		return answer;
	}
}
