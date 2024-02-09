package Charctar;

import java.util.Random;

import Item.Armor;
import Item.Weapon;
import Skill.Skill;

public class Hero extends charactar {

	Random rand = new Random();

	private String name;
	private int level = 3;
	private int hp = 20;
	private int mp = 10;
	private final int Max_hp = 20;
	private final int Max_mp = 10;

	private int str = 3;
	private int def = 4;
	private int agi = 4;
	private int dex = 3;
	private Weapon wepon;
	private Armor armor;
	private Skill skill;

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
		System.out.println(damg + "のダメージ！");

		CalcDamege.isAlive(m);

		//		ダメージ計算式に使える？
		//		public int atack() {
		//			this.atack = wepons.getAttackPoint();
		//			return this.atack;

	}

	public void healMagic(Hero h) {
		Random rand = new Random();
		int heal = rand.nextInt(5) + 5;

		//リスト管理したい

		if ((h.getMp() < 2)) {
			System.out.println("MPがたりない！");
			return;

		}
		if ((h.getHp() == h.getMaXHp())) {
			System.out.printf("%sのHPはこれいじょうかいふくしない！\n", h.getName());
			return;
		}
		h.setHp(h.getHp() + heal);
		h.setMp(h.getMp() - 2); //マジックナンバーになっている

		if (h.getHp() > h.getMaXHp()) {
			h.setMaxHp(h.getMaXHp());
			System.out.printf("%sのHPはさいだいまでかいふくした!\n", h.getName());

		} else {
			System.out.printf("%sはHP%dポイントかいふくした！\n", h.getName(), heal);
		}

	}

	public void fire(Hero h, Monster m) {

		if ((h.getMp() < 3)) { //マジックナンバーになっている
			System.out.println("MPがたりない！");
			return;
		}

		Random rand = new Random();
		int fire = rand.nextInt(5) + 1;
		h.setMp(h.getMp() - 3);
		int damg = this.str + fire;
		m.setHp(m.getHp() - damg);
		System.out.println(this.name + "はファイアをとなえた！");
		System.out.println(damg + "のダメージ！");
		CalcDamege.isAlive(m);
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

	public int getMaXHp() {
		return Max_hp;
	}

	public void setMaxHp(int hp) {
		this.hp = Max_hp;
	}

	public int getMaxMp() {
		return Max_mp;
	}

	public void setMAxMp(int mp) {
		this.mp = Max_mp;
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
