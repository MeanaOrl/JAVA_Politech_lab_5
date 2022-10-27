public class Lan5_5 {
    public static void main(String[] args) {
        System.out.println("jjjjj:");
        int a[][] = new int[10][10];
        int mis = 1000;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = (int) (Math.random() * 20 + 10);
                if (mis > a[i][j]){
                    mis = a[i][j];
                }
            }
            System.out.print(mis);
            mis = 1000;
            System.out.print("\n");
        }
    }
}
