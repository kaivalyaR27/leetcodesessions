import java.io.*;
import java.lang.Math;
class jio{
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		while(true){
			System.out.println("circle radius");
			String str=br.readLine();
			double radius;
			try{
				radius=Double.valueOf(str).doubleValue();
				if(radius<=0)
					System.err.println("radius cant be zero");
				else{
					System.out.print("circum"+Math.PI*2.0*radius);
					System.out.println("Area"+Math.PI*radius*radius);
					System.out.println();
				}
			}
			catch(Exception e){
			System.out.println(e);
			}
			
		}
	}
}
		