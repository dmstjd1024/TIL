package com.dmstjd1024.pattern.templateMethodPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeinBeverageWithHook{

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("레몬을 추가하는 중");
	}
	
	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("차를 우려내는 중");
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
		
		System.out.println("차에 레몬을 넣어 드릴까요? (y/n)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
		answer = in.readLine();
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(answer == null) {
			return "no";
		}
		
		return answer;
	}
}

