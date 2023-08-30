package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior();
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "전사1";
		w1.rage = 60;
		w1.characterInfo();

		System.out.println("----------------------------");
		
		Mage m1 = new Mage();
		m1.level = 200;
		m1.atk = 4;
		m1.hp = 20;
		m1.name = "삼장법사";
		m1.mana = 20000;
		m1.characterInfo();
		
		System.out.println("----------------------------");
		
		Hunter h1 = new Hunter();
		h1.level = 20;
		h1.atk = 400;
		h1.hp = 3000;
		h1.name = "사냥꾼";
		h1.pet = "꾼냥사";
		h1.characterInfo();
		
		
	}

}
