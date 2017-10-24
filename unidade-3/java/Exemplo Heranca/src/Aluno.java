/*
 *	Disciplina: Programação Orientada a Objetos 
 *  Professor: 	Orlewilson B. Maia
 *  Turma:		CIN04S1
 *  Data:		27/08/17
 *  Autor:		Orlewilson B. Maia
 *  Descrição:	Modelo para representar um aluno
 * 	
 */
public class Aluno extends Pessoa{

	// atributos
	private String curso;
	private double coeficiente;
	private int periodo;
	private String modalidade;
	private boolean bolsista;

	// construtor sem argumentos
	public Aluno() {
		
		super();
		
		this.curso = "";
		this.coeficiente = 0.0;
		this.periodo = 0;
		this.modalidade = "";
		this.bolsista = false;
	}

	// construtor com argumentos
	public Aluno(String nome, String matricula, 
			char sexo, String dataNascimento, 
			String disciplinas,
			
			String curso, 
			double coeficiente, int periodo, 
			String modalidade, boolean bolsista) {
		
		super(nome, matricula, sexo, 
				dataNascimento, disciplinas);

		this.curso = curso;
		this.coeficiente = coeficiente;
		this.periodo = periodo;
		this.modalidade = modalidade;
		this.bolsista = bolsista;
	}

	// métodos para acessar os atributos
	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getCoeficiente() {
		return this.coeficiente;
	}

	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}

	public int getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getModalidade() {
		return this.modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public boolean getBolsista() {
		return this.bolsista;
	}

	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}
	
	
	// mostrar dados de Aluno
	public void mostrarDados() {
		// 1a Forma
//		System.out.println("Nome: " + getNome());
//		System.out.println("Matrícula: " + getMatricula());
//		System.out.println("Sexo: " + getSexo());
//		System.out.println("Data Nascimento: " 
//				+ getDataNascimento());
//		System.out.println("Disciplinas: " 
//				+ getDisciplinas());
		// 2a Forma
		super.mostrarDados();
		
		System.out.println("Curso: " + getCurso());
		System.out.println("Coeficiente: " 
				+ getCoeficiente());
		System.out.println("Periodo: " + getPeriodo());
		System.out.println("Modalidade: " 
				+ getModalidade());
		
		if (getBolsista()) {
			System.out.println("Bolsista: Sim");
		} else {
			System.out.println("Bolsista: Não");
		}
	}

		
}










