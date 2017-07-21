
public class Blackjack {
	
	public static int blackjack(int a, int b)
	{
	if (a >21 & b >21) {
	return 0; 
	}
	else if (b > a && b <=21) {
	return b;
	}
	if (a > b && a <=21) {
	return a;
	}
	return b;
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.out.println(blackjack(21,18));
}
}
