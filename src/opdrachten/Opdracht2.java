package opdrachten;

import java.util.Arrays;

public class Opdracht2 {

    public static void main(String[] args) {

        int[] array1 = {5, 20, 40, 15, 1, 30, 100, 6, 300, 23, 48};

        int[] array2 = Arrays.copyOfRange(array1, 0, 10);
        Arrays.sort(array2);
        for (int n : array2) {
            System.out.print(n + " ");
        }

        System.out.printf("%n");

        int[] array3 = Arrays.copyOfRange(array1, 3, 9);
        for (int m : array3) {
            System.out.print(m + " ");
        }
    }
}
