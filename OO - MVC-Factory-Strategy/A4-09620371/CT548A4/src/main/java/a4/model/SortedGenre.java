package a4.model;

import java.util.TreeSet;

/**
 * Concrete strategy class implementing the Strategy interface
 */
public class SortedGenre implements Strategy {

	/**
	 * Method that sorts Items by their genre from the objects in the inventory
	 */
	@Override
	public void sort(Model m) {
		for (Items item : m.getInventory()) {
			for (Genres g : item.getGenre()) {
				if (m.getSortedGenres().containsKey(g)) {
					TreeSet<Items> genres = m.getSortedGenres().get(g);
					genres.add(item);
					m.getSortedGenres().put(g, genres);
				} else {
					TreeSet<Items> tempSet = new TreeSet<Items>();
					tempSet.add(item);
					m.getSortedGenres().put(g, tempSet);
				}
			}
		}
	}
}