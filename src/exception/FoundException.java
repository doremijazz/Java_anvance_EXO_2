package exception;

import java.util.Date;

/**
 * @author El babili - 2021
 */
public class FoundException {

    public static void main(String[] args) {
        Date date = null;
        Date today = new Date();

        try {
            System.out.println(date.getClass().getName());
        } catch (NullPointerException exception) {
            System.err.println(
                "Erreur : impossible d'appeler getClass() car date vaut null."
            );
        }

        try {
            System.out.println(today.getClass().getName());
        } catch (NullPointerException exception) {
            System.err.println(
                "Erreur : impossible d'appeler getClass() car today vaut null."
            );
        }
    }
}