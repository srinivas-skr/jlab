package lab;
import java.util.*;
public class Calcu {

	public static void main(String[] args) {
	
	
						int a, b, op, res;
				Scanner ob = new Scanner(System.in);
				System.out.println("Enter first operand:");
				a = ob.nextInt();
				System.out.println("Enter second operand:");
				b = ob.nextInt();
				System.out.println("Menu: 1-Add  2-Sub  3-Mul  4-Div");
				op = ob.nextInt();
				switch (op)
				{
					case 1:
						res= a+b;
						System.out.println("Result: " + res);
						break;
					case 2:
						res= a-b;
						System.out.println("Result: " + res);
						break;
					case 3:
						res= a*b;
						System.out.println("Result: " + res);
						break;
					case 4:
						res= a/b;
						System.out.println("Result: " + res);
						break;
					default:
						break;
				}
			}

		}

	
