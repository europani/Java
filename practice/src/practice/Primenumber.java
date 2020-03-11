package practice;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		int p = 0;
		
		System.out.println("숫자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		
		for (int i = 1; i <= n ; i++) {
			if (n%i ==0) {
				p += 1;
			}	
		}
		
		if (p==2) {
			System.out.println(n + "은(는) 인수의 갯수가 " + p + "이므로 소수입니다.");
		} else {
			System.out.println(n + "은(는) 인수의 갯수가 " + p + "이므로 소수가 아닙니다.");
		}
		
	}
}
