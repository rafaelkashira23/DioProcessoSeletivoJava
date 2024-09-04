
package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {


	public static void main(String[] args) {

				
	}
	
	//método seleção dos candidatos com base nos salários
	static void selecaoCandidatos() {
		//candidatos
		String candidatos [] = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		
		int candidatosSelecionados = 0; //variavel contadora de candidatos selecionados
		int candidatosAtual = 0; //variavel que indica o candidato atual pelo indice na lista de candidatos
		
		while (candidatosSelecionados <5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual]; //variavel que armazena o nome do candidato atual
			double salarioBase = 2000.0;
			double salarioPretendido = valorPretendido(); //atribui um valor aleatório, conforme o metodo valorPretendido().
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$" + salarioPretendido + ".");
			
			if (salarioBase >= salarioPretendido) {
				
				System.out.println("O candidato " + candidato + " foi selecionado.");
				candidatosSelecionados++;
				
			}
			
			candidatosAtual++;
			
		}
		
	}
	
	//metodo que gera um valor double aleatorio entre 1800 e 2200
	static double valorPretendido () {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

		
		
	//método que analisa o candidadato tendo como parâmetro o salário pretendido
	static void analisarCandidato (double salarioPretendido) {
		//variavel salarioBase que será comparada com o salario pretendido
		double salarioBase = 2000.0;
		//estrutura condicional para enquadramento do candidato comparando salarioBase e salarioPretendido
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else if (salarioBase == salarioPretendido) 
			System.out.println("Ligar para o candidato com contraproposta");
		else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}
}