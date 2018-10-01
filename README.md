# DataStructsLab2
In the files 06aStackDefinition.docx and 06bStackApplications.docx from the directory “Lectures” the algorithms for infix-to-postfix converter and postfix expression evaluation are described. 
Translate those algorithms in Java code, creating two classes: InfixToPostfix and PostfixEvaluator.

The method InfixToPostfix.convert(String infix) creates the new string; the method PostfixEvaluator.eval (String postfix) returns the computed value.
Use the Stack class from JCL.
Assume that the string for conversion contains only one-letter variables and one-digit numbers; the string for evaluation contains only one-digit numbers. 
The result of the evaluation is supposed to be a floating-point value.
Test the method by asking user to enter a string.
Upon the user input, you should check whether the string is parentheses-balanced.

Here is a possible output:
Enter a string for conversion: a+ (b-c)/(c-3)
a b c - c 3 - / +
Enter a string for evaluation, digits only: 1+3^3^2/5
The result: 3937.6



Enter a string for conversion: 
(a-b)+(c*d
Input error: unbalanced string


Extra credit (10 pts): make sure the methods work with multi-digit numbers.
