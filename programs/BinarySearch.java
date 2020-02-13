package com.spm.androidtesting.di;

public class BinarySearch {

    int binarySearch(int []arr,int l, int r, int x){

        if(r >= l){
            int mid = (l+(r-1))/2;
            if(arr[mid] == x){
                return mid;
            }
            else{
                if(arr[mid] > x){
                    return binarySearch(arr,l,mid-1,x);
                }
                else{
                    return binarySearch(arr,mid+1,r,x);
                }
            }
        }
        else{
            return -1;
        }
    }
    public static void main(String...args){

        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {2,3,4,5,6,10,30,40};
        int position = binarySearch.binarySearch(arr,0,arr.length-1,10);
        System.out.println(position);

    }
}
