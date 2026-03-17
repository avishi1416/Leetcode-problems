import java.util.*;

public class Heightcheck {
    public static int heightChecker(int[] heights) {
        // Step 1: Copy array
        int[] expected = heights.clone();

        // Step 2: Sort copied array
        Arrays.sort(expected);

        // Step 3: Compare
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights)); // Output: 3
    }
}