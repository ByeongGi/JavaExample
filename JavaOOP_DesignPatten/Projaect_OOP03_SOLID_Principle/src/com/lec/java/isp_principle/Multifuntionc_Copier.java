package com.lec.java.isp_principle;

public class Multifuntionc_Copier implements Printer,Copier,Fax{

	@Override
	public void fax() {
		System.out.println("fax 기능을 구현 ");
		
	}

	@Override
	public void copy() {
		
		System.out.println("copy 기능을 구현 ");
	}

	@Override
	public void print() {
		System.out.println("print 기능을 구현 ");
		
	}
	
}
