
public class TooHot {

	public static boolean hot (int temperature, Boolean isSummer)
			{
		int temperatureLimit = 90;
		
		if (isSummer = true) {
		temperatureLimit = 100;
		}
		if (temperature >= 60 && temperature <= temperatureLimit) {
		return true;
		}
		return false;
		}
			
public static void main(String[] args) {
	// TODO Auto-generated method stub

System.out.print(hot (40, false));
}
}