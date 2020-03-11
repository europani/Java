package practice;

import java.util.Scanner;

public class NearAlgorithm {
	
	public static void main(String[] args) {
		
		System.out.println("값을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt(); 
		
		
		
		int[] arr = { 10, 20, 30, 17, 27 }; 
		int near = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(Math.abs(target-arr[i])<Math.abs(near-arr[i])) {
				near = arr[i];
			}
				
		
		}
		
		System.out.println(near);
	}

}
