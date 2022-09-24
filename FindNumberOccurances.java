package week3day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[]= {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer, Integer> map=new TreeMap<Integer, Integer>();
		 for(int output:input)
		 {
		if(map.containsKey(output))
		{
			map.put(output,map.get(output)+1);
		}
		else
		{
			map.put(output,1);
		}
	}
System.out.println(map);
}
}