/*
 * Fachhochschule Dortmund
 * Sheikh Muhammad Adib Bin Sheikh Abu Bakar
 * Student ID: 7219310
 * ESE student
 * Task: Home assigment 1
 * Subtask: Problem 3
 */


public class Main {
    public static void main(String[] args) {

        // text
        String text = "To be or not to be, that is the question;"
                +"Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";

        // define word - continues sequence of letters (start with a letter or ` and end with  space or ')
        // store all word in a list

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);

            //start of word
            if( c == '`' )
            {
                continue;
            }

        }

        System.out.println("The text contained: \n" + vowels + " vowels, \n" + (letters - vowels) + " consonants, \n" + spaces + " spaces, \n" + letters + " letters.");

        // sort the word

    }
}

// number of letter (skip if the character is not a letter)
            if(c == ' ' || c == '`' || c == ';' || c == '?' || c == ',')
                    {
                    continue;
                    }
                    letters++;