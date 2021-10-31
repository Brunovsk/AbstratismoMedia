package entities;

public class Nota {
	
	private Double nota;
	private Double peso;
	
	public Nota(){
	}

	public Nota(Double nota, Double peso) {
		
		this.nota = nota;
		this.peso = peso;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "";
	}

}
