package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 2_134_845_223L;
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleanos
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa:
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens:
		System.out.println(numeroDeVoos / 2);
		
		//Pontos acumulados:
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Pontos por real:
		System.out.println(id + ": ganha --> " + salario);
		System.out.println("Férias? "+ estaDeFerias);
		System.out.println("Status: " + status);
	}
}
