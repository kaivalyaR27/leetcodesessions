import java.io.*;
class fos{
	public static void main(String args[]){
		try{
			FileOutputStream fo=new FileOutputStream("C:\Users\srisaika\Desktop\leetcode\txt doc");
			fo.write(65);
			fo.close();
			System.out.println("success");
		}
		catch(Execption e){
			System.out.println(e);
		}
	}