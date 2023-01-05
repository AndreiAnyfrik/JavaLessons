package by.onliner;

import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    //    Создать трехмерный массив из целых чисел.С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число. Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число");
        int numb = scanner.nextInt();
        int[][][] array = new int[2][2][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int f = 0; f < array.length; f++) {
                    array[i][j][f] = random.nextInt(2);
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int f = 0; f < 3; f++) {
                    array[i][j][f] = array[i][j][f] + numb;
                    System.out.println(array[i][j][f]);
                }
            }
        }
    }
}
