package epam3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortandOrder {
	
	public static void main(String args[] ) throws Exception
    {
        Scanner s = new Scanner(System.in);
        long n=s.nextLong();
        long k=s.nextLong();
        ArrayList<Long> weights=new ArrayList<Long>();
        for(long i=0;i<n;i++)
            weights.add(s.nextLong());
        s.close();
        Collections.sort(weights, (a,b) ->
                                {
                                    if (a%k == b%k)
                                    return (int)(a - b);
                                    
                                    else
                                    	
                                    return (int)(b%k - a%k);
                                }   
        
        );
        
        for(long i: weights)
            System.out.print(i + " ");
        
    }
	
}