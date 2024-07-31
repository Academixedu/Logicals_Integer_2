import java.util.Scanner;

public class Palindrome{
  public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter");
	int	a=in.nextInt();
	int temp=0;
	int pal=a;
	while(a>0){
		int r=a%10;
		temp=temp*10+r;
		a=a/10;
	}
	if(pal==temp){
            System.out.println(temp+" is a palindrome number");
        } 
        else{
            System.out.println(temp+" is not a palindrome number");
        }
    }
  }
