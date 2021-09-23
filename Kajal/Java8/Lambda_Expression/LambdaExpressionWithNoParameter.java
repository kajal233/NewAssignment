package com.java8.lambdaexp;
interface Sayable{
	String Say();}

public class LambdaExpressionWithNoParameter {
public static void main(String[] args) {
	Sayable s = () -> {
		return "hi how are you";};
		System.out.println(s.Say());
		}}
	