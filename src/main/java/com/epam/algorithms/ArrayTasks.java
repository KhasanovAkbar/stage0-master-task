package com.epam.algorithms;

import java.util.Arrays;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {

        for (int i : arr) {
            if (i == number)
                return i;
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] newArr = new String[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int size = 0;
        for (int i : arr) {
            if (i > 0) size++;
        }

        int[] newArr = new int[size];
        int index = 0;
        for (int i : arr) {
            if (i > 0) {
                newArr[index] = i;
                index++;
            }
        }
        return newArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

        for (int[] ints : arr) {
            quickSort(ints, 0, ints.length - 1);
        }

        int size = 0;
        for (int[] ints : arr) {
            size++;
        }
        int[] newArr = new int[size];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i].length;
        }

        quickSort(newArr, 0, newArr.length - 1);
        return arr;
    }

    private void quickSort(int[] arrs, int low, int high) {

        if (low < high) {
            int pi = partitions(arrs, low, high);

            quickSort(arrs, low, pi - 1);
            quickSort(arrs, pi + 1, high);
        }
    }

    private int partitions(int[] arrs, int low, int high) {
        int pivot = arrs[high];

        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arrs[j] < pivot) {
                i++;
                swap(arrs, i, j);
            }
        }
        swap(arrs, i + 1, high);
        return (i + 1);
    }

    private void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        ArrayTasks arrayTasks = new ArrayTasks();

        //season array
        String[] strings = arrayTasks.seasonsArray();
        System.out.println(Arrays.toString(strings));

        //generateNumbers
        int[] ints = arrayTasks.generateNumbers(1);
        System.out.println(Arrays.toString(ints));

        //totalSum
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(arrayTasks.totalSum(a));

        //findIndexOfNumber
        System.out.println(arrayTasks.findIndexOfNumber(a, 1));

        //reverseArray
        String[] temp = {"Nick", "Bob"};
        System.out.println(Arrays.toString(arrayTasks.reverseArray(temp)));

        //getOnlyPositiveNumbers
        int[] a1 = {1, 2, 3};
        System.out.println(Arrays.toString(arrayTasks.getOnlyPositiveNumbers(a1)));

        //sortRaggedArray
        int[][] matrix = {
                {3, 1, 2, 1},
                {0, 5, 1},
                {7}
        };
        int[][] ints1 = arrayTasks.sortRaggedArray(matrix);
        for (int i = 0; i < ints1.length; i++) {
            System.out.println(Arrays.toString(ints1[i]));
        }
    }

}
