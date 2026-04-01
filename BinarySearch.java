import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		
		int bottom = 0;
		int top = ray.length-1;
		int middle = (bottom+top)/2;
		//Boolean sentinal
		boolean foundIt = false;

		while(bottom <= top && !foundIt)
		{
			//Resetting the middle after every loop since the top or bottom value changes with each loop	
			middle = (bottom + top) / 2;
			//If the middle value is less than the index
        	if(ray[middle] < item)
        	{
				//Change the bottom to the middle value plus 1
            	bottom = middle + 1;
        	}
			//Else the middle value is greater than the index
        	else if(ray[middle] > item)
        	{
				//Change the top to the middle value minus 1
            	top = middle - 1;
        	}
			//Else we found the index
        	else
        	{
				//Return the index 
            	return middle;
        	}
		}
		//If the value doesn't exist at all than return -1
		return -1;
		
	}
}
