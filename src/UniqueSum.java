
public class UniqueSum {
	
	public static int uniqueSum (int a, int b, int c)
	{
	if (a == b || a == c) {
	return c;
	} if (b == c) {
	return a+c;
	}if (c == a || c == b) {
	return a+b;
	} if (a == b && b == c) {
	return 0;
	}
	return (a+b+c);
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.print(uniqueSum(1,1,2));
	}

}
