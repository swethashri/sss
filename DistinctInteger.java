package guvi;
import java.io.*;
import java.util.*;
public class DistinctInteger {
	 public static void main(String[] args){
	        Scanner s=new Scanner(System.in);
	        System.out.print("Enter number of elements in the array : ");
	        int arr[]=new int[s.nextInt()],iteration;
	        for(iteration=0;iteration<arr.length;iteration++){
	           System.out.print("Enter element["+iteration+"] : ");
	            arr[iteration]=s.nextInt();
	        }
	        Arrays.sort(arr);
	        for(iteration=0;iteration<arr.length-1;iteration+=2){
	            if(arr[iteration]!=arr[iteration+1]){
	               System. out.print("The unique number : "+arr[iteration]);
	                break;
	            }
	        }
	    }
}
