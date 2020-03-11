package practice;

public class chapter3 {

public static void main(String[] args) {
	int i = 1, j = 0;
	j=i++;
	System.out.println("i = " + i + ", j = " + j);
	
	i = 1; 
	j = 0;
	j=++i;
	System.out.println("i = " + i + ", j = " + j);
	
	for (int a=1; a<=5; ++a)
		System.out.println("I can do it");
}
}
