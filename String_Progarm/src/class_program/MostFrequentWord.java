package class_program;
public class MostFrequentWord {
    public static void main(String[] args) {

        String[] words = {"java", "sql", "java", "spring", "sql", "java"};

        int maxCount = 0;
        String result = "";

        for (int i = 0; i < words.length; i++) {

            int count = 0;

            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                result = words[i];
            }
        }

        System.out.println("Most Frequent Word: " + result);
    }
}