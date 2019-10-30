package com.hk.starcraft;

public class Academy extends Building {
	//구현 클래스 넣고 싶으면 추상 클래스 생성해야 된다.
	@Override
	void depart() {
		System.out.println("이륙할 수 없습니다.");
	}

	@Override
	void landing() {
		System.out.println("착륙할 수 없습니다.");
	}
	
}
