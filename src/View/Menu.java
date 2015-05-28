package View;

import java.util.Scanner;

import Model.Dao.AlunoDaoImp;
import Model.Dao.AtividadeDaoImp;
import Model.Dao.DisciplinaDaoImp;
import Model.Dao.FaltaDaoImp;
import Model.Dao.NotaDaoImp;
import Model.Dao.ProfessorDaoImp;
import Model.Dao.TurmaDaoImp;

public class Menu {

	public static void main(String[] args) {
		ProfessorDaoImp professorDaoImp = new ProfessorDaoImp();
		AlunoDaoImp alunoDaoImp = new AlunoDaoImp();
		AtividadeDaoImp atividadeDaoImp = new AtividadeDaoImp();
		DisciplinaDaoImp disciplinaDaoImp = new DisciplinaDaoImp();
		FaltaDaoImp faltaDaoImp = new FaltaDaoImp();
		TurmaDaoImp turmaDaoImp = new TurmaDaoImp();
		NotaDaoImp notaDaoImp = new NotaDaoImp();
		
		
		
		String opcao1 = "0";  
		while (opcao1 != "6") { 
			System.out.println("Menu academico da UFLN");
			System.out.println("Para assuntos relacionados ao aluno digite 1");
			System.out.println("Para assuntos relacionados ao professor digite 2");
			System.out.println("Para assuntos relacionados a turma digite 3");
			System.out.println("Para assuntos relacionados a disciplina digite 4");
			System.out.println("Para assuntos relacionados a notas, faltas e atividades digite 5");
			opcao1 = new Scanner(System.in).nextLine();
			
					 
						if( opcao1.equals("1")){
							MenuAluno menualuno= new MenuAluno();
							menualuno.menu(alunoDaoImp);
					 }
						else if( opcao1.equals("2")){
							MenuProfessor menuprofessor= new MenuProfessor();
							menuprofessor.menu(disciplinaDaoImp, professorDaoImp);
						}
						else if( opcao1.equals("2")){
							MenuTurma menuturma = new MenuTurma();
							menuturma.menu(turmaDaoImp);
					 }
						else if( opcao1.equals("2")){
							MenuDisciplina menudisciplina = new MenuDisciplina();
							menudisciplina.menu(disciplinaDaoImp);
						}
						else if( opcao1.equals("2")){ 
							MenuExtra menuextra = new MenuExtra();
							menuextra.menu(faltaDaoImp, notaDaoImp, atividadeDaoImp);
						}
						else
					   		System.out.println("Opção inválida , digite novamente");
				
					 }		      
		  		
		
		
		
		}
	}



