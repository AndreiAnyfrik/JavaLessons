package by;

public class Example {
    public static void main(String[] args) {
        int a = 4;
        try {
            System.out.println(a/0);
        } catch (Exception e) {
            System.out.println("На ноль делить нельзя");;
        }
    }
}
