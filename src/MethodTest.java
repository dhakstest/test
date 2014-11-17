
public class MethodTest {
	
	public static void main(String[] args) {
		int age = 23;
		String result = minorOrAdult(age);
		System.out.println(result);
		
		int age2 = 17;
		String result2 = MethodTest.minorOrAdult(age2);
		System.out.println(result2);
		
		int age3 = 12;
		MethodTest obj = new MethodTest();
		String result3 = obj.minorOrAdult(age3);
		System.out.println(result3);
		
	}
	
	public static String minorOrAdult(int age)	{
		if(age >= 18)	
			return "Adult";
		else 
			return "minor";
	}

	public int add(int a , int b)	{
		return a+b;
	}
}
