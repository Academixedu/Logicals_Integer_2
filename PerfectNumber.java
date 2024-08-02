import java.util.Scanner;

public class PerfectNumber{
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your Number");
	int temp=0;
	int a=sc.nextInt();
	for(int i =1; i<=a; i++){
		if(a%i==0){
			System.out.println(i);
		}
	}
// Write Logic to find out whether a Number is  Perfect Number or not
		
	
	if(temp==a) {
		System.out.println("Perfect Number"+ a);
	}

}}

