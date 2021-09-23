package com.packagedemo;

import com.addition.AdditionService;
import com.sub.SubstractionService;

public class MainClientClassDemo {

	public static void main(String ar[]) {

		AdditionService addition = new AdditionService();

		int resutadd = addition.ShowAddition(4, 8);

		SubstractionService substraction = new SubstractionService();
		int resutlsub = substraction.ShowSub(8, 4);

		System.out.println("addd    " + resutadd);

		System.out.println("addd    " + resutlsub);
	}

}
