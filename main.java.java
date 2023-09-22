import java.util.Scanner;

public class L11_221rdb389 {
    public static void main(String[] args) {
        int rows = 10;
        int column = 10;
        int[][] a = new int[rows][column];
        Scanner input = new Scanner(System.in);
        System.out.println("Lauma Gailite 2. kurss 221RDB389");
        System.out.println("Izpildīt uzdevuma numuru (1 vai 2): ");
        int uzdevums = input.nextInt();
        if (uzdevums == 1) {
            int n = 1;
            for (int i = 0; i <= 9; i++) {
                for (int j = 9 - i; j >= 7 - i; j--) {
                    if (j >= 0) {
                        a[i][j] = n++;
                    }
                }
            }
        } else if (uzdevums == 2) {
            for (int i = 0; i < 10; i++) {
                int n = 1;
                for (int j = a.length - 1 - i; j < 10; j++) {
                    a[j][i] = n;
                    n++;
                }
            }
        } else {
            System.out.print("Kļūda, nepareizs cipars");
        }
        if (uzdevums == 1 || uzdevums == 2) {
            for (int[] row : a) {
                for (int item : row) {
                    System.out.print(item + "\t");
                }
                System.out.println();
            }
        }
        input.close();
    }
}