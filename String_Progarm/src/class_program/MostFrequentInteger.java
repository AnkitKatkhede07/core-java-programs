package class_program;

public class MostFrequentInteger {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 10, 20, 10};

        int maxCount = 0;
        int mostFrequent = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }

        System.out.println("Most Frequent Integer: " + mostFrequent);
    }
}