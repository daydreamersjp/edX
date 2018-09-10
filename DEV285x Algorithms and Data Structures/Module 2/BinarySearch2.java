public class BinarySearch2 {
    
  public static void main(String[] args) {

    // Input array has to be sorted by ascending order.
    int[] input1 = {1, 2, 5, 7, 8};
    int[] input2 = {1, 2, 5};
    int[] input3 = {3};
  

    System.out.println(binarySearch(1, input1, 0, input1.length - 1));
    System.out.println(binarySearch(3, input1, 0, input1.length - 1));
    System.out.println(binarySearch(8, input1, 0, input1.length - 1));
    System.out.println();
    System.out.println(binarySearch(1, input2, 0, input2.length - 1));
    System.out.println(binarySearch(3, input2, 0, input2.length - 1));
    System.out.println(binarySearch(5, input2, 0, input2.length - 1));
    System.out.println();
    System.out.println(binarySearch(1, input3, 0, input3.length - 1));
    System.out.println(binarySearch(3, input3, 0, input3.length - 1));
    System.out.println(binarySearch(10, input3, 0, input3.length - 1));   
  
  }

  static boolean binarySearch(int v, int[] lst, int low, int high) {
      
    if (low > high) {
        System.out.println("not found");
        return false;
    }
    
    int middle = (low+high)/2;
    
    if (v == lst[middle]) {
        System.out.println("found! It is at " + middle);
        return true;
    }
    else if (v > lst[middle]) {
        return binarySearch(v, lst, middle+1, high);
    }
    else {
        return binarySearch(v, lst, low, middle-1);
    } 

  }

}
