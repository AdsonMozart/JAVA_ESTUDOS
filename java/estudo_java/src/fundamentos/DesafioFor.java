package fundamentos;

public class DesafioFor {

	public static void main(String[] args) {
		
		for(String escada = "#"; !escada.equals("######"); escada += "#") {
			System.out.println(escada);
		}
		
		}
	}
//String valor = "#";
//for(int i=1; i<=5; i++) {
//	System.out.println(valor);
//	valor += "#"
//}

//Versão do desafio
//Não pode usar valor numérico para controlar o laço!