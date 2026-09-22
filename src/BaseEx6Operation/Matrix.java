package BaseEx6Operation;

public class Matrix {
	public static void main(String[] args) {

        int[][] firstMatrix = {
            {5, 2, 4},
            {0, 1, 1},
            {6, 3, 1}
        };

        int[][] secondMatrix = {
            {1, 1, 3},
            {2, 5, 6},
            {3, 0, 5}
        };

        int[][] thirdMatrix = {
            {8, 7},
            {5, 4},
            {2, 1}
        };

        int[][] fourthMatrix = {
            {0, 2},
            {1, 2},
            {1, 1}
        };

        addMatrix(firstMatrix, secondMatrix);
        System.out.println("----------------");

        addMatrix(firstMatrix, thirdMatrix);
        System.out.println("----------------");

        subMatrix(thirdMatrix, fourthMatrix);
        System.out.println("----------------");

        mulScalMatrix(fourthMatrix, 2);
    }

	private static void mulScalMatrix(int[][] fourthMatrix, int i) {
		 int[][] resultat = new int[fourthMatrix.length][fourthMatrix[0].length];
		 printMatrix(fourthMatrix);
		 	System.out.println("*");
		 	System.out.println(i);
		    for (int y = 0; y < fourthMatrix.length; y++) {
		        for (int x = 0; x < fourthMatrix[y].length; x++) {
		            resultat[y][x] =
		            		fourthMatrix[y][x] * i;
		        }
		    }
		    System.out.println("----------------");
		    printMatrix(resultat);
		
		
	}
	
	private static void printMatrix (int[][]Matrix) {
		for (int y = 0; y < Matrix.length; y++) {
	        for (int x = 0; x < Matrix[y].length; x++) {
	        	System.out.print(Matrix[y][x] + " ");
	        }
	        System.out.print("\n");
	}
	}

	private static void addMatrix(int[][] firstMatrix, int[][] secondMatrix) {
		if (firstMatrix.length == secondMatrix.length && firstMatrix[0].length == secondMatrix[0].length) {
			 int[][] resultat = new int[firstMatrix.length][firstMatrix[0].length];
			 	printMatrix(firstMatrix);
			 	System.out.println("+");
			 	printMatrix(secondMatrix);
			    for (int y = 0; y < firstMatrix.length; y++) {
			        for (int x = 0; x < firstMatrix[y].length; x++) {
			            resultat[y][x] =
			                firstMatrix[y][x] + secondMatrix[y][x];
			        }
			    }
			    System.out.println("----------------");
			    printMatrix(resultat);
			    
		}else {
			System.out.println("Les Matrices non pas la meme taille");
		}
	}
	
	private static void subMatrix(int[][] firstMatrix, int[][] thirdMatrix) {
		if (firstMatrix.length == thirdMatrix.length && firstMatrix[0].length == thirdMatrix[0].length) {
			 int[][] resultat = new int[firstMatrix.length][firstMatrix[0].length];
			 printMatrix(firstMatrix);
			 	System.out.println("-");
			 	printMatrix(thirdMatrix);
			    for (int y = 0; y < firstMatrix.length; y++) {
			        for (int x = 0; x < firstMatrix[y].length; x++) {
			            resultat[y][x] =
			                firstMatrix[y][x] - thirdMatrix[y][x];
			        }
			    }
			    System.out.println("----------------");
			    printMatrix(resultat);
		}else {
			System.out.println("Les Matrices non pas la meme taille");
		}
			

}
}
