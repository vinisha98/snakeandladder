package com.snakeandladder;

public class Snakeandladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Snake and ladder game");
		int POSITION=0;
		int Roll= (int) Math.floor((Math.random() * 10) %  6) + 1;
		if (Roll==1) {
			System.out.println(Roll);
			POSITION= (POSITION + Roll);
		}
		else if (Roll==2) {
			System.out.println(Roll);
			POSITION= (POSITION + Roll);
		}
		else if (Roll==3) {
			System.out.println(Roll);
			POSITION= (POSITION + Roll);
		}
		else if (Roll==4) {
			System.out.println(Roll);
			POSITION= (POSITION + Roll);
		}
		else if (Roll==5) {
			System.out.println(Roll);
			POSITION= (POSITION + Roll);
		}
		else {
			System.out.println(Roll);
			POSITION= (POSITION + Roll);
		}
		System.out.println("player position is at: " + POSITION);

	}

}
