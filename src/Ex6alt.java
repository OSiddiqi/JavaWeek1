
public class Ex6alt {
	
	public static int sum (int a, int b, Boolean c)
	{
		if (c== true)
		{
			return a+b;
		}
	
		else
		{
			return (a+1)*b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(2,3,true));
	}

}
