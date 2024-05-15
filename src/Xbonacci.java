import java.util.Arrays;
public class Xbonacci {
     public double[] tribonacci(double[] s, int n) {
        double[] result = new double[n];
        if (n == 0) {
            return result;
        }
        
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                result[i] = s[i];
            } else {
                result[i] = result[i - 1] + result[i - 2] + result[i - 3];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Xbonacci xbonacci = new Xbonacci();
        
        // Example usage
        double[] signature1 = {1, 1, 1};
        double[] result1 = xbonacci.tribonacci(signature1, 8);
        System.out.println("Tribonacci sequence with signature [1, 1, 1]: " + Arrays.toString(result1));
        
        double[] signature2 = {0, 0, 1};
        double[] result2 = xbonacci.tribonacci(signature2, 10);
        System.out.println("Tribonacci sequence with signature [0, 0, 1]: " + Arrays.toString(result2));
    }
}


