package com.all.example.controller;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Function {

	private Scanner sc;

	public Function() {

		sc = new Scanner(System.in);
	}

	public void calculator() {

		int sum = 0;

		System.out.println("첫번째 정수 입력 >>>>");
		int a = sc.nextInt();

		System.out.println("두번째 정수 입력 >>>>");
		int b = sc.nextInt();

		System.out.println("연산 문자 입력 >>>>");
		char c = sc.next().charAt(0);

		switch ((char) c) {

		case '+':
			sum = a + b;
			System.out.println();
			System.out.println("두 정수의 합 : " + sum);
			System.out.println("========================");
			System.out.println();
			break;

		case '-':
			sum = a - b;
			System.out.println("두 정수의 차 : " + sum);
			System.out.println("========================");
			System.out.println();
			break;

		case 'X':
		case 'x':
			sum = a * b;
			System.out.println();
			System.out.println("두 정수의 차 : " + sum);
			System.out.println("========================");
			System.out.println();
			break;

		case '/':

			if (b == 0) {
				System.out.println();
				System.out.println("0으로 나눌 수 없습니다.");
				System.out.println("========================");
				System.out.println();
				sum = 0;

			} else {

				sum = a / b;

				System.out.println();
				System.out.println("두 정수의 차 : " + sum);
				System.out.println("========================");
				System.out.println();

			}
			break;

		default:
			break;

		}

	}

	public void totalCalculator() {

		System.out.println("첫번째 정수 값 입력");
		int a = sc.nextInt();

		System.out.println("두번째 정수 값 입력");
		int b = sc.nextInt();

		int sum = 0;
		int[] arr = { a, b };

		int max = arr[0]; // 최대값
		int min = arr[0]; // 최소값

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {

				max = arr[i];

			}

			if (min > arr[i]) {

				min = arr[i];
			}

		}

		for (int i = min; i <= max; i++) {

			sum += i;

		}

		System.out.println(sum);
	}

	public void profile() {

		System.out.println("이름 입력 >>>");
		String name = sc.next();
		System.out.println("나이 입력 >>>");
		int age = sc.nextInt();
		System.out.println("성별 입력 >>>");
		String male = sc.next();
		System.out.println("성격 입력 >>>");
		String personal = sc.next();

		System.out.println("**** 신상정보 출력 ****");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + male);
		System.out.println("성격 : " + personal);
		System.out.println("====================");
		System.out.println();

	}

	public void sungjuk() {

		System.out.println("학생 이름 입력 >>>");
		String name = sc.next();
		System.out.println("학생 학년 입력 >>>");
		int year = sc.nextInt();
		System.out.println("학생 반 입력  >>>");
		int classNum = sc.nextInt();
		System.out.println("학생 번호 입력 >>>");
		int num = sc.nextInt();
		System.out.println("학생 성별 입력 (M / F) >>>");
		char ch = sc.next().charAt(0);

		String str = (ch == 'M' || ch == 'm') ? "남학생" : "여학생";

		System.out.println("학생 성적 입력 >>>");
		double grade = sc.nextDouble();

		char credit;

		if (grade >= 90 && grade <= 100) {

			credit = 'A';

		} else if (grade >= 80 && grade < 90) {

			credit = 'B';
		} else if (grade >= 70 && grade < 80) {

			credit = 'C';

		} else if (grade >= 60 && grade < 70) {

			credit = 'D';
		} else {

			credit = 'F';

		}

		System.out.printf("%d학년 %d반 %d번", year, classNum, num);
		System.out.printf("%s %s의 점수는 %.1f 이고, %c 학점입니다.\r\n", str, name, grade, credit);

	}

	public void printStarNumber() {

		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();

		if (num > 0) {

			System.out.println("정수하나 입럭 : " + num);

			for (int i = 1; i <= num; i++) {

				for (int j = 0; j < i - 1; j++) {

					System.out.print("*");

				}

				System.out.print(i);
				System.out.println();

			}

			System.out.println("==========");

		} else {

			System.out.println("정수하나 입럭 : " + num);
			System.out.println("양수가 아닙니다.");
		}

	}

	public void sumRandomNumber() {

		int num = 0;
		int sum = 0;

		for (int i = 1; i < 100; i++) {

			num = (int) (Math.random() * 100) + 1;

		}

		for (int i = 1; i < num; i++) {

			sum = sum + i;

		}

		System.out.println("발생한 숫자 : " + num);
		System.out.println("결과값 : " + sum);
		System.out.println();

	}

	public void continueGugudan() {

		System.out.println("정수를 입력해주세요");
		int num = sc.nextInt();

		if (num > 0) {

			for (int i = 1; i < 10; i++) {

				if (i % num == 0) {

					continue;

				}

				System.out.println(num + " * " + i + " = " + (num * i));

			}

		} else {

			System.out.println("정수 하나 입력 : " + num);
			System.out.println("양수가 아닙니다.");

		}

	}

	public void shutNumber() {

		Random rd = new Random();


		boolean check = true;
		
		do {
			System.out.println("1부터 6까지의 수 중 하나의 수를 입력");
			int num = sc.nextInt();
			
			int num1 = 0;
			int num2 = 0;
			int sum = 0;
			
			for (int i = 1; i <= 6; i++) {
				
				for (int j = 1; j <= 6; j++) {
					
					num1 = rd.nextInt(i);
					num2 = rd.nextInt(j);
					sum = num1 + num2;
					
				}
				
			}
			
			System.out.println("1번 주사위 숫자 : " + num1);
			System.out.println("2번 주사위 숫자 : " + num2);
			System.out.println("두 주사위의 합 : " + sum);

			if (num == sum) {

				System.out.println("맞췄습니다!");
				
			} else {

				System.out.println("틀렸습니다");
			}
			
			System.out.println("계속하시겠습니까? (y / n)");
			char ch = sc.next().charAt(0);
			
			check = (ch == 'n' || ch == 'N') ? false : true;
			

		} while (check);

	}

}
