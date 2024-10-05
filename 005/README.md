Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.


Comments:
Using stacks for this problem!!

I used two methods : using while loop and for loop

Initially, I used for loop cause I am comfortable with it but then one of the test cases failed, so I had to switch to while loop. It worked.
I think the for loop didnt work because the for loop broke prematurely before finding all the pairs.
I have given both my codes in the other file, if you know how to execute it using for loop. Please help me!!

Things I learnt:
             
            1. Getting comfortable with while loop
            2. Using stacks in java
            3. push and pop in stack.