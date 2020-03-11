package practice;

public class SortAlgorithm {

	public static void main(String[] args) {
		int[] arr = {36, 11, 68, 45, 92, 100};
		int tem = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]> arr[j]) {
					tem=arr[j];
					arr[j]=arr[i];
					arr[i]=tem;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
