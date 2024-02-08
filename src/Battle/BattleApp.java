package Battle;

import java.util.Random;
import java.util.Scanner;

import Charctar.Eenemy;
import Charctar.Hero;
import Charctar.Monster;

public class BattleApp {

	//戦闘システム

	public static void battle() {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int sumMoney = 0; //戦闘後に得るお金
		int sumExp = 0; //戦闘後に得る経験値

		//プレイヤーとモンスターをmapに格納

		
		//parties.put(player, 0);
		//parties.put(enemy, 0);

		
		//ターン設定

		//デバッグ用
		Hero h = new Hero("ゆうしゃ");
		Eenemy e = new Eenemy("とうぞく");
		//Map<List<Character>, Integer> parties = new LinkedHashMap<List<Character>, Integer>();
		 
		 
		//Map<List<Character>,Integer>parties = new LinkedHashMap<List<Character>,Integer>();
		//parties.put(player, 0);
		//parties.put(enemy, 0);

		//初期表示  モンスターが現れた！戦闘開始  関数

		callEnemy(h, e);

		//戦闘開始
		
		boolean btl = false;

		while (!btl) {
			System.out.println();

				
		
				//パーティの全滅判定 　関数
				
		
				//ステータスの表示　関数
			
				
			
				
				//先制判定(素早さが高いほうが優先）関数
		
				
				if (h.getAgi() < e.getAgi()) {
					//モンスターのターン
				
				}
		
				
				//バトルコマンド表示 関数
		
				callDisplay( h,  e);
				battleCommandDisplay();
		
				
				int select = scan.nextInt();
				switch (select) {
				
				
				
		
				case 1://たたかう
		
					//敵の選択
		
					h.attack(e);
					e.attack(h);
					
					break;
		
				case 2:
		
				case 3:
		
					System.out.println("未実装");
					break;
		
				case 4://にげる
						//逃げるはランダムで戦闘終了
		
					boolean b = false;
					b = h.run(); //参照型を基本型に代入
		
					if (b == true) {
						btl = true;
						break;
		
					}
		
					break;
					
					
		
				default:
					System.out.println("せんたくしにありません！");
		
				}
		
				
				
				//生存判定　ダメージゼロなら全滅処理
		
				
				
				//生存判定
				//		private static boolean isAlive(Character c){
				//			if(c.getHp() <=0){
				//				c.setHp(0);
				//				return false;
				//			}
				//			return true;
		}		
		System.out.printf("%sたちはたたかいおわった！", h.getName());
		
		
	}

	//全滅処理

	//if(player.isEmpty()) {
	//	System.out.printf("ぜんめつした...");

	//パーティ情報保存

	//戦闘終了

	
	
	
	
	
	

	//関数

	public static void battleCommandDisplay() {
		
		System.out.println("\n_______________________________________________\n");
		System.out.println("1:たたかう");
		System.out.println("2:とくぎ"); // 職業で表示を変える
		System.out.println("3:どうぐ");
		System.out.println("4:にげる");
		System.out.println("_______________________________________________\n");
	}

	public static void callEnemy(Hero h, Monster e) {

		System.out.println("_______________________________________________\n");
		//リスト表示で　複数現れるようにする繰り返し処理
		System.out.printf("\n%5sがあらわれた！\n\n", e.getName());

		System.out.println("_______________________________________________\n");
		
		
		

		//パーティー情報と　モンスターの情報ロード

		//		player = new Player(20, 10, 1);
		//		monster = new Monster(10, 5, 1);
		//		viewStatus(h.getName(),h.getHp(),h.getMp(), e.getHp(),e.getMp());

		//		String line1 =  h.getName();
		//		String line2 = "HP: " + h.getHp();
		//		String line3 = "MP: " + h.getMp();
	}
		
	public static void callDisplay(Hero h, Monster e) {
	//String line1 ; 
	String line2 = "HP: A1　    HP: B1";
	String line3 = "MP: A2　    MP: B2";
	// 値を入れ替える
	line2 = line2.replace("A1", String.format("%02d", h.getHp())).replace("B1", String.format("%02d", e.getHp()));
	line3 = line3.replace("A2", String.format("%02d", h.getMp())).replace("B2", String.format("%02d", e.getMp()));

	System.out.printf("%s%7s%n", h.getName(), e.getName());
	System.out.println(line2);
	System.out.println(line3);
	
	}

	

	//	private static void viewStatus(String playerName,int playerHp, int playerMp, int monsterHp, int monsterMp) {
	//		String line1 =  h.getName();
	//		String line2 = "ぼうぎょ: 2   HP: A1　    HP: B1";
	//		String line3 = "にげる　: 3   MP: A2　    MP: B2";
	//		// 値を入れ替える
	//		line2 = line2.replace("A1", String.format("%02d", playerHp)).replace("B1", String.format("%02d", monsterHp));
	//		line3 = line3.replace("A2", String.format("%02d", playerHp)).replace("B2", String.format("%02d", monsterHp));
	//
	//		System.out.println(line1);
	//		System.out.println(line2);
	//		System.out.println(line3);

	//参考
	//	public class TextRpgGame {
	//		/** 入力部品 */
	//		private Scanner scan;
	//		/** プレーヤー */
	//		private Player player;
	//		/** モンスター */
	//		private Monster monster;
	//
	//		/** 初期表示を行う */
	//		public void init() {
	//			System.out.println("たくのじが現れた！");
	//			player = new Player(20, 10, 1);
	//			monster = new Monster(10, 5, 1);
	//			viewStatus(player.getHp(), player.getMp(), monster.getHp(), monster.getMp());
	//			
	//			scan = new Scanner(System.in);
	//		}
	//
	//		/** 入力処理 */
	//		public String input() {
	//			return scan.next();
	//		}
	//
	//		/** 入力後に行う処理 */
	//		public boolean update(String input) {
	//			if (CheckerUtils.isNumber(input, CheckerUtils.REG_1_TO_3) == false) {
	//				System.out.println("1-3を入力してください。: " + input);
	//				return false;
	//			}
	//			// コマンド実行後の計算
	//			
	//			return true;
	//		}
	//
	//		/** 画面を更新する */
	//		public void render() {
	//			
	//		}
	//
	//		private void viewStatus(int playerHp, int playerMp, int monsterHp, int monsterMp) {
	//			String line1 = "たたかう: 1   プレーヤー   たくのじ";
	//			String line2 = "ぼうぎょ: 2   HP: A1　    HP: B1";
	//			String line3 = "にげる　: 3   MP: A2　    MP: B2";
	//			// 値を入れ替える
	//			line2 = line2.replace("A1", String.format("%02d", playerHp)).replace("B1", String.format("%02d", monsterHp));
	//			line3 = line3.replace("A2", String.format("%02d", playerHp)).replace("B2", String.format("%02d", monsterHp));
	//
	//			System.out.println(line1);
	//			System.out.println(line2);
	//			System.out.println(line3);
	//		}
	//	
	//	

}
