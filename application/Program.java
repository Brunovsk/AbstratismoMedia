package application;

import java.util.Scanner;

import entities.Aluno;
import entities.MediaPonderada;
import entities.MediaSimples;
import entities.Nota;
import entities.Turma;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Turma turma = new Turma("1° fase");
		
		Aluno aluno = new Aluno ("Bruno");
		turma.getAlunos().add(aluno);
		
		System.out.println("Notas de "+ aluno.getNome()+" ("+turma.getFase()+") "+":");
		Nota nota1 = new Nota (9.5,10.0);
		aluno.getNotas().add(nota1);
		Nota nota2 = new Nota(8.0,10.0);
		aluno.getNotas().add(nota2);
		Nota nota3 = new Nota(6.0,10.0);
		aluno.getNotas().add(nota3);
		System.out.print(nota1.getNota()+",");
		System.out.print(nota2.getNota()+",");
		System.out.println(nota3.getNota());
		MediaSimples calculoMedia = new MediaSimples();
		System.out.println("media: "+calculoMedia.calculaMediaAluno(aluno));
		System.out.println();
		
		Aluno aluno1 = new Aluno("Felipe");
		turma.getAlunos().add(aluno1);
		
		System.out.println("Notas de "+ aluno1.getNome()+" ("+turma.getFase()+") "+":");
		Nota nota4 = new Nota (7.0,10.0);
		aluno1.getNotas().add(nota4);
		Nota nota5 = new Nota(5.0,10.0);
		aluno1.getNotas().add(nota5);
		Nota nota6 = new Nota(8.5,10.0);
		aluno1.getNotas().add(nota6);
		System.out.print(nota4.getNota()+",");
		System.out.print(nota5.getNota()+",");
		System.out.println(nota6.getNota());
		System.out.println("media: "+calculoMedia.calculaMediaAluno(aluno1));
		System.out.println();
		
		Aluno aluno2 = new Aluno ("Sid");
		turma.getAlunos().add(aluno);
		
		System.out.println("Notas de "+ aluno2.getNome()+" ("+turma.getFase()+") "+":");
		Nota nota7 = new Nota (7.0,8.0);
		aluno2.getNotas().add(nota7);
		Nota nota8 = new Nota(8.0,3.0);
		aluno2.getNotas().add(nota8);
		Nota nota9 = new Nota(6.0,2.0);
		aluno2.getNotas().add(nota9);
		System.out.print(nota7.getNota()+",");
		System.out.print(nota8.getNota()+",");
		System.out.println(nota9.getNota()); 
		MediaPonderada mediaPonderada = new MediaPonderada();
		System.out.println("media: "+mediaPonderada.calculaMediaAluno(aluno2));
		System.out.println();
		
		System.out.println("MEDIA PONDERADA TURMA: "+mediaPonderada.calculaMediaTurma(turma));
		System.out.println("MEDIA SIMPLES TURMA: "+calculoMedia.calculaMediaTurma(turma));
		sc.close();

	}

	

}
