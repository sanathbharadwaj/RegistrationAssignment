package com.nissan.training.advancedjava.servlet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FieldsValidator {
	
	public static boolean isEmailValid(String email) {
		
		if(email == null || email.equals(""))
			return false;
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

	public static boolean isMobileValid(String mobile)
    {
		if(mobile == null || mobile.equals(""))
			return false;
        // The given argument to compile() method
        // is regular expression. With the help of
        // regular expression we can validate mobile
        // number.
        // 1) Begins with 0 or 91
        // 2) Then contains 7 or 8 or 9.
        // 3) Then contains 9 digits
        Pattern p = Pattern.compile("(0/91)?[5-9][0-9]{9}");

        // Pattern class contains matcher() method
        // to find matching between given number
        // and regular expression
        Matcher m = p.matcher(mobile);
        return (m.find() && m.group().equals(mobile));
    }
	
	public static boolean isPasswordValid(String password)
	{
		if(password == null || password.equals(""))
			return false;
		if(password.length() > 5)
			return true;
		return false;
	}
	
	public static boolean isNameValid(String name)
	{
		if(name == null || name.equals("")) {
			System.out.println("Name is null");
			return false;
		}
		if(name.length() > 2)
			return true;
		return false;
	}
	
	
	
	
}
