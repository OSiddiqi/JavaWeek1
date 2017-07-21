import java.util.ArrayList;

public class People extends Person {

	
	public People(String name, int age, String jobTitle) {
		super(name, age, jobTitle);
		// TODO Auto-generated constructor stub
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		People a = new People("Steve", 22, "Marketing Officer");
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.jobTitle);
		
		ArrayList<String> Names = new ArrayList<String>();
		
		Names.add("Steve");
		Names.add("Frank");
		Names.add("John");
		
		for (int index = 0; index <Names.size(); index++);
				
			int index = 0;
			System.out.println(Names.get(index));
			
	}

}
