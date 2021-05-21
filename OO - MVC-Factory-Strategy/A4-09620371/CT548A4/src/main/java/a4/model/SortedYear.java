package a4.model;

import java.util.TreeSet;

/**
 * Concrete strategy class implementing the Strategy interface
 */
public class SortedYear implements Strategy {

	/**
	 * Method that sorts Items by their genre from the objects in the inventory
	 */
	@Override
	public void sort(Model m) {
		for (Items item : m.getInventory()) {
			int year = item.getYear();
			if (m.getSortedYears().containsKey(year)) {
				TreeSet<Items> years = m.getSortedYears().get(year);
				years.add(item);
				m.getSortedYears().put(year, years);
			} else {
				TreeSet<Items> tempSet = new TreeSet<Items>();
				tempSet.add(item);
				m.getSortedYears().put(year, tempSet);
			}
		}
	}
}