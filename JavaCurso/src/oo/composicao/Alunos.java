package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Alunos {

	final String nome;
	
	final List<Curso> cursos = new ArrayList<>();
	
	Alunos(String nome) {
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
}
