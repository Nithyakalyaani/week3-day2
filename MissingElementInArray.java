package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,2,3,4,7,6,8,10,13};
		List<Integer> input=new ArrayList<Integer>();
		
		for(Integer in:array)
		{
			input.add(in);//to add array items into list
		
	}
		Collections.sort(input);//to sort values
		System.out.println(input);//to print the sorted values
		int size=input.size();
		int count=1;
		for(int i=0;i<size;i++)
		{
			if((i+count)!=input.get(i))
			{
				System.out.println(i+count);
				count++;
				
			}
		}
	}
}
