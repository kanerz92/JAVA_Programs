//Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
//
//HH = hours, padded to 2 digits, range: 00 - 99
//MM = minutes, padded to 2 digits, range: 00 - 59
//SS = seconds, padded to 2 digits, range: 00 - 59
//The maximum time never exceeds 359999 (99:59:59)

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
	// 	int anHourInSeconds = 3600;
	// 	int aMinuteInSeconds = 60;
		
	// 	String hh = Integer.toString((seconds / anHourInSeconds));
	// 	String mm = Integer.toString((seconds % anHourInSeconds) / aMinuteInSeconds);
	// 	String ss = Integer.toString(seconds % aMinuteInSeconds);
		
	// 	if (hh.length() == 1) {
	// 		hh = "0" + hh;
	// 	}
	// 	if (mm.length() == 1) {
	// 		mm = "0" + mm;
	// 	}
	// 	if (ss.length() == 1) {
	// 		ss = "0" + ss;
	// 	}
		
	// 	return hh + ":" + mm + ":" + ss;
    return String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, (seconds % 60));
    //second%3600, if its zero and divided by 60 will be zero, meaning that the seconds hasnt passed 60 to be considered a minute

}
	
	public static void main(String[] args) {
		System.out.println(makeReadable(359999));
		System.out.println(makeReadable(3600));
	}
}
