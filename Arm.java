import java.util.Scanner;

public class Arm {
//	counting the digits
	
    public int countDigits(int num) {

    	int count = 0;
        while (num != 0) {
//        	153
//        	divide it until num becomes 0 
            num = num / 10;
//            15
//            add count by every iteration
            count++;
        }
        return count;
    }
	public void Arm() {
        int b;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Give your Value");
        int a = in.nextInt();
        int temp = a;
        int n = countDigits(a); // Calculate the number of digits in the input number
        
      // Write the Logic to know the sum value
    
      for(;temp!=0;temp /= 10,++n);
          temp=a;
          a=temp%10;
          for(;temp!=0;temp /=10){
              a=temp % 10;
              double result = Math.pow(a,n);
          }
    
        if (temp == sum) {
            System.out.println(temp + " is an Armstrong");
        } else {
            System.out.println(temp + " is not an Armstrong");
        }
    }

    // Method to count the number of digits in a number


    public static void main(String[] args) {
        Arm m = new Arm();
        m.Arm();
    }
}
