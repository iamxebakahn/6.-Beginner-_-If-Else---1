/*Problem Description

Write a program to input an integer from user and print 1 if it is odd otherwise print 0.

Problem Constraints

1 <= N <= 1000000



Input Format

One line containing an integer N.



Output Format

Print either 1 or 0 as per the question.



Example Input

Input 1:

5
Input 2:

1000


Example Output

Output 1:

1
Output 2:

0 */
import java.lang.*;
import java.util.*;

public class Q1_Beginner_If_Else{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N%2==0)
            System.out.print(0);
        else
            System.out.print(1);
    }
}