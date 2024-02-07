package Charctar;

import java.util.Random;

public class Hero extends charactar {

	Random rand = new Random();

	private String name = "ゆうしゃ";
	private int level = 3;
	private int hp = 20;
	private int mp = 10;
	private int str = 5;
	private int def = 4;
	private int agi = 4;
	private int dex = 3;

	public void attack(Monster m) {
		int damg = this.str;
		m.setHp(m.getHp() - damg);
		System.out.println(this.name + "のこうげき！");
		System.out.println(str + "のダメージ！");
	}

	public boolean run() {

		//逃走判定

		int run = rand.nextInt(100) + 1;

		if (run >= 80) {
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

}
