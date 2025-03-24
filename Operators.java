public class Operators{
	public static void main(String[] args{
		//Asignment operator(-)
		
		int num1 = 13;
		int num2 = 5;

       //arithmetic operator(+,*,-,/,%)
	   int sum = num1 + num2

       int product = num1 *	num2;

       int difference = num1 - num2;

       double quotient = (double)num1 / num2;
       
       int remainder = num1 % num2;

       //Relational operators(>,<,>=,<=,==,!=)
       boolean isLessThan = num1 < num2;
	   boolean isGreaterThan = num1 > num2;
	   boolean isGreaterThanOrEqualTo = num1 >= num2;
	   boolean isLessThanOrEqualTo = num1 <= num2;
	   boolean isEqualTo = num1 == num2;
	   boolean isNotEqualTo = num1 != num2;
	   
	   //logical operators
	   boolean isAndOperator = num1 > num2 && num1 >= num2
	   boolean isNotOperator = num1 == num2 || num1 > num2;
	   boolean isNotOperator = !(num1 == num2 || num1 > num2);
       System.out.printf("the sum of the number is %d%n",sum);
	   System.out.printf("the product of the number is %d%n",product); 	   
	   System.out.printf("the difference between %d and %d is %d%n",num1,num2,difference); 	 
	   System.out.printf("the quotient is %f%n",quotient); 	   
	   System.out.printf("the remainder is %d%n",remainder); 	   
	   System.out.println("==============================================================");
 	   System.out.printf("is %d < %d? %b%n",num1,num2,IsLessThan);
 	   System.out.printf("is %d > %d? %b%n",num1,num2,IsGreaterThan);
	   System.out.printf("is %d >= %d? %b%n",num1,num2,IsGreaterThanOrEqualTo);
	   System.out.printf("is %d <= %d? %b%n",num1,num2,IsLessThanOrEqualTo);
	   System.out.printf("is %d == %d? %b%n",num1,num2,IsEqualTo);
	   System.out.printf("is %d != %d? %b%n",num1,num2,IsNotEqualTo);
	   System.out.println("==============================================================");
	   System.out.printf("is %d > %d && %d >=%d? %b%n",num1,num2,num1,num2,isAndOperator);
	   System.out.printf("is %d == %d || %d >= %d? %b%n",num1,num2,num1,num2,isOrOperator);
	   System.out.printf("is ! (%d == %d || %d >= %d) ? %b%n",num1,num2,num1,num2,isNotOperator);