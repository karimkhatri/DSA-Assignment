import java.util.Stack;

public class ReverseArrayWithStack {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: ");
        printArray(arr);

        reverseArray(arr);

        System.out.println("\nReversed Array: ");
        printArray(arr);
    }

    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements of the array onto the stack
        for (int num : arr) {
            stack.push(num);
        }

        // Pop elements from the stack and put them back into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
