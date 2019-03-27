package clouds;

public class JumpingOnTheClouds {
	
	static int jumpingOnClouds(int[] c) {

		int result=0;
		
		//0 0 0 0 1 0
		int p = 0;
        int moves = 0;
        while(p < c.length-1) {
            moves++;
            if(p+2 <= c.length-1 && c[p+2] == 0) {
                p+=2;
            } else {
                p++;
            }
        }
        return moves;
        
        
    }

	
	
	public static void main(String[] args) {
		
		
		int[] a= {0,0, 0, 1, 0, 1};
		
		int n=a.length;
		
		
		int result=0;
		
		result=jumpingOnClouds(a);
		
		System.out.println(result);
		
		
	}
}
