package week3.day1.assignments;

public class StringEqualVerify {

	public static void main(String[] args) {
		String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");
	}
	
	/*
	 Justification of the Output:
	 *****************************
	 * 1. == is an operator gives the result true when primitive data types are 
	 * used. In case of primitive types like int, long, float, “==” operator
	 *  works fine and compares the values of the variables but in case of objects, 
	 * equality operator compares the object references not their values
	 * 
	 * 2.In the code there are two String objects str1 and str2.
		Since both objects have different references so equality 
		operator returns false. 
		Instead of == opearator if .isequals() method used,
		 content of both the String objects is same so the method will retun true.
		 
		 
		3.If we use String literals instead of creating new String objects 
		and then compare them. Note that in case of String literals 
		if object with the same value is already there then another literal
		 also uses the same reference, so its returns true
		 
		  str1=  "HELLO";
		 str2=  "HELLO";

		if (str1==str2)
			System.out.println(" Same text");  -> we get true value
		 
		 else 
			 System.out.println("Diff text");
	 * 
	 *
	 	 
	 */

}
