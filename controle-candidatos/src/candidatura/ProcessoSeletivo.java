
package candidatura;


public class ProcessoSeletivo {


	public static void main(String[] args) {

		//mensagem de apresentação		
		System.out.println("Processo Seletivo");
		
		//chamada de metodos
		analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);
		
		
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