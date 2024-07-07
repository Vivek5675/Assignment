/*Write a java program to make addition, Subtraction and multiplication of two
matrix using 2-D Array
*/

package module2;

public class Array4_2DArray 
{	
	public static void main(String[] args)
	{
	        int[][] matrixA = 
	        {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        
	        int[][] matrixB =
	        {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };
	        
	        int[][] sum = addMatrices(matrixA, matrixB);
	        int[][] difference = subtractMatrices(matrixA, matrixB);
	        int[][] product = multiplyMatrices(matrixA, matrixB);
	        
	        System.out.println("Addition of matrices:");
	        printMatrix(sum);
	        
	        System.out.println("Subtraction of matrices:");
	        printMatrix(difference);
	        
	        System.out.println("Multiplication of matrices:");
	        printMatrix(product);
	}

	    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB)
	    {
	        int rows = matrixA.length;
	        int cols = matrixA[0].length;
	        int[][] result = new int[rows][cols];
	        
	        for (int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < cols; j++) 
	            {
	                result[i][j] = matrixA[i][j] + matrixB[i][j];
	            }
	        }
	        
	        return result;
	    }

	    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) 
	    {
	        int rows = matrixA.length;
	        int cols = matrixA[0].length;
	        int[][] result = new int[rows][cols];
	        
	        for (int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < cols; j++)
	            {
	                result[i][j] = matrixA[i][j] - matrixB[i][j];
	            }
	        }
	        
	        return result;
	    }

	    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) 
	    {
	        int rowsA = matrixA.length;
	        int colsA = matrixA[0].length;
	        int colsB = matrixB[0].length;
	        int[][] result = new int[rowsA][colsB];
	        
	        for (int i = 0; i < rowsA; i++) 
	        {
	            for (int j = 0; j < colsB; j++)
	            {
	                for (int k = 0; k < colsA; k++)
	                {
	                    result[i][j] += matrixA[i][k] * matrixB[k][j];
	                }
	            }
	        }
	        
	        return result;
	    }

	    public static void printMatrix(int[][] matrix)
	    {
	        for (int[] row : matrix)
	        {
	            for (int element : row)
	            {
	                System.out.print(element + "  ");
	            }
	            System.out.println();
	        }
	    }
	}
