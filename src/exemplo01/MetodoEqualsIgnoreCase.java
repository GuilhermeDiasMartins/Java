package exemplo01;

public class MetodoEqualsIgnoreCase {
	
	public static void main(String[] args)  {
		String texto = "java";
		
		// equals � equivalente aos "=="
		if (texto.equals("Java")) {
			System.out.println("� igual");
		} else {
			System.out.println("N�o � igual");
		}
		
		
		System.out.println("\n-------------------------------------\n");
		
		//ignorando o caso
		
		if (texto.equalsIgnoreCase("JAVA")) {
			System.out.println("� igual");
		} else {
			System.out.println("N�o � igual");
		}
		
	}
	
}
