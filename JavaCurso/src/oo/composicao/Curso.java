package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	 final String nome;
	
	final List<Alunos> alunos = new ArrayList<>();
	
	Curso(String nome) {
		this.nome = nome;
	}
	
	void adicionarAluno(Alunos alunos) {
		this.alunos.add(alunos);
		alunos.cursos.add(this);
	}
}
