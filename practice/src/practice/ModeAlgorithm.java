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
			System.out.println(i + "�� ������ " + count[i]);
		}
		
		System.out.println("\n" +"�ֺ��� " + mode + "�̰� " + max + "�� ���Դ�.");
		
		
		
	}
}
