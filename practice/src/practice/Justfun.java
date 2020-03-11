package practice;

public class Justfun {
	int i = 1; 
	int j = 2;
	
	public int add(int i, int j) {
		return i+j;
	}
	
	Justfun(){
		
	}
		
	
	
	
	
	
	public static void main(String[] args) {
		
		Justfun a = new Justfun();
		
		int b = a.add(4, 5);
		
		a.i = 3;
		a.j = 4;
		
		System.out.println("a.i = " + a.i);
		System.out.println("a.j = " + a.j);
		System.out.println(b);
		
		
		
	}
	
}
