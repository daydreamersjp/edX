public class BinarySearch {
  
  public static void main(String[] args) {
    
    int[] input1 = {1, 2, 5, 7, 8};
    int[] input2 = {1, 2, 5};
    int[] input3 = {3};
  
    System.out.println(1, input1);
    System.out.println(3, input1);
    System.out.println(10, input1);
    System.out.println(1, input2);
    System.out.println(3, input2);
    System.out.println(10, input2);    
    System.out.println(1, input3);
    System.out.println(3, input3);
    System.out.println(10, input3);    
  
  }

  public static boolean binarySearch(target, int[] arr) {
    
    int[] arr_half;
    
    if (arr.length == 1) {
      if (arr[0] == target) { 
        return true; 
      }
      else { 
        return false; 
      }
    } else if (arr.length % 2 == 0) {
      arr_half = new int[arr.length/2];
      if (arr[arr.length/2] > target) {
        for (int i = 0; i < arr.length - arr.length/2; i++;) {
          arr_half[i] = arr[arr.length - arr.length/2 + i];
        }
      } else {
        for (int i = 0; i < arr.length/2; i++;) {
          arr_half[i] = arr[i];
        }
      }    
      return binarySearch(target, arr_half);
    } else {
      arr_half = new int[arr.length - arr.length/2 - 1];
      if (arr[arr.length/2] == target) {
        return true;
      } else if (arr[arr.length/2 + 1] > target) {
        for (int i = 0; i < arr.length/2; i++;) {
          arr_half[i] = arr[arr.length/2 + 1 + i];
        }
      } else {
        for (int i = 0; i < arr.length/2; i++;) {
          arr_half[i] = arr[i];
        }
      }    
      return binarySearch(target, arr_half);  
    }  
  }

}
