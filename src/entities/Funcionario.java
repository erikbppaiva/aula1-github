package entities;

public class Funcionario {
	
	public String name;
	public double salarioBruto;
	public double tax;
	
	public double salarioLiquido() {
		return salarioBruto - tax;
		
		
	}
	public void aumentarSalario(double percentage) {
		this.salarioBruto += salarioBruto * percentage / 100;
		
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", salarioLiquido());
		}
	
	
	
}
