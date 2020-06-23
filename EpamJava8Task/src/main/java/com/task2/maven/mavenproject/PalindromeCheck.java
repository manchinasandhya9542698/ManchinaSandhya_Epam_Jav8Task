package com.task2.maven.mavenproject;
import java.util.*;

public class PalindromeCheck {
	
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) {
                return false; 
            }
            i++; 
            j--; 
        }
        return true; 
	}
}
