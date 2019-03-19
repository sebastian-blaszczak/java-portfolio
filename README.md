## Welcome to java portfolio

This page was created to improve programmings skills and show what I'am currently working on. You can 
also see [my GitHub repository](https://github.com/sebastian-blaszczak).

I hope You like it ! 😄
 - - - -
# 1. Anagram algorithm
According to Wikipedia:
>An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all 
the original letters exactly once.

So I created an anagram solver that:
* Inputs of solver are two equal sized arrays of string,
* Output is a List of Boolean, if two words are anagrams then it will show true if not it will show false.

Solver was tested by set of cases:

```
    {"more", "snail", "atom"};
    {"rome", "nails", "bomb"};
    {"more", "snail"};
    {"rome", "nails", "bomb"};
```

Source code and tests are in [anagram-algorithm](https://github.com/sebastian-blaszczak/java-portfolio/tree/master/anagram-algorithm).
 - - - -
# 2. Minimum unique array sum
The problem of this task is that we want to have all unique elements in array and then sum all of numbers, but in this array will be duplicates.

I created an minimum unique array solver that:
* Inputs of solver is array of number and there will be duplicates
* Output is a sum of all elements in array.

Solver was tested by set of cases:
````
    {1, 2, 3, 3, 4, 5};
    {0, 0, 0, 0, 0};
    {-1, -10, -4, -4, -4};
    {1, 1, -1, -3, -3};
    {};
````

Source code and tests are in [minimum-unique-array-sum](https://github.com/sebastian-blaszczak/java-portfolio/tree/master/minimum-unique-array-sum).
 - - - -
# 3. Recursion
In this section I will show some algorithms that contains recursion.

## 1. Fibonacci Sequence
This the common task in programming examples. Fibonacci numbers are numbers that each number is a sum of the two 
numbers preceding ones. The sequence starts by:
````
    F(0) = 0, F(1) = 1;
````
The equation of the numbers starting from 2 index is:
````
    F(n) = F(n-1) + F(n-2);
````
As You can see this is good example to use recursion. 

Solution of this task was to create collector of fibonacci numbers and return them as list.

Collector was tested by set of cases accordingly for index 19 , 9 and 1:
````
    {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};
    {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
    {0, 1};
````
Source code and tests are in [recursion](https://github.com/sebastian-blaszczak/java-portfolio/tree/master/recursion).

## 2. Factorial Sequence
Factorial collector is also good example to use recursion, but instead of Fibonacci collector in this case we have to
iterate from the last index to first. Factorial starts from index 0:
````
    F(0) = 1;
````
The equation for factorial numbers is:
````
    F(n) = 1 * 2 * 3 * ... * (n-2) * (n-1) * n;
````
In this collector there need to be used specific types of integers and it call BigInteger, because even small indexes
creates big numbers, so if we use normal integers it will make integer overflow.

Collector was tested by set of cases accordingly from index 3, 7 and 14:
````
    {1, 1, 2, 6};
    {1, 1, 2, 6, 24, 120, 720, 5040};
    {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800, 87178291200};
````
Source code and tests are in [recursion](https://github.com/sebastian-blaszczak/java-portfolio/tree/master/recursion).