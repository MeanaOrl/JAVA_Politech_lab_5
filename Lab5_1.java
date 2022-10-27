import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args) {
        System.out.println(":");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 20 + 10);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
