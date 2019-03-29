package minmax;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMax {

	// Complete the miniMaxSum function below.
		static void miniMaxSum(int[] arr) {

			 long min = Long.MAX_VALUE;
		        long max = 0;
		        long sum = 0;
		        for(int i=0; i<arr.length; i++)
		        {
		            long curr = arr[i];  
		            if(max < curr)
		            {
		                max = curr;
		            }
		            if(min > curr)
		            {
		                min = curr;
		            }
		            
		            sum += curr;
		        }
		        long minSum = sum - max;//Removes the largest of the 5 numbers to get the min sum
		        long maxSum = sum - min;//Removes the smallest of the 5 numbers to get the max sum
		        System.out.println(minSum + " " + maxSum);	    }
		
		
		
		/*static long minVal(int[] arr) {
			long result=0;
			
			int maxVal=0;
			int loc=0;
			
			for(int i=0;i<arr.length;i++) {
			
				if(arr[i]>maxVal) {
					maxVal=arr[i];
					loc=i;
				}
				
				
			}
			
			int[] minVal=removeVal(maxVal,arr,loc);
			
			
			for (int i = 0; i < minVal.length-1; i++) {
				result+=minVal[i];
			}
			
			//System.out.println(result);
			return result;
		}
		*/
		
		/*static long maxVal(int[] arr) {
			long result=0;
			
			int minVal=arr[0];
			int loc=0;
			
			for(int i=0;i<arr.length;i++) {
			
				if(arr[i]<minVal) {
					minVal=arr[i];
					loc=i;
				}
				
				
			}
			
			//System.out.println(minVal);
			
			int[] mVal=removeVal(minVal,arr,loc);
			
			
			for (int i = 0; i < mVal.length-1; i++) {
				result+=mVal[i];
			}
			
			//System.out.println(result);
			return result;
		}
		
		
		
		static int[] removeVal(int val, int[] arr, int loc) {
			
			
			 
			for(int i=loc+1;i<arr.length;i++) {
				
				arr[i-1]=arr[i];
				
				
			}
			
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i]);
//			}
			
			return arr;
		}*/
		
		
		public static void main(String[] args) {
					
			int[] arr = {1, 2, 7, 4, 5};
			
			
			miniMaxSum(arr);
		}

	
}


