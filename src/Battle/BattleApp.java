package Battle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Charctar.CalcDamege;
import Charctar.Eenemy;
import Charctar.Hero;
import Charctar.Monster;

public class BattleApp {

	//戦闘システム

	public static void battle() throws Exception {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int sumMoney = 0; //戦闘後に得るお金
		int sumExp = 0; //戦闘後に得る経験値

		//プレイヤーとモンスターをmapに格納

		//parties.put(player, 0);
		//parties.put(enemy, 0);

		//ターン設定

		//デバッグ用
		Hero h1 = new Hero("ゆうしゃ");
		Eenemy e1 = new Eenemy("とうぞく");
		
		
		
		List<Character> playerParty = new ArrayList<>();
		List<Character>monsterParty = new ArrayList<>();
		
	 	
		
		
		
		//Map<List<Character>, Integer> parties = new LinkedHashMap<List<Character>, Integer>();

		//Map<List<Character>,Integer>parties = new LinkedHashMap<List<Character>,Integer>();
		//parties.put(player, 0);
		//parties.put(enemy, 0);

		//初期表示  モンスターが現れた！戦闘開始  関数

		callEnemy(h1, e1);

		//戦闘開始

		boolean btl = false;

		while (!btl) {
			System.out.println();

			//パーティの全滅判定 　関数

			//ステータスの表示　関数

			//先制判定(素早さが高いほうが優先）関数

			if (h1.getAgi() < e1.getAgi()) {
				//モンスターのターン

			}

			//バトルコマンド表示 関数

			callDisplay(h1, e1);
			battleCommandDisplay();

			int select = scan.nextInt();
			switch (select) {

				case 1://たたかう
	
					//敵の選択
	
					h1.attack(e1);
					e1.attack(h1);
	
					break;
	
				case 2:
					
	
					try {
						magicCommandDisplay();
						int magicselect = scan.nextInt();
						switch (magicselect) {
	
						case 1:
							h1.healMagic(h1);
							break;
						case 2:
							h1.fire(h1, e1);
							break;
	
						default:
							break;
						}
					} catch (Exception e) {
	
						System.out.println("せんたくしにありません");
						
					}
					break;
	
				case 3:
	
					System.out.println("未実装");
					break;
	
				case 4://にげる
						//逃げるはランダムで戦闘終了
	
					boolean b = false;
					b = h1.run(); //参照型を基本型に代入
	
					if (b == true) {
						btl = true;
						break;
	
					}

				default:
					System.out.println("せんたくしにありません！");
					break;
			}
			
			//生存判定　ダメージゼロなら全滅処理
			
			if(! CalcDamege.isAlive(h1)) {
				System.out.printf("%Sはまけてしまった…\n", h1.getName());
				
				btl = true;
				
			}else if(! CalcDamege.isAlive(e1)) {
				System.out.printf("%Sをたおした!\n", e1.getName() );
				sumMoney  +=e1.getMoney();
				sumExp += e1.getExp();
				//リストから削除
				
			}
			
		//敵が全滅したら
			
			
			
			
			
//			if(!isAlive(targetParty.get(target))) {
//				if(targetParty.get(target) instanceof Player) {
//					//プレイヤーの場合
//					System.out.printf("%sのHP:%d%n",targetParty.get(target).getName(),targetParty.get(target).getHp());
//					System.out.printf("%sがやられてしまった！%n",targetParty.get(target).getName());
//				}else {
//					//モンスターの場合
//					System.out.printf("%sのHP:%d%n",enemy.get(target).getName(),enemy.get(target).getHp());
//					System.out.printf("%sを倒した！%n",enemy.get(target).getName());
//					sumMoney += ((Monster)enemy.get(target)).getMoney();
//					sumExp += ((Monster)enemy.get(target)).getExp();
//				}
//				//パーティから削除
//				targetParty.remove(target);
			

		}


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
		System.out.println("2:まほう"); // 職業で表示を変える
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

	public static void magicCommandDisplay() {

		System.out.println("\n_______________________________________________\n");
		System.out.println("1:ヒール");
		System.out.println("2:ファイア");
		System.out.println("_______________________________________________\n");
	}

	

	//ライン表示
	
	public static void printLine(int num) {
		printLine(num,"-");
	}
	//ライン表示
		public static void printLine(int num,String line) {
			for(int i=0;i<num;i++) {
				System.out.print(line);
			}
			System.out.println();
		}
	
	
}
