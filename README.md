# Algorithms

## Dynamic Programming

### Types of  Problems

- 0/1 Knapsack ( max(f(n-1)+v[n], f(n-1) )
  - Subset sum problem ( + -> || , no val array)
    - Equal sum partition (totalSum/2)
    - Count the number of subsets with a given sum ( || -> + )
      - Count the number of subsets with a given difference (sum(s1) = (diff + totalSum)/2)
        - Target sum (diff = s)
    - Minimum subset sum difference (min(totalSum-2*sum(s1)))
- Longest Common Subsequence 1+ lcs(X,Y,m-1,n-1)
  - Print LCS - Collect matching characters by traversing LCS dp[][], and move in direction of max(dp[i-1][j], dp[i][j-1]) when characters dont match 
  - Check if X is a subsequence of Y - X.length() == lcs(X,Y)
  - Shortest Common Supersequence - X.length()+Y.length() - lcs(X,Y)
  - Print SCS - similar to printLCS but collect even when characters dont match; print remaining characters
  - Longest Common Substring - same as LCS, but when char don't match, reset length to 0
  - Longest Palindromic Subsequence - lcs(X, X.reverse())
    - Minimum number of insertions / deletions to convert X to Palindrome: len(X) - lps(X)
  - Minimum number of insertions / deletions to convert X to Y Del : len(X) - lcs(X,Y) Ins: len(Y) - lcs(X,Y)
  - Longest repeating subsequence - similar to lcs but add the count only when i != j
  
  
