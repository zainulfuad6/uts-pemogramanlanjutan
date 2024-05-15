
public class kata {
    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            
            // Calculate sum of elements before current index i
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            
            // Calculate sum of elements after current index i
            for (int k = i + 1; k < arr.length; k++) {
                rightSum += arr[k];
            }
            
            // Check if leftSum equals rightSum
            if (leftSum == rightSum) {
                return i; // Found the index
            }
        }
        
        // If no such index found
        return -1;
    }
}

