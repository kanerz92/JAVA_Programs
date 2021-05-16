//Useful knowledge programs scenarios
import java.util.LinkedList;
import java.util.*;
public class TestCode {
    public static void main(String[] args) {

        //1 How to reverse a string
        String str = "hello";
        String reverse = "";
        int length = str.length();//String class .length method being used
        for (int i = 0; i < length; i++){
            //Takes first element and adds previously insserted element
            //After 1st iteration e + h gets written to reverse(eh) etc. 
            reverse = str.charAt(i) + reverse;
            System.out.println(reverse);

        //2 How to determine a string is palindrome    
        if (str.equals(reverse)){
            System.out.println("Palindrome");
        }    else{
            System.out.println("Not Palindrome");
        }
        
        //3 Find the number of occurences of a character in a string
        int count = 0;
        char search = "a";
        for (int i = 0; i < length; i++){
            if (str.charAt(i) == search){
                count++;
            }
        }
        System.out.println(count);

        //4 FInd if the two given strings are anagrams or not - they contain simlar group of characters in varied sequence
        boolean anagramstatus = false;
        if (str.length() != reverse.length()){
            System.out.println(str + " and " + reverse + " strings are not anagrams");
        } else {
            char[] anagram1 = str.toCharArray();
            char[] anagram2 = reverse.toCharArray();
            Arrays.sort(anagram1);
            Arrays.sort(anagram2);
            anagramstatus = Arrays.equals(anagram1, anagram2);
        }
        if (anagramstatus == true){
            System.out.println(" Anagram strings");
        } else {
            System.out.println("Strings are not anagrams");
        }
        //5 How do you calculate number of vowels and consonants in a String
        int vowels = 0;
        int consonants = 0;
        for (int k = 0; k < str.length(); k++){
            //c as counter variable used to check characters, iterating through each index by k
            char c = str.charAt(k);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowels++;
                else
                consonants++;
        }
        System.out.println("Vowel count is " + vowels);
        System.out.println("Consonant count is " + consonants);
       }
       //6 How do you get matching elements in an integer array
        int[] a = {1,2,3,4,5,1,2,6,7};
       //Nested loops to compare elements
        for (int m = 0; m < a.length; m++){
            for (int n = m + 1; n < a.length; n++){
                if (a[m] == a[n])
                System.out.println(a[m]);//Print matching elements whenever found
            }
        }
        //7 Bubble Sort Algorithm
        int[] b = {1,2,7,6,4,9,12};

        for (int k = 0; k < b.length; k++){
            for (int l = 0; l < b.length -l -1; l++){
                if (a[l] > a[l +1]){
                    int t = a[l];
                    a[l] = a[l + 1];
                    a[l + 1] = t;
                }
            }
        }
        //8 Insertion Sort Algorithm
        int[] c = {1,2,7,6,4,9,12};

        for (int m = 1; m < c.length; m++){
            int n = m;
            while ( n> 0 && a[n - 1] > a[n]){
                int k = a[n];
                a[n] = a[n - 1];
                a[n - 1] = k;
                n--;
            }
        }
        //9 How do you reverse an array
        int[] d = {1,2,7,6,4,9,12};
        //Loop half of the array, next we replace the numbers correcponding to the index from the start to the end
        for (int t = 0; t < d.length/2; t++){
            int tmp = d[t];
            d[t] = d[d.length - t - 1];
            d[d.length -t -1] = tmp;
        }
        //10 Swap two numbers without using a third variable
        int x = 10;//Declare variables and instialise values
        int y = 20;

        y = y + x;//y is now 30
        x = y - x;//x is now 20 and y is still 30
        y = y - x;//y is now 10 and x is 20 swapped  

        //3 Driver code
        int n = 10;
        System.out.println(fibonacci(n));
        
        //11 How do we reverse a Linked List
        //Declare the LinkedList and create ll list object
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println(ll);
        LinkedList<Integer> lll = new LinkedList<>();
        //Applying descending method to list, for each method, adds value to lll
        ll.descendingIterator().forEachRemaining(lll::add);
        System.out.println(lll);

        //12 Implementation of Binary Search
        //Divides the array into half, in every iteration step until it find the element
        //It works on sorted arrays and compares the adjacent elemets and calculates middle number
        //If the value of low is greater than hight then the element is not present
        int mid = (low + high)/2;
        while ( low <= high){
            if (arr[mid] < key){
                low = mid + 1;
            } else if ( arr[mid] == key){
                return mid;
            } else {
                high = mid -1;
            }
            mid = (low + high)/2;
        }
        if (low > high){
            return -1;
        }
        return -1;

        //13 Find the second largest number in an array
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        //Loop through the array, if the value of i is greater than the highest,
        //store the value i in highest and secondhighest variable
        for (int i : array){
            if (i > highest){
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest){
                secondHighest = i;
            }
        }
        return secondHighest;

        //How to remove all occurrences of a given character from the input string
        String str1 = "Australia";
        str1 = str1.replace("a", "");//Built in String method used
        System.out.println(str1);//ustrli

    }
      //14 Print fibonacci using recursion
      public static int fibonacci (int n){
        if (n <=1)
        return n;
        //Will keep calling until we get to the base case and return n
        //computes fib(n-1) then (n-2) add, then (n-3) etc. until base case met and return n
        return fibonacci(n -1) + fibonacci(n - 2);
    }
    //15 Find the factorial of an integer, multiplies a number by everything below
    //Multiplies the number until it reaches 1 - Recursive function
    public static long factorial(long n){
        if (n == 1)
            return 1;
        else
            return ( n * factorial(n -1));
    }

    //16 Showing inheritance
    class Animal{
        String color;
    }
    class Cat extends Animal{
        void meow(){
            System.out.println("Meow!");
        }
    }
    //17 Overloading and Overriding example
    //Overloading - A class has two or more methods that have the same name
    //Could also use an example of methods with different return types but 
    //the same method name String print(); Int print();
    class Foo{
        void print(String s){
            System.out.println(s);
        }
        void print(String s, int count){
            while (count > 0) {
                System.out.println(s);
                count--;
            }
        }
    }
    //17 Overriding example - When a superclass method is also implemented in the child class
    class Super{
        void printName(){
            System.out.println("Super or Base Class");
        }
    }
    class Child extends Super{
        @Override
        void printName(){
            System.out.println("Child Class printName method being envoked");
        }
    }
    //18 Check if the given number is prime
    //
    public static boolean isPrime(int n){
        if (n ==0 || n ==1){
            return false;
        }
        if (n ==2){
            return true;
        }
        //Checking if the number is divisibile by 2, if so would mean its not a Pnum
        for (int i = 2; i <= n/2; i++){
            if (n % i ==0){
                return false;
            }
         //IF the number is indivisibile by other numbers condition is true
         return true;
        }
    }
    
        //19 Sum all the elements in an array
        int[] array2 = {1,2,3,4,5};
        int sum = 0;
        for (int i : array2)
        sum += i;
        System.out.println(sum);       
   
    }
}


