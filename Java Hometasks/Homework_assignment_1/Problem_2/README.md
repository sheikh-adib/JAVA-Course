# Student Information

Fachhochschule Dortmund

Sheikh Muhammad Adib Bin Sheikh Abu Bakar

Student ID: 7219310

ESE student

# Task
Task: Home assignment 1/Problem 2

# Solution
Number of file: 1

main file: [Primes.java](./src/Primes.java)

1. If condition is used to include  number that its square root value less then 2
```
if (Math.sqrt(i)<2)
            {
                System.out.println(i);
            }
```
2. Use for loop to check the other number
3. if there is no reminder when didving a number with a value less then its square root value, skip the proceding statement using ```continue``` and if the number cannot be divided  with number less than its square root value, the number is considered as a prime number
```
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
```

# Output
```
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
```
