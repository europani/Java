package practice;

public class SumAlgorithm {

	public static void main(String[] args) {
		int[] scores = { 100, 75, 50, 37, 90, 95 };
		int sum = 0;
		int ple = 0;
		
		for(int i=0; i<scores.length; i++) {
			if(scores[i]>= 80) {
				sum += scores[i];
				ple++;
			}
		}
			
		System.out.println(scores.length + "명의 점수 중 80점 이상의 총점:" + sum);
		System.out.println(scores.length + "명의 점수 중 80점 이상의 학생수:" + ple);
		
			
			//int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
			int[] arr = new int[20];
			int sum2 = 0;
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = i+1;
			}
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%2 !=0) {
					sum2 += arr[i];
				}
			}
			
			System.out.println(arr.length + "개 중의 홀수인 수의 합은 :" + sum2);
	}

}
	


