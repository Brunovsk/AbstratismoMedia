package entities;

public class MediaPonderada extends CalculoMedia {

	
	public Double calculaMediaAluno(Aluno aluno) {
		double notaxPeso=0.0,contNotaxPeso=0.0,contPeso=0.0,media=0.0;
		for(Nota nota : aluno.getNotas()) {
			notaxPeso = nota.getNota()*nota.getPeso();
			contNotaxPeso = contNotaxPeso+notaxPeso;
			contPeso= contPeso + nota.getPeso();
		}
		return contNotaxPeso/contPeso;
		
	}

	public Double calculaMediaTurma(Turma turma) {
		 double notaxPeso=0.0,contNotaxPeso=0.0,contPeso=0.0,media=0.0,somaMedia =0;
		for (Aluno aluno : turma.getAlunos()) {
			for(Nota nota : aluno.getNotas()) {
				notaxPeso = nota.getNota()*nota.getPeso();
				contNotaxPeso = contNotaxPeso+notaxPeso;
				contPeso= contPeso + nota.getPeso();
			}
			media = contNotaxPeso/contPeso;
			somaMedia = somaMedia + media;
		}
		int tamanho = turma.getAlunos().size();
		return somaMedia/tamanho;
	}

	@Override
	public Double calculaMediaAluno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculaMediaTurma() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
