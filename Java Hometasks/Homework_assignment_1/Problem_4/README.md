# Student Information

Fachhochschule Dortmund

Sheikh Muhammad Adib Bin Sheikh Abu Bakar

Student ID: 7219310

ESE student

# Task
Task: Homework assignment 1/Problem 4

# Development enviroment
- Language: JAVA
- using openJDK-20
- IDE: IntelliJ

# Solution
Number of file: 1

main file: [Main.java](./src/Main.java)

1. A word is define as:
```"A word start with a letter or '`' and end with a letter or ''' and without any space between the charachters"```
2. The algorithm of the solution is as follow.
      1. Make a list of word from a text.
      2. Remove redundant word (optional).
         ```java
         boolean removeRedundant = false;
         ```
      4. Sorting (based on the word's first character) :
           1. Iterate every word in the list.
           2. Compare the the first value of charachter of selected word with the other word's first charachter value.
              ```java
              if((int)currentWord.charAt(0) > (int)wordList.get(j).toLowerCase().charAt(0))
              ```
           4. During the comparison, the character is set to lower case.
           5. If the value of the character is bigger than the compared charachter, those words is swapped.




# Output
1. When no redundant word is removed:
```
[`tis, and, arrows, arms, against, a, and, be, be, by, end, fortune, in, is, mind, nobler, not, or, of, or, of, opposing, outrageous, question, sea, slings, suffer, to, the, the, To, to, troubles, that, the, to, take, them, Whether]
```
2. When redundant word is removed:
```
[`tis, and, arrows, arms, against, a, be, by, end, fortune, is, in, mind, not, nobler, or, of, opposing, outrageous, question, suffer, slings, sea, take, troubles, that, To, the, them, Whether]
```


