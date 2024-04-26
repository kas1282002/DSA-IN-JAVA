import java.util.*;

public class kadanes {

  public static int kadane(int numbers[]) {
    int currsum = 0;
    int maxsum = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      currsum = currsum + numbers[i];
      maxsum = Math.max(currsum, maxsum);

      if (currsum < 0) {
        currsum = 0;
      }
    }

    return maxsum;
  }

  public static void main(String[] args) {
    int numbers[] = { 1, 2, 4, 6 };
    System.out.print(kadane(numbers));
  }
}
