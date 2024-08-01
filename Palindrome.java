import java.util.Scanner;

public class Palindrome{
  public static void main(String[]args){
	Scanner in=new Scanner(System.in);
System.out.println("Enter");
	int	a=in.nextInt();
	int temp=0;
	int pal=a;
    // Write your Logic to find out a number ArmStrong or not
  
  while (a != 0) {
            int digit = a % 10; // Get the last digit
            temp = temp * 10 + digit; // Build the reversed number
            a = a / 10; // Remove the last digit
        }
        
        // Check if the original number is equal to the reversed number
        if (pal == temp) {
            System.out.println(pal + " is a palindrome.");
        } else {
            System.out.println(pal + " is not a palindrome.");
        }
    }
}
