package oo.composicao;

public class CursoTeste {
	 
	public static void main(String[] args) {
		
		Alunos aluno1 = new Alunos("Pedro");
		Alunos aluno2 = new Alunos("Amanda");
		Alunos aluno3 = new Alunos("Arthur");
		
		Curso curso1 = new Curso("Pos-Historia");
		Curso curso2 = new Curso("Engenharia de Software");
		Curso curso3 = new Curso("Ingles complementar");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		
		for(Alunos aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso de " + curso3.nome);
			System.out.println("Meu nome é: " + aluno.nome);
			System.out.println();
		}
	}
}
