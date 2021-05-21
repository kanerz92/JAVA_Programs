package a4.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * People class that extends Items, implements the compareTo method for People
 * and uses jackson annotations to identify it's id
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "pid", scope = People.class)
public class People implements Comparable<People> {

	private static int numPeoplePID = 30;
	private int pid;
	private String name;

	public People() {

	}

	public People(String name) {

		this.name = name;
		numPeoplePID++;
		this.setPid(getNumPeoplePID());
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getNumPeoplePID() {
		return numPeoplePID;
	}

	public static void setNumPeoplePID(int numPeoplePID) {
		People.numPeoplePID = numPeoplePID;
	}

	@Override
	public int compareTo(People o) {
		return Integer.compare(o.getName().compareTo(this.getName()), 0);
	}
}
