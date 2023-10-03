import java.util.*;
import java.io.*;
import java.lang.*;
class lenofword{
public int low(String a)
	{
	int len = 0;
	String x = a.trim();
      for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == ' ')
				len = 0;
			else
				len++;
		}

		return len;
	}
public static void main(String[] args)
	{
		String input = "Hi kaivalya";
		lenofword l = new lenofword();
		System.out.println("The length of last word is "
						+ l.low(input));
	}
}

