package oop;

public class PenMain {

	public static void main(String[] args) {
		
		/*
		 설계도에 작성한 속서오가 기능을 사용하려면
		 반드시 실체(객채)를 생성하셔야 합니다.
		 클래스만 제작된 재료는 아무 기능도 수행할 수 없습니다. 
		 */
		
		//객채 생성 문법 : 클래스타입 변수명 = new 클래스이름();
		Pen redPen = new Pen();
		Pen bluePen = new Pen();
		Pen blackPen = new Pen();
		
		//창조 연산자(.)를 통해 객채로 접근한뒤
		//속성을 지정하고 기능을 사용할 수 있습니다.
		redPen.color = "빨강";
		redPen.price = 500; 
		bluePen.color = "파랑";
		bluePen.price = 600;
		blackPen.color = "검정";
		blackPen.price = 1000;
		
		redPen.write();
		bluePen.write();
		blackPen.write();
		redPen.priceInfo();
		bluePen.priceInfo();
		blackPen.priceInfo();
		
		System.out.println(redPen);
		System.out.println(bluePen);
		System.out.println(blackPen);

	}

}
