package strings;
import java.io.*;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
StringBuffer s1=new StringBuffer(str);
StringBuffer s2=new StringBuffer(s1);
s1.reverse();
System.out.println("the reverse string is"+s1);
if(String.valueOf(s1).compareTo(String.valueOf(s2))==0)
{
	System.out.println("its a palindrome");
}
else
	System.out.println("its not a palindrome");
}
}