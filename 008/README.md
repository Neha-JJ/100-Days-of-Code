Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana

Sample Output 0

Anagrams

Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	     3	                 3
G or g	     1	                 1
N or n	     1	                 1
M or m	     1	                 1
R or r	     1	                 1

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams

Explanation 1

Character	Frequency: anagramm	  Frequency: marganaa
A or a	      3	                    4
G or g	      1	                    1
N or n	      1	                    1
M or m	      2	                    1
R or r	      1	                    1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	     1	                  1
H or h	     1	                  1
L or l	     2	                  2
O or o	     1	                  1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Comments:
Literally feeling super demotivated cause I couldn't solve a coding question during an assessment today. I took so much time to even understand what the question was and the logic was just too complicated.
So this is just a simple anagram question I solved from Hackkeran today. I am too fragile to face leetcode today!

Things I learnt:
              
        1. Revisiting basic concepts, the way I forgot the case factor!!!
        2. Keep my coding life seperate from personal and professional life :)
        3. I am not a good programmer yet, I need to practice more. Like really a lot!