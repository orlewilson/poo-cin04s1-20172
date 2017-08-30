/*
 *	Disciplina: Programação Orientada a Objetos 
 *  Professor: 	Orlewilson B. Maia
 *  Turma:		CIN04S1
 *  Data:		23/08/17
 *  Autor:		Orlewilson B. Maia
 *  Descrição:	Modelo para representar o modelo de uma caneta
 * 	
 */

public class Caneta {

	// Atributos (sem encapsulamento)
//	String cor;
//	String marca;
//	String material;
//	String tipo;
//	double preco;
//	double ponta;

	// Atributos (com encapsulamento)
	private String cor;
	private String marca;
	private String material;
	private String tipo;
	private double preco;
	private double ponta;

	// Construtor (sem argumentos)
	public Caneta(){
		this.cor = "";
		this.marca = "";
		this.material = "";
		this.tipo = "";
		this.preco = 0.0;
		this.ponta = 0.0;
	}
	
	
	// Construtor (com argumentos)
	public Caneta(String cor, String marca,
			String material, String tipo, 
			double preco, double ponta){
		this.cor = cor;
		this.marca = marca;
		this.material = material;
		this.tipo = tipo;
		this.preco = preco;
		this.ponta = ponta;
	}
	
	// Métodos para acessar os atributos (encapsulamento)
	public void setCor(String cor){
		this.cor = cor;
	}
	
	public String getCor(){
		return this.cor;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getMarca(){
		return this.marca;
	}
	
	public void setMaterial(String material){
		this.material = material;
	}
	
	public String getMaterial(){
		return this.material;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public double getPreco(){
		return this.preco;
	}
	
	public void setPonta(double ponta){
		this.ponta = ponta;
	}
	
	public double getPonta(){
		return this.ponta;
	}	
}
