import java.io.*;
import java.util.*;
import java.lang.*;
class sudoku{
public static void main(String args[]){
int[][]sudokugrid={
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
solvesudoku(sudokugrid);
printsudoku(sudokugrid);
}
public static boolean solvesudoku(int[][]grid){
for(int i=0;i<9;i++)
for(int j=0;j<9;j++)
if(grid[i][j]==0)
for(int n=1;n<=9;n++)
if(isvalid(grid,i,j,n)){
grid[i][j]=n;
if(solvesudoku(grid))
return true;
grid[i][j]=0;
}
return true;
}
private static boolean isvalid(int[][]grid,int row,int col,int n){
for(int x=0;x<9;x++)
if(grid[row][x]==n || grid[x][col]==n || grid[row-row%3+x/3][col-col%3+x%3]==n)
return false;
return true;
}
public static void printsudoku(int[][]grid){
for(int[]row:grid){
for(int num:row)
System.out.println(num+" ");
System.out.println();
}
}
}