import java.lang.*;
import java.util.*;
import java.io.*;
class pof {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }
        while (num > 3) {
            if (num % 4 != 0) {
                return false;
            }
            num = num / 4;
        }
        return num == 1;
    }
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
}	}

