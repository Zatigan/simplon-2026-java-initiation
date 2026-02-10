package fr.simplon.exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Exercice 8: Manipulation de chaînes de caractères
 * 
 * Objectif: Apprendre à manipuler les String
 */
public class Exercise08StringManipulation {

    /**
     * Inverse une chaîne de caractères
     * 
     * @param str la chaîne à inverser
     * @return la chaîne inversée
     */
    public String reverseString(String str) {

        String[] arrayedString = str.split("");

        String reversedArray = "";

        for (int i = arrayedString.length - 1; i >= 0; i--) {
            reversedArray += arrayedString[i];
        }

        return reversedArray;

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Vérifie si une chaîne est un palindrome
     * 
     * @param str la chaîne à vérifier
     * @return true si c'est un palindrome, false sinon
     */
    public boolean isPalindrome(String str) {

        String[] arrayedString = str.split("");

        String[] reversedArray = new String[arrayedString.length];

        for (int i = arrayedString.length - 1; i >= 0; i--) {
            reversedArray[i] = arrayedString[i];
        }

        for (int i = 0; i < arrayedString.length / 2; i++) {
            String temp = arrayedString[i];
            String temp2 = reversedArray[arrayedString.length - 1 - i];

            if (!temp.equals(temp2)) {
                return false;
            }
            ;
        }

        return true;

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Compte le nombre de voyelles dans une chaîne
     * 
     * @param str la chaîne
     * @return le nombre de voyelles (a, e, i, o, u)
     */
    public int countVowels(String str) {

        String[] arrayedString = str.toLowerCase().split("");
        String[] vowels = new String[] { "a", "e", "i", "o", "u" };
        int sumOfVowels = 0;

        for (int index = 0; index < arrayedString.length; index++) {
            for (int j = 0; j < vowels.length; j++) {
                if (arrayedString[index].equals(vowels[j])) {
                    sumOfVowels++;
                }
            }
        }

        return sumOfVowels;

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Compte le nombre de mots dans une chaîne
     * 
     * @param str la chaîne
     * @return le nombre de mots (séparés par des espaces)
     */
    public int countWords(String str) {
        
        String[] arrayedString = str.split(" ");
        
        return arrayedString.length;

        /* throw new UnsupportedOperationException(); */
    }

    /**
     * Met la première lettre de chaque mot en majuscule
     * 
     * @param str la chaîne
     * @return la chaîne avec chaque mot commençant par une majuscule
     */
    public String capitalizeWords(String str) {
        
        String[] arrayedStr = str.toLowerCase().split(" ");

        for (int i = 0; i < arrayedStr.length; i++) {
            String answer = arrayedStr[i];
            arrayedStr[i] = answer.substring(0,1).toUpperCase()+answer.substring(1);
        }

        return String.join(" ", arrayedStr);

        /* throw new UnsupportedOperationException(); */
    }
}
