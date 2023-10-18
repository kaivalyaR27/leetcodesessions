import java.lang.*;
import java.util.*;
import java.io.*;
class pof {
	public boolean ipof(int n)
	{
		if (n != 0 && n == (int)Math.pow(4, (Math.log(n) / Math.log(4)))) {
			return true;
		}
		return false;
	}

	public static void main(String[] args)
	{
		pof g = new pof();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if (g.ipof(num)) {
			System.out.print(num + " is a power of 4 ");
		}
		else {
			System.out.print(num+ " is not a power of 4");
		}
	}
}

