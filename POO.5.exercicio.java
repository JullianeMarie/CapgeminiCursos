package capgeminiProjeto;

import java.util.Random;
import java.util.Map;

public class AlunosMatriculados {
	private String numeroMatricula; 
	private String nomeAluno; 
	private double prova1;
	private double prova2;
	private double trabalhoNota;
	private double media;
	private double notaFinal;

	public AlunosMatriculados(String numeroMatricula, String nomeAluno, double prova1, double prova2,
			double trabalhoNota, double media, double NotaFinal) {
		this.numeroMatricula = numeroMatricula;
		this.nomeAluno = nomeAluno; 
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.trabalhoNota = trabalhoNota;
		this.media = media;
		this.notaFinal = notaFinal;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}
	
	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public void setProva1(double prova1) {
		this.prova1 = prova1;
	}

	public void setProva2(double prova2) {
		this.prova2 = prova2;
	}

	public void setTrabalhoNota(double trabalhoNota) {
		this.trabalhoNota = trabalhoNota;
	} 
	
	public double getMedia() {
		return media;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	private static String gerarNumeroMatricula() {
		Random random = new Random();
		int numero = random.nextInt(0001001);
		return String.format("%05d", numero);
	}

	public static AlunosMatriculados cadastrarAluno(Map<String, AlunosMatriculados> cadastro, String nomeAluno) {
		String numeroMatricula = gerarNumeroMatricula();
		AlunosMatriculados aluno = new AlunosMatriculados(numeroMatricula, nomeAluno, 0.0, 0.0, 0.0, 0.0, 0.0);
		cadastro.put(nomeAluno, aluno);
		return aluno;
	}

	public static AlunosMatriculados buscarAluno(Map<String, AlunosMatriculados> cadastro, String numeroMatricula) {
	for (AlunosMatriculados aluno : cadastro.values()) {
		if (aluno.getNumeroMatricula().equals(numeroMatricula)){
			return aluno;
		}
	}
	return null;
	}

	public double Media() {
		this.media = (2.5 * this.prova1 + 2.5 * this.prova2 + 2.0 * this.trabalhoNota) / (2.5 + 2.5 + 2.0);
		return this.media;
	}

	public double Final() {
		this.notaFinal = Math.max(0, 7.0 - this.media);
		return this.notaFinal;
	}
}


_________________________________________________________________________________________________________________________
package capgeminiProjeto;

import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		 
		/*5. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. 
		 * Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova
		 *  e 1 nota de trabalho. Escreva os seguintes métodos para esta classe: 
		 a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2) 
		 b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)*/
		
		
		Map<String, AlunosMatriculados> cadastro = new HashMap<>();
		
		while (true) {
			System.out.println();
			System.out.println("Digite o nome do aluno: | Digite para encerrar: sair ");
			String nomeAluno = sc.nextLine();
			if (nomeAluno.equalsIgnoreCase("sair")) {
			break;
		}
		
		AlunosMatriculados aluno = AlunosMatriculados.cadastrarAluno(cadastro, nomeAluno);
		System.out.println();
		System.out.println("Aluno cadastrado com sucesso!");
		System.out.println();
		System.out.println("Nome: " + aluno.getNomeAluno());
		System.out.println("Numero de Matrícula: " + aluno.getNumeroMatricula());
		
		}
		
		while (true) {
			System.out.println();
			System.out.println("***Atualização Boletim*** : ");
			System.out.println("Digite 'sair' para finalizar");
			System.out.println();
			System.out.printf("Digite o número da matrícula: ");
			
			String numeroMatricula = sc.next();
			if (numeroMatricula.equals("sair")) {
				break;
			}
			
			AlunosMatriculados aluno = AlunosMatriculados.buscarAluno(cadastro, numeroMatricula);
		
			if (aluno != null) {
				System.out.print("Digite nota aluno: " + aluno.getNomeAluno());
				System.out.println();
				System.out.print("PROVA 1: ");
				aluno.setProva1(sc.nextDouble());
				System.out.print("PROVA 2: ");
				aluno.setProva2(sc.nextDouble());
				System.out.print("NOTA TRABALHO: ");
				aluno.setTrabalhoNota(sc.nextDouble());
				
				aluno.Media();
		        System.out.printf("Média: %.2f%n", aluno.getMedia());  // Formatando a média com duas casas decimais
		        aluno.Final();
		        System.out.printf("Final: %.2f%n" , aluno.getNotaFinal());
			
			} else {
				System.out.println("Aluno não encontrado com o número de matriculado");
			}
			
		}
		
	sc.close();
	}
}

/*


Digite o nome do aluno: | Digite para encerrar: sair 
Julliane Marie

Aluno cadastrado com sucesso!

Nome: Julliane Marie
Numero de Matrícula: 00129

Digite o nome do aluno: | Digite para encerrar: sair 
Angelo Franzon

Aluno cadastrado com sucesso!

Nome: Angelo Franzon
Numero de Matrícula: 00027

Digite o nome do aluno: | Digite para encerrar: sair 
sair

***Atualização Boletim*** : 
Digite 'sair' para finalizar

Digite o número da matrícula: 00129
Digite nota aluno: Julliane Marie
PROVA 1: 7.5
PROVA 2: 6.5
NOTA TRABALHO: 2.0
Média: 5.57
Final: 1.43

***Atualização Boletim*** : 
Digite 'sair' para finalizar

Digite o número da matrícula: 0027
Aluno não encontrado com o número de matriculado

***Atualização Boletim*** : 
Digite 'sair' para finalizar

Digite o número da matrícula: 00027
Digite nota aluno: Angelo Franzon
PROVA 1: 7.0
PROVA 2: 5.0
NOTA TRABALHO: 2.0
Média: 4.86
Final: 2.14

***Atualização Boletim*** : 
Digite 'sair' para finalizar

Digite o número da matrícula: 

 */