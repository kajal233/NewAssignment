package com.demo1;

public class Main {
		public static void main(String[] args) {
			Guitar g1; //instance variable for Guitar Interface
			Piano g2; //instance variable for Piano Interface.
			g1 = new Instrument();
			g2 = new Instrument();
			System.out.print("Guitar");
			g1.play();
			System.out.print("Piano");
			g2.play();
		}
	}

