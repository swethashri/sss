package guvi;
import java.util.*;
public class DigitsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b;
int rev=0;
while(a!=0)
{
	b=a%10;
	rev=rev*10+b;
	a/=10;
}
System.out.println(rev);
	}

}
