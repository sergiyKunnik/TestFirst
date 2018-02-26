package java;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt();
            array[i] = number;
        }
    }
}