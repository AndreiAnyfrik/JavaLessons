package by.teachmeskills;

import java.util.Random;
import java.util.Scanner;
//Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).


public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число");
        int b = scanner.nextInt();
        int[] a = new int[5];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }

        int bIndex = -1;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == b) {
                bIndex = j;
            }
        }

        if (bIndex == -1) {
            System.out.println("Нету");
        } else {
            System.out.println("Есть " + bIndex);
        }
    }
}