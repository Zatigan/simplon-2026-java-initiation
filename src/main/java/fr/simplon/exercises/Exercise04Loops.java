package fr.simplon.exercises;

/**
 * Exercice 4: Boucles
 * 
 * Objectif: Apprendre à utiliser les boucles for et while
 */
public class Exercise04Loops {

    /**
     * Calcule la somme des nombres de 1 à n
     * 
     * @param n le nombre maximum
     * @return la somme de 1 + 2 + ... + n
     */
    public int sumUpToN(int n) {

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        return sum;

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Inverse un nombre (ex: 123 -> 321)
     * 
     * @param number le nombre à inverser
     * @return le nombre inversé
     */
    public int reverseNumber(int number) {

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Calcule la factorielle d'un nombre (n!)
     * 
     * @param n le nombre
     * @return n! (n factorielle)
     */
    public int factorial(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Compte le nombre de chiffres dans un nombre
     * 
     * @param number le nombre
     * @return le nombre de chiffres
     */
    public int countDigits(int number) {

        int result = 0;

        do {
            number /= 10;
            result++;
        } while (number != 0);

        return result;

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Vérifie si un nombre est premier
     * 
     * @param number le nombre à vérifier
     * @return true si le nombre est premier, false sinon
     */
    public boolean isPrime(int number) {
        boolean answer = true;

        if (number <= 1) {
            answer = false;
            return answer;
        };

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                answer = false;
                break;
            }
        };

        return answer;
    }

    /* throw new UnsupportedOperationException(); */
}
