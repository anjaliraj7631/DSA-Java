package Array;

import java.util.Arrays;

public class SwapArr {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
