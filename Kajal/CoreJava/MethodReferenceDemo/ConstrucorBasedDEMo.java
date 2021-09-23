package com.java8.methodreferencedemo;

interface Sayable7 {

	void say();
}

public class ConstrucorBasedDEMo {
	ConstrucorBasedDEMo() {

		System.out.println("from constructor");
	}

	public static void main(String ag[]) {

		Sayable7 h = ConstrucorBasedDEMo::new;

		h.say();

	}


}
