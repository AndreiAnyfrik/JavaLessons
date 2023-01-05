package by.teachmeskills;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Создайте массив целых чисел. Удалите все вхождения заданного
//        числа из массива. Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщение об этом. В результате должен быть новый массив без указанного числа.


public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size for array");
        int length = scanner.nextInt();
        Random random = new Random();
        int[] integers = new int[length];
        for (int i = 0; i < length; i++) {
            integers[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(integers));
        System.out.println("Enter number of removal");
        int numberForRemoval = scanner.nextInt();
        int amountOfRepetitions = 0;
        for (int element : integers) {
            if (element == numberForRemoval) {
                amountOfRepetitions++;
            }
        }
        if (amountOfRepetitions == 0) {
            System.out.println(numberForRemoval + "wasn't found in the array");
        } else {
            int newLength = integers.length - amountOfRepetitions;
            int[] withoutRemovedElement = new int[newLength];
            for (int i = 0, j = 0; i < integers.length; i++) {
                if (integers[i] != numberForRemoval) {
                    withoutRemovedElement[j] = integers[i];
                    j++;
                }
            }
            System.out.println("Initial array" + Arrays.toString(integers));
            System.out.println("Result array" + Arrays.toString(withoutRemovedElement));
        }
    }
}