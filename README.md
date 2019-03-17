## Welcome to java portfolio

This page was created to improve programmings skills and show what I'am currently working on. You can also see [my GitHub repository](https://github.com/sebastian-blaszczak).

I hope You like it ! 😄

# 1. Anagram algorithm
According to Wikipedia:
>An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

So I created an anagram solver that:
* Inputs of solver are two equal sized arrays of string,
* Output is a List of Boolean, if two words are anagrams then it will show true if not it will show false.

Solver was tested by set of cases:

'''markdown
    {"more", "snail", "atom"};
    {"rome", "nails", "bomb"};

    {"more", "snail"};
    {"rome", "nails", "bomb"};
'''

Sorce code and tests are in [anagram-algorithm](https://github.com/sebastian-blaszczak/java-portfolio/tree/master/anagram-algorithm).

# 2. Minimum unique array sum
The problem of this task is that we want to have all unique elements in array and then sum all of numbers, but in this array will be duplicates.

I created an minimum unique array solver that:
* Inputs of solver is array of number and there will be duplicates
* Output is a sum of all elements in array.

Solver was tested by set of cases:
'''markdown
    {1, 2, 3, 3, 4, 5};
    {0, 0, 0, 0, 0};
    {-1, -10, -4, -4, -4};
    {1, 1, -1, -3, -3};
    {};
'''

Sorce code and tests are in [minimum-unique-array-sum](https://github.com/sebastian-blaszczak/java-portfolio/tree/dev_new_task/minimum-unique-array-sum).

