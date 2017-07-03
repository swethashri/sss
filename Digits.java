package guvi;
import java.io.*;
import java.util.*;
public class Digits {
	  public static void main(String[] args) {
	         Scanner sc=new Scanner(System.in);System.out.println("Enter No.");
	        int n=sc.nextInt();System.out.println("Enter del digit");
	        int k=sc.nextInt();
	        int length=0;
	        int a[]=new int[100];
	        int i=0;
	        while(n>0){
	            a[i]=n%10;
	            n=n/10;
	            length++;
	            i++;
	        }
	        int a1[]=new int[length];
	        for(i=0;i<length;i++)
				a1[i]=a[i];
	        Arrays.sort(a1);
	        String num="";
	        for(i=0;i<length-k;i++)
	            num=num+a1[i];
	        System.out.println(num);
	           }}
