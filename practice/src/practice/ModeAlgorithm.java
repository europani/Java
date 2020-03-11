package practice;

public class ModeAlgorithm {

	public static void main(String[] args) {
		int[] numArr = {6, 5, 2, 6, 8, 1, 3, 2, 6, 9};
		int[] count = new int[10];
		int mode = 0;
		int max = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			count[numArr[i]]++;
			
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] >max) {
				max = count[i];
				mode = i;
			} 
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + "의 갯수는 " + count[i]);
		}
		
		System.out.println("\n" +"최빈값은 " + mode + "이고 " + max + "번 나왔다.");
		
		
		
	}
}
