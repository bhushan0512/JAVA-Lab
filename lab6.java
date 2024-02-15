import java.util.Scanner;

class lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the matrix (m x n):");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix= new int[m][n];
        int[][] transpose= new int[n][m];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
            
        }
        System.out.println("Elements of the original matrix are:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+"\t");
                transpose[j][i] = matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Elements of the transpose matrix are:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
