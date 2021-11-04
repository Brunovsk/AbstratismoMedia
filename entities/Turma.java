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

	@Override
	public String toString() {
		return "Turma [fase=" + fase + ", alunos=" + alunos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alunos == null) ? 0 : alunos.hashCode());
		result = prime * result + ((fase == null) ? 0 : fase.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		if (alunos == null) {
			if (other.alunos != null)
				return false;
		} else if (!alunos.equals(other.alunos))
			return false;
		if (fase == null) {
			if (other.fase != null)
				return false;
		} else if (!fase.equals(other.fase))
			return false;
		return true;
	}


	
}
