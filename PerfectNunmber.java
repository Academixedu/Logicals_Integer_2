import java.util.Scanner;
public class PerfectNunmber{
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your Number");
	int temp=0;
	int a=in.nextInt();

	for(int i=1;i<a;i++){
		if(a%i==0){
			temp=temp+i;
			System.out.println("Factorial of i: "+i);
		}
	}
	if(temp==a) {
		System.out.println("Perfect Number "+a);
	}

}
}
