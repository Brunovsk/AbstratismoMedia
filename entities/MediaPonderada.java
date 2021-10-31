package entities;

public class MediaPonderada extends CalculoMedia {

	
	public Double calculaMediaAluno(Aluno aluno) {
		double a=0.0,b=0.0,c=0.0,media=0.0;
		for(Nota nota : aluno.getNotas()) {
			a = nota.getNota()*nota.getPeso();
			b = b+a;
			c= c + nota.getPeso();
		}
		return media = b/c;
	}

	@Override
	public Double calculaMediaTurma() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculaMediaAluno() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
