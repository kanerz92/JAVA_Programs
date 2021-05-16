import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class arrayLists {

	public static void main(String[] args) {
		
		//Creating an Array list with Integer wrapper class
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		//autoboxing converting primitive int to wrapper class Integer
		//loop to populate array with 10 random number >100
		
		for (int i = 0; i <10; i++) {
			//casting numbers as int from double from math.random
			int list = (int) ((Math.random()) * 100);
			intList.add(list);//Autoboxing
		}
		//autounboxing changing wrapper type Integer to primitive int
		
		for (Integer arr: intList) {
				System.out.print(arr + " ");
		}
		//removing first number from list([0] element
		intList.remove(0);
		
		System.out.println();
		
		for (Integer arr : intList) { //arr has integer type and identified arr
			System.out.print(arr + " ");
	}
		System.out.println();
		ListIterator<Integer> iterator = intList.listIterator();
		while (iterator.hasNext()) {//transversing list with ListIterator
				System.out.print(iterator.next() + " ");
		}
		
		System.out.println();
		//converting array list to linked list
		LinkedList<Integer> linkList = new LinkedList<Integer>(intList);
		for (Integer link : linkList) {
			System.out.print(link + " ");
			
		}
	}

}
