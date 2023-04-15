package br.com.IFCTI4.app;

import java.util.Scanner;

import br.com.IFCTI4.bo.Calculo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		Scanner leia = new Scanner(System.in);
		Calculo obj = new Calculo();
		
		System.out.println("Informe a porcentagem do IPI:");
		int IPI = leia.nextInt();	
		
		obj.setIPI(IPI);
				
		
		// Input's referentes a peça 1
		System.out.println("Informe o codigo da peça 1:");
		int cod1 = leia.nextInt();
		
		obj.setCod1(cod1);
				
		System.out.println("Informe o valor unitario da peça 1:");
		int valor1 = leia.nextInt();
		
		obj.setValor1(valor1);
				
		System.out.println("Informe a quantidades de peças 1");
		int qtde1 = leia.nextInt();
		
		obj.setQtde1(qtde1);
				
		
		// Input's referentes a peça 2
		System.out.println("Informe o codigo da peça 2:");
		int cod2 = leia.nextInt();
		
		obj.setCod2(cod2);
				
		System.out.println("Informe o valor unitario da peça 2:");
		int valor2 = leia.nextInt();
		
		obj.setValor2(valor2);
				
		System.out.println("Informe a quantidades de peças 2");
		int qtde2 = leia.nextInt();
		
		obj.setQtde2(qtde2);
				
		obj.Calculo();
		
		
		

	}

}
