package practice;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		char add = '0';
		
		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				add = '+';
			}
			else if (score < 93) {
				add = '-';
			}
		}
		else if (score >= 80) {
			grade = 'B';		
			if (score >= 88) {
				add = '+';
			}
			else if (score < 83) {
				add = '-';
			}
		}
		else
			grade = 'C';
		
		System.out.println("당신의 등급은 :" + grade + add + "입니다.");
		
	}
}
