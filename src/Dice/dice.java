package Dice;

import java.util.Random;

public class dice {
	public static int roll(int num){
		int[] dices = {1,2,3,4,5,6};
		//ダイスの出目と振ったダイスの出目の和
		int dice =0;
		int diceSum = 0;

		System.out.printf("%dd6の出目 ",num);
		//出目を決める
		try {
			for(int i=1;i<=num;i++){
				if(i!=1) {
					Thread.sleep(500);
					System.out.print("+");
				}
				dice = dices[new Random().nextInt(6)];  
				System.out.printf("%d",dice);
				//出目の和
				diceSum += dice;
			}
			Thread.sleep(500);
			System.out.printf(" → %d%n",diceSum);
			Thread.sleep(1000);
		}catch(Exception e) {
		}
		return diceSum;
	}

}
