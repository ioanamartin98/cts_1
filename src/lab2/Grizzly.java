package lab2;

public class Grizzly extends Bear{

	int GRIZZLY_SPEED=45;

	public Grizzly() {
		super();
	}

	public int getGRIZZLY_SPEED() {
		return GRIZZLY_SPEED;
	}

	@Override
	public String toString() {
		return "Grizzly [GRIZZLY_SPEED=" + GRIZZLY_SPEED + "]";
	}
	
	
	
}
