Given a string s consisting of lowercase English letters, return the first letter to appear twice.

Note:

A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
s will contain at least one letter that appears twice.
 

Example 1:

Input: s = "abccbaacz"
Output: "c"
Explanation:
The letter 'a' appears on the indexes 0, 5 and 6.
The letter 'b' appears on the indexes 1 and 4.
The letter 'c' appears on the indexes 2, 3 and 7.
The letter 'z' appears on the index 8.
The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
Example 2:

Input: s = "abcdd"
Output: "d"
Explanation:
The only letter that appears twice is 'd' so we return 'd'.
 

Constraints:

2 <= s.length <= 100
s consists of lowercase English letters.
s has at least one repeated letter.


I solved it in a simple method yesterday but think the better solution is to use a hashMap. I am not very familiar with hasMap so I am not adding the code. I tried to implement it today and it didn't work :(

In the code given what I did was: 
                        
                        I created an array to keep track of the elements of size 26 (as there are 26 letters in English)
                        Then iterated through the given string and updated the count of each letter
                        And then for any letter, if the count becomes 2, Return it.

I will learn the HashMap method and update the code within this week.