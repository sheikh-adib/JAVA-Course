/*
 * Fachhochschule Dortmund
 * Sheikh Muhammad Adib Bin Sheikh Abu Bakar
 * Student ID: 7219310
 * ESE student 
 * Task: Home assigment 1
 * Subtask: Problem 2 
 */

/*
Create a new program that has the following features. Download source (JAVA).
(a) Uses labeled continue instead of break
(b) Does not require the isPrime variable.
(c) When testing whether an integer is prime, it is sufficient to try and divide by integers up to
    the square root of the number being tested.
 */

public class Primes {
    public static void main(String[] args) {

        int nValues = 50;

        for(int i = 2; i <= nValues; i++)
        {
            // include number that its square root value < 2
            if (Math.sqrt(i)<2)
            {
                System.out.println(i);
            }

            // try and divide by integers up to the square root of the number being tested.
            for (int j = 2; j<= (int)Math.sqrt(i) ;j++)
            {
                // skip number that can be divided with number less than its square root value
                if (i % j == 0) {
                    j = (int)Math.sqrt(i) + 1;
                    continue;
                }

                // the number cannot be divided  with number less than its square root value is prime number
                if ( j >= (int)Math.sqrt(i) ){
                    System.out.println(i);
                }

            }
        }
    }
}
