package lab2;

public class PolarBear extends Bear {
	int POLAR_BEAR_SPEED=40;

	public PolarBear() {
		super();
	}

	public int getPOLAR_BEAR_SPEED() {
		return POLAR_BEAR_SPEED;
	}

	@Override
	public String toString() {
		return "PolarBear [POLAR_BEAR_SPEED=" + POLAR_BEAR_SPEED + "]";
	}
	
} 
