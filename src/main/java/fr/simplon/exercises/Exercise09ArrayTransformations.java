package fr.simplon.exercises;

/**
 * Exercice 9: Tableaux - Transformations
 * 
 * Objectif: Apprendre à créer de nouveaux tableaux à partir de tableaux
 * existants
 */
public class Exercise09ArrayTransformations {

    /**
     * Double tous les éléments d'un tableau
     * 
     * @param array le tableau source
     * @return un nouveau tableau avec tous les éléments doublés
     */
    public int[] doubleElements(int[] array) {

        int[] doubledArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            doubledArray[i] = array[i] * 2;
        }

        return doubledArray;

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Filtre les nombres pairs d'un tableau
     * 
     * @param array le tableau source
     * @return un nouveau tableau contenant seulement les nombres pairs
     */
    public int[] filterEvenNumbers(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        int[] evenNumbers = new int[count];
        int finalIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                evenNumbers[finalIndex] = array[i];
                finalIndex++;
            }
        }
        return evenNumbers;
        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Copie un tableau dans l'ordre inverse
     * 
     * @param array le tableau source
     * @return un nouveau tableau avec les éléments dans l'ordre inverse
     */
    public int[] reverseArray(int[] array) {

        int[] reversedArray = new int[array.length];
        int index = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[index] = array[i];
            index++;
        }

        return reversedArray;

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Concatène deux tableaux
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un nouveau tableau contenant d'abord les éléments de array1, puis
     *         ceux de array2
     */
    public int[] concatenate(int[] array1, int[] array2) {
        
        int[] bigArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            bigArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            bigArray[array1.length + i] = array2[i];
        }

        return bigArray;
        
        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Extrait une sous-partie d'un tableau
     * 
     * @param array le tableau source
     * @param start l'index de début (inclus)
     * @param end   l'index de fin (exclus)
     * @return un nouveau tableau contenant les éléments de start à end-1
     */
    public int[] slice(int[] array, int start, int end) {
        int[] finalArray = new int[end - start];
        int count = 0;

        for (int i = start; i < end; i++) {
            finalArray[count] = array[i];
            count++;
        }

        return finalArray;

        /* throw new UnsupportedOperationException(); */
    }
}
