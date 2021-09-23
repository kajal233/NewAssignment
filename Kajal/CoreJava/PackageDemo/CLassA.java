package com.packagedemo;

public class CLassA {
	
	void show() {
		
		System.out.println("hi");
	}
	

	public static void main(String[] args) {
	

		CLassA cLassA = new CLassA();
		CLassA cLassA2 = new CLassA();
		
		System.out.println(cLassA);//printing object
		System.out.println(cLassA2);//printing object
		
		cLassA.show();
		
	}

}
