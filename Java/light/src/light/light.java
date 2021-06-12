package light;

public class light {
	public static void main(String args[]) {
		long second;
		long distance;
		int days;
		long speed;
		int lightspeed = 18600;
		days = 1000;
		second = days * 24 * 60 * 60;
		distance = lightspeed * second;
		System.out.println("Distance:   "  +distance);
	}

}
