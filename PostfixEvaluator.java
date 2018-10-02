import java.util.Stack;

public class PostfixEvaluator {
	
public PostfixEvaluator() {}

	public int eval (String postfix) {

		
		int index = 0;
	    int characterCount = postfix.length();
	    char nextCharacter;
		
		//new empty stack
		Stack <Character> valueStack = new Stack <Character>();
		
		char[] x = postfix.toCharArray();

		
		for(int i = 0; i  < characterCount; i++) {
			nextCharacter = x[i];
			valueStack.push(nextCharacter);
		}
		
		//while parsing through
		while(index < characterCount) {
			nextCharacter = x[index++];
			
			//if scanned character is a digit, push to valueStack
			if(Character.isDigit(nextCharacter))
				valueStack.push((char) (nextCharacter - '0'));
			else {
				int operandOne = valueStack.pop();
				int operandTwo = valueStack.pop();
				
				switch (nextCharacter) {
				case '+':
					valueStack.push((char) (operandTwo + operandOne));
					break;
				case '-':
					valueStack.push((char) (operandTwo - operandOne));
					break;
				case '*':
					valueStack.push((char) (operandTwo * operandOne));
					break;
				case '/':
					valueStack.push((char) (operandTwo / operandOne));
					break;
				case '^':
					valueStack.push((char) Math.pow(operandTwo, operandOne));
					break;
				default:
					break;
				}
				
			}
			
		}
		return valueStack.pop();
	}
	
}

