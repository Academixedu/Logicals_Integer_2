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
		while (a > 0) {
            b = a % 10;
//            initial power to 1
            int power = 1;
//            n states about number of numbers in given int
            for (int i = 1; i <=n; i++) {
//            	iterations starts from 0 and rasise to <n ex:
                power *= b;
//                power*=1*(3*3*3) three iterations if we take 153
            }
            sum += power;
//            adding it it to sum variable
            a = a / 10;
//           by dividing it we can again get remianing value; 
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
