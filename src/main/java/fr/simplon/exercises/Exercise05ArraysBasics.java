package fr.simplon.exercises;

/**
 * Exercice 5: Tableaux - Opérations de base
 * 
 * Objectif: Apprendre à manipuler des tableaux
 */
public class Exercise05ArraysBasics {

    /**
     * Crée un tableau contenant les nombres de 1 à n
     * 
     * @param n la taille du tableau
     * @return un tableau [1, 2, 3, ..., n]
     */
    public int[] createSequence(int n) {

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        return numbers;

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Retourne le premier élément d'un tableau
     * 
     * @param array le tableau
     * @return le premier élément
     */
    public int getFirstElement(int[] array) {

        return array[0];

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Retourne le dernier élément d'un tableau
     * 
     * @param array le tableau
     * @return le dernier élément
     */
    public int getLastElement(int[] array) {

        return array[array.length - 1];

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Compte le nombre d'occurrences d'une valeur dans un tableau
     * 
     * @param array le tableau
     * @param value la valeur à chercher
     * @return le nombre d'occurrences
     */
    public int countOccurrences(int[] array, int value) {

        int result = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                result++;
            }
        }

        return result;

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Vérifie si un tableau contient une valeur
     * 
     * @param array le tableau
     * @param value la valeur à chercher
     * @return true si la valeur est présente, false sinon
     */
    public boolean contains(int[] array, int value) {

        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                return true;
            }
        }

        return false;

        /* throw new UnsupportedOperationException(); */
    }
}
