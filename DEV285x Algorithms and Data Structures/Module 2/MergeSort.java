public class MergeSort {

    public static void main(String[] args) {

        int[] inputArray1 = {9, 5, -1, 4, 20, -100, 2, 1};
        int[] inputArray2 = {5, 2, 7, -1, 100};
        int[] inputArray3 = {12, 4, 8, 1, -10, 12, 1, 2};

        System.out.println(Arrays.toString(mergeSort(inputArray1))); // Sorting array with even elements
        System.out.println(Arrays.toString(mergeSort(inputArray2))); // Sorting array with odd elements
        System.out.println(Arrays.toString(mergeSort(inputArray3))); // Sorting array with the same amount in elements
    }

    public static int[] mergeSort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }        
        
        int[] arr1;
        int[] arr2;
        
        if (arr.length % 2 == 0) {
            arr1 = new int[arr.length/2];
            arr2 = new int[arr.length/2];
        } else {
            arr1 = new int[arr.length/2];
            arr2 = new int[arr.length/2 + 1];
        }    
        
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length/2) {
                arr1[i] = arr[i];
            } else {
                arr2[i - arr.length/2] = arr[i];
            }
        }

        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);
        
        return mergeArrays(arr1, arr2);
    }
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        while (i < arr1.length || j < arr2.length) {
            if (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    arr3[i + j] = arr1[i];
                    i++;
                } else {
                    arr3[i + j] = arr2[j];
                    j++;
                }
            } else if (i < arr1.length) {
                arr3[i + arr2.length] = arr1[i];
                i++;
            } else if (j < arr2.length) {
                arr3[arr1.length + j] = arr2[j];
                j++;
            }
        }
        return arr3;
    } 
    
}
