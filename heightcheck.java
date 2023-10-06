import java.util.*;
import java.io.*;
import java.lang.*;
class heightcheck{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the height of the student");
int n=sc.nextInt();
if(n>=150){
System.out.println("These are promoted to next grade");
}
else{
System.out.println("Better luck next time");
}
}
}