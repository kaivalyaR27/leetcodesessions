import java.util.*;
import java.lang.Math;
class powers{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a base number");
double x=sc.nextDouble();
System.out.println("Enter the exponential number");
double n=sc.nextDouble();
double power=Math.pow(x,n);
System.out.println(power);
}
}