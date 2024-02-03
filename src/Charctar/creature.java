package Charctar;

abstract class creature {
	
	//ステータス
	private String name = "冒険家";
	private int level = 1;
	private int hp;
	private int mp;
	private int str;
	private int def;
	private int agi;
	private int dex;
	
	
	
	//コンストラクタ
	public creature() {}
		
	//先制判定
	public abstract int judgePre();
	//命中判定
	public abstract int judgeHit();
	//回避判定
	public abstract int judgeAvoi();
	//ダメージ算出
	public abstract int damegeCalc();
	
	
	//名前のアクセサ
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//レベルのアクセサ
	public int getLevel() {
		return this.level;
	}
	//現在HPのアクセサ
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp =hp;
	}
	//現在MPのアクセサ
	public int getMp() {
		return this.mp;
	}
	//ちからのアクセサ
	public int getStr() {
		return this.str;
	}
	public void setStr(int str) {
		this.str =str;
	}
	//たいりょくのアクセサ
	public int getDef() {
		return this.def;
	}
	public void setDef(int def) {
		this.def =def;
	}
	//すばやさのアクセサ
	public int getAgi() {
		return this.agi;
	}
	public void setAgi(int agi) {
		this.agi = agi;
	}
	//きようさのアクセサ
	public int getDex() {
		return this.dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	//回避のアクセサ
	public abstract int getAvoi();
	//先制力のアクセサ
	public abstract int getPre();
	//命中のアクセサ
	public abstract int getHit();
	//追加ダメージ
	//public abstract int getAddDamege();
	
}
