public class BinarySearch {
    
  public static void main(String[] args) {

    // Input array has to be sorted by ascending order.
    int[] input1 = {1, 2, 5, 7, 8};
    int[] input2 = {1, 2, 5};
    int[] input3 = {3};
  

    System.out.println(binarySearch(1, input1, 0));
    System.out.println(binarySearch(3, input1, 0));
    System.out.println(binarySearch(8, input1, 0));
    System.out.println();
    System.out.println(binarySearch(1, input2, 0));
    System.out.println(binarySearch(3, input2, 0));
    System.out.println(binarySearch(5, input2, 0));
    System.out.println();
    System.out.println(binarySearch(1, input3, 0));
    System.out.println(binarySearch(3, input3, 0));
    System.out.println(binarySearch(10, input3, 0));   
  
  }

  public static String binarySearch(int target, int[] arr, int index) {
    
    int[] arr_half;

    if (arr.length == 1) {
      if (arr[0] == target) { 
        return "Found at index: " + index; 
      }
      else { 
        return "Not Found"; 
      }
    } else if (arr.length % 2 == 0) {
      arr_half = new int[arr.length/2];
      if (arr[arr.length/2] <= target) {
        for (int i = 0; i < arr.length/2; i++) {
          arr_half[i] = arr[arr.length/2 + i];
        }
        index += arr.length/2;
      } else {
        for (int i = 0; i < arr.length/2; i++) {
          arr_half[i] = arr[i];
        }
        index += 0;
      }    
      return binarySearch(target, arr_half, index);
    } else {
      arr_half = new int[arr.length/2];
      if (arr[arr.length/2] == target) {
          index += arr.length/2;
          return "Found at index: " + index;
      } else if (arr[arr.length/2 + 1] <= target) {
        for (int i = 0; i < arr.length/2; i++) {
          arr_half[i] = arr[arr.length/2 + 1 + i];
        }
        index += arr.length/2 + 1;
      } else {
        for (int i = 0; i < arr.length/2; i++) {
          arr_half[i] = arr[i];
        }
        index += 0;
      }    
      return binarySearch(target, arr_half, index);  
    }  

  }
  
}
