package model;

public class Skill {
	private String skillName;
	private int cost;
	private int damag;
	
	public Skill(String skillName, int cost, int damag) {
		this.skillName = skillName;
		this.cost = cost;
		this.damag = damag;
	}
	
	public Skill() {
	}


	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDamag() {
		return damag;
	}

	public void setDamag(int damage) {
		this.damag = damage;
	}
	
}
