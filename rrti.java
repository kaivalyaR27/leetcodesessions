import java.util.*;
import java.io.*;
import java.lang.*;
import java.io.*;  
import java.util.*;  
class rrti{ 
public static void rti(String s)  
    {  
        Map<Character, Integer> map=new HashMap<Character, Integer>();    
        map.put('I',1);  
        map.put('V',5);  
        map.put('X',10);  
        map.put('L',50);  
        map.put('C',100);  
        map.put('D',500);  
        map.put('M',1000);    
        s = s.replace("IV","IIII");  
        s = s.replace("IX","VIIII");  
        s = s.replace("XL","XXXX");  
        s = s.replace("XC","LXXXX");  
        s = s.replace("CD","CCCC");  
        s = s.replace("CM","DCCCC");  
        int num = 0;  
        for (int i = 0; i < s.length(); i++)  
        {   
            num = num + (map.get(s.charAt(i)));  
        }  
         
        System.out.println("The corresponding Integer value is: "+num);  
}  
    
    public static void main (String args[])  
    {  
          
        rti("IX");  
    }  
} 
  
	