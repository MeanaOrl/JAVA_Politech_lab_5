public class Lab5_4 {
    public static void main(String[] args) {
        System.out.println("jjjjj:");
        int a[][] = new int[10][10];
        int su = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = (int) (Math.random() * 20 + 10);
                su += a[i][j];
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        } System.out.print(su);
    }
}
