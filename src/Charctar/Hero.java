package Charctar;

import java.util.Random;

import Item.Armor;
import Item.Weapon;

public class Hero extends charactar {

	Random rand = new Random();

	private String name;
	private int level = 3;
	private int hp = 20;
	private int mp = 10;
	private int str = 4;
	private int def = 4;
	private int agi = 4;
	private int dex = 3;
	private Weapon wepon;
	private Armor armor;

	//コンストラクタ

	public Hero(String name) {
		this.name = name;
	}

	public Hero(int hp, int mp) {
		this.hp = hp;
		this.mp = mp;
	}

	public Hero(int hp, int mp, int level) {
		this.hp = hp;
		this.mp = mp;
		this.level = level;
	}

	public void attack(Monster m) {
		int damg = this.str;
		m.setHp(m.getHp() - damg);
		System.out.println(this.name + "のこうげき！");
		System.out.println(str + "のダメージ！");
		
		//		ダメージ計算式に使える？
		//		public int atack() {
		//			this.atack = wepons.getAttackPoint();
		//			return this.atack;

	}

	public boolean run() {

		//逃走判定

		int run = rand.nextInt(100) + 1;

		if (run >= 20) {
			//成功
			System.out.printf("%sはにげだした！\n", this.name);
			return true;
			
		} else {
			//失敗
			System.out.printf("%sはころんでしまった！\n", this.name);
			return false;
		}

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

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	@Override
	public void attack() {
		// TODO 自動生成されたメソッド・スタブ
		;
	}

	@Override
	public void diffence() {
		// TODO 自動生成されたメソッド・スタブ
		;
	}
}
