package com.java.dip_principle;
/**
 *  Denpendency_Inversion_principle 이란 ?
 * 	의존관계를 맺을때 변하기 쉬운것이나, 차후에 자주변화하는 것보다는
 * 	변하는 것이 어려운것, 거의 변화가 없는 것에 대해서 의존하라는 것이다.
 *  구현방식 : 변하기 어려운것은 interface and abstaract class 등으로 구현하여 구현하고,
 *  나머지 변하기 쉬운 것들은  interface 와 abstaract class 를 상속받아 구현하여 사용하여 의존성 주입을 한다.
 *  
 *  의존성 주입이란 ? 
 *  클래스 외부에서 의존되는 것을 대상 객체의 인스턴스 변수에 주입하는 기술이다. 의존성 주입을 이용하면 대상객체의 내용을 
 *  변경하지 않고도 외부에서 대상 객체의 외부 의존 객체를 바꿀수 있다.
 * @author kira
 *
 */
public class Denpendency_Inversion_principle {
	
	public static void main(String[] args){
		Toy t = new Robot(); // Toy 라는 인터페이스를 통해서 다양한 자식 클래스의 객체를 받을수 있다.
		Toy t2= new Lego();  // 즉  , 외부의 인스턴스에서 대상 객체의 외부의 의존관계를 일으키는 객체를 변경할수있다.
		Kid k = new Kid();
		k.setToy(t);
		k.play();
		k.setToy(t2);
		k.play();
		
		
		
		
		
	}
	

}
