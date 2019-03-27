package socks;



import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HashMapToFindFrequencyArrayElements {
	
	public static void main(String args[]){
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int arr[] = new int[]{2,2,3,3,5,6,7,9,9,0};
        for(int i=0; i<arr.length; i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i]) + 1);
                
            } else {
                h.put(arr[i], 1);
            }
        }
        System.out.println(h);
    }
	}
		   
	
