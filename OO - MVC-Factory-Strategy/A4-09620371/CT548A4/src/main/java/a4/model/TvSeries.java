package a4.model;

import java.util.ArrayList;

 // TvSeries class that extends item and implements compareTo method
 
public class TvSeries extends Items {

	private int tid;
	private People creator;

	public TvSeries() {
	}

	public TvSeries(int tid, String title, int year, ArrayList<Genres> genres, ArrayList<People> cast, String description,
			People creator) {
		this.setTid(tid);
		this.setTitle(title);
		this.setYear(year);
		this.setGenre(genres);
		this.setCast(cast);
		this.setDescription(description);
		this.setCreator(creator);
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public People getCreator() {
		return creator;
	}

	public void setCreator(People creator) {
		this.creator = creator;
	}
	
	public int compareTo(Items o) {
		return Integer.compare(o.getTitle().compareTo(this.getTitle()), 0);
	}
}
