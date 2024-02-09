package Skill;

import java.util.Random;

import Charctar.Hero;

public class Skill {

	private void healMagic(Hero h) {
		Random rand = new Random();
		int heal = rand.nextInt(5)+5; 
		
		System.out.printf("%sはHP%d回復した！\n",h.getName(),heal);
		
		
		
	}
	
}
