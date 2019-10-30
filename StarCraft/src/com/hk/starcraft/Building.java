package com.hk.starcraft;

public abstract class Building {
	//abstract 추상 클래스는 abstract 있으면 메인메소드에서
	//객체화 불가..
	
	//빌딩 타입으로 아카데미, 배럭 가리킬수 있다.
	//내용이 뭔지는 모르지만 호출은 가능하다.
	int max_hp;
	int hp;
	int x;
	int y;
	
	abstract void depart();
	abstract void landing();
}
