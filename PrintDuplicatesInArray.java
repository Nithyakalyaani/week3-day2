package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {14,12,13,11,15,14,18,16,17,19,18,17,20};
Set<Integer> input=new LinkedHashSet<Integer>();

for(Integer in:array)
{ 
	Boolean e=input.add(in);
	
	if(e==false)
	{
		System.out.println("Duplicate elements in array are" +input);
	}
}

	}

}
