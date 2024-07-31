import java.util.Scanner;

public class PerfectNunmber{
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your Number");
	int temp=0;
	int a=in.nextInt();
// Write Logic to find out whether a Number is  Perfect Number or not
   for(int i=1;i<a;i++){
	if(a%i==0)
	{
		temp=temp+i;
		System.out.println(i);
	}
}
if(temp==a) {
	System.out.println("Perfect Number"+a);
}

}
}
