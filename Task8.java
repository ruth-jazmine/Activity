public class Task8 {
    public static int cumulativeSum(int... numbers) {
        int total = 0;

        for (int num : numbers) {
            int cumSum = 0;
            for (int i = 1; i <= num; i++) {
                cumSum += i;
            }
            System.out.println("Cumulative sum of " + num + " = " + cumSum);
            total += cumSum;
        }

        return total;
    }

    public static void main(String[] args) {
        int result = cumulativeSum(4, 5, 10);
        System.out.println("Total cumulative sum: " + result);
    }
}

