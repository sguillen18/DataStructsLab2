package Lab2;

import java.util.Stack;

public class InfixToPostfix {
	
	public InfixToPostfix() {
		
	}
	
	public static boolean checkBalance (String expression) {
        Stack <Character> openDelimiterStack = new Stack<>();
        boolean isBalanced = true;
        int index = 0;
        int characterCount = expression.length();
        char nextCharacter;
        
        while (isBalanced && index < characterCount){
            nextCharacter = expression.charAt(index);
            switch (nextCharacter)
            {
                case '(': case '[': case '{':
                    openDelimiterStack.push(nextCharacter);
                    break;
                case ')': case ']': case '}':
                    if (openDelimiterStack.isEmpty())
                        isBalanced = false;
                    else {
                        char openDelimiter = openDelimiterStack.pop();
                        isBalanced = isPaired (openDelimiter, nextCharacter );
                    }
                    break;
                default: //irelevant character
                    break;
                 
            }
            index ++;
        }
        if (!openDelimiterStack.empty())
            isBalanced = false;
        
        return isBalanced;
    }
    private static boolean isPaired (char first, char second) {
        return (first == '(' && second == ')' ||
                first == '[' && second == ']' ||
                first == '{' && second == '}');
    }


	public String convert (String infix) {
		
		int index = 0;
	    int characterCount = infix.length();
	    char nextCharacter;
	    String postfix;
	    char topOperator;
		
		//new empty stack
		Stack <Character> operatorStack = new Stack <Character>();
		
		char[] x = infix.toCharArray();
		
		//while parsing through
		while(index < characterCount) {
			nextCharacter = x[index];
			index++;
			switch (nextCharacter) {
			case '^':
				operatorStack.push(nextCharacter);
				break;
			case '+':
			case '-':
			case '/':
			case '*':
				while(!operatorStack.isEmpty()) {
					//more code
					break;
				}
			case '(':
					operatorStack.push(nextCharacter);
					break;
			case ')':
					topOperator = operatorStack.pop();
					while(topOperator != '(') {
						postfix.concat(Character.toString(nextCharacter));
						topOperator = operatorStack.pop();
					}
					break;
			default:
				if(nextCharacter == ' ')
					break;
				else {
					String s = Character.toString(nextCharacter);
					postfix.concat(s);
				}
			}
			
			while (!operatorStack.isEmpty()) {
				topOperator = operatorStack.pop();
				postfix += topOperator;
			}
				
			
		}
		return postfix;
	}
}