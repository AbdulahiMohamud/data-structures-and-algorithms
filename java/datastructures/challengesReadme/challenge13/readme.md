# Multi-bracket Validation.

Make a balanced multi bracket validation algorithm.

Input is a string
Ouput is true or false based on paris fo brackets


### Contributor: Rodger Reyes

## Approach & Efficiency

The approach splits the sting into an array and push values into a stack. Pop the stack and compare the
reverse of the string to get true or false. There are multiple conditions that if it doesn't match
return false.

Stacks and queues have time complexity O(n) and space complexity of  O(n).

#### Work Time: 5 hours
