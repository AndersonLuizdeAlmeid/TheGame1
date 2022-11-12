package model;

public class Enemy extends Player{

	public Enemy(String name, Weapon weapon,Life life) {
		Enemy.super.setName(name);
		Enemy.super.setLife(life);
		Enemy.super.setWeapon(weapon);
	}

}
