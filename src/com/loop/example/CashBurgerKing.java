package com.loop.example;

import java.util.Scanner;

public class CashBurgerKing {

	private Scanner sc;

	public CashBurgerKing() {

		sc = new Scanner(System.in);
	}

	public void selectMenu() {

		int bBurger = 0;
		int cBurger = 0;
		int potato = 0;
		int cheeze = 0;
		int salad = 0;
		int cola = 0;
		int ade = 0;
		int coffee = 0;
		int price = 0;
		int count = 0;
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

			switch (select) {

			case 1:
				System.out.println("불고기 버거를 선택하셨습니다\r\n");
				System.out.println("수량을 입력 >>>>>>>");
				count = sc.nextInt();
				System.out.println(count + "개 주문하셨습니다.\r\n");

				bBurger = count * 3500;
				break;

			case 2:
				System.out.println("치킨 버거를 선택하셨습니다\r\n");
				System.out.println("수량을 입력 >>>>>>>");
				count = sc.nextInt();
				System.out.println(count + "개 주문하셨습니다.\r\n");

				cBurger = count * 3200;
				break;

			case 3:
				System.out.println("감자 튀김을 선택하셨습니다\r\n");
				System.out.println("수량을 입력 >>>>>>>");
				count = sc.nextInt();
				System.out.println(count + "개 주문하셨습니다.\r\n");

				potato = count * 1000;
				break;

			case 4:
				System.out.println("치즈스틱을 선택하셨습니다\r\n");
				System.out.println("수량을 입력 >>>>>>>");
				count = sc.nextInt();
				System.out.println(count + "개 주문하셨습니다.\r\n");

				cheeze = count * 400;
				break;

			case 5:
				System.out.println("샐러드를 선택하셨습니다\r\n");
				System.out.println("수량을 입력 >>>>>>>");
				count = sc.nextInt();
				System.out.println(count + "개 주문하셨습니다.\r\n");

				salad = count * 2000;
				break;

			case 6:
				System.out.println("콜라를 선택하셨습니다\r\n");
				System.out.println("수량을 입력 >>>>>>>");
				count = sc.nextInt();
				System.out.println(count + "개 주문하셨습니다.\r\n");

				cola = count * 700;
				break;

			case 7:
				System.out.println("에이드를 선택하셨습니다\r\n");
				System.out.println("수량을 입력 >>>>>>>");
				count = sc.nextInt();
				System.out.println(count + "개 주문하셨습니다.\r\n");

				ade = count * 1200;
				break;

			case 8:
				System.out.println("커피를 선택하셨습니다\r\n");
				System.out.println("수량을 입력 >>>>>>>");
				count = sc.nextInt();
				System.out.println(count + "개 주문하셨습니다.\r\n");

				coffee = count * 1000;
				break;

			}

			System.out.println("추가 주문 하시겠습니까? (y / n)");
			String add = sc.next();

			if (add.equals("n") || add.equals("N")) {

				total = cBurger + bBurger + potato + cheeze + salad + cola + ade + coffee;

				System.out.println();
				System.out.println("*주문하신 정보는 다음과 같습니다*");
				System.out.println("================================");

				if (bBurger > 0) {

					price = bBurger / 3500;
					System.out.println("불고기버거 : " + price + "개 - " + bBurger + "원");

				}

				if (cBurger > 0) {

					price = cBurger / 3200;
					System.out.println("치킨버거 : " + price + "개 - " + cBurger + "원");
					

				}
				
				
				if (potato > 0) {

					price = potato / 1000;
					System.out.println("치킨버거 : " + price + "개 - " + potato + "원");
					

				}
				
				if (cheeze > 0) {

					price = cheeze / 400;
					System.out.println("치킨버거 : " + price + "개 - " + cheeze + "원");
					

				}
				
				
				if (salad > 0) {

					price = salad / 2000;
					System.out.println("치킨버거 : " + price + "개 - " + salad + "원");
					

				}
				
				
				if (cola > 0) {

					price = cola / 700;
					System.out.println("치킨버거 : " + price + "개 - " + cola + "원");
					

				}
				
				
				if (ade > 0) {

					price = ade / 1200;
					System.out.println("치킨버거 : " + price + "개 - " + ade + "원");
					

				}
				
				
				if (coffee > 0) {

					price = coffee / 1000;
					System.out.println("치킨버거 : " + price + "개 - " + coffee + "원");
					

				}
				
				
				
				System.out.println("================================");
				System.out.println("총 가격 : " + total + "원");
				check = !check;
			}

		}
		
		

	}
}
