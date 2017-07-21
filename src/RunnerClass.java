import java.util.ArrayList;

public class RunnerClass {

	public static void main(String[] args) {
		int roomSize = 250;
		ArrayList<Paint> paintList = new ArrayList<>();
		ArrayList<Double> prices = new ArrayList<>();
		
		Paint p = new Paint ("CheapoMax", 10, 19.99, 20);
		Paint p1 = new Paint ("AverageJoes", 11, 17.99, 15);
		Paint p2 = new Paint ("DuluxourousPaints", 20, 25.00, 10);
		
		paintList.add(p);
		paintList.add(p1);
		paintList.add(p2);
		
		for (Paint paint : paintList) {
			prices.add(paint.getTotalPrice() * (paint.getCoverage() / roomSize));
		}
		
		double lowestPrice = prices.get(0);
		for (double price : prices) {
			if (price < lowestPrice) {
				lowestPrice = price;
			}
		}
		System.out.print("£");
		System.out.format("%.2f%n", lowestPrice);
	}
	
}

