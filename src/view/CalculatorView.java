package view;

import java.util.Scanner;

import controller.CalculatorController;

public class CalculatorView {
	
	public void runCalc(CalculatorController calcControl) {
			
			System.out.println("\n\t\t\t||CALCULADORA||\n");
			System.out.println("Digite q em operação e numeros quaisquer caso queira sair\n\n");
			System.out.println("Que operação deseja fazer entre +, -, *, ou /?\n");
			String OP = new Scanner(System.in).next();
			
			System.out.println("Qual o primeiro número?\n");
			Float a = new Scanner(System.in).nextFloat();
;			
			System.out.println("Qual o segundo número?\n");
			Float b = new Scanner(System.in).nextFloat();
			calcControl.controladora(a, b, OP);
	}

	
	public void showError() {
		System.out.println("Erro: Não é possivel dividir por zero");
	}
	
	public void showRes(Float res, CalculatorController calcControl) {
		System.out.println("O resultado da operação é: "+res);
		this.runCalc(calcControl);
	}

	public void showEndMessage() {
		System.out.println("Calculadora encerrada! Obrigado! ;-;");
	}
}
