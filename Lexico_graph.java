package lab;
import java.util.*;
public class Lexico_graph {

	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String[] strings = new String[5];

	        // Accept 5 strings from the user
	        System.out.println("Enter 5 strings:");
	        for (int i = 0; i < 5; i++) {
	            strings[i] = sc.next();
	        }

	        // Sort the strings in lexicographical order
	        Arrays.sort(strings);

	        // Print the strings in lexicographical order
	        System.out.println("Strings in lexicographical order:");
	        for (int i=0;i<5 ;i++) {
	            System.out.println(strings[i]+"\t");
	        }
	        System.out.println();
	    }
	}