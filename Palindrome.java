import java.util.Scanner;
public class Palindrome{
	public static int countdigits(int num)
	{
		int count =0;
		while(num !=0)
		{
			num = num / 10;
			count ++;
		}
		return count;
	}

  public static void main(String[]args){
	Scanner in=new Scanner(System.in);
System.out.println("Enter a number");
	int	a=in.nextInt();
	int temp=0;
	int pal=a;
	int b = 1;
	int sum =0;
	int n = countdigits(a);
	while( a> 0)
	{
		b = a % 10;
		int power = 1;
		for (int i = 1; i <= n; i++) {
			power *= b;
		}
		sum = sum+power;
		a=a/10;

	}
	if(pal == sum)
	{
		System.out.println(pal+" is a Armstrong number");
	}
	else{
		System.out.println(pal+" is not a Armstrong number");
	}
    // Write your Logic to find out a number ArmStrong or not
	

  }
}
