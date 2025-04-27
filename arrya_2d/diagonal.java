import java.util.Scanner;

public class diagonal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter The Number of Rows");
    int a = input.nextInt();
    System.out.println("Enter The Number of Columns");
    int b = input.nextInt();
    int[][] arr = new int[a][b];
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        arr[i][j] = input.nextInt();
      }
    }

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        if (i == j) {
          if (arr[i][j] == 1)
            System.out.println(true);
          else {
            System.out.println(false);
          }
        }
      }
    }
  }
}