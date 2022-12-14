package controller;

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController {
	private CalculatorView calcView;
	private CalculatorModel calcModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.calcModel = theModel;
		this.calcView = theView;
		
		calcView.runCalc(this);
	}
	
	public void controladora(Float a, Float b, String OP) {
		calcModel.setA(a);
		calcModel.setB(b);
		switch(OP) {
			case "+":
				calcView.showRes(calcModel.soma(), this); 
				break;
			case "-":
				calcView.showRes(calcModel.subtracao(), this);
				break;
			case "*":
				calcView.showRes(calcModel.multiplicacao(), this);
				break;
			case "/":
				try {
					calcView.showRes(calcModel.divisao(), this);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					calcView.showError();
					calcView.runCalc(this);
				}
				break;
			case "q":
				calcView.showEndMessage();
				break;
		}
	}
}
