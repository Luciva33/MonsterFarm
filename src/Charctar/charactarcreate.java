package Charctar;
import java.util.Scanner;

public class charactarcreate {



	//キャラ作成
	private Player player;
	public Player create() throws Exception {
		Scanner scan = new Scanner(System.in);
		
		//名前入力
		String name;
		while(true) {
			System.out.print("冒険者の名前を決めて下さい>>");
			name = scan.next();
			System.out.printf("%sでよろしいですか?(はい:1%nいいえ:2)>>",name);
			if(scan.nextInt() == 1) {
				break;
			}
		}
		this.player.setName(name);
		
		return this.player;
	}

	//playerのアクセサ
		public Player getPlayer() {
			return player;
		}

		public void setPlayer(Player player) {
			this.player = player;
		}

	

}
