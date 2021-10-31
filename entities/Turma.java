package entities;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private String fase;
    public List<Aluno> alunos = new ArrayList<>();
	
	public Turma() {
	}
	
	public Turma(String fase) {
		this.fase = fase;
	}

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}


}
