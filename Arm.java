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
      while(a>0){
        b=a%10;
        int pow=1;
        for(int i=1;i<=n;i++){
            pow=pow*b;

        }
        sum=sum+pow;
        a=a/10;
      }
    
        if (temp == sum) {
            System.out.println(temp + " is an Armstrong");
        } else {
            System.out.println(temp + " is not an Armstrong");
        }
    }


    public static void main(String[] args) {
        Arm m = new Arm();
        m.Arm();
    }
}
