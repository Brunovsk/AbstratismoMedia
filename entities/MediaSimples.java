package entities;


public class MediaSimples extends CalculoMedia {
	
   
	public Double calculaMediaAluno(Aluno aluno) {
		Double soma =0.0;
		for(Nota nota : aluno.getNotas()) {
			soma = soma + nota.getNota();
		}
		int tamanho = aluno.getNotas().size();
		return soma / tamanho;
	}

	public Double calculaMediaTurma(Turma turma) {
		Double soma1 = 0.0,soma = 0.0;
		for (Aluno aluno : turma.getAlunos()) {
			soma =0.0;
			for(Nota nota : aluno.getNotas()) {
				soma = soma + nota.getNota();
			}
			int tamanho = aluno.getNotas().size();
			double media = soma / tamanho;
			soma1 = soma1 +media;
		}
		int tamanho = turma.getAlunos().size();
		return soma1 / tamanho;
		
		
	}

	@Override
	public Double calculaMediaAluno( ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculaMediaTurma() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
