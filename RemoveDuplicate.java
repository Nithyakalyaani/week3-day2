package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String text="We Learn java basics as apart of java sessions in java week1";
   String[] split=text.split(" ");//to split the string
   Set<String> value=new LinkedHashSet<String>();
   for (String s:split)
   {
	   value.add(s);//adding string data to set
   
	}
System.out.println(value);//to print after removing duplicates
System.out.println(String.join(" ", value));//to join as string
}
}