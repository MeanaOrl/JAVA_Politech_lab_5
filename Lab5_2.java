public class Lab5_2 {
    public static void main(String[] args) {
        System.out.println(":");
        int[] a = new int[30];
        int mi = 101;
        int ma = 0;
        for (int i = 0; i < 30; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
            if (a[i] < mi) {
                mi = a[i];
            }
            if (a[i] > ma) {
                ma = a[i];
            }
        }
        for (int i = 0; i < 30; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        System.out.print(mi + " " + ma);
    }
}
