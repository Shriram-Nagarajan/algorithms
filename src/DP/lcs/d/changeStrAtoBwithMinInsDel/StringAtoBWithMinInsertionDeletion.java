package DP.lcs.d.changeStrAtoBwithMinInsDel;

import DP.lcs.a.lcs.LCSBottomUp;

public class StringAtoBWithMinInsertionDeletion
{
    LCSBottomUp lcs;
    void printMinimumNumberOfInsertionDeletion(String a,String b){
        /*
            Given string a = "heap"
            Given string b = "pea"
            
            What is the minimum insertion, deletion to convert a->b
            
            "heap" -> Delete (h,p) -> "ea" [2 Deletions]
            "ea" -> Insert (p) -> "pea" [1 Insertion]
            
            The conversion here is "heap" -> "ea" -> "pea"
            here "ea" is LCS
            
            a -> (deletions) -> LCS -> (insertions) -> b
            
            Deletions  = length(a) - LCS
            Insertions = length(b) - LCS
         */
        int lenA = a.length();
        int lenB = b.length();
        lcs = new LCSBottomUp();
        int lcsOfAB = lcs.lcs(a,b,lenA,lenB);
        
        int deletions  = lenA-lcsOfAB;
        int insertions = lenB-lcsOfAB;
        
        System.out.println("Insertions : "+insertions+", Deletions : "+deletions);
    }
    
    public static void main(String args[]) {
    	new StringAtoBWithMinInsertionDeletion().printMinimumNumberOfInsertionDeletion("heap","pea");
    }
    
}
