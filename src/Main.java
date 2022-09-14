import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            int[] numArray = {500, 400, 550, 600, 100};
            String[] wordArray = { "Test", "Is", "Awesome", "Dude", "Feel it", "Plus" };

            System.out.println("Unsorted Number Array: "+ Arrays.toString(numArray));

            Arrays.sort(numArray);
            System.out.println("Sorted Number Array: "+ Arrays.toString(numArray) + "\n");

            System.out.println("Unsorted String Array: "+ Arrays.toString(wordArray));

            Arrays.sort(wordArray);
            System.out.println("Sorted String Array: "+ Arrays.toString(wordArray));

        }
    }
