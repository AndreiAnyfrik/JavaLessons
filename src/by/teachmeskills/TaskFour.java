package by.teachmeskills;
//Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных cтроках. Посчитайте среднее арифметическое элементов каждого массива и
//        сообщите, для какого из массивов это значение оказалось больше (либо
//        сообщите, что их средние арифметические равны).

public class TaskFour {
    public static void main(String[] args) {
        double sumone = 0;
        double sumtwo = 0;
        int[] masOne = new int[5];
        for (int i = 0; i < masOne.length; i++) {
            masOne[i] = (int) (Math.random() * 6);
            System.out.print(masOne[i] + " ");
            sumone += (double) masOne[i] / masOne.length;
        }
        System.out.print(" ");
        int[] mastwo = new int[5];
        for (int i = 0; i < mastwo.length; i++) {
            mastwo[i] = (int) (Math.random() * 6);
            System.out.print(mastwo[i] + " ");
            sumtwo += (double) mastwo[i] / mastwo.length;
        }
        System.out.println(" ");
        if (sumone == sumtwo) {
            System.out.println("Средние арифметические равны");
        } else if (sumone > sumtwo) System.out.println("среднее арифметическое первого массива больше второго");
        else {
            System.out.println("среднее арифметическое второго массива больше первого");
        }
    }
}
