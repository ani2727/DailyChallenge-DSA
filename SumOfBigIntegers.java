//Problem Link: https://rb.gy/wpnhxt

//code
import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static String findSum(String num1 , String num2)  
	{
			int carry = 0;
			StringBuilder sb = new StringBuilder();
		
			int i = num1.length()-1;
			int j = num2.length()-1;
			while(i >= 0 || j >= 0 || carry != 0)
			{
				int n1 = 0,n2 = 0;
				if(i >= 0) n1 = Character.getNumericValue(num1.charAt(i --));
				if(j >= 0) n2 = Character.getNumericValue(num2.charAt(j --));

				int sum = carry + n2 + n1;

				if(sum > 9) carry = sum/10;
				else carry = 0;

				sum = sum%10;
				sb.insert(0,sum);
			}
			return sb.toString();
	}
}
