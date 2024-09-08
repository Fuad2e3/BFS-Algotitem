import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int node=5,edge=8,node1,node2;
        int a[][]  = new int[node][node];

        System.out.println("Enter nodes in the matrix");

        for (int i = 1; i < edge; i++) {
            node1 = sc.nextInt();
            node2 = sc.nextInt();
            a[node1][node2] = 1;
        }
        for (int i = 1; i < node; i++) {
            for (int j = 1; j < node; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
