package a4.model;

/**
 * Films class that extends Items and implements the compareTo method for titles
 */
public class Films extends Items {

	private int fid;
	private People director;

	public People getDirector() {
		return director;
	}

	public void setDirector(People director) {
		this.director = director;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	@Override
	public int compareTo(Items o) {
		return Integer.compare(o.getTitle().compareTo(this.getTitle()), 0);
	}
}
