
public class Ex11 {
	public static boolean exerciseMethod11(int a) {
				
	int[] nums = {1,2,3,4,5,6,7,8,9,10};
	return nums(1,2,3,4,5,6,7,8,9,10) == nums(1,2,3,4,5,6,7,8,9,10)*10;
	
	}

	private static int nums(int i, int j, int k, int l, int m, int n, int o, int p, int q, int r) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int nums(int i, int j, int k, int l, int m, int n, int o, int p, int q, boolean b) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 1; i < nums.length; i++)
		{
		System.out.println(exerciseMethod11(i));
		}
		System.out.println("----------------");
		for (int i = 1; i < nums.length; i++)
		{
		System.out.println(exerciseMethod11(i*10));
		}
	}
}