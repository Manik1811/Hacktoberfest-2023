import java.util.Scanner;

public class DiagonalSum {
    public static int diagonalSum(int mat[][]){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            //PRIMARY DIAGONAL(PD)
          sum+=mat[i][i];
          //SECONDARY DIAGONAL
          if(i!=mat.length-1-i)
          sum+=mat[i][mat.length-i-1];
        }

        return sum;
    }
        
    public static void main(String args []) { 
        int mat[][]=new int[4][4];
        int n=mat.length,m=mat[0].length;
        System.out.println("Enter the array elements: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nThe diagonal sum of the mayrix is: "+diagonalSum(mat)+"\n");
    }
}


