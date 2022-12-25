package by.teachmeskills;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число");
        int x = scanner.nextInt();
        int[] arr = {1, 2, 3};
        int j = 0;
        int numb = 0;
        for(int value : arr) {
            if (value == x) {
                numb++;
            }
        }
        int[] tar = new int[arr.length - numb];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != x) {
                tar[j] = arr[i];
                j++;
            } else {
            }
        }
        System.out.println(Arrays.toString(tar));
        System.out.println("нет данного числа");
    }
}