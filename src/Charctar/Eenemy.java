package Charctar;

public class Eenemy extends Monster {

	private String name ;
	private int level = 1;
	private int hp  = 8;
	private int mp  = 2;
	private int str = 5;
	private int def = 3;
	private int agi = 5;
	private int dex = 2; 
	private int money = 100;
	private int Exp = 8;
	
	public Eenemy(String name) {
		this.name = name;
	}
	
	
	
	public void attack(Hero h) {
		int damg = this.str;
		h.setHp(h.getHp() - damg);
		System.out.println(this.name + "のこうげき！");
		System.out.println(str + "のダメージ！");
		CalcDamege.isAlive(h);
	}
	
	
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	/**
	 * @return the mp
	 */
	public int getMp() {
		return mp;
	}
	/**
	 * @param mp the mp to set
	 */
	public void setMp(int mp) {
		this.mp = mp;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	public int getMoney() {
		return money;
	}

	/**
	 * @param level the level to set
	 */
	public int getExp() {
		return Exp;
	}

	
	
	

	@Override
	public void attack() {
		// TODO 自動生成されたメソッド・スタブ
		
	}



	@Override
	public void diffence() {
		// TODO 自動生成されたメソッド・スタブ
		
	}



	public boolean run() {
		return true;
		
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	
	
}
