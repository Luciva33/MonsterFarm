package Charctar;

public class Exenemy extends Monster {

	private String name = "とうぞく";
	private int level = 1;
	private int hp  = 8;
	private int mp  = 2;
	private int str = 3;
	private int def = 3;
	private int agi = 5;
	private int dex = 2; 
	private int money = 100;
	private int Exp = 8;
	
	public void attack(Hero h) {
		int damg = this.str;
		h.setHp(h.getHp() - damg);
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
