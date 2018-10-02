package Lab2;

import java.util.Stack;

public class InfixToPostfix {
	
	public InfixToPostfix() {
		
	}
	
	public boolean checkBalance (String expression) {
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
	    String postfix = "";
	    char topOperator;
		
		//new empty stack
		Stack <Character> operatorStack = new Stack <Character>();
		
		char[] x = infix.toCharArray();
		
		//while parsing through
		while(index < characterCount) {
			nextCharacter = x[index++];
			switch (nextCharacter) {
			case '^':
				operatorStack.push(nextCharacter);
				break;
			case '+':
			case '-':
				operatorStack.push(nextCharacter);
				break;
			case '/':
			case '*':
				while((!operatorStack.isEmpty()) && 
						(!((operatorStack.peek()).equals('+')) || !((operatorStack.peek()).equals('-')))) {
					String op = Character.toString(operatorStack.pop());
					postfix += op;
					break;
				}
			case '(':
					operatorStack.push(nextCharacter);
					break;
			case ')':
					topOperator = operatorStack.pop();
					while(topOperator != '(') {
						postfix += Character.toString(topOperator);
						topOperator = operatorStack.pop();
					}
					break;
			default:
				if(nextCharacter == ' ')
					break;
				else if (nextCharacter != '(') {
					String s = Character.toString(nextCharacter);
					postfix += s;
					if((!operatorStack.isEmpty()) && (operatorStack.peek()).equals('^')) {
						s = Character.toString(operatorStack.peek());
						postfix += s;
						operatorStack.pop();
					}
					break;
				}
			}
			
			while (!operatorStack.isEmpty() && index==characterCount) {
				topOperator = operatorStack.pop();
				postfix += topOperator;
			}
				
			
		}
		return postfix;
	}
}