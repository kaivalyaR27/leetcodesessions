import java.util.Scanner;
class bignumber{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    int n1=sc.nextIn();
    System.out.println("enter second number");
    int n2=sc.nextInt();
    System.out.println("enter third number");
    int n3=sc.nextInt();
    if(n1>n2 && n1>n3){
        System.out.println("this is biggest number");
    }
    else if(n2>n1 && n2>n3){
        System.out.println("this is biggest number");
    }
    else{
        System.out.println("this is biggest number");
    }
    }

}