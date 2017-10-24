/*
 *	Disciplina: Programação Orientada a Objetos 
 *  Professor: 	Orlewilson B. Maia
 *  Turma:		CIN04S1
 *  Data:		18/10/17
 *  Autor:		Orlewilson B. Maia
 *  Descrição:	Executar o projeto
 * 	
 */
public class Principal {
	
	// executar o projeto
	public static void main(String[] args) {
		
		//Pessoa pes1 = new Pessoa();
		Aluno al = new Aluno("Lukas", "16169948", 
				'M',"26/09/1996","POO, SO", "CC",
				8.1, 4, "Presencial", true);
		
		Professor prof = new Professor("Orlewilson Maia", 
				"1231231", 'M', "05/05/1984", "POO",
				"Doutor", 3000.0, "Uninorte, FMF", 40,
				2);
		
		al.mostrarDados();
		
		prof.mostrarDados();	
		
	}
}






