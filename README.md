# APPROACH

> I have used the Stack Based Approach to solve this problem.
> First of all, we insert -1 in empty stack for calculation of length.
> IF character is - ")" then we pop the top element of stack 
> now if the stack becomes empty then there is no matched element and we push the current index for further correct length calculations.
> if stack is not empty then current length of substring will be (index - peek()).


 * Time complexity will be O(n) as we are only using single for-loop.
 * Space complexity will be O(n) because we are using Stack which considerd as extra space.

 ########## TO RUN ############

 > javac Moglix.java
 > java Moglix


 then enter the String containing oly chars - "(" and ")"
 