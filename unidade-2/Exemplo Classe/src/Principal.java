/*
 *	Disciplina: Programação Orientada a Objetos 
 *  Professor: 	Orlewilson B. Maia
 *  Turma:		CIN04S1
 *  Data:		23/08/17
 *  Autor:		Orlewilson B. Maia
 *  Descrição:	Executar o projeto
 * 	
 */
public class Principal {
	
	// executar o projeto
	public static void main(String[] args) {
		
		// criando objeto
		Caneta bic = new Caneta();
		
		// Atribuindo valores (sem encapsulamento)
		bic.cor = "vermelha";
		bic.marca = "BIC";
		bic.material = "plástico";
		bic.tipo = "esferográfica";
		bic.ponta = 0.7;
		bic.preco = 3.25;
		
		// Imprimir conteúdos (sem encapsulamento)
		System.out.println("Cor: " + bic.cor);
		System.out.println("Marca: " + bic.marca);
		System.out.println("Material: " + bic.material);
		System.out.println("Tipo: " + bic.tipo);
		System.out.println("Ponta: " + bic.ponta);
		System.out.println("Preço: " + bic.preco);
		
		
	}
}





