package com.hk.starcraft;

public class SiegeTank extends AttackUnit {
	boolean siegeMode;
	int siegePowerOfAttack = 70;
	
	public SiegeTank() {
		max_hp = 150;
		hp = max_hp;
		powerOfAttack = 30;
		movingSpeed = 1;
	}
	
	void changeMode() {
		siegeMode = !siegeMode;
		//좋은 소스 -> 실력 향상
		/*
		if(siegeMode == false) {
			siegeMode = true;
		} else {
			siegeMode = false;
		}
		*/
	}
	
	@Override
	public String toString() {
		return "siegeMode : " + siegeMode;
	}
	
	//틀림. 오버라이딩 사용시.
	@Override
	void attack(Unit u1) {
		if(siegeMode) {
			u1.hp -= siegePowerOfAttack;
		} else {
			super.attack(u1);
		}
	}
}
