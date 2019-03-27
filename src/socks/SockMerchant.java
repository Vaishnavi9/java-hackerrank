package socks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SockMerchant {
	static List<Integer> checkList=new ArrayList<Integer>();
	 static int frequency(int a[], int n, int x) 
			    { 
		 
		 	//to check visited elements
		 	
		 
			        int count = 0;
			        
			        if(!checkList.contains(x)) {    
			        	
			        for (int i=0; i < n; i++) {
			        	if (a[i] == x) {count++;}
			    	   }
			        
			        checkList.add(x);
			        }
			        
			        
			        return count; 
			    } 
			      
			    // Driver program 
			    public static void main (String[] 
			    args) { 
			          
			        int a[] = {10, 20, 20, 10, 10, 30, 50, 10, 20}; 
			        List<Integer> result=new ArrayList<Integer>();
			        
			        int finalCount=0;
			        
			        int n = a.length; 
			        for(int i=0;i<n;i++) {
			        
			        	
			        result.add(frequency(a, n, a[i]));
			        			
			        	
			        
			        }
			        
			        
			        for (Integer integer : result) {
			        	
			        	if(integer!=0) {
			        		finalCount+=integer/2;
			        	}
						
					}
			        
			        System.out.println("The pair of socks created is -->"+finalCount);
			        
			    } 

}
