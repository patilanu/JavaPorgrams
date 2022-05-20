package SortingArray;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] array) {
        for (var i = 0; i < array.length; i++) {
            for (var j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    var temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                   // swap(array,j,j-1);
                }
            }
        }
    }
    private void swap(int[] array, int index1, int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void main(String[] args){
        int[] arr = {2,4,1,9,7,5,0,6};
        var sorted = new BubbleSort();
        sorted.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}