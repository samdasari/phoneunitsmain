package com.qa.phoneuutils.nt;

import phoneutils.*;

public class MainUnit {
	
	private static final int toffset = 10;

	public static void main(String[] args) 
	
	{
		
	System.out.println("Phone number 92345678901 validation result: "+validatePhoneNumber("92345678901"));
	System.out.println("Phone number 923-4561-78901 validation result: "+validatePhoneNumber("923-4561-78901"));
	System.out.println("Phone number 123-4561-7890 validation result: "+validatePhoneNumber("123-4561-7890"));
	System.out.println("Phone number (123)-4561-7890 validation result: "+validatePhoneNumber("(123)-4561-7890"));
	System.out.println("Phone number 123.4561.7890 validation result: "+validatePhoneNumber("123.4561.7890"));
	System.out.println("Phone number 123 4561 78900 validation result: "+validatePhoneNumber("123 456 78900"));
	System.out.println("Phone number 123-456-7890 x1234 validation result: "+validatePhoneNumber("123-456-7890 x1234"));
	System.out.println("Phone number 123-456-7890 ext1234 validation result: "+validatePhoneNumber("123-456-7890 ext1234"));
	System.out.println("Phone number 123dhjf yt67 46: "+validatePhoneNumber("123dhjf yt67 46"));
	System.out.println("Phone number 852 678 (2): "+validatePhoneNumber("852 678 (2)"));
		}

		private static boolean validatePhoneNumber(String phoneNo) {
			//validate phone numbers of format "1234567890"
			if (phoneNo.matches("\\d{11}")) return true;			
			// validating phone number start with 9
			else if (phoneNo.startsWith("9", toffset)) return true; 			
			//validating phone number with -, . or spaces			
			else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{4}[-\\.\\s]\\d{4}")) return true;
			//validating phone number with extension length from 3 to 5
			else if(phoneNo.matches("\\d{3}-\\d{4}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
			//validating phone number where area code is in braces ()
			else if(phoneNo.matches("\\(\\d{3}\\)-\\d{4}-\\d{4}")) return true;
			//return false if nothing matches the input
			else return false;
		
	}

}
