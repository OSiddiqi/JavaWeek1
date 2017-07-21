
public class Paint {

	public String make;
	private int coverage;
	private double price;
	private int litres;
	/* double costPerSqM = price / coverage; */

	public Paint(String make, int coverage, double price, int litres) {

		this.make = make;
		this.coverage = coverage;
		this.price = price;
		/* this.costPerSqM = costPerSqM; */
		this.litres = litres;
	}

	private double getTotalCoverage() {
		return litres * coverage;

	}

	public double getTotalPrice() {
		return getTotalCoverage() * price;
	}

	public double getCoverage() {
		return coverage;
	}
}
