package by.teachmeskills;

public class TaskFour {
    public static void main(String[] args) {
       double sumone = 0;
       double sumtwo = 0;
       int[] masone =new int[5];
       for(int i=0;i< masone.length; i++){
           masone[i]=(int)(Math.random()*6);
           System.out.print(masone[i]+" ");
           sumone +=(double)masone[i]/ masone.length;
       }
        System.out.print(" ");
        int[] mastwo =new int[5];
        for(int i=0;i< mastwo.length; i++) {
            mastwo[i] = (int) (Math.random() * 6);
            System.out.print(mastwo[i] + " ");
            sumtwo += (double) mastwo[i] / mastwo.length;
        }
        System.out.print(" ");
        if(sumone == sumtwo) {
            System.out.println("Средние арифметические равны");
        }else if (sumone > sumtwo)
            System.out.println("среднее арифметическое первого массива больше второго");
        else {System.out.println("среднее арифметическое второго массива больше первого");
        }
    }
}
