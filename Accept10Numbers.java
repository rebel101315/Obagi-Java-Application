/*Accept 10 numbers from a user and print the sum ,
average and product of thhe 10 numbers*/
import java.util.scanner;

public class Accept10Numbers{
     public static void main(String[] args){
         scanner input = new Scanner(System.in);
		 
		 int sum = 0;
		 double average;
		 int Product = 1;
		 long Product =1;

         for(int i =1; i <= 10; i++){
        System.out.printf("Enter num%d: ",i);

        int num = input.nextInt();
        
        sum += num;		
		product *= num;
	}
	
	average = (double)sum/10;
	
	System.out.printf("The sum of the numbers is: %d%n",sum);
	System.out.printf("The average of the numbers is: %f%n",average);
	System.out.printf("The product of the numbers is: %d%n",product);
   }
}   