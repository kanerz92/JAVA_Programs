package Q2;

public interface ComparableGeometricFigure<T extends GeometricFigure2> extends Comparable<T>{

	public int compareTo(T o);/*/Generic interface extending comparable,
								*taking in generic type parameters of
								*GeometricFigure2 and its subclasses
								*
								*compareTo method taking generic type geometricfigure2
								* and subclasses. Used to compare subclasses with each other
								*
								*/

	

	

}
