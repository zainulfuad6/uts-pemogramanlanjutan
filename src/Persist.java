
public class Persist {
    public static int persistence(long n) {
        // Base case: jika n hanya satu digit, maka persistence adalah 0
        if (n < 10) {
            return 0;
        }
        
        // Hitung hasil perkalian digit-digit dari n
        long multiplication = 1;
        while (n > 0) {
            multiplication *= n % 10;
            n /= 10;
        }
        
        // Rekursif: hitung persistence dari hasil perkalian
        return 1 + persistence(multiplication);
    }
}
