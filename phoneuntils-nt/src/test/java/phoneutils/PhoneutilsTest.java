package phoneutils;

import static org.junit.Assert.*;

import org.junit.Test;

public class PhoneutilsTest {

	@Test
	public void test_input_num_digits_is_10_result_true() 
	{
		
		//arrange 
		PhoneUtils cut = new PhoneUtils();
		String input = "91234567890";
		String expResult = "91234567890";
		
		//act
		
		String actualResult = cut.ValidatePhoneNum(input);
		
		//assert
		assertEquals(expResult,actualResult);
		
		// fail("Not yet implemented");
	}
	
	@Test
	public void test_input_num_digits_is_9_result_invalid() 
	{
		
		//arrange 
		PhoneUtils cut = new PhoneUtils();
		String input = "9123456789";
		String expResult = "invalid";
		
		//act
		
		String actualResult = cut.ValidatePhoneNum(input);
		
		//assert
		assertEquals(expResult, actualResult);
		
	 }
	
	@Test
	public void test_input_num_digits_is_not_10_result_invalid() 
	{
		
		//arrange 
		PhoneUtils cut = new PhoneUtils();
		String input9 = "9123456789";
		String input11 = "912345678911";
		String expResult = "invalid";
		
		//act
		
		String actualResult9 = cut.ValidatePhoneNum(input9);
		String actualResult11 = cut.ValidatePhoneNum(input11);
		
		//assert
		assertEquals(expResult, actualResult9);
		assertEquals(expResult, actualResult11);
		
	 }
	
	@Test
	public void test_input_num_digits_is_wrongformat_result_invalid() 
	{
		
		//arrange 
		PhoneUtils cut = new PhoneUtils();
		String input = "9{123456789";
		String expResult = "invalid";
		
		//act
		
		String actualResult = cut.ValidatePhoneNum(input);
		
		//assert
		assertEquals(expResult, actualResult);
		
	 }
	
	@Test
	public void test_input_num_digits_has_letters_result_invalid() 
	{
		
		//arrange 
		PhoneUtils cut = new PhoneUtils();
		String input = "9ab123456789";
		String expResult = "invalid";
		
		//act
		
		String actualResult = cut.ValidatePhoneNum(input);
		
		//assert
		assertEquals(expResult, actualResult);
		
	 }
	
	}
