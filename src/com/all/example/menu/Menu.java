package com.all.example.menu;

import java.util.Scanner;

import com.all.example.controller.Function;

public class Menu {

	public static void displayMenu() {
		Function fc = new Function();

		Scanner sc = new Scanner(System.in);
		int select;

		do {

			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3. 신상정보 확인하기");
			System.out.println("4. 학생정보 확인하기");
			System.out.println("5. 별과 숫자 출력하기");
			System.out.println("6. 난수까지의 합게 구하기");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");

			System.out.println();
			System.out.println("실행할 메뉴 번호 입력 >>>>>>>");
			select = sc.nextInt();
			System.out.println();

			switch (select) {

			case 1:

				fc.calculator();
				break;

			case 2:

				fc.totalCalculator();
				break;
				
			case 3:

				fc.profile();
				break;
				
			case 4:

				fc.sungjuk();
				break;
				
			case 5:
				
				fc.printStarNumber();
				break;
				
			case 6:
				fc.sumRandomNumber();
				break;
				
			case 7:
				fc.continueGugudan();
				break;
				
			case 8:
				fc.shutNumber();
				break;

			default:
				System.out.println("종료");
				break;

			}

		} while (select < 10);

	}

}
