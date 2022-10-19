package operacoeslogicas;

public class oplogicas {

	
	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*Operações Lógicas aninhadas: São operações dentro de operações*/
		
		if (media >= 50) {
			if (media >= 70) {
				System.out.println("Aluno está aprovado direto");
			}else {
				System.out.println("Aluno está em recuperação");
			}
			}
		}
		
}
