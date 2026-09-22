package BaseEx6Operation;

import java.util.Scanner;

public class triangle {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrer un nombre");
        String nombre = scanner.nextLine();
        while(true) {
	        if (isInteger(nombre)) {
	        	int nb = Integer.parseInt(nombre);
	        	triangle(nb);
	        	break;
	        }else {
	        	System.out.println("Saisie invalide");
	        	continue;
	        }
        }
	}
	public static void triangle (int n) {
		String space = " ";
		String star = "*";
		for (int i = 1; i<n; i+=2) {
			String pos = repeat(space , (n-i)/2);
			String word = repeat(star, i);
			System.out.println(pos + word);
		}
	}
	public static String repeat(String texte, int nombre) {
	    String resultat = "";

	    for (int i = 0; i < nombre; i++) {
	        resultat += texte;
	    }

	    return resultat;
	}
	private static boolean isInteger(String nombre) {
		try {
            Integer.parseInt(nombre);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
	}

}
