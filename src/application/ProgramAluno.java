package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramAluno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Final Grade = %.2f%n", aluno.total());
		
		if (aluno.total() < 60.0 ) {
			System.out.println("Failed ");
			//System.out.printf("MISSING %.2f POINTS%n", aluno.falta()); 
			System.out.printf("Missing = %.2f POINTS%n", aluno.falta());
		}else {
			System.out.println("Pass");
		}

		

		sc.close();
	}

}
