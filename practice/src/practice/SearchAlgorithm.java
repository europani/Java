package practice;

import java.util.Scanner;

public class SearchAlgorithm {
	
	public static void main(String[] args) {
		
		
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		System.out.println("1~100 �߿� ã�� ���� ���ڸ� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		int sch = sc.nextInt();
				
		boolean flag = false;
		int index = -1;
		int i = 1;
		
		int low = 0;
		int high = arr.length-1;
		
		while (low<=high) {
			int mid = (low+high)/2;
			if (arr[mid] == sch) {
				flag = true; index = mid; break;
			}
			else if(arr[mid] < sch){
				low = mid+1;
				i += 1;
			}
			else {
				high = mid-1;
				i += 1;
			}
		}

		if (flag) {
			System.out.println(i + "�� �˻��Ͽ����ϴ�.");
			System.out.println(index + "��ġ���� " + sch + "���� ã�ҽ��ϴ�.");
		}
		else {
			System.out.println("����Ʈ�� �������� �ʽ��ϴ�.");
		}
		
	}
		



}
		


