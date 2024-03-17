package Recursion;

public class PrintNto1
{
    void print(int n){
        if(n==0) return; // Base condition
        print(n-1); //Hypothesis
        System.out.println(n); //Induction
    } 
    
    public static void main(String[] args)
    {
        new PrintNto1().print(5);
    }
}
