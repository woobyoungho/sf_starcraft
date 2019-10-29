package com.hk.starcraft;

public class AttackUnit extends Unit {
	int powerOfAttack;
	
	//헷갈리는 부분.
	void attack(Unit u1) {
		u1.hp -= powerOfAttack;
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		//부모의 toString 값을 받기 위해 super.toString() 사용
		return String.format("poa : %d, %s", powerOfAttack, str);
	}
}
