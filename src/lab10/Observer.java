package lab10;

public abstract class Observer {
	protected Subject subject;
	protected float currentTemp;
	public abstract void update();
}
