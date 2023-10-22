//sample program to know how lines are inserted into fos 
import java.io.*
class insertintostream{
public static void main(String args[]){
	try{
		FileOutputStream fo=new FileOutputStream("");
		String s="";
		byte b=s.getBytes();
		fo.write(b);
		fo.close();
		System.out.println("success");
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}