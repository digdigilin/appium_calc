package tests;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;

public class Tests extends BClass {
	
	@Test(priority=1)
	public void nullMobileTest() {
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.daretoinnovate.oze:id/action_bar_root\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.Button\"), \"Sign Up\")")).click();
		System.out.println("Starting test for blank mobile number...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("abc@gmail.com");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Please fill all the fields"))
		{
			System.out.println("Test Passed...");
		}
	}
	
	@Test(priority=2)
	public void invalidMobileTest() {
		System.out.println("Starting test for invalid mobile number...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("5544070519");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("xyz@gmail.com");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Please make sure the mobile number you entered is valid"))
		{
			System.out.println("Test Passed...");
		}
	}
	
	
	@Test(priority=3)
	public void nullEmailTest() {
		System.out.println("Starting test for blank email...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("554407051");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Please fill all the fields"))
		{
			System.out.println("Test Passed...");
		}
	}
	
	
	@Test(priority=4)
	public void emailSymbolTest() {
		System.out.println("Starting test for invalid email (no @ symbol)...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("554407051");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("abcgmail.com");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Please enter a valid email address"))
		{
			System.out.println("Test Passed...");
		}
	}
	
	
	@Test(priority=5)
	public void emailSuffixTest() {
		System.out.println("Starting test for invalid email (no suffix)...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("554407051");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("abc@gmail");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Please enter a valid email address"))
		{
			System.out.println("Test Passed...");
		}
	}
		
		
	@Test(priority=6)
	public void emailPrefixTest() {
		System.out.println("Starting test for invalid email (no prefix)...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("554407051");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("@gmail.com");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Please enter a valid email address"))
		{
			System.out.println("Test Passed...");
		}
	}
	
		
	@Test(priority=7)
	public void nullPassTest() {
		System.out.println("Starting test for blank password...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("554407051");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("abc@gmail.com");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Please fill all the fields"))
		{
			System.out.println("Test Passed...");
		}
	}
		
		
	@Test(priority=8)
	public void spacePassTest() {
		System.out.println("Starting test for space in password...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("554407051");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("abc@gmail.com");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("Pass abc");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("Pass abc");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Please make sure your password doesn't contain spaces!"))
		{
			System.out.println("Test Passed...");
		}
	}
	
	
	@Test(priority=9)
	public void upperCasePassTest() {
		System.out.println("Starting test for Upper case in password...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("554407051");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("abc@gmail.com");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Please make sure your password has at least 1 Upper case character"))
		{
			System.out.println("Test Passed...");
		}
	}
	
	
	@Test(priority=10)
	public void shortPassTest() {
		System.out.println("Starting test for short passwords...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("554407051");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("abc@gmail.com");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("Passabc");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("Passabc");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Please make sure your password has at least 8 characters!"))
		{
			System.out.println("Test Passed...");
		}
	}
	
	
	@Test(priority=11)
	public void mismatchPassTest() {
		System.out.println("Starting test for mismatch passwords...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("554407051");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("abc@gmail.com");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("Pass@1234");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("Retype password is not same as password entered"))
		{
			System.out.println("Test Passed...");
		}
	}
	
	
	@Test(priority=12)
	public void dupMobileTest() throws InterruptedException {
		System.out.println("Starting test for duplicate mobile number...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("554407051");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("abc@gmail.com");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		driver.findElementById("com.daretoinnovate.oze:id/check_accept_terms").click();
		driver.findElementById("com.daretoinnovate.oze:id/okay").click();
		
		Thread.sleep(3000);
		
		String xmlFormat = driver.getPageSource();
		if(xmlFormat.contains("This phone number is already taken. Kindly try another one or contact Coach for help."))
		{
			System.out.println("Test Passed...");
		}
	}
	
	
	@Test(priority=13)
	public void validSignUpTest() throws InterruptedException {
		System.out.println("Starting test for valid sign up test...");
		driver.findElementById("com.daretoinnovate.oze:id/phone_number").sendKeys("558139947");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_email").sendKeys("abc@gmail.com");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/new_user_password2").sendKeys("Pass@123");
		driver.hideKeyboard();
		driver.findElementById("com.daretoinnovate.oze:id/btn_signup").click();
		
		String ver = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.daretoinnovate.oze:id/action_bar_root\")).getChildByText("
				+ "new UiSelector().className(\"android.widget.Button\"), \"Verify\")")).getText();
		
		if (ver == "Verify") {
			System.out.println("Test Passed...");
		}
	}
	
}
