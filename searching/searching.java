package com.company.Lect5;

import java.util.Scanner;

public class searching {

    public static void main(String[] args) {

        int a=5;


        Scanner s = new Scanner(System.in);
        int length=s.nextInt();
        int[] ar= new int[length];

        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }

        int element=s.nextInt();

        System.out.println(binary(ar,element));
    }

    private static int linearsearch(int[] ar, int element) {

        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]==element){
                return i;
            }
        }
        return -1;
    }

    public static int binary(int ar[],int element){

        int start=0;
        int end=ar.length-1;

        while(start<=end){

            int mid=(start+end)/2;

            if(ar[mid]==element){
                return mid;
            }

            else if(ar[mid]<element){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
}
