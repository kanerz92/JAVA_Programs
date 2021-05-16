
public class ForLoop { 							//BeerSong for loop instead of while loop

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int beerNum = 99;
		String word = "bottles";
		
		for (int i = 1; beerNum>0; i++) { // instead of while (beerNum > 0) { if (beerNum == 1) (i to initialise, beernum>0 is the condition, i++ is the incrementation of the loop)
			
			
			 System.out.println(beerNum + " " + word + " of beer on the wall"); 	//loop statement
			 System.out.println(beerNum + " " + word + " of beer");
			 System.out.println("Take one down.");
			 System.out.println("Pass it around.");
			 beerNum = beerNum - 1;
		}
		{
			 System.out.println("No more bottles of beer on the wall"); //end of the for loop statement/condition
		
	}

	} //End main method
} //End class