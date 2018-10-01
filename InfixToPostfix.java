import java.util.Stack;

public class InfixToPostfix {

	public String convert (String infix) {
		
		//new empty stack
		Stack operatorStack = new Stack();
		
		//while parsing through
		while(infex[i] < ) {
			
			char nextCharacter;
			switch (nextCharacter) {
			
			case variable:
				postfix += variable;
				break;
			case '^':
				operatorStack.push(nextCharacter);
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
