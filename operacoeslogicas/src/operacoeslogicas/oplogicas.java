package operacoeslogicas;

public class oplogicas {

	
	/* Main � um m�todo auto execut�vel em Java */
	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*Opera��es L�gicas aninhadas: S�o opera��es dentro de opera��es*/
		
		if (media >= 50) {
			if (media >= 70) {
				System.out.println("Aluno est� aprovado direto");
			}else {
				System.out.println("Aluno est� em recupera��o");
			}
			}
		}
		
}
