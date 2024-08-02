import java.util.Scanner;
public class Palindrome{
  public static void main(String[]args){
	Scanner in=new Scanner(System.in);
System.out.println("Enter");
	int	a=in.nextInt();
	int temp=0;
	int pal=a;
    // Write your Logic to find out a number ArmStrong or not
	while(a!=0){
		int digit =a%10;
		temp = temp*10+digit;
		a=a/10;
	}
	if (pal==temp){
		System.out.println("is a palindrome");
	}else{
		System.out.println("is not a palindrome");
	}
  }
}
