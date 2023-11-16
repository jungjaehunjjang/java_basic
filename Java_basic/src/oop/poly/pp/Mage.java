package oop.poly.pp;


public class Mage extends Player {

	
	int mana;
	
	Mage(String name){
		super(name);
		this.mana = 100;
	}
		void blizzard(Player[] target) {
			System.out.printf(" %s이 눈보라를 시전했습니다.\n",this.name);
			this.mana -= 10;
			System.out.printf("마나" + 10 + "사용했다. 남은 마나 : %d\n ",this.mana);
			System.out.println("-----------------------");
			for(Player j : target ) {
				int damage = (int) (Math.random()*6+10);
				System.out.printf(" %s가 %s한테 %d만큼 피해를 입혔다.\n" 
						,this.name, j.name, damage );
				j.hp -= damage;
				System.out.printf("(남은 체력 : %d)\n ",j.hp);
			}
		}
	
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 정신력: " + mana);
		
	}

}
