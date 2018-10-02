
public class Testing {

	public static void main(String[] args) {
		
		PostfixEvaluator p = new PostfixEvaluator();
		
		String exp="231*+9-"; 
        System.out.println(p.eval(exp)); 

	}

}
