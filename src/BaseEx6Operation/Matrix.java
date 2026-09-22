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
		 	try {
			    for (int y = 0; y < fourthMatrix.length; y++) {
			    	try {
				        for (int x = 0; x < fourthMatrix[y].length; x++) {
				            resultat[y][x] =
				            		fourthMatrix[y][x] * i;
				        }
			    	}catch (ArrayIndexOutOfBoundsException e) {
			    		System.err.println("Indice x invalide " + e.getMessage());
			    	}
		    	}
		 	}catch(ArrayIndexOutOfBoundsException exception) {
		 		System.err.println("Indice y invalid : " + exception.getMessage());
		 	}
		    System.out.println("----------------");
		    printMatrix(resultat);
		
		
	}
	
	private static void printMatrix (int[][]Matrix) {
		try {
			for (int y = 0; y < Matrix.length; y++) {
				try {
			        for (int x = 0; x < Matrix[y].length; x++) {
			        	System.out.print(Matrix[y][x] + " ");
			        }
			    }catch (ArrayIndexOutOfBoundsException e) {
			    	System.err.println("Indice x invalide " + e.getMessage());
			    }
		        System.out.print("\n");
				}
			}catch (ArrayIndexOutOfBoundsException exception) {
				System.err.println("Indice y invalid : " + exception.getMessage());
			}
	}

	private static void addMatrix(int[][] firstMatrix, int[][] secondMatrix) {

	    if (firstMatrix.length == secondMatrix.length
	            && firstMatrix[0].length == secondMatrix[0].length) {

	        int[][] resultat =
	                new int[firstMatrix.length][firstMatrix[0].length];

	        printMatrix(firstMatrix);
	        System.out.println("+");
	        printMatrix(secondMatrix);

	        try {
	            for (int y = 0; y < firstMatrix.length; y++) {

	                try {
	                    for (int x = 0; x < firstMatrix[y].length; x++) {

	                        resultat[y][x] =
	                                firstMatrix[y][x] + secondMatrix[y][x];
	                    }

	                } catch (ArrayIndexOutOfBoundsException exception) {
	                    System.err.println(
	                            "Indice x invalide : "
	                                    + exception.getMessage()
	                    );
	                }
	            }

	        } catch (ArrayIndexOutOfBoundsException exception) {
	            System.err.println(
	                    "Indice y invalide : "
	                            + exception.getMessage()
	            );
	        }

	        System.out.println("----------------");
	        printMatrix(resultat);

	    } else {
	        System.err.println(
	                "Les matrices n'ont pas la même taille."
	        );
	    }
	}
	
	private static void subMatrix(int[][] firstMatrix, int[][] thirdMatrix) {

	    if (firstMatrix.length == thirdMatrix.length
	            && firstMatrix[0].length == thirdMatrix[0].length) {

	        int[][] resultat =
	                new int[firstMatrix.length][firstMatrix[0].length];

	        printMatrix(firstMatrix);
	        System.out.println("-");
	        printMatrix(thirdMatrix);

	        try {
	            for (int y = 0; y < firstMatrix.length; y++) {

	                try {
	                    for (int x = 0; x < firstMatrix[y].length; x++) {

	                        resultat[y][x] =
	                                firstMatrix[y][x] - thirdMatrix[y][x];
	                    }

	                } catch (ArrayIndexOutOfBoundsException exception) {
	                    System.err.println(
	                            "Indice x invalide : "
	                                    + exception.getMessage()
	                    );
	                }
	            }

	        } catch (ArrayIndexOutOfBoundsException exception) {
	            System.err.println(
	                    "Indice y invalide : "
	                            + exception.getMessage()
	            );
	        }

	        System.out.println("----------------");
	        printMatrix(resultat);

	    } else {
	        System.err.println(
	                "Les matrices n'ont pas la même taille."
	        );
	    }
	}
}
