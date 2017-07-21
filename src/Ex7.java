//exercise to either add 2 integers depending the conditions met
//or multiply them together
//this exercise is to check for a 0; it will just return the
//other number if one is 0

public class Ex7 {

	public static int exerciseMethod7(int a, int b)
	{
	if (a == 0) {
	
	return b;
	} else if 
	(b == 0) {
	
	return a;
	}
	return a+b;
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub

		System.out.println(exerciseMethod7(3,2));
	
	}

}