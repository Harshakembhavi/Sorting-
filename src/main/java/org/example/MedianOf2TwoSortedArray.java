package org.example;

import java.util.Arrays;

public class MedianOf2TwoSortedArray {
    public static void main(String[] args) {
        int a[]={2,6,3,5,8,4};
        int []b={10,94,9,35,65,23};
        int []c=new int[a.length+ b.length];
        int start=0;
        int end=c.length-1;
       // while(start<=end){
       //     int mid=start+(end-start)/2;
       //     if()
       /* System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        Arrays.sort(c);
        for(int c1:c){
            System.out.print(c1+" ");
        }
        System.out.println("");
       double median=0;
        if(c.length%2==0){
             median = (c[c.length / 2] + c[(c.length / 2) - 1]) / 2.0;
        }else{
            median=c[c.length/2];
        }
        System.out.println(median);*/
    }
}