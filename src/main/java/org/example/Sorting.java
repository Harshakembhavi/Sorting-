package org.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
      int arr[]={5,4,3,2,1};
        System.out.println(Arrays.toString(bubble(arr)));
    }
    static int[] bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swapping(arr,j,j-1);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;

    }

    static void swapping(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
    }
}
