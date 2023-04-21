// 1. Реализовать алгоритм сортировки слиянием и выборкой.Самое эффективное , 
// это изучить эти сортировки на Питоне , и постараться написать их на java.

//Алгоритм сортировки слиянием
package Seminar_3;
import java.util.*;
public class Task_1 {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(list));
        mergeSort(list);
        System.out.println(Arrays.toString(list));
    }   
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
             return;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        System.arraycopy(arr,0, left, 0, left.length);
        System.arraycopy(arr,mid, right, 0, right.length);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }
    private static void merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }   
    }
}
