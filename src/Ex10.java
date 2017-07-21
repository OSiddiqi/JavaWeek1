public class Ex10 {
	public static int exerciseMethod10(int a, int b)
	{
	if (a == 0) {
	
	return b;
	} else if 
	(b == 0) {
	
	return a;
	} else {
	
	}
	return a*b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		for (int i : nums)
		{
		System.out.println(exerciseMethod10(i,i+1));
		}
	}
}