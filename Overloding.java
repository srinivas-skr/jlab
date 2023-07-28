package lab;

public class Overloding {
	import java.util.*;

	public class sort_search {
	    public void sort(int a[]) {
	        int temp;
	        for (int i = 0; i < a.length; i++) {
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] > a[j]) { 
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	       
	        System.out.println("Sorted Array:");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " "); 
	        }
	        System.out.println(); 
	    }

	    public void search(int a[], int key) {
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == key)
	                System.out.println("Element found at index: " + i);
	        }
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int a[] = new int[10];
	        int b[] = new int[10];
	        int key;
	        sort_search obj = new sort_search();
	        System.out.println("Enter the array to be sorted");
	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	        }
	        obj.sort(a);
	        System.out.println("Enter the element in sorted format");
	        for (int i = 0; i < b.length; i++) {
	            b[i] = sc.nextInt();
	        }
	        System.out.println("Enter the element to be searched");
	        key = sc.nextInt();
	        obj.search(b, key); 
	    }
	}

}
