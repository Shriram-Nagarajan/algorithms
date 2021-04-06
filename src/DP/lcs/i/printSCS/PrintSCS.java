package DP.lcs.i.printSCS;

import java.util.Stack;

import DP.lcs.a.lcs.LCSBottomUp;

/**
 * Printing Shortest Common Subsequence
 * 
 * @author Shriram N
 *
 */
public class PrintSCS {

	public String printSCS(String X,String Y, int m,int n) {
		
		int dp[][] = new LCSBottomUp().lcsDP(X, Y, m, n);
		Stack<Character> scsStack = new Stack<Character>();
		
		int i = m;
		int j = n;
		
		while(i > 0 && j > 0) {
			
			if(X.charAt(i-1) == Y.charAt(j-1)) {
				scsStack.push(X.charAt(i-1));
				i--;
				j--;
			}	else if(dp[i][j-1] > dp[i-1][j]) {
				scsStack.push(Y.charAt(j-1));
				j--;
			}	else {
				scsStack.push(X.charAt(i-1));
				i--;
			}
			
		}
		
		while(i > 0) {
			scsStack.push(X.charAt(i-1));
			i--;
		}
		
		while(j > 0) {
			scsStack.push(Y.charAt(j-1));
			j--;
		}
		
		StringBuilder sb = new StringBuilder();
		while(scsStack != null && !scsStack.isEmpty()) {
			sb.append(scsStack.pop());
		}
		
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		String X = "abcdaf", Y = "acbcf";
		System.out.println(new PrintSCS().printSCS(X,Y,X.length(), Y.length()));
	}
	
}
