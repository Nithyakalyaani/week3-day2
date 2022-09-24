package week3day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1= {3,2,11,4,6,7};
		int[] num2= {1,2,8,4,9,7};
		List<Integer> number1=new ArrayList<Integer>();
		List<Integer> number2=new ArrayList<Integer>();
		for(Integer in:num1)
		{
			number1.add(in);
			
		}
		for(Integer in1:num2)
		{
			number1.add(in1);
			
			
		}
		for(int i=0;i<number1.size();i++)
		{
			for(int j=0;j<number2.size();j++)
			{
				if(number1.get(i)==number2.get(j))
				{
					System.out.println(number1.get(i));
				}else
				{
					System.out.println("No Intersection");
				}
			}
		}
	}

}
