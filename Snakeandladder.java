package com.snakeandladder;

public class Snakeandladder {
	public static final int NO_PLAY=1;
	public static final int LADDER=2;
	public static final int SNAKE=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Snake and ladder game");
		int POSITION=0;
		int Roll= (int) Math.floor((Math.random() * 10) %  6) + 1;
		switch (Roll) {
		case 1:
			System.out.println("Roll valur is: " + Roll);
			POSITION= (POSITION + Roll);
		break;
		case 2:
			System.out.println("Roll value is: " + Roll);
		break;
		case 3:
			System.out.println("Roll value is: " + Roll);
		break;
		case 4:
			System.out.println("Roll value is: " + Roll);
		break;
		case 5:	
			System.out.println("Roll value is: " + Roll);
		break;
		case 6:
			System.out.println("Roll value is: " + Roll);
		break;
		default:
			System.out.println("Roll not valid");
		}
		
		int Check= (int) Math.floor((Math.random() * 10) %  3) + 1;
		System.out.println("check value is: " + Check);
		switch (Check) {
		case NO_PLAY:
			System.out.println("player position is at: " + POSITION);
			break;
		case LADDER:
			POSITION = POSITION + Roll;
			System.out.println("player position is at: " + POSITION);
			break;
		case SNAKE:
			POSITION = POSITION - Roll;
			if (POSITION>0) {	
			System.out.println("player position is at: " + POSITION);
			}
			else {
				System.out.println("Player falles to position : 0");
			}
			break;
		default:
			System.out.println("Roll not valid");
		}
	}

}
