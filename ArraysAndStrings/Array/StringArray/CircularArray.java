// John Watson performs an operation called a right circular rotation on an array of integers, . After performing one right circular rotation operation, the array is transformed from  to . 
// Watson performs this operation  times. To test Sherlock's ability to identify the current element at a particular position in the rotated array, Watson asks  queries, where each query consists of a single integer, , for which you must print the element at index  in the rotated array (i.e., the value of ).
// Input Format
// The first line contains  space-separated integers, , , and , respectively. 
// The second line contains  space-separated integers, where each integer  describes array element (where ). 
// Each of the  subsequent lines contains a single integer denoting .


Solution :

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int q=scn.nextInt();
        if(n>=1 && n<=100000 || k>=1 && k<=100000 || q>=1 && q<=500 )
            {       
                int temp=0;
                int nm=1;
                
                int a[]=new int [n];
                int b[] = new int[n]; 
                for(int i=0;i<a.length;i++){
                    a[i]=scn.nextInt();
                }
                
                for(int i=0;i<n;i++){
                    temp = k+i;
                    if(temp>=n){
                        temp = temp%n;
                    }
                   
                    b[temp]=  a[i];
                    
                }
                for(int i=0;i<q;i++){
                    int num=scn.nextInt();
                    if(num <n){
                       System.out.println(b[num]);
                    }
                }

               
        }
    }
    
}