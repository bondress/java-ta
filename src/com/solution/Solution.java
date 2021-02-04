
package com.solution;

import java.util.Scanner;

public class Solution {
    
    public static boolean getresult(String str)
    {
        // your code goes here
        String rev = "";
        int length = str.length();
 
        for ( int i = length - 1; i >= 0; i-- )
        rev = rev + str.charAt(i);
 
        if (str.equals(rev))
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");

        if (args.length < 1)
        {
             System.exit(1);
        }
        
        args[0] = sc.nextLine();
        String str = args[0];
        
        if (str.length() < 0)
        {
             System.exit(2);
        }
        boolean result = Solution.getresult(str);
        System.out.print("is (" + str + ") a palindrome:  " + result + "\n");
    }
}
