package practice;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		int p = 0;
		
		System.out.println("���ڸ� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		
		for (int i = 1; i <= n ; i++) {
			if (n%i ==0) {
				p += 1;
			}	
		}
		
		if (p==2) {
			System.out.println(n + "��(��) �μ��� ������ " + p + "�̹Ƿ� �Ҽ��Դϴ�.");
		} else {
			System.out.println(n + "��(��) �μ��� ������ " + p + "�̹Ƿ� �Ҽ��� �ƴմϴ�.");
		}
		
	}
}
