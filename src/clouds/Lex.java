package clouds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lex {
	
	
	public static void main(String[] args) {
		
		
		/*List<String> list=new ArrayList<String>();
		
		list.add("b");
		list.add("a");
		list.add("ba");
		
		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);
		}*/
		
		
		String s="abc";
		
		
		
		List<String> result=build(s);
		
		for (String string : result) {
			System.out.println(string);
		}
		
	}
	
	
	public static List<String> build(String s){
		
		
		
List<String> substringList=new ArrayList<String>();
		
	/*	for(int i=0;i<s.length();i++) {
			for (int j=i+1;j<=s.length();j++) {
				String sub=s.substring(i, j);
				
				if(!substringList.contains(sub)) {substringList.add(sub);}
				
				for(int k=1;k<sub.length()-1;k++) {
					StringBuffer sb=new StringBuffer(sub);
					
					sb.deleteCharAt(k);
					
					
					if(!substringList.contains(sb)) {
							build(sb.toString());
					}
					
					
				}
				
				
				
			}
		}*/


	char[] subCharArray=s.toCharArray();
	String temp=" ";
	
	for(int i=0;i<subCharArray.length;i++) {
		for(int j=i+1;j<=subCharArray.length;j++) {
			
			System.out.println();
			
		}
	}
		
		Collections.sort(substringList);
		return substringList;
	}

}




