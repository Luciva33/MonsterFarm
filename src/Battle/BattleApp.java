package Battle;

import java.util.Random;
import java.util.Scanner;

import Charctar.Exenemy;
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

		//デバッグ用
		Hero h = new Hero();
		Exenemy e = new Exenemy();

		//Map<List<Character>,Integer>parties = new LinkedHashMap<List<Character>,Integer>();
		//parties.put(player, 0);
		//parties.put(enemy, 0);

		//モンスターが現れた！戦闘開始  関数

		callEnemy(e);

		//戦闘開始
		boolean btl = false;

		while (! btl) {
			System.out.println();

			//パーティの全滅判定 　関数

			//ステータスの表示　関数

			//先制判定(素早さが高いほうが優先）関数

			if (h.getAgi() < e.getAgi()) {
				//モンスターのターン
			}

			//コマンド選択 1:戦う　2:逃げる

			//バトルコマンド表示 関数

			battleCommandDisplay();

			int select = scan.nextInt();
			switch (select) {

			case 1://たたかう

				//敵の選択

				h.attack(e);
				break;

			case 2:
			case 3:
				System.out.println("未実装");

			case 4://にげる
					//逃げるはランダムで戦闘終了
				boolean b = false;
				h.run();
				if(b) {
				btl = true;
				}
				break;

			default:
				System.out.println("せんたくしにありません！");

			}

			//攻撃メソッド　ダメージ計算式 
			//生存判定　ダメージゼロなら全滅処理

			//パーティ情報保存

		}
		//戦闘終了
	
		//System.out.printf("%sたちはたたかいおわった！", h.getName());

	}

	public static void battleCommandDisplay() {

		System.out.println("1:たたかう");
		System.out.println("2:とくぎ"); // 職業で表示を変える
		System.out.println("3:どうぐ");
		System.out.println("4:にげる");

	}

	public static void callEnemy(Monster e) {

		System.out.println("_______________________________________________\n");
		//リスト表示で　複数現れるようにする繰り返し処理
		System.out.printf("\n%5sがあらわれた！\n\n", e.getName());

		System.out.println("_______________________________________________\n");

	}

}
