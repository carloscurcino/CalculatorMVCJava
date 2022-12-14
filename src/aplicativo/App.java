package aplicativo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

public class App {
	public static void main(String[] args) {
		CalculatorModel calcModel = new CalculatorModel();
		CalculatorView calcView = new CalculatorView();
		CalculatorController calcControl = new CalculatorController(calcView, calcModel);
//		
//		
//		
//		
//		
//		
//		
//		
//		
		//SERIALIZACAO
		 ObjectOutputStream objectOutput;
		try {
			objectOutput = new ObjectOutputStream(new FileOutputStream("Calculadora.javaobj"));
			objectOutput.writeObject(calcModel);
			objectOutput.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}
}
