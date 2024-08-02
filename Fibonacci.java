import java.util.Scanner;
public class Fibonacci {
public void scan() {
	d=in.nextInt();
	System.out.println("First Number"+a);
	System.out.println("Second Number"+b);
	for(int i=0;i<d;i++){
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
// prepare Logic to find out Fibanocci series and print it
}	
	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
f.scan();		
}
}