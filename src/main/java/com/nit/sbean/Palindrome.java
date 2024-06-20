package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("p")
public class Palindrome {
	
	
	public void isPalindrome(int num) {
		int temp=num;int rev=0;
		while(num!=0) {
			rev=(rev*10)+(num%10);
			num/=10;
		}System.out.println(rev);
		if(rev==temp) {
			System.out.println(temp+" is palindrome.");
		}
			else {
				System.out.println(temp+" is not palindrome.");
			}
	}
	}


