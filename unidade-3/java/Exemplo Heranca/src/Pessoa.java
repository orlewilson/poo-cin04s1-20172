/*
 *	Disciplina: Programação Orientada a Objetos 
 *  Professor: 	Orlewilson B. Maia
 *  Turma:		CIN04S1
 *  Data:		27/08/17
 *  Autor:		Orlewilson B. Maia
 *  Descrição:	Modelo para representar uma pessoa
 * 	
 */
public class Pessoa {

	// atributos
	private String nome;
	private String matricula;
	private char sexo;
	private String dataNascimento;
	private String disciplinas;

	// construtor sem argumentos
	public Pessoa() {
		this.nome = "";
		this.matricula = "";
		this.sexo = ' ';
		this.dataNascimento = "";
		this.disciplinas = "";
	}

	// construtor com argumentos
	public Pessoa(String nome, String matricula, char sexo, String dataNascimento, String disciplinas) {
		this.nome = nome;
		this.matricula = matricula;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.disciplinas = disciplinas;
	}

	// métodos para acessar os atributos
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public char getSexo() {
		return this.sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDisciplinas() {
		return this.disciplinas;
	}

	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
}
