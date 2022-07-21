
public class Calculadora {
	
	int v1;
	int v2;
	String operacao;
	
	void EscolherOperacao() {
	
	switch(operacao) {
	case "+":
		System.out.println(v1 + " + " + v2 + " = " + (v1+v2));
		break;
	case "-":
	  System.out.println(v1 + " - " + v2 + " = " + (v1-v2));
		break;
	case "x":
		System.out.println(v1 + " x " + v2 + " = " + (v1*v2));
		break;
	case "/":
		System.out.println(v1 + " / " + v2 + " = " + (v1/v2));
		break;
	default:
		System.out.println("Operação inválida");
		

	}
	
	}
	
	

}


