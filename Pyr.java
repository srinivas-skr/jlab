package lab;

import java.util.Scanner;

public class Pyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		        Scanner ob = new Scanner(System.in);
		        System.out.print("Enter the number of levels for the pyramid: ");
		        int levels = ob.nextInt();
		        
		        for (int row = 1; row <= levels; row++) {
		            // Print leading spaces to center the numbers in each row
		            for (int space = 1; space <= levels - row; space++) {
		                System.out.print("  ");
		            }
		            
		            // Print the increasing sequence of numbers in each row
		            for (int col = row; col <= 2 * row - 1; col++) {
		                System.out.print(col + " ");
		            }
		            
		            // Print the decreasing sequence of numbers in each row (excluding the last number)
		            for (int k = 2 * row - 2; k >= row; k--) {
		                System.out.print(k + " ");
		            }
		            
		            System.out.println();
		        }
		    }
		}
