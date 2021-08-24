import java.util.Scanner;

public class Example11054 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dt = new int[n+1];
		
		for (int i = 0; i < n; i++) {
			dt[i] = sc.nextInt();
		}
		
		int[] dpLeftToRight = new int[n+1];
		
		int[] dpRightToLeft = new int[n+1];
		
	    for (int i = 0; i < n; i++)
	    {
	    	dpLeftToRight[i] = 1;

	        for (int j = 0 ; j < n; j++)
	        {
	            if (dt[j] < dt[i] && dpLeftToRight[i] < dpLeftToRight[j]+1)
	            	dpLeftToRight[i] = dpLeftToRight[j]+1;
	        }
	    }

	    for (int i = n-1; i >= 0; i--)
	    {
	    	dpRightToLeft[i] = 1;

	        for (int j = n-1 ; j > i; j--)
	        {
	            if (dt[j] < dt[i] && dpRightToLeft[i] < dpRightToLeft[j]+1)
	            	dpRightToLeft[i] = dpRightToLeft[j]+1;
	        }
	    }


	    int ans = dpLeftToRight[0] + dpRightToLeft[0] - 1;

	    for (int i = 0; i < n; i++)
	    {
	        if (ans < dpLeftToRight[i] + dpRightToLeft[i] - 1)
	            ans = dpLeftToRight[i] + dpRightToLeft[i] - 1;
	    }
	
		System.out.print(ans);
	}

}
