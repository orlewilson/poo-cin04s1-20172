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
		
		// criando objeto (com construtor sem argumentos)
//		Caneta bic = new Caneta();
		
		// criando objeto (com construtor com argumentos)
		Caneta bic = new Caneta("vermelha","BIC", "plástico",
				"esferográfica",0.7,3.25);
		
		// Atribuindo valores (sem encapsulamento)
//		bic.cor = "vermelha";
//		bic.marca = "BIC";
//		bic.material = "plástico";
//		bic.tipo = "esferográfica";
//		bic.ponta = 0.7;
//		bic.preco = 3.25;
		
		// Atribuindo valores (com encapsulamento)
		bic.setCor("vermelha");
		bic.setMarca("BIC");
		bic.setMaterial("plástico");
		bic.setTipo("esferográfica");
		bic.setPonta(0.7);
		bic.setPreco(3.25);
		
		// Imprimir conteúdos (sem encapsulamento)
//		System.out.println("Cor: " + bic.cor);
//		System.out.println("Marca: " + bic.marca);
//		System.out.println("Material: " + bic.material);
//		System.out.println("Tipo: " + bic.tipo);
//		System.out.println("Ponta: " + bic.ponta);
//		System.out.println("Preço: " + bic.preco);
		
		// Imprimir conteúdos (com encapsulamento)
		System.out.println("Cor: " + bic.getCor());
		System.out.println("Marca: " + bic.getMarca());
		System.out.println("Material: " + bic.getMaterial());
		System.out.println("Tipo: " + bic.getTipo());
		System.out.println("Ponta: " + bic.getPonta());
		System.out.println("Preço: " + bic.getPreco());
		
	}
}