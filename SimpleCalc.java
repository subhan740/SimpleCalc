		
import java.util.Scanner;

public class SimpleCalc
{
    public static void main(String gh[])
    {
        double n1, n2, result;
        char operator;
        Scanner s = new Scanner(System.in);
		
            System.out.print("1. Addition\n");
            System.out.print("2. Subtraction\n");
            System.out.print("3. Multiplication\n");
            System.out.print("4. Division\n");
            System.out.print("5. Exit\n\n");
            System.out.print("Enter Your operator : ");
            operator = s.next().charAt(0);
            switch(operator)
            {
                case '1' : System.out.print("Enter 1st Number : ");
				 n1 = s.nextDouble();
				System.out.print("Enter 2n Number : ");
                   
                    n2 = s.nextDouble();
                    result = n1 + n2;
                    System.out.print("Result = " + result);
                    break;
                case '2' : System.out.print("Enter 1st Number : ");
				 n1 = s.nextDouble();
				System.out.print("Enter 2n Number : ");
                   
                    n2 = s.nextDouble();
                    result = n1 - n2;
                    System.out.print("Result = " + result);
                    break;
                case '3' : System.out.print("Enter 1st number : ");
				 n1 = s.nextDouble();
				System.out.print("Enter 2n number : ");
                   
                    n2 = s.nextDouble();
                    result = n1 * n2;
                    System.out.print("Result = " + result);
                    break;
                case '4' : System.out.print("Enter 1st number : ");
				 n1 = s.nextDouble();
				System.out.print("Enter 2n number : ");
                   
                    n2 = s.nextDouble();
                    result = n1 / n2;
                    System.out.print("Result = " + result);
                    break;
                case '5' : System.exit(0);
                    break;
                default : System.out.print("Wrong Choice...");
                    break;
            }
	}      
}