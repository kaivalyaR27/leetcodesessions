import java.io.*;
import java.lang.*;
import java.util.*;    
class anagram{
static void isana(String s1,String s2){
String st1=s1.replaceAll("\\s","");
String st2=s2.replaceAll("\\s","");
boolean status=true;
if(st1.length()!=st2.length()){
status=false;
}
else{
char[]arrayS1=st1.toLowerCase().toCharArray();
char[]arrayS2=st2.toLowerCase().toCharArray();
Arrays.sort(arrayS1);
Arrays.sort(arrayS2);
status=Arrays.equals(arrayS1,arrayS2);
}
if(status){
	System.out.println("Anagrams");
}
else{
	System.out.println("Not an anagram");
}
}
public static void main(String args[]){
	isana("hello","mellow");
	isana("heart","earth");
}
}

