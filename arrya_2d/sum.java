import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows for A matrix ");
        int m =sc.nextInt();
        System.out.println("enter number of column  for A matrix ");
        int n =sc.nextInt();
        int[][] matrixA =new int[m][n];
        System.out.println("enter number of rows for B matrix ");
        int p=sc.nextInt();
        System.out.println("enter number of column  for B matrix ");
        int q =sc.nextInt();
        int[][] matrixB =new int[p][q];
        for (int i = 0; i< matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixA[i][j] = matrixA[i][j] +matrixB[i][j];
            }
        }
        System.out.println(matrixA);
    }
    

}
