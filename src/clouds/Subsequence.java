package clouds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Subsequence {

    // set to store all the subsequences 
    static List<String> st = new ArrayList<String>(); 
  
    // It computes all the subsequence of an string 
    static void subsequence(String str) 
    { 
        // iterate over the entire string 
        for (int i = 0; i < str.length(); i++) { 
              
            // iterate from the end of the string 
            // to generate substrings 
            for (int j = str.length(); j > i; j--) { 
                String sub_str = str.substring(i, j); 
              
                
                
                if (!st.contains(sub_str)) 
                    st.add(sub_str); 
  
                // drop kth character in the substring 
                // and if its not in the set then recur 
                for (int k = 1; k < sub_str.length() - 1; k++) { 
                    StringBuffer sb = new StringBuffer(sub_str); 
  
                    // drop character from the string 
                    sb.deleteCharAt(k); 
                    if (!st.contains(sb)) 
                         
                    	{subsequence(sb.toString());} 
                } 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String s = "abc"; 
        subsequence(s);
        
        
        Collections.sort(st);
        for (String string : st) {
			System.out.println(string);
		}
         
    }

}
