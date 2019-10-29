package com.hk.starcraft;

public class Marine extends AttackUnit implements Healable{
	
	//마린 객체화
	//max_hp 값은 40
	//hp 40
	//공격력 6
	//이동속도 1
	public Marine() {
		powerOfAttack = 6;
		max_hp = 40;
		hp = 40;
		movingSpeed = 1;
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		//부모의 toString 값을 받기 위해 super.toString() 사용
		return String.format("Marine\t->\t%s", str);
	}

}
