
public class LeapYear2 {

	
	
	public boolean LeapYear2() {
		boolean isLeapYear(int y) {
			boolean I = false;
			
			if (y % 4==0) {
				
				if (y % 100 !=0) {
					I = true;
				}
				
				else if (y % 400 ==0){
					I = true;
				}
				


	
				}
			
			return I;
			}
		
	}
}
