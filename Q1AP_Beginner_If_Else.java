/*Problem Description

Take an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.


Problem Constraints

1 <= A <= 109



Input Format

The input contains a single integer A.



Output Format

Print 1 if A is divisible by both 5 and 11, else print 0.



Example Input

Input 1:

 55 
Input 2:

 22 


Example Output

Output 1:

 1 
Output 2:

 0  */
import java.lang.*;
import java.util.*;

public class Q1AP_Beginner_If_Else{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        if((A%11==0)&&(A%5==0))
            System.out.print(1);
        else
            System.out.print(0);
    }
}