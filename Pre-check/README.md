# Student Information

Fachhochschule Dortmund

Sheikh Muhammad Adib Bin Sheikh Abu Bakar

Student ID: 7219310

ESE student

# Task
Task: Pre-check task

# Development enviroment
- Language: JAVA
- using openJDK-20
- IDE: IntelliJ

# Solution
list of accesible function of Prticipant can bee seen in interface of Participant (Participant_interface)

Number of file: 1

main file: [Participant.java](./src/Participant.java)

# Verification
1. list of three participant were created
     ```python
     Participant participant1 = new Participant("Sheikh", "Muhammad",22, "Climbing", new String[]{"national", "international"});
     Participant participant2 = new Participant("Adib", "Bin",23, "Climbing", new String[]{"national"});
     Participant participant3 = new Participant("Abu", "Bakar",24, "Cycling", new String[]{"national", "international"});
     
    ```
3. three scenario were conducted
    1. select participant with sport type = "climbing"
    2. select participant that have "international awards"
    3. select participant that have "national awards"
4. assertion was used to verify

# Output
```
Participant with sportType "Climbing"
Muhammad Sheikh
Bin Adib

Pass

Participant with international award
Muhammad Sheikh
Bakar Abu

Pass

Participant with national award
Muhammad Sheikh
Bin Adib
Bakar Abu

Pass

Process finished with exit code 0
```
