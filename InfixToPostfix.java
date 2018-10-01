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
		
		//new empty stack
		Stack <String> operatorStack = new Stack <String>();
		
		//while parsing through
		while(index < characterCount) {
			switch (nextCharacter) {
			
			case variable:
				postfix += variable;
				break;
			case '^':
				String s = nextCharacter.
				operatorStack.push(nextCharacter.toString());
				break;
			case '+':
			case '-':
			case '/':
				while(!operatorStack.isEmpty() || precedence) {
					//more code
					break;
				}
			case '(':
					operatorStack.push(nextCharacter);
					break;
			case ')':
					topOperator = operatorStack.pop();
					while(topOperator != '(') {
						postfix += topOperator;
						topOperator = operatorStack.pop();
					}
					break;
			default:
					break;
			}
			
			while (!operatorStack.isEmpty()) {
				topOperator = operatorStack.pop();
				postfix += topOperator;
			}
				
			
		}
		return postfix;
	}
}