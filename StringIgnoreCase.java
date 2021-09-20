package week3.day1.assignments;

public class StringIgnoreCase {

	public static void main(String[] args) {
		String s1="I am Learning Java" ;
		String s2="I am learning java";
		
		if (s1.equals(s2))
			System.out.println("Both are same - Equals method");
		else
			System.out.println("Both are different - Equals method");
		if (s1.equalsIgnoreCase(s2))
			System.out.println("Both are same Ignore case");
		else
			System.out.println("Both are different Equals method");
		
		if(s1==s2)
			System.out.println("Both are same == Operator");
		else
			System.out.println("Both are different == Operator");

	}
	

}
