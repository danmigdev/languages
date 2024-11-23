import java.util.concurrent.ThreadLocalRandom;

class Code {

    public static void main(String[] args) {
        int u = Integer.parseInt(args[0]);                  // Get an input number from the command line
        int r = ThreadLocalRandom.current().nextInt(10000); // Get a random integer 0 <= r < 10k
        int[] a = new int[10000];                           // Array of 10k elements initialized to 0
        for (int i = 0; i < 10000; i++) {                   // 10k outer loop iterations
          for (int j = 0; j < 100000; j++) {                // 100k inner loop iterations, per outer loop iteration
            a[i] = a[i] + j%u;                              // Simple sum
          }
          a[i] += r;                                        // Add a random value to each element in array
        }
        System.out.printf("%d\n", a[r]);                    // Print out a single element from the array
    }

}