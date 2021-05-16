import java.util.Scanner;

public class Q1BubbleSort {
		   static void bubbleSort(int[] arr) {  
		        int n = arr.length;  
		        int temp = 0;  
		         for(int i=0; i < n; i++){  
		                 for(int j=1; j < (n-i); j++){  
		                          if(arr[j-1] > arr[j]){//Compares adjacent elements  
		                                 //swap elements  
		                                 temp = arr[j-1];  
		                                 arr[j-1] = arr[j];  
		                                 arr[j] = temp;  
		                         }                 
		                 }  
		         } 
		    }  
		    public static void main(String[] args) {  
		    	Scanner inputs = new Scanner(System.in);
		    	System.out.println("Enter size of Array:");
		    	int y = inputs.nextInt();
		        int[] arr = new int[y];
		        
		        System.out.println("Enter " +y +" numbers");
		        for (int i = 0; i < y; i++) {
		        	arr[i] = inputs.nextInt();
		        }
		                System.out.println("Array Before Bubble Sort");  
		                for(int i=0; i < arr.length; i++){  
		                        System.out.print(arr[i] + " ");  
		                }  
		                System.out.println();  
		                  
		                bubbleSort(arr);//Calling Bubblesort Function to sort array elements using bubble sort  
		                 
		                System.out.println("Array After Bubble Sort");  
		                for(int i=0; i < arr.length; i++){  
		                        System.out.print(arr[i] + " ");  
		                }  
		        }  
		}  
	
