import java.io.*;
import java.util.*;
import java.lang.*;
class divprogram{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n1=sc.nextInt();
		if(n1%3==0  & n1%5 ==0){
			System.out.println("fizzbuzz");
		}
		else if(n1%3==0){
			System.out.println("fizz");
		}
		else if(n1%5==0){
			System.out.println("buzz");
		}
		else{
			System.out.println("[]");
		}
	}
}