package practice;

public class Forlength {

	public static void main(String[] args) {
		
		int sum = 0;
		int ave = 0;
	
		int[] arr = {85, 42, 79, 98, 89};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		ave = sum/arr.length;
		System.out.println("sum : " + sum );
		System.out.println("average : " + ave);
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			else if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
			
	}
}
