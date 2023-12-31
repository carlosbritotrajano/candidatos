package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		/*
		analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);
		*/
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"Felipe","Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5){
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " Solicitou este valor de sal�rio " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " Foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			
			candidatosAtual++;
		}
	
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		
	double salarioBase = 2000.0;
	if(salarioBase > salarioPretendido) {
		System.out.println("LIGAR PARA O CANDIDATO");
	}else if(salarioBase == salarioPretendido){
		System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
	}else {
		System.out.println("AGUARDANDO O RESULTADO DOS CANDIDATO");
	}
   }
}
