import java.util.ArrayList;
public class Metro {
    
    public static int countPassengers(ArrayList<int[]> stops) {
        int totalPassengers = 0;

        for (int[] stop : stops) {
            totalPassengers += stop[0]; // People getting on
            totalPassengers -= stop[1]; // People getting off
        }

        return totalPassengers;
    }
}


