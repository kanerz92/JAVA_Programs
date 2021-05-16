import javax.swing.JOptionPane;

public class Assignment2_LeapYear_Test {

	public static void main(String[] args) {
	
		LeapYear check = new LeapYear2();
		int yr;
		boolean lp;
		String inp;
		
		inp = JOptionPane.showInputDialog("Enter year");
		yr = Integer.parseInt(inp);
		lp =check.isLeapYear(yr);
		
		System.out.println(yr);
		
		if(lp)
		{
			System.out.print("is a Leap Year");
			
		}
		
		System.out.println("is Not a Leap Year");
		
	}
	
	System.exit(0);
	
		}

	}

}
