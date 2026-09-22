package BaseEx6Operation;

public class Operation {
	
	 public static void main(String[] args) {
		 System.out.println(Operation.add(5, 2));
	     System.out.println(Operation.sub(5, 2));
	     System.out.println(Operation.mul(5, 2));
	     System.out.println(Operation.div(3, 0));
	 }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
    	try {
    		return a/b;
    	}catch (ArithmeticException exception) {
    		System.err.println("Division impossible : " + exception.getMessage());
    		return 0;
    	}
        
    }
}
