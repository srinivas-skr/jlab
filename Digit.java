package lab;
import java.util.*;
public class Digit {


		// 
		
		
		  public void digitSum(int n)
		  {
		    int m=n;
		     while(n>0)
		    {
		     int a=n/10;
		     int b=n%10;
		     int sum=a+b;
		     if(sum<10)
		     {
		      System.out.println("The digit sum of "+m+" is "+sum);
		      return;     
		     }
		     else
		       n=sum;
		    }
		  }  
		  public static void main(String[] args)
		   {
		     Scanner sc=new Scanner(System.in);
		     Digit d=new Digit();
		     System.out.println("Enter the number");
		     int n=sc.nextInt();
		     d.digitSum(n);
		   }
		 }
		        
	
