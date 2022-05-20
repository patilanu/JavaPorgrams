package SortingArray;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] array){
        for (var i = 1; i < array.length; i++){
            var current = array[i];
            var j = i - 1;
            while(j >= 0 && array[j] > current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    public static void main(String[] args) {
        int[] num = { 1,9,7,4,6,0};
        var sort = new InsertionSort();
        sort.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
