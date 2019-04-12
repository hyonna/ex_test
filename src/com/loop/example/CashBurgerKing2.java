package com.loop.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CashBurgerKing2 {

	private Scanner sc;

	public CashBurgerKing2() {

		sc = new Scanner(System.in);

	}

	public void selectMenu() {

		String name = "0-불고기버거-치킨버거-감자튀김-치즈스틱-샐러드-콜라-에이드-커피";
		String price = "0-3500-3200-1000-400-2000-700-1200-1000";

		String[] menuName = name.split("-");
		String[] menuPrice = price.split("-");

		int[] menuPrice2 = new int[menuPrice.length];

		for (int i = 0; i < menuPrice.length; i++) {

			menuPrice2[i] = Integer.parseInt(menuPrice[i]);
		}

		int[] menuLength = new int[9];

		int count = 0;
		int menuNum = 0;
		int[] menuArr = null;
		int total = 0;

		boolean check = true;

		while (check) {

			System.out.println("*** 메뉴를 선택하세요 ***");
			System.out.println();
			System.out.println("햄버거 ******************");
			System.out.println("1. 불고기버거	3500원");
			System.out.println("2. 치킨버거	3200원");
			System.out.println("추가 *******************");
			System.out.println("3. 감자튀김	1000원");
			System.out.println("4. 치즈스틱	400원");
			System.out.println("5. 샐러드		2000원");
			System.out.println("음료수 ******************");
			System.out.println("6. 콜라		700원");
			System.out.println("7. 에이드		1200원");
			System.out.println("8. 커피		1000원");
			System.out.println("***********************");
			System.out.println("메뉴 선택 >>>>>>>>>>>>>");
			int select = sc.nextInt();

			for (int i = 0; i <= menuLength.length; i++) {

				if (select == i) {

					System.out.println(menuName[i] + "를 선택하셨습니다.\r\n");
					System.out.println("수량을 입력>>>>>>");
					count = sc.nextInt();
					System.out.println(count + "개 주문하셨습니다.\r\n");

					menuNum = count * menuPrice2[i];
					

				}

			}
			System.out.println("추가 주문 하시겠습니까? (y / n)");
			String add = sc.next();

			if (add.equals("n") || add.equals("N")) {

			//	total = menuNum[index];

				System.out.println();
				System.out.println("*주문하신 정보는 다음과 같습니다*");
				System.out.println("================================");

//				for (int i = 0; i < menuLength.length; i++) {
//
//					int count2 = menuNum / menuPrice2[i];
//					System.out.println(menuName[i] + " : " + count2 + "개 - " + menuNum + "원");
//
//				}

				System.out.println("================================");
				System.out.println("총 가격 : " + total + "원");

				check = !check;

			}

		}

	}

}
