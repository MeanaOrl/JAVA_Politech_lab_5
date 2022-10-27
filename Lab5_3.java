public class Lab5_3 {
    public static void main(String[] args) {
        System.out.println(":");
        int[] a = new int[10];
        int mi = 101;
        int ma = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 1002 + -501);
            if (a[i] < mi) {
                mi = a[i];
            }
            if (a[i] > ma) {
                ma = a[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < 10; i++) {
            System.out.print(Math.abs(a[i]) + " ");
        }
    }
}
