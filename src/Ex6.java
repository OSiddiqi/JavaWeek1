//exercise to either add 2 integers depending the conditions met
//or multiply them together

public class Ex6 {

	public static int exerciseMethod6(int a, int b, Boolean c) {
	
	if (c == true) { 
		
	return(a+b);
	} else {
	return(a*b);
	}
	}
		
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println(exerciseMethod6(3,2,true));

	}

}
