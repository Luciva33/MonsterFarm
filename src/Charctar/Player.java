package Charctar;

import Item.Armor;
import Item.Shield;
import Item.Weapon;

public abstract class Player extends charactar {

//	Map<String, Integer> jobs = new LinkedHashMap<String, Integer>();
	//職業
	//戦闘特技
//	Set<Skill> skills = new LinkedHashSet<Skill>();

	//武器
	private Weapon weapon;
	//Weapon weapon = new Panch();

	//鎧
	private Armor armor;
	//Armor armor = new Nude(); 

	//盾
	private Shield shield;
	//Shield shield = new Nohand();

	//アイテム

	private int money = 100;//所持金
	private static int bank;//預金/借金

	//経験値
	private int exp;
	
	//コンストラクタ
	public Player() {
		;
	}

	public  Player(String name) {
		this.name = name; 
	}
	
	public  Player(int hp, int mp) {
		this.hp = hp;
		this.mp = mp;
	}
	
	public  Player(int hp, int mp, int level) {
		this.hp = hp;
		this.mp = mp;
		this.level = level;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//先制判定
	//public int judgePre() {
	//	return ;
	//}

	//命中判定
	//	public int judgeHit() {
	//		return ;
	//		
	//	}

	//回避判定:修正予定
	//		public int judgeAvoi() {
	//			int dice = Dice.roll(2);
	//			return autoJudge(dice,getAvoi());

	//ダメージロール
	//		public int damageCalcl(){
	//			int dice = Dice.roll(2)-2;
	//			if(dice > 0){
	//				System.out.printf("%sの威力は%d%n",getWeapon().getName(),getWeapon().getPower(dice));
	//				return getWeapon().getPower(dice) + this.getStrBonus();
	//			}else{
	//				System.out.println("自動失敗!ダメージを与えられなかった");
	//				return 0;
	//			}
	//		}
	//技能の追加習得
	//	abstract public void addJob();
	
	//経験値のアクセサ
	public int getExp() {
		return this.exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	

}
