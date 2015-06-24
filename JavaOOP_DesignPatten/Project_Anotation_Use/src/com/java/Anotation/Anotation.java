package com.java.Anotation;

import java.lang.reflect.Method;

public class Anotation {
	
	public static void main(String[] args) {
		
		Method[] deMethods = Service.class.getDeclaredMethods();
		
		for (Method method : deMethods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				System.out.println(method.getName());
				System.out.println(printAnnotation.value());
				try {
					method.invoke(new Service());
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			
			
		}
		
		
		
		

	}
	
	

}
