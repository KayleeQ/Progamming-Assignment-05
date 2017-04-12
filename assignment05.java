/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfive;

import java.util.*;
import java.io.*;

/**
 *
 * @author piaoxie
 */
public class assignment05 {
    public static void main(String[] args) {

        long wordsFound = 0, wordsNotFound = 0;
        long ComparisonsofWordsFound = 0, ComparisonsofWordsNotFound = 0;

        String wordToBeSearched = "1";
        
        int i = 0;
        int[] count = new int[1];
        int WordsinDictionary = 0;
        BinarySearchTree[] list = new BinarySearchTree[26];// replacce mylinked list with binary search tree
        for (i = 0; i < list.length; i++) {
            list[i] = new BinarySearchTree<String>();// each array element contains a new MyLinkedList
        }

        try {
            File file = new File("random_dictionary.txt");
            Scanner in = new Scanner(file);
            while (in.hasNext() != false) {
                String word = in.next();
                word = word.toLowerCase();
                list[word.charAt(0) - 97].insert(word);//subtracts 97 from the ASCII value of the first letter for every word.
                WordsinDictionary++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        try {
            File file = new File("oliver.txt");
            Scanner in = new Scanner(file);
            while (in.hasNext() == true) {
                String word = in.next();
                word = word.toLowerCase();
                word = word.replaceAll("[^A-Za-z]", "");

                
                if (!word.isEmpty()) {
                    wordsFound++;
                    if (list[word.charAt(0) - 97].search(word, count)) {
                        wordsFound++;
                        ComparisonsofWordsFound += count[0];
                    } else {
                        wordsNotFound++;
                        ComparisonsofWordsNotFound += count[0];
                    }
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        int avgCompsWordsFound = (int) (ComparisonsofWordsFound / wordsFound);
        int avgCompsWordsNotFound = (int) (ComparisonsofWordsNotFound / wordsNotFound);
        
        System.out.println("=====================================================================================");
        
        System.out.println("Number of words found: " + wordsFound);
        System.out.println("Total Number of comparisons of words found: " + ComparisonsofWordsFound);
        
        System.out.println("=====================================================================================");
        
        System.out.println("Number of words not found: " + wordsNotFound);
        System.out.println("Total Number of comparisons of words not found: " + ComparisonsofWordsNotFound);
        
        System.out.println("=====================================================================================");
        
        System.out.println("The average amount of words found to comparisons of words" + " found is:" + avgCompsWordsFound);
        System.out.println("The average amount of words not found to comparisons of words" + " not found is:" + avgCompsWordsNotFound);
        
        System.out.println("=====================================================================================");
    }//main
}//class

