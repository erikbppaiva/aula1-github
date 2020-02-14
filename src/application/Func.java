package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Func {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.print("Entre com o nome do funcionario: ");
		funcionario.name = sc.nextLine();
		System.out.print("Entre com o salario do funcionario: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Informe o impposto do funcionario: ");
		funcionario.tax = sc.nextDouble();
		System.out.println("");
		
		System.out.println(funcionario.toString());

		System.out.print("Quanto de aumento? ");
		double aum = sc.nextInt();
		funcionario.aumentarSalario(aum);

		System.out.println(funcionario.toString());

		sc.close();
	}

}
