package com.hk.starcraft;

public class Game {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		FireBat f1 = new FireBat();
		Medic m2 = new Medic();
		SiegeTank siege = new SiegeTank();
		
		Healable heal = m1;
		//강제 형변환
		
		System.out.print("마린 ");
		m2.heal(m1);
		System.out.print("시즈탱크 ");
		m2.heal(siege);
		
		/*
		//시즈모드 일때 예시
		System.out.println(m2);
		System.out.println(f1);
		
		siege.attack(m2);
		siege.changeMode();
		siege.attack(f1);
		
		System.out.println(m2);
		System.out.println(f1);
		*/
		
		/*
		//메딕 힐 줄때 예시
		m1.attack(f1);
		m1.attack(f1);
		m1.attack(f1);
		System.out.println(f1);
		
		m2.heal(f1);
		System.out.println(f1);
		*/
		
		/*
		Coordinates lo1 = new Coordinates(10, 50);
		
		m1.moving(lo1);
		m2.moving(lo1);
		
		System.out.println(m1);
		System.out.println(f1);
		System.out.println(m2);
		*/
	}
}
 