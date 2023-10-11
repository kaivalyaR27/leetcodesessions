import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class mobnumvalid
{     
    public static boolean isvalidnum(String str)  
{ 
    Pattern p = Pattern.compile("(0/91)?[0-9][0-9]{9}");  
    Matcher match = p.matcher(str);  
    return (match.find() && match.group().equals(str));  
} 
public static void main(String args[])  
{        
    String str = "8688667047";    
    if (isvalidnum(str))  
    System.out.println("It is a valid mobile number.");   
    else  
    System.out.println("Entered mobile number is invalid.");      
}  
}   