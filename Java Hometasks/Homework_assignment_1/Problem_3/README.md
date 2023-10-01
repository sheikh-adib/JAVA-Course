# Student Information

Fachhochschule Dortmund

Sheikh Muhammad Adib Bin Sheikh Abu Bakar

Student ID: 7219310

ESE student

# Task
Task: Homework assignment 1/Problem 3

# Development enviroment
- Language: JAVA
- using openJDK-20
- IDE: IntelliJ

# Solution
Number of file: 1

main file: [StringCharacters.java](./src/StringCharacters.java)

1. If statement is used to count number of vowels, letter and spaces
2. All the letter in the text is set to lower case to reduce the number of condition to check whether the character is vowel or not
```java
String input = text.toLowerCase();
```
```java
if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            {
                vowels++;
            }
```
3. Number of letter is increased as every character in the text is checked except when the charachter is symbol or space
```java
if(c == ' ' || c == '`' || c == ';' || c == '?' || c == ',')
            {
                continue;
            }
            letters++;
```

# Output
```
The text contained: 
60 vowels, 
93 consonants, 
37 spaces, 
153 letters.
```
