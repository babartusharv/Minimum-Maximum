import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimumMaximum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int length,numbers[],minCount;
	    Scanner scanner = new Scanner(System.in);
	    byte testCases = scanner.nextByte();
	    while(testCases-- > 0)
	    {
	        minCount=0;
	        length=scanner.nextInt();
	        numbers=new int[length];
	        for(int i=0;i<length;i++)
	            numbers[i]=scanner.nextInt();
	        Arrays.sort(numbers);
	        for(int j=0;j<length;j++)
	        {
	           minCount++;
	           if(j == length-2)
	            break;
	        }
	        System.out.println(minCount*numbers[0]);
		}
	}
}
