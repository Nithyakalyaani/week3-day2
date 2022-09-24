package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data= {3,2,11,5,6,7};
		List<Integer> input=new ArrayList<Integer>();
		
		for(Integer in:data)
		{
			input.add(in);
			
		}
		Collections.sort(input);
		System.out.println(input.get(input.size()-2));//to get second largestitem
	}

}
