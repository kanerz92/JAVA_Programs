// Equal Sides Of An Array
// You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that would make this happen, return -1.

// For example:
// Let's say you are given the array {1,2,3,4,3,2,1}:
// Your function will return the index 3, because at the 3rd position of the array, 
// the sum of left side of the index ({1,2,3}) and the sum of the right side of the 
// index ({3,2,1}) both equal 6.
import java.util.Scanner;
public class ArraySides{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the size of your array: ");
        int array_size = scanner.nextInt();
        System.out.println("Please enter the elements of your array");
        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Array numbers are: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
        System.out.println("The result is: ");
        System.out.println(equalResult(array));
    }
    static int equalResult(int[] array){
        int result = -1; //To print -1 if no matching sides found
        //To check all the elements of the array
        for (int i = 0; i < array.length; i++){
            int sum1 = 0;
            int sum2 = 0;
            //Loop to check the sum of elements starting at[0]
            for (int j = 0; j < i; j++){
                sum1 += array[j];
            }
            for (int k = array.length - 1; k > i; k--){
                sum2 += array[k];
            }
            //If both sums are equal print i
            if (sum1 == sum2){
                result = i;
                break;
            }
        }
        return result;
    }
}
//Another possible way 
// int left = 0;
// int right = Arrays.stream(arr).sum();
// for (int i=0; i<arr.length; i++){
//   right -= arr[i];
//   if (left == right) return i;
//   left += arr[i];
// }
// return -1;