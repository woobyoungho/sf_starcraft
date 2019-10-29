package com.hk.starcraft;

public class Medic extends Unit implements Healable {
	public Medic() {
		max_hp = 60;
		hp = max_hp;
		movingSpeed = 1;
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		return String.format("Medic\t->\t\t %s", str);
	}
	/*
	public void heal(Unit u1) {
		while(true) {
			if(u1.hp < u1.max_hp) {
				u1.hp++;
			} else {
				break;
			}
		}
		
	}
	*/
	
	public void heal(Unit u1) {
		if(u1 instanceof Healable) {
			//Unit u1 이 Healable로 형변환이 가능 하다면.
			//1씩 치료
			while(true) {
				if(u1.hp < u1.max_hp) {
					u1.hp++;
				} else {
					break;
				}
			}
			System.out.println("치료를 완료하였습니다.");
		} else {
			System.out.println("치료할 수 없습니다.");
		}
		
	}
}








