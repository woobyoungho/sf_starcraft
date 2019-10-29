package com.hk.starcraft;

public class FireBat extends AttackUnit implements Healable{
	public FireBat() {
		max_hp = 50;
		hp = 50;
		powerOfAttack = 8;
		movingSpeed = 1;
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		//부모의 toString 값을 받기 위해 super.toString() 사용
		return String.format("FireBat\t->\t%s", str);
	}
}
