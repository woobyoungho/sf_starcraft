package com.hk.starcraft;

public class Unit {
	int max_hp;
	int hp;
	int movingSpeed;
	int x;
	int y;
	
	public void moving(Coordinates c) {
		//c에서 복사한 값을 넣어준다.
		this.x = c.x;
		this.y = c.y;
	}
	
	@Override
	public String toString() {
		return String.format("max_hp : %d, hp : %d, ms : %d, x : %d, y : %d", max_hp, hp, movingSpeed, x, y);
	}
}
