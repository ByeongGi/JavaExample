package com.lec.java.isp_principle;
/**
 * 인터페이스를 클라이언트에 특화되도록 설계하는 것이다. 즉 ISP 는
 * 인터페이스를 클라이언트에서 특화되도록 분리시키라는 설계 원칙이다.
 * 인터페이스 Fax,Copier,printer 의 모든 기능을 가진 복합기 클래스(Multifuntion_Copier)은
 * 3개의 인터페이스의 기능을 받아서 구현할수 있다.
 * 
 * 
 * ISP원리는 한 클래스는 자신이 사용하지 않는 인터페이스는 구현하지 말아야 한다는 원리입니다. 
 * 즉 어떤 클래스가 다른 클래스에 종속될 때에는 가능한 최소한의 인터페이스만을 사용해야 합니다. 
 * ISP를 ‘하나의 일반적인 인터페이스보다는, 여러 개의 구체적인 인터페이스가 낫다’라고 정의할 수 도 있습니다.
 * 만약 어떤 클래스를 이용하는 클라이언트가 여러 개고 이들이 해당 클래스의 특정 부분집합만을 이용한다면, 
 * 이들을 따로 인터페이스로 빼내어 클라이언트가 기대하는 메시지만을 전달할 수 있도록 합니다. SRP가 클래스의 단일책임을 강조한다면 
 * ISP는 인터페이스의 단일책임을 강조합니다. 하지만 ISP는 어떤 클래스 혹은 인터페이스가 여러 책임 혹은 역할을 갖는 것을 인정합니다. 
 * 이러한 경우 ISP가 사용되는데 SRP가 클래스 분리를 통해 변화에의 적응성을 획득하는 반면, 
 * ISP에서는 인터페이스 분리를 통해 같은 목표에 도달 합니다.
 * @author kira
 *
 */
public class Interface_Segreation_Principle {

	public static void main(String[] args) {
		Multifuntionc_Copier MulCopier= new Multifuntionc_Copier();
		MulCopier.copy();
		MulCopier.fax();
		MulCopier.print();

	}

}
