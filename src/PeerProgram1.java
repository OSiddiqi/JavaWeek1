
public class PeerProgram1 {

	int input;
	int divider = 1;
	int answer;
	
	public static void main(String[] args) {
		
	PeerProgram1 p1 = new PeerProgram1();
		
		p1.dude(18);
		p1.dude(3628800);
		p1.dude(479001600);
		p1.dude(6);
	}
	
	public void dude(int in) {
		
		answer = in;
		input = in;
		divider = 1;
		
		while (answer > 1) 
		{
		
		input = in;
		
		answer = answer/divider;
		System.out.println("divider: " + divider);
		
		divider++;
		
		System.out.println(answer);
		}
		
		if (answer <1)
		
		{
			
		System.out.println("None");	
			
		}
		System.out.println("");
	}
	
}
