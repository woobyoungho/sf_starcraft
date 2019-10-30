package com.hk.starcraft;

public class Barrack extends Building{
	//( ) makeUnit(int no)
	
	//no : 1 > 마린 객체화 한 다음에 그 주소값을 리턴
	//no : 2 > 파이어뱃을 객체화 한 후 주소값 리턴
	//no : 3 > 매딕을 객체화 한 후 주소값 리턴
	//1 ~ 3 값이 아닌 no가 넘어오면 null 리턴
	
	public Unit makeUnit(int no) {
		/*
		if(no == 1) {
			Marine m1 = new Marine();
			return m1;
		} else if(no == 2) {
			FireBat f1 = new FireBat();
			return f1;
		} else if(no == 3) {
			Medic m2 = new Medic();
			return m2;
		} else {
			return null;
		}
		*/
		
		switch(no) {
		case 1:
			return new Marine();
		case 2:
			return new FireBat();
		case 3:
			return new Medic();
		default:
			return null;
		}
	}

	@Override
	void depart() {
		System.out.println("이륙할 수 없습니다.");
	}

	@Override
	void landing() {
		System.out.println("착륙할 수 없습니다.");
		
	}
}
