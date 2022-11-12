package model;

public interface Pessoa {
	
	public void setName(String name); 
	public void setLife(Life life); 
	public void setSkill(Skill skill); 
	public void setXp(Xp xp); 
	public void setWeapon(Weapon weapon); 
	public void setClasse(Classe classe); 
	public void setDefense(Defense defense); 
	
	public String getName(); 
	
	public Skill getSkill(); 
	public Life getLife(); 
	public Xp getXp(); 
	public Weapon getWeapon(); 
	public Classe getClasse(); 
	public Defense getDefense(); 
	
}
