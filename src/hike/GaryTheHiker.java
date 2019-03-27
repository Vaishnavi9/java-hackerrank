package hike;

public class GaryTheHiker {
	
	
	 // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	
    	int level = 0;
        int valleys = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'U'){
            	System.out.println(level);
                level++;
            }else if(s.charAt(i) == 'D'){
                if(level == 0){
                    valleys++;
                }
                level--;
                System.out.println(level);
            }
        }
        
        return valleys;


    }
    
    
    public static void main(String[] args) {
		
    	String s="UDDDUDDDDUU";
    	
    	int n=s.length();
    	
    	int result=0;
    	
    	result=countingValleys(n, s);
    	
    	System.out.println(result);
	}

}
