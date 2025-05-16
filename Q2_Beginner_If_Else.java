/*Problem Description

Write a program to input a number(A) from user and print 1 if it is positive, -1 if it is negative, 0 if it's neither positive nor negative.



Problem Constraints

1 <= A <= 1000000



Input Format

One line containing an integer A.



Output Format

One line each 0/1/-1 as per the question.



Example Input

Input 1:

50
Input 2:

-101
Input 3:

0


Example Output

Output 1:

1
Output 2:

-1
Output 3:

0
 */

import java.lang.*;
import java.util.*;

public class Q2_Beginner_If_Else{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N>0)
            System.out.print(1);
        else if(N<0)
            System.out.print(-1);
        else
            System.out.print(0);
    }
}