import java.util.Arrays;
import java.util.Scanner;

public class Q2QuickSort {

    public static void main(String[] args) {
    	int n = 0;
    	
    	Scanner inputs = new Scanner(System.in);
    	System.out.println("Enter size of Array:");
    	n = inputs.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " +n +" numbers");
        for (int i = 0; i < n; i++) {
        	arr[i] = inputs.nextInt();
        }
        
        quickSort(arr, 0, arr.length-1);//Fuction to sort entire array
        
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int start, int end){//Recursive function
 
        int partition = partition(arr, start, end);//Partitioning index, stores position of pivot element
 
        if(partition-1>start) {
            quickSort(arr, start, partition - 1);//Recursively sort before partition/pivot
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);//Recursively sort after partition/pivot
        }
    }
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];//Pivot chosen as last element
 
        for(int i=start; i<end; i++){  /*rearrange the array by putting elements which are less than pivot
            							on one side and which are greater that on other. */
             if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
 
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;//Swapping pivot
 
        return start; //Start index to be used in quicksort function
    }
}