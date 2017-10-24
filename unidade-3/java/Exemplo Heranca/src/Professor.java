/*
 *	Disciplina: Programação Orientada a Objetos 
 *  Professor: 	Orlewilson B. Maia
 *  Turma:		CIN04S1
 *  Data:		27/08/17
 *  Autor:		Orlewilson B. Maia
 *  Descrição:	Modelo para representar um professor
 * 	
 */

// extends = herança em Java
public class Professor extends Pessoa{

	// atributos
	private String formacao;
	private double salario;
	private String faculdades;
	private int cargaHoraria;
	private int nivelCrueldade;

	// construtor sem argumentos
	public Professor() {
		
		// primeira forma de iniciar os atributos
		// da superclasse
//		setDataNascimento("");
//		setDisciplinas("");
//		setMatricula("");
//		setNome("");
//		setSexo(' ');
		
		// segunda forma de iniciar os atributos
		// da superclasse
		//super();

		// terceira forma de iniciar os atributos
		// da superclasse
		super("", "", ' ', "", "");
				
		this.formacao = "";		
		this.salario = 0.0;
		this.faculdades = "";
		this.cargaHoraria = 0;
		this.nivelCrueldade = 0;
	
	}

	
	// construtor com argumentos
	public Professor(String nome, String matricula, 
			char sexo, String dataNascimento, 
			String disciplinas,
			
			String formacao, 
			double salario, String faculdades, 
			int cargaHoraria, int nivelCrueldade) {
		
		// primeira forma de iniciar os atributos
		// da superclasse
//		setDataNascimento(dataNascimento);
//		setDisciplinas(disciplinas);
//		setMatricula(matricula);
//		setNome(nome);
//		setSexo(sexo);
//		
		// segunda forma de iniciar os atributos
		// da superclasse
		super(nome, matricula, sexo, 
				dataNascimento, disciplinas);
		
		this.formacao = formacao;
		this.salario = salario;
		this.faculdades = faculdades;
		this.cargaHoraria = cargaHoraria;
		this.nivelCrueldade = nivelCrueldade;
	}

	// métodos para acessar os atributos
	public String getFormacao() {
		return this.formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getFaculdades() {
		return this.faculdades;
	}

	public void setFaculdades(String faculdades) {
		this.faculdades = faculdades;
	}

	public int getCargaHoraria() {
		return this.cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getNivelCrueldade() {
		return this.nivelCrueldade;
	}

	public void setNivelCrueldade(int nivelCrueldade) {
		
		if(nivelCrueldade > 0 || nivelCrueldade < 6) {
			this.nivelCrueldade = nivelCrueldade;
		}
	}
	
	// mostrar dados de Professor
		public void mostrarDados() {
			// 1a Forma
//			System.out.println("Nome: " + getNome());
//			System.out.println("Matrícula: " + getMatricula());
//			System.out.println("Sexo: " + getSexo());
//			System.out.println("Data Nascimento: " 
//					+ getDataNascimento());
//			System.out.println("Disciplinas: " 
//					+ getDisciplinas());
			// 2a Forma
			super.mostrarDados();

			System.out.println("Formação: " + getFormacao());
			System.out.println("Salário: " 
					+ getSalario());
			System.out.println("Faculdades: " + getFaculdades());
			System.out.println("Carga Horária: " 
					+ getCargaHoraria());
			
			if (getNivelCrueldade() == 1) {
				System.out.println("Nível Crueldade: gasparzinho");
			} else if (getNivelCrueldade() == 2) { 
				System.out.println("Nível Crueldade: shrek");
			}else if (getNivelCrueldade() == 3) { 
				System.out.println("Nível Crueldade: cruela");
			}else if (getNivelCrueldade() == 4) { 
				System.out.println("Nível Crueldade: oscar");
			}else if (getNivelCrueldade() == 5) { 
				System.out.println("Nível Crueldade: malévola");
			}
		}
}