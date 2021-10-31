package entities;

public abstract class CalculoMedia {
	
	public abstract Double calculaMediaAluno();
	
	public abstract Double calculaMediaTurma();
	
	public void mostraMedia() {
		System.out.println(calculaMediaAluno());
		System.out.println(calculaMediaTurma());
		
	}

	

	
	

}
