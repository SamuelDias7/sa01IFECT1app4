package br.com.IFCTI4.bo;

public class Calculo {
	private int IPI;
	private int cod1;
	private int valor1;
	private int qtde1;
	private int cod2;
	private int valor2;
	private int qtde2;
	private int total;
	
	public int getIPI() {
		return IPI;
	}
	public void setIPI(int iPI) {
		IPI = iPI;
	}
	public int getCod1() {
		return cod1;
	}
	public void setCod1(int cod1) {
		this.cod1 = cod1;
	}
	public int getValor1() {
		return valor1;
	}
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	public int getQtde1() {
		return qtde1;
	}
	public void setQtde1(int qtde1) {
		this.qtde1 = qtde1;
	}
	public int getCod2() {
		return cod2;
	}
	public void setCod2(int cod2) {
		this.cod2 = cod2;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	public int getQtde2() {
		return qtde2;
	}
	public void setQtde2(int qtde2) {
		this.qtde2 = qtde2;
	}
	
	public void Calculo() {
		this.total = (valor1 * this.qtde1 + this.valor2 * this.qtde2) * (this.IPI/100+1);
		
		System.out.println("O valor a ser pago é de:" + this.total + " reais");
		
	}

	
	
	
}
