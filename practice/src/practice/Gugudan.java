package practice;

public class Gugudan {

	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			if (i!=1) {
				System.out.println("");
			}	
			for (int j = 1; j <=9; j++) {
				//System.out.println(i + " X " + j + " = " +i*j);
				System.out.printf("%d X %d = %d%n", i, j, i*j);
			}
		}
	}
}
