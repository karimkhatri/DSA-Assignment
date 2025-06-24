public class RecursiveArraySum {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };

    int sum = recursiveSum(arr, 0); // Start recursion from index 0

    System.out.println("Sum of array elements: " + sum);
  }

  public static int recursiveSum(int[] arr, int index) {
    // Base case: If the index is out of bounds, return 0
    if (index >= arr.length) {
      return 0;
    }

    // Recursive step: Add the current element to the sum of the rest of the array
    return arr[index] + recursiveSum(arr, index + 1);
  }
}
