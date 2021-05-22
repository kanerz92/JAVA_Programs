package a4.model;


 // Class for implementation of factory method
 
public class Factory {

	public Items itemType(boolean isTvSeries) {
		if (isTvSeries) {
			return new TvSeries();
		}
		else if (!isTvSeries) {
			return new Films();
		}
		return null;
	}
}