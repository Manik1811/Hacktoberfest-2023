//N Queen problem using java #1959

class NQueen_Problem{
    public static boolean isSafe(char chessBoard[][],int row,int col){
          //vertical up
          for(int i=row-1;i>=0;i--){
            if(chessBoard[i][col]=='Q'){
                return false;
            }
          }
          //left diag up
          for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        //right diag up
        for(int i=row-1,j=col+1;i>=0 && j<chessBoard.length;i--,j++){
          if(chessBoard[i][j]=='Q'){
              return false;
    }
}
      return true;
}
    public static void nQueen(char chessBoard[][], int row){
        //Base case
        if(row==chessBoard.length){
            printBoard(chessBoard);
            return;
        }  
        //cloumn loop
          for(int j=0;j<chessBoard.length;j++){
            if (isSafe(chessBoard,row,j)){
            chessBoard[row][j]='Q';
            nQueen(chessBoard, row+1);  //function call
            chessBoard[row][j]='x';  //backtrack
            }
          }
    }
    public static void printBoard(char chessBoard[][]){
        System.out.println("----Chess-Board----");
        for(int i=0;i<chessBoard.length;i++){
        for(int j=0;j<chessBoard.length;j++){
            System.out.print(chessBoard[i][j]+" ");
        }
        System.out.println();
    }
}
   
