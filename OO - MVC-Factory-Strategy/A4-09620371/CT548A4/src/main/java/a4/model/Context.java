package a4.model;
/**
 * Class to create a context object whose behavior varies as per its strategy object.
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void executeStrategy(Model m) {
		strategy.sort(m);
	}
}
