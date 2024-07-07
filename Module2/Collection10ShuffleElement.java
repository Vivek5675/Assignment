package module2;

import java.util.ArrayList;
import java.util.Collections;

public class Collection10ShuffleElement 
{
	public static void main(String[] args) 
	{
		 ArrayList<Integer> numbers = new ArrayList<>();
		 
	        for (int i = 1; i <= 10; i++) 
	        {
	            numbers.add(i);
	        }
	        
	        System.out.println("ArrayList: " + numbers);
	        
	        Collections.shuffle(numbers);
	        
	        System.out.println("Shuffle ArrayList: " + numbers);
	}
}

