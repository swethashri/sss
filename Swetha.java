package guvi;
import java.io.*;
import java.util.*;
public class Swetha {
	public static void main(String[] args) 
	{
		System.out.println("enter array length");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the values");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==i)
			{
				System.out.println("the num"+arr[i]+"index"+i);
			}
		}
	}
}
