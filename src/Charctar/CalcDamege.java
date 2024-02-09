package Charctar;



public class CalcDamege {

	//攻撃メソッド　ダメージ計算式 
	
	
	//基本攻撃ダメージ＝(攻撃力-敵の守備力÷2)*乱数値(54~197)/256
	
	public static int calcdamage( ) {
		int dmg =0;
		
		return dmg;
	}
	
	
	//dmg = (atk + def / 2 ) *(rand.nextInt(134)+54)/256

	
	//生存判定
	
	public static boolean isAlive(charactar c){
					if(c.getHp() <=0){
						c.setHp(0);
						return false;
					}
					return true;
	}
	
	
	
	
	
	
}
