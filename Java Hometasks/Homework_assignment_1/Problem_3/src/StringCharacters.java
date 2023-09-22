/*
 * Fachhochschule Dortmund
 * Sheikh Muhammad Adib Bin Sheikh Abu Bakar
 * Student ID: 7219310
 * ESE student
 * Task: Home assigment 1
 * Subtask: Problem 3
 */

/*
In the following code the soliloquy is analyzed character by character to determine the vowels,
spaces and letters used. Fill in the code that computes the number of spaces, vowels, and
consonants. Download source (JAVA).

public class StringCharacters
{
    public static void main(String[] args)
    {
        String text = "To be or not to be, that is the question;"
                +"Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";
        int spaces = 0,
                vowels = 0,
                letters = 0;
//YOUR CODE HERE
        System.out.println("The text contained vowels: " + vowels + "\n"
                +
                consonants " + (letters - vowels) + "\n"+ spaces: " + spaces);
    }
}
    Run the program once you have written your code. Turn in your code, and the output
    produced when the code runs.

*/

public class StringCharacters
{
    public static void main(String[] args)
    {
        String text = "To be or not to be, that is the question;"
                +"Whether `tis nobler in the mind to suffer"
                +" the slings and arrows of outrageous fortune,"
                +" or to take arms against a sea of troubles,"
                +" and by opposing end them?";

        int spaces = 0,
            vowels = 0,
            letters = 0;

        // change to lower case to reduce number of object
        String input = text.toLowerCase();

        // go through every character in string to compare
        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);

            //number of space
            if(c == ' ')
            {
                spaces++;
            }
            //number of vowels
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            {
                vowels++;
            }

            // number of letter (skip if the character is not a letter)
            if(c == ' ' || c == '`' || c == ';' || c == '?' )
            {
                continue;
            }
            letters++;

        }

        System.out.println("The text contained: \n" + vowels + " vowels, \n" + (letters - vowels) + " consonants, \n" + spaces + " spaces, \n" + letters + " letters.");
    }
}
