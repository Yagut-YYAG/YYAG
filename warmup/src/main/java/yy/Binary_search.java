package yy;

import java.util.ArrayList;
import java.util.Random;

public class Binary_search {


    public static boolean Binary_search(int[]a,int left,int right, int data){
        int middle;
        while(left < right) {
            middle=(right+left)/2;
            if(a[middle]==data) return true;
            if(data>a[middle])left=middle+1;
            else if(data<a[middle])right=middle-1;
        }
        return false;
    }
    public static void sort(int[] a, int length) {
    for(int i=0;i<length;i++) {
    for(int j=i;j<length;j++){
        if(a[i]>a[j]){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }

    }
    }
    public static void main(String[] args) {
        int[] A=new int [9];
        Random r= new Random();
        for(int i=0;i<9;i++) {
            A[i]=r.nextInt(10);
        }
        for(int i=0; i<9; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        sort(A,9);
        for(int i=0; i<9; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println(Binary_search(A,0, 9,4));
        }
    }

