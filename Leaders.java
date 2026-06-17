public class Leaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2}; // Example array
        int n = arr.length;

        // The last element is always a leader
        int maxFromRight = arr[n - 1];
        System.out.print(maxFromRight + " ");

        // Traverse from the second last element to the first
        for (int i = n - 2; i >= 0; i--) {
            // If current element is greater than the max from right
            if (arr[i] > maxFromRight) {
                System.out.print(arr[i] + " ");
                maxFromRight = arr[i]; // Update the max seen so far
            }
        }
    }
}