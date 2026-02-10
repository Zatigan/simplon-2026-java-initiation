package fr.simplon.exercises;

/**
 * Exercice 7: Tableaux - Somme et moyenne
 * 
 * Objectif: Apprendre à calculer la somme et la moyenne des éléments d'un
 * tableau
 */
public class Exercise07ArraysSumAverage {

    /**
     * Calcule la somme de tous les éléments d'un tableau
     * 
     * @param array le tableau
     * @return la somme de tous les éléments
     */
    public int sum(int[] array) {

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
            }

        return result;
        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Calcule la moyenne des éléments d'un tableau
     * 
     * @param array le tableau
     * @return la moyenne (arrondie à l'entier inférieur)
     */
    public double average(int[] array) {
        
        int result = 0;
        
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        
        return Math.round(result / array.length);

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Compte combien d'éléments sont supérieurs à la moyenne
     * 
     * @param array le tableau
     * @return le nombre d'éléments supérieurs à la moyenne
     */
    public int countAboveAverage(int[] array) {
        
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        int average = total / array.length;
        int aboveAverage = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                aboveAverage++;
            }
        }
        
        return aboveAverage;
        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Calcule la somme des nombres pairs dans un tableau
     * 
     * @param array le tableau
     * @return la somme des nombres pairs
     */
    public int sumEvenNumbers(int[] array) {
        
        int sumOfEven = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumOfEven += array[i];
            }
        }

        return sumOfEven;
        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Calcule le produit de tous les éléments d'un tableau
     * 
     * @param array le tableau
     * @return le produit de tous les éléments
     */
    public int product(int[] array) {
        
        int totalProduct = array[0];

        for (int i = 1; i < array.length; i++) {
            totalProduct *= array[i];
        }
        
        return totalProduct;

        /* throw new UnsupportedOperationException(); */
    }
}
