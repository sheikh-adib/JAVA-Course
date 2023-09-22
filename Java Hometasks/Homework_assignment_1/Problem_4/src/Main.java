/*
 * Fachhochschule Dortmund
 * Sheikh Muhammad Adib Bin Sheikh Abu Bakar
 * Student ID: 7219310
 * ESE student
 * Task: Home assigment 1
 * Subtask: Problem 3
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import static java.lang.Character.isLetter;

public class Main {
    public static void main(String[] args) {
        // text
        String text = "To be or not to be, that is the question;"
                +"Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";

        // 1. define word - A word start with a letter or '`' and end with a letter or ''' and without any space between the charachters
        // 2. collect all word in a list
        // 3. remove redundant word (optional)
        // 4. sort out the list

        String word = "";
        ArrayList<String> wordList= new ArrayList<String>();
        boolean removeRedundant = true;

        // 2. collect all word in a list
        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);

            //start of words
            if( c == '`' || isLetter(c))
            {
                //end of words
                for(char cInWord; text.charAt(i) != ' ' && text.charAt(i) != ';' && text.charAt(i) != '?' && text.charAt(i) != ','; i++)
                {
                    cInWord = text.charAt(i);
                    word += cInWord;
                }
                // store words
                //System.out.println(word);
                wordList.add(word);

                //clear words
                word = "";
                i--;
            }

        }

        // 3. remove redundant word
        if(removeRedundant)
        {
            for(int i =0; i< wordList.size();i++)
            {
                String currentWord = wordList.get(i).toLowerCase();
                for(int j = i + 1; j<wordList.size();j++)
                {
                    if(Objects.equals(currentWord, wordList.get(j).toLowerCase()))
                    {
                        wordList.remove(j);
                    }
                }
            }
        }

        // sort out the list based on first character
        for(int i =0; i< wordList.size();i++)
        {
            String currentWord = wordList.get(i).toLowerCase();
            for(int j = i + 1; j<wordList.size();j++)
            {
                if((int)currentWord.charAt(0) > (int)wordList.get(j).toLowerCase().charAt(0))
                {
                    Collections.swap(wordList, i, j);
                    currentWord = wordList.get(i).toLowerCase();
                }
            }
        }

        System.out.println(wordList);
    }
}

